import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<Character> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
        	list.add(s.charAt(i));
        }
        
        list.sort(Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(Character c : list) {
        	sb.append(c);
        }
        
        String answer = sb.toString();
        return answer;
    }
}