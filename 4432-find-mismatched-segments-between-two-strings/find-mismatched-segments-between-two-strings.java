class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        int n1 = s1.length();
        int i = 0;
        int i0 = 0;
        while(i < n1) {
            if(s1.charAt(i) != s2.charAt(i)) {
                i0 = i;
                while(i < n1 && s1.charAt(i) != s2.charAt(i)) {
                    i++;
                }
                List<String> a = new ArrayList<>();
                a.add(s1.substring(i0, i));
                a.add(s2.substring(i0, i));
                ans.add(a);
            }
            else i++;
        }
        return ans;
    }
}