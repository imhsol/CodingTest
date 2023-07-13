class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length()-p.length();
        long pNum = Long.parseLong(p);
        
        for(int i=0;i<=len;i++) {
        	long n = Long.parseLong(t.substring(i,i+p.length()));
        	answer += n<pNum||n==pNum?1:0;
        }
        
        return answer;
    }
}