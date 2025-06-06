import java.util.*;

public class nonrepeat {
    public static void printFirstNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek() + " ");
        }
    }

    public static void main(String[] args) {
        String input = "aabc";
        System.out.println("First non-repeating characters:");
        printFirstNonRepeating(input);
    }
}
