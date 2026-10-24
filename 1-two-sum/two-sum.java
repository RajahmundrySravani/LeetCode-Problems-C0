class Solution {
    public int[] twoSum(int[] nums, int target) {
        //testing extension 
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] a = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int x = target - nums[i];
            if(hm.containsKey(x)) {
                a[0] = i;
                a[1] = hm.get(x);
                return a;
            }
            hm.put(nums[i], i);
        }
        return a;
    }
}