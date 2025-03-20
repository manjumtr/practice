public class SwapInPais {

    public static Node swap(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node cur = prev.next;
        Node next = cur.next;
        dummy.next = dummy;

        while (cur != null && cur.next != null) {
            next = cur.next;
            cur.next = next.next;
            next.next = cur;
            prev.next = next;

            prev = cur;
            cur = cur.next;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = Node.build1();
        Node.print(head);
        Node swaped = swap(head);
        System.out.println(".....");
        Node.print(swaped);
    }

}
