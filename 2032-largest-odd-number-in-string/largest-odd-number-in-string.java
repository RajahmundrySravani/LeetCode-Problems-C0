class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int i = 0;
        int j = n - 1;
        String s = "";
        while(i < n && num.charAt(i) == 0) {
            i++;
        }
        while(j >= 0 && num.charAt(j) % 2 == 0) j--;
        while(i <= j) {
            s += num.charAt(i);
            i++;
        }
        return s;
    }
}