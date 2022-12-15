class Solution {
    public String solution(String s) {
        String answer = "";
        
        double len = (double)s.length()/2;
        answer = s.substring((int)Math.ceil(len-1),(int)Math.floor(len+1));
        return answer;
    }
}