class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) rev(nums, 0, n - 1);
        else {
            for(int i = n - 1; i > ind; i--) {
                if(nums[i] > nums[ind]) {
                    swap(nums, ind, i);
                    break;
                }
            }
            rev(nums, ind + 1, n - 1);
        }
    }
    public static void rev(int[] a, int i, int j) {
        while(i <= j) {
            swap(a, i++, j--);
            // i++;
            // j--;
        }

    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}