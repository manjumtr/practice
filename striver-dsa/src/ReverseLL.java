public class ReverseLL {

    public static Node reverse(Node head) {

        Node prev = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);
        Node.print(head);
        head = reverse(head);
        Node.print(head);

    }
}
