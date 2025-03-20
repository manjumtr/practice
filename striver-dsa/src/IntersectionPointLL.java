public class IntersectionPointLL {

    public static Node intersectionPoint(Node a, Node b) {
        int lengthA = Node.length(a);
        int lengthB = Node.length(b);

        Node longest = lengthA > lengthB ? a : b;
        Node shortest = lengthA > lengthB ? b : a;

        int diff = lengthA > lengthB ? lengthA - lengthB : lengthB - lengthA;

        while (diff > 0) {
            longest = longest.next;
            diff--;
        }

        while (longest.val != shortest.val) {
            longest = longest.next;
            shortest = shortest.next;
        }
        return shortest;
    }

    public static void main(String[] args) {
        Node a = Node.build1();
        Node b = Node.build2();
        Node intersect = intersectionPoint(a, b);
        System.out.println(intersect.val);

    }

}
