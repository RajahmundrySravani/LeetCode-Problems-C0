class Solution {
    public int countGoodSubstrings(String s) {
        int k = 3;
        int n = s.length();
        if(k <= 0 || k > n) return 0;
		HashMap<Character, Integer> hm = new HashMap<>();
		int cnt = 0;
		for(int i = 0; i < k; i++) {
			char ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);			
		}
		if(hm.size() == k) cnt++;
		for(int i = 1; i <= n - k; i++) {
			char leftCh = s.charAt(i - 1);
			if(hm.get(leftCh) == 1) hm.remove(leftCh);
			else {
				hm.put(leftCh, hm.get(leftCh) - 1);
			}

			char rightCh = s.charAt(i + k - 1);
			hm.put(rightCh, hm.getOrDefault(rightCh, 0) + 1);
			if(hm.size() == k) cnt++;
		}
		return cnt;

    }
}