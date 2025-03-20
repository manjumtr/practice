import java.util.Stack;

public class PalindromeLL {

    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null && fast.next == null) {
            slow = slow.next;
        }
        while (!stack.isEmpty()) {
            if (stack.peek() != slow.val) {
                return false;
            }
            slow = slow.next;
            stack.pop();
        }

        return stack.isEmpty() && slow == null ? true : false;
    }

    public static void main(String[] args) {
        Node head = Node.buildForPalindrom();
        System.out.println(isPalindrome(head));
    }

}
