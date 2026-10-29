class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums) {
            for(int i = 2; i <= n / i; i++) {
                if(n % i == 0) {
                    hs.add(i);
                    while(n % i == 0) {
                        n /= i;
                    }
                }
            }
            if(n > 1) hs.add(n);
        }
        return hs.size();
    }
}