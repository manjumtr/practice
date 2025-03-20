public class DeleteNodeLL {

    public static void delete(Node head, Node node) {

        if (node == null || node.next == null) {
            return;
        }

        Node next = node.next;
        node.val = next.val;
        node.next = next.next;
        next.next = null;
    }

    public static void main(String[] args) {
        Node head = Node.build1();
        Node node = head.next;
        delete(head, node);
        Node.print(head);
    }
}
