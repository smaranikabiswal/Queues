import java.util.*;

public class samelevel {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static boolean checkSameLevel(Node root) {
        if (root == null) return true;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0, leafLevel = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            level++;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left == null && node.right == null) {
                    if (leafLevel == -1) leafLevel = level;
                    else if (leafLevel != level) return false;
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println(checkSameLevel(root)); // true
    }
}