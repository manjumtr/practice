public class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.next = next;
        this.val = val;
    }

    public Node(int val) {
        this.next = null;
        this.val = val;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static Node build1() {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(5, null);
        head.next.next.next.next.next = new Node(6, null);
        return head;
    }

    public static Node buildForPalindrom() {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(2, null);
        head.next.next.next = new Node(1, null);
        // head.next.next.next.next = new Node(3, null);
        return head;
    }

    public static Node build2() {
        Node head = new Node(6, null);
        head.next = new Node(7, null);
        head.next.next = build1().next;
        return head;
    }

    public static int length(Node node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
