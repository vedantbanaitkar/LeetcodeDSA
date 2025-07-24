class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int k = x % 10;

            // \U0001f7e2 Check *r*, not x
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && k > 7)) return 0;
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && k < -8)) return 0;

            r = r * 10 + k;
            x /= 10;
        }
        return r;
    }
}
