import java.util.*;

public class palindrome {
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        for (int num : q) {
            s.push(num);
        }

        for (int num : q) {
            if (num != s.pop()) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(List.of(1, 2, 3, 2, 1));
        Queue<Integer> q2 = new LinkedList<>(List.of(1, 2, 3, 4));

        System.out.println("q1 is palindrome? " + isPalindrome(q1)); // true
        System.out.println("q2 is palindrome? " + isPalindrome(q2)); // false
    }
}
