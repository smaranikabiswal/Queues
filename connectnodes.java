import java.util.*;

public class connectnodes {
    static class Node {
        int val;
        Node left, right, next;
        Node(int v) { val = v; }
    }

    public static void connect(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (prev != null) prev.next = node;
                prev = node;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        connect(root);
        System.out.println(root.left.next.val); // 3
    }
}