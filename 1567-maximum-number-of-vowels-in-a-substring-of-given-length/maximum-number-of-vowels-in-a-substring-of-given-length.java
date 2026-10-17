class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        //int maxi = cntVowels(s.substring(0, k), n, k);
        int cnt = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int maxi = cntValues(hm);
        for(int i = 1; i <= n - k; i++) {
            char leftCh = s.charAt(i - 1);
            if(isVowel(leftCh)) {
                if(hm.get(leftCh) == 1) hm.remove(leftCh);
                else {
                    hm.put(leftCh, hm.get(leftCh) - 1);
                }

            }

            char rightCh = s.charAt(i + k - 1);
            if(isVowel(rightCh)) hm.put(rightCh, hm.getOrDefault(rightCh, 0) + 1);
            maxi = Math.max(maxi, cntValues(hm));
        }
        return maxi;
    }
    // public static int cntVowels(String s, int n, int k) {
    //     int cnt = 0;
    //     for(char ch : s.toCharArray()) {
    //         if(isVowel(ch)) {
    //             cnt++;
    //         }
    //     }
    //     return cnt;
    // }
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public static int cntValues(HashMap<Character, Integer> hm) {
        int cnt = 0;
        for(char ch : hm.keySet()) {
            cnt += hm.get(ch);
        }
        return cnt;
    }
}