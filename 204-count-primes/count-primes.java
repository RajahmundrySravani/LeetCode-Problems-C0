class Solution {
    public int countPrimes(int n) {
        boolean[] p = new boolean[n + 1];
	    Arrays.fill(p, true);
	    if(n >= 0) p[0] = false;
	    if(n >= 1) p[1] = false;
	    for(int i = 2; i * i < n ; i++) {
	        if(p[i]) {
    	        for(int j = i * i; j < n; j += i) {
    	            p[j] = false;
    	        }
	        }
	    }
	    int cnt = 0;
	    for(int i = 0; i < n; i++) {
	        if(p[i]) cnt++;
	    }
	    return cnt;

    }
}