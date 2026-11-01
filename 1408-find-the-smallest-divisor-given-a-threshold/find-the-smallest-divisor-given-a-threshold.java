class Solution {
    public int smallestDivisor(int[] nums, int tr) {
        int n = nums.length;
        int l = 1;
        int h = mx(nums, n);
        int id = h;
        while(l <= h) {
            int m = l + (h - l) / 2;
            double sum = div(nums, n, m);
            if(sum > tr) l = m + 1;
            else {
                id = m;
                h = m - 1;
            }
        }
        return id;
    }
    public static int mx(int[] a, int n) {
        int maxi = a[0];
        for(int i = 1; i < n; i++) {
            maxi = Math.max(a[i], maxi);
        }
        return maxi;
    }
    public static double div(int[] a, int n, int m) {
        double sum = 0;
        for(int i = 0; i < n; i++) {
        sum += Math.ceil((double) a[i] / m);        }
        return sum;
    }
}