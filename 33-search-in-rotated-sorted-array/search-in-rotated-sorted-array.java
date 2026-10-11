class Solution {
    public int search(int[] nums, int key) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while(l <= h) {
            int m = l + (h - l) / 2;
            if(nums[m] == key) return m;
            else if(nums[l] <= nums[m]) {
                if(nums[l] <= key && key <= nums[m]) {
                    h = m;
                }
                else {
                    l = m + 1;
                }
            }
            else {
                if(nums[m] <= key && key <= nums[h]) {
                    l = m;
                }
                else {
                    h = m - 1;
                }
            }
        }
        return -1;
    }
}