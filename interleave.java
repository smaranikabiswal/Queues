import java.util.*;

public class interleave {
    public static void interleave(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < n / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 6; i++) q.add(i);

        System.out.println("Original queue: " + q);
        interleave(q);
        System.out.println("Interleaved queue: " + q);
    }
}
