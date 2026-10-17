class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(k <= 0 || k > n) return 0;
        long sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < k; i++) {
            sum += nums[i];
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        long maxi = 0;
        if(hm.size() == k) {
            maxi = Math.max(maxi, sum);
        }
        for(int i = 1; i <= n - k; i++) {
            int left = nums[i - 1];
            if(hm.get(left) == 1) hm.remove(left);
            else {
                hm.put(left, hm.get(left) - 1);
            }
            sum -= left;
            int right = nums[i + k - 1];
            hm.put(right, hm.getOrDefault(right, 0)+ 1);
            sum += right;
            if(hm.size() == k) {
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}