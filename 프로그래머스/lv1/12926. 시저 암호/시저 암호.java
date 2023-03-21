class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++) {
        	char c = s.charAt(i);

        	if(c==' ') {
        		answer += " ";
        	} else if('A'<=c && c<='Z') {
        		answer += c+n>'Z' ? (char)(c+n-26) : (char)(c+n);
        	} else if('a'<=c && c<='z') {
        		answer += c+n>'z' ? (char)(c+n-26) : (char)(c+n);
        	}
        }
        return answer;
    }
}