class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String st = "";
        int sti = 0;
        int stn = 0;
        for(int i = 0; i < n; i++) {
            if(strs[i].length() < strs[sti].length()) {
                sti = i;
            }
        }
        stn = strs[sti].length();
        st += strs[sti];
        int j = eachString(strs, stn, st);
        String sub = st.substring(0, j);
        return sub;
        
    }
    public static int eachString(String strs[], int stn, String st) {
        int i = 0;
        while(i < stn) {
            for(String s : strs) {
                if(st.charAt(i) != s.charAt(i)) return i;
            }
            i++;
        }
        return stn;
    }
}