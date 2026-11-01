class Solution {
    public String largestEven(String s) {
        //String s1 = "";
        StringBuilder s1 = new StringBuilder();
        int n = s.length();
        int j = -1;
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == '2') {
                j = i;
                break;
            }
        }
        for(int i = 0; i <= j; i++) {
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}