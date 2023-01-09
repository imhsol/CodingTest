import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
    	
    	List<Integer> arrList = new ArrayList<>();
    	for(int i:arr) {
    		arrList.add(i);
    	}
    	
    	int min = Collections.min(arrList);
    	arrList.remove(arrList.indexOf(min));
    	
    	int[] answer = new int[arrList.size()];

    	for(int i=0;i<answer.length;i++) {
    		answer[i] = arrList.get(i);
    	}
    	
    	for(int i:answer) {
    		System.out.print(i + " ");
    	}
    	
    	return answer;
    }
}