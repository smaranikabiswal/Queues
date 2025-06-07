import java.util.*;

public class zigzag {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void zigzag(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (leftToRight) level.addLast(node.val);
                else level.addFirst(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            System.out.println(level);
            leftToRight = !leftToRight;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.right.right = new Node(18);
        zigzag(root);
    }
}