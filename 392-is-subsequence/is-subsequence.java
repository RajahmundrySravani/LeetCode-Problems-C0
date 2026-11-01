class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 > n2) return false;
        int i = 0;
        int j = 0;
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        while(i < n1 && j < n2) {
            if(a1[i] == a2[j]) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if(i == n1) return true;
        return false;
    }
}