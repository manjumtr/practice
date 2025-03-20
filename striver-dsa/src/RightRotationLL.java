
public class RightRotationLL {

    public static Node rotate(Node head, int k) {

        int length = 0;
        Node cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        k = k % length;

        while (k > 0) {
            cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next.next = head;
            head = cur.next;
            cur.next = null;

            k--;
        }
        return head;

    }

    public static void main(String[] args) {
        Node head = Node.build1();

        Node rotated = rotate(head, 2);
        Node.print(rotated);
    }

}
