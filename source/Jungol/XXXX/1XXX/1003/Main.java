import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        Node first = new Node(1);
        Node current = first;
        for (int i = 1; i < n; i++) {
            current.addNodeNext();
            current = current.next;
        }
        for (int i = 1; i < n; i++) {
            int c = Integer.parseInt(st.nextToken()) * -1;
            first.findNode(i + 1).moveAndInsert(c);
        }

        while (first.prev != null) {
            first = first.prev;
        }

        current = first;

        while (current != null) {
            if (current != first)
                sb.append(' ');

            sb.append(current.num);
            current = current.next;
        }

        System.out.println(sb);
    }

    static class Node {
        int num;
        Node prev = null;
        Node next = null;
        Node(int n) {
            num = n;
        }

        public void addNodeNext() {
            Node current = this;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current.num + 1);
            current.next = newNode;
            newNode.prev = current;
        }
        public Node getNodeAway(int n) {
            Node current = this;

            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    if (current.next == null)
                        return null;

                    current = current.next;
                }
            } else {
                for (int i = 0; i < -n; i++) {
                    if (current.prev == null)
                        return null;

                    current = current.prev;
                }
            }

            return current;
        }
        public void moveAndInsert(int n) {
            if (n == 0)
                return;
            Node target = getNodeAway(n);
            if (target == null || target == this)
                return;
            Node before = this.prev;
            Node after = this.next;
            if (before != null)
                before.next = after;
            if (after != null)
                after.prev = before;

            if (n > 0) {
                Node targetNext = target.next;
                target.next = this;
                this.prev = target;
                this.next = targetNext;
                if (targetNext != null)
                    targetNext.prev = this;
            } else {
                Node targetPrev = target.prev;
                target.prev = this;
                this.next = target;
                this.prev = targetPrev;
                if (targetPrev != null)
                    targetPrev.next = this;
            }
        }
        public Node findNode(int num) {
            Node current = this;

            // 현재 노드부터 next 방향으로 탐색
            while (current != null) {
                if (current.num == num)
                    return current;

                current = current.next;
            }

            return null;
        }
    }
}