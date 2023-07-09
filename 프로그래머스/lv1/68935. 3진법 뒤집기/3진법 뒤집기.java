class Solution {
    public int solution(int n) {
        String answer = "";
        String str = Integer.toString(n,3);
        
        for(int i=str.length();i>0;i--) {
        	answer += str.substring(i-1,i);
        }
        
        return Integer.parseInt(answer,3);
    }
}