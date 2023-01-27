class Solution {
    public String solution(int n) {
        String answer="";
        int num = 1;
        
        for(int i=0;i<n;i++) {
        	answer += num%2==1 ? "수" : "박" ;
        	num++;
        }
        return answer;
    }
}