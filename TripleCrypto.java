import java.util.*;
import java.util.Base64;

public class TripleCrypto {

    // -----------------------------
    // Layer 1: 문자 난독화 (뒤집기 + 키 더하기)
    // -----------------------------
    public static String layer1Obfuscate(String text, String key) {
        StringBuilder reversed = new StringBuilder(text).reverse();
        char[] keyChars = key.toCharArray();
        int k = keyChars.length;

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            int newCode = (ch + keyChars[i % k]) % 65536;
            out.append((char) newCode);
        }
        return out.toString();
    }

    public static String layer1Deobfuscate(String obf, String key) {
        char[] keyChars = key.toCharArray();
        int k = keyChars.length;

        StringBuilder mid = new StringBuilder();

        for (int i = 0; i < obf.length(); i++) {
            char ch = obf.charAt(i);
            int orig = (ch - keyChars[i % k]) % 65536;
            if (orig < 0) orig += 65536; // Java % is not always positive
            mid.append((char) orig);
        }

        return mid.reverse().toString();
    }

    // -----------------------------
    // Layer 2: 바이트 XOR
    // -----------------------------
    public static byte[] layer2Xor(byte[] data, String key) {
        byte[] keyBytes = key.getBytes();
        int k = keyBytes.length;
        byte[] out = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            out[i] = (byte)(data[i] ^ keyBytes[i % k]);
        }
        return out;
    }

    // -----------------------------
    // Layer 3: Base64 + noise
    // -----------------------------
    private static int noiseLength(String key) {
        byte[] kb = key.getBytes();
        int sum = 0;
        for (byte b : kb) sum += b;
        return (sum % 20) + 10;  // 10~29 글자
    }

    public static String layer3Encode(byte[] data, String key) {
        String base = Base64.getEncoder().encodeToString(data);
        int noiseLen = noiseLength(key);

        Random r = new Random(key.hashCode()); // 키 기반 잡음(복원 가능)
        StringBuilder noise = new StringBuilder();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

        for (int i = 0; i < noiseLen; i++) {
            noise.append(chars.charAt(r.nextInt(chars.length())));
        }
        return base + noise.toString();
    }

    public static byte[] layer3Decode(String cipher, String key) {
        int nlen = noiseLength(key);
        String basePart = cipher.substring(0, cipher.length() - nlen);
        return Base64.getDecoder().decode(basePart);
    }

    // -----------------------------
    // 전체 암호화
    // -----------------------------
    public static String encrypt(String text, String key) {
        // Layer 1
        String step1 = layer1Obfuscate(text, key);
        // Layer 2
        byte[] step2 = layer2Xor(step1.getBytes(), key);
        // Layer 3
        return layer3Encode(step2, key);
    }

    // -----------------------------
    // 전체 복호화
    // -----------------------------
    public static String decrypt(String cipher, String key) {
        // Layer 3
        byte[] step2 = layer3Decode(cipher, key);
        // Layer 2
        byte[] step1bytes = layer2Xor(step2, key);
        String step1 = new String(step1bytes);
        // Layer 1
        return layer1Deobfuscate(step1, key);
    }

    // -----------------------------
    // 실행용 (Scanner)
    // -----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1) Encrypt  2) Decrypt : ");
        int mode = sc.nextInt();
        sc.nextLine(); // flush

        System.out.print("키 입력: ");
        String key = sc.nextLine();

        System.out.print("문장 입력: ");
        String text = sc.nextLine();

        if (mode == 1) {
            String enc = encrypt(text, key);
            System.out.println("\n암호문:\n" + enc);
        } else {
            String dec = decrypt(text, key);
            System.out.println("\n복호문:\n" + dec);
        }
    }
}
