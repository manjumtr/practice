import java.util.HashSet;
import java.util.Set;

public class LongestSSWithoutRePChar {

    public static int length(String s) {
        int n = s.length();
        int length = 0;

        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
                length = Math.max(length, j - i);
            }

        }
        return length;
    }

    public static void main(String[] args) {
        String str = "abcabcdb";
        System.out.println(length(str));

    }
}
