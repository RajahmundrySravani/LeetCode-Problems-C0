class Solution {
    public int[] closestPrimes(int l, int h) {
        int[] a = {-1, -1};
        int prev = -1;
        int mini = Integer.MAX_VALUE;
        while(l <= h) {
            if(isPrime(l)) {
                if(prev != -1) {
                    int diff = l - prev;
                    if(diff < mini) {
                        mini = diff;
                        a[0] = prev;
                        a[1] = l;
                    }
                    if(diff == 1 || diff == 2) return a;
                }
                prev = l;
            }
            l++;
        }
        return a;
    }
    public static boolean isPrime(int n) {
            // code here
            if(n <= 1) return false;
            if(n == 2 || n == 3) return true;
            if(n % 2 == 0) return false;
            if(n % 3 == 0) return false;
            for(int i = 5; i * i <= n; i += 6) {
                if(n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
    }
}