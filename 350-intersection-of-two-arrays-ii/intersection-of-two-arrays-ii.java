class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums2[j] < nums1[i]) {
                j++;
            }
            else {
                a.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[a.size()];
        for(i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
}