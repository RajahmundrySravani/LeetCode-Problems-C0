class Solution {
    public int sumFourDivisors(int[] nums) {
        int GrandSum = 0;
        for(int i = 0; i < nums.length; i++) {
            GrandSum += findDivis(nums[i]);
        }
        return GrandSum;
    }
    public static int findDivis(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int sum = 0;
        for(int i = 1; i <= n / i; i++) {
            if(n % i == 0) {
                a.add(i);
                if(n / i != i) {
                    a.add(n / i);
                }
            }
        }
        if(a.size() == 4) {
            for(int i : a) {
                sum += i;
            }
        }
        else sum = 0;
        return sum;
    }
}