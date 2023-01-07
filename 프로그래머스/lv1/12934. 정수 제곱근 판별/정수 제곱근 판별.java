class Solution {
    public long solution(long n) {
    	long answer;

        double d = Math.sqrt(n);
        long l = (long)d;
        
        return answer = (d==l) ? (l+1)*(l+1) : -1;
    }
}