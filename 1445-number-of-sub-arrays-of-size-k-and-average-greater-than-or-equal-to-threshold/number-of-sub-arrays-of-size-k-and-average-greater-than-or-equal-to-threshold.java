class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int n = nums.length;
        
        int sum = 0;
        int p = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int cnt = (sum / k >= threshold) ? 1 : 0;
        for(int i = 1; i <= n - k; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            if(sum / k >= threshold) cnt++;
        }
        return cnt;
    }
}