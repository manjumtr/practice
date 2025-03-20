public class ReverseInGrpK {

    public static Node reverse(Node head, int k) {

        Node dummy = new Node(0);
        int length = 0;
        Node temp = head;
        dummy.next = head;
        Node cur = dummy;
        Node next = dummy;
        Node prev = dummy;

        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (k == 0) {
            return null;
        }

        if (head == null || head.next == null || k == 1) {
            return head;
        }

        while (length > 0) {
            cur = prev.next;
            next = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            prev = cur;
            length -= k;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = Node.build1();
        Node.print(head);

        Node rev = reverse(head, 2);
        System.out.println(".......");
        Node.print(rev);
    }

}
