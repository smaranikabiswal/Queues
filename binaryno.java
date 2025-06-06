import java.util.*;

public class binaryno {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while (n-- > 0) {
            String curr = q.remove();
            System.out.println(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Binary numbers from 1 to " + n + ":");
        generate(n);
    }
}
