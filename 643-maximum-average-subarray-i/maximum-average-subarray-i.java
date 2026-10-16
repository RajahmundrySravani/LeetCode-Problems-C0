class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        double sum = 0;
        int p = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxi = sum / k;
        for(int i = 1; i <= n - k; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            maxi = Math.max(maxi, (double)sum / k);
        }
        return maxi;
    }
}