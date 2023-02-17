class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String str = "^([0-9]*)$";
        int len = s.length();
        
        if(len==4||len==6) {
        	answer = s.matches(str) ? true : false;
        } else { answer = false; }
        return answer;
    }
}