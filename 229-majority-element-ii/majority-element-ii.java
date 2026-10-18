class Solution {
    public List<Integer> majorityElement(int[] nums) {
    
        
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = nums[i];
            hm.put(x, hm.getOrDefault(x, 0) + 1);
            if(hm.get(x) > (n / 3) && !a.contains(x)) {
                a.add(x);
            }
        }
        return a;

    }
}