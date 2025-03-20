public class CircularLLStartingPoint {

    public static Node startingPoint(Node head) {

        Node slow = head, fast = head;

        if (head == null || head.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node first = new Node(2);
        Node second = new Node(0);
        Node third = new Node(-4);
        head.next = first;
        // head.next.next.next = third;
        // head.next.next.next.next = first;

        System.out.println(startingPoint(head));

    }
}
