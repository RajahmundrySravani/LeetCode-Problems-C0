class Solution {
    public String reverseWords(String s) {
        String nosp = s.trim().replaceAll("\\s+", " ");
        String[] words = nosp.split(" ");
        rev(words);
        return String.join(" ", words);
    }
    public static void rev(String[] a) {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while(i < j) {
            swap(i, j, a);
            i++; j--;
        }
    }
    public static void swap(int i, int j, String[] a) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}