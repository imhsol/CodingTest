class Solution {
    
    public String change(String s){
        s = s.replaceAll("zero","0");
        s = s.replaceAll("one","1");
        s = s.replaceAll("two","2");
        s = s.replaceAll("three","3");
        s = s.replaceAll("four","4");
        s = s.replaceAll("five","5");
        s = s.replaceAll("six","6");
        s = s.replaceAll("seven","7");
        s = s.replaceAll("eight","8");
        s = s.replaceAll("nine","9");
        
        return s;
    }
    
    public int solution(String s) {
        
        int answer = 0;
        int lenS = s.length();
        
        String str = change(s);
        answer = Integer.parseInt(str);
        return answer;
        
    }
}