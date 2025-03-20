public class DetectLoopLL {

    public static boolean conatinsLoop(Node head) {

        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = Node.build1();
        System.out.println(conatinsLoop(head));

    }
}
