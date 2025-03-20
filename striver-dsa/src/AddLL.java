public class AddLL {

    public static Node add(Node f, Node s) {

        Node result = new Node(0);
        Node resultHead = result;

        int sum = 0;
        int carry = 0;

        while (f != null && s != null) {
            sum = (f.val + s.val + carry) % 10;
            carry = (f.val + s.val + carry) / 10;

            result.next = new Node(sum);
            result = result.next;
            f = f.next;
            s = s.next;
        }

        while (f != null) {
            sum = (f.val + carry) % 10;
            carry = (f.val + carry) / 10;

            result.next = new Node(sum);
            result = result.next;
            f = f.next;
        }
        while (s != null) {
            sum = (s.val + carry) % 10;
            carry = (s.val + carry) / 10;

            result.next = new Node(sum);
            result = result.next;
            s = s.next;
        }

        if (carry > 0) {
            result.next = new Node(carry);
        }

        return resultHead.next;

    }

    public static void main(String[] args) {
        Node f = new Node(9);
        f.next = new Node(9);
        f.next.next = new Node(9);

        Node s = new Node(9);
        s.next = new Node(9);

        System.out.println("----- first list-----");
        Node.print(f);

        System.out.println("----- second list-----");
        Node.print(s);

        Node result = add(f, s);
        System.out.println("---------Result-------");
        Node.print(result);
    }
}
