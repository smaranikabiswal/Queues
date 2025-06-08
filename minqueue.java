import java.util.*;

public class minqueue {
    static class QueueWithMin {
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        public void add(int x) {
            q.add(x);
            while (!minDeque.isEmpty() && minDeque.getLast() > x) {
                minDeque.removeLast();
            }
            minDeque.addLast(x);
        }

        public int remove() {
            if (q.isEmpty()) return -1;
            int removed = q.poll();
            if (removed == minDeque.peek()) {
                minDeque.poll();
            }
            return removed;
        }

        public int getMin() {
            return minDeque.peek();
        }

        public boolean isEmpty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueWithMin mq = new QueueWithMin();
        mq.add(4);
        mq.add(2);
        mq.add(5);
        mq.add(1);
        System.out.println("Min: " + mq.getMin());  // 1
        mq.remove(); // removes 4
        System.out.println("Min after removing 4: " + mq.getMin()); // 1
        mq.remove(); // removes 2
        mq.remove(); // removes 5
        System.out.println("Min after removing till 1: " + mq.getMin()); // 1
    }
}