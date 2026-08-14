import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Person[] a = new Person[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = new Person(i,Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
    static class Person implements Comparable<Person> {
        private int d;
        private String n;
        private int a;
        public Person(int signupdate ,int age, String name) {
            this.d = signupdate;
            this.a = age;
            this.n = name;
        }

        @Override
        public int compareTo(Person o) {
            if (this.a != o.a) {
                return this.a - o.a;
            }
            else {
                return this.d - o.d;
            }
        }

        @Override
        public String toString() {
            return this.a + " " + this.n;
        }
    }
}