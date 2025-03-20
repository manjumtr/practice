public class MergeLL {

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node cur = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                cur.next = a;
                a = a.next;

            } else if (a.val > b.val) {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }

        if (a != null) {
            cur.next = a;
        }
        if (b != null) {
            cur.next = b;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);
        System.out.println("l1 : ");
        Node.print(l1);

        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

        System.out.println("l2 : ");
        Node.print(l2);

        Node node = merge(l1, l2);
        System.out.println("Merged");
        Node.print(node);
    }
}
