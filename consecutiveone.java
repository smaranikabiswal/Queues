import java.util.*;

public class consecutiveone {
    static class Pair {
        String val;
        int len;

        Pair(String val, int len) {
            this.val = val;
            this.len = len;
        }
    }

    public static int countBinary(int n) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair("0", 1));
        q.add(new Pair("1", 1));
        int count = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            if (p.len == n) {
                count++;
                continue;
            }

            q.add(new Pair(p.val + "0", p.len + 1));

            if (p.val.charAt(p.val.length() - 1) != '1') {
                q.add(new Pair(p.val + "1", p.len + 1));
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Binary numbers of length " + n + " with no consecutive 1s: " + countBinary(n));
    }
}