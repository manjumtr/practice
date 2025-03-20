public class Koko {

    public static int koko(int[] piles, int h) {
        int max = max(piles);
        for (int i = 1; i <= max; i++) {
            if (canFinish(piles, h, i)) {
                return i;
            }
        }
        return max;
    }

    public static boolean canFinish(int[] piles, int h, int k) {
        for (int i = 0; i < piles.length; i++) {
            h = h - Math.ceilDiv(piles[i], k);
        }

        return h < 0 ? false : true;
    }

    public static int max(int[] piles) {
        int max = piles[0];
        for (int i : piles) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] piles = { 332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077,
                337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728,
                941802184 };
        System.out.println(koko(piles, 823855818));
    }
}
