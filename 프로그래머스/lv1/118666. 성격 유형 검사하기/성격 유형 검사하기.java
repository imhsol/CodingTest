import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<survey.length;i++) {
        	
        	int c = choices[i];
        	String a = survey[i].substring(0, 1);
        	String b = survey[i].substring(1,2);

        	/* getOrDefault(Object key, V DefaultValue) 
        	 * key : 값을 가져와야 하는 요소의 키
        	 * defaultValue : 저장된 키로 매핑된 값이 없는 경우 반환되는 기본값
        	 * map에 key가 존재하면 매핑된 값을 반환하고,
        	 * 그렇지 않으면 매개변수로 받은 디폴트 값을 반환한다.*/
        	if(c<4) {
        		map.put(a, map.getOrDefault(a, 0)+(4-c));
        	} else if(c>4) {
        		map.put(b, map.getOrDefault(b, 0)+(c-4));
        	}
        	
        }
        System.out.println(map);
        
        List<String> list = new ArrayList<>();
        list.add(map.getOrDefault("R",0)>=map.getOrDefault("T", 0)?"R":"T");
        list.add(map.getOrDefault("C",0)>=map.getOrDefault("F", 0)?"C":"F");
        list.add(map.getOrDefault("J",0)>=map.getOrDefault("M", 0)?"J":"M");
        list.add(map.getOrDefault("A",0)>=map.getOrDefault("N", 0)?"A":"N");
        
        for(String str:list) {
        	answer += str;
        }
        
        return answer;
    }
}