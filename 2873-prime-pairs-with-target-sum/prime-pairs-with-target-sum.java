class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<Integer> all = allPrimes(n);
        int n1 = all.size();
        List<List<Integer>> ans = new ArrayList<>();
        int l = 0;
        int r = n1 - 1;
        while(l <= r) {
            int sum = all.get(l) + all.get(r);
            if(sum == n) {
                List<Integer> a = new ArrayList<>();
                a.add(all.get(l));
                a.add(all.get(r));
                ans.add(a);
                l++;
                r--;
            }
            else if(sum > n) {
                r--;
            }
            else {
                l++;
            }
        }
        return ans;
    }
    public static List<Integer> allPrimes(int  n) {
        boolean isPrime[] = new boolean[n + 1];
        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; 
                }
            }
        }
        List<Integer> a = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                a.add(i);
            }
        }
        return a;
    }
}