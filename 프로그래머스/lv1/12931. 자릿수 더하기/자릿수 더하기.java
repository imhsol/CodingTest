public class Solution {
	
    public static int solution(int n) {
        int answer = 0;
        String strN = Integer.toString(n);
        
        for(int i=0;i<strN.length();i++) {
        	answer += Character.getNumericValue(strN.charAt(i));
        }
        return answer;
    }
}