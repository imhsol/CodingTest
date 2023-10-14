import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

		for(int i=0; i<numbers.length-1; i++){
			for(int j=i+1; j<numbers.length; j++){
				int n = numbers[i]+numbers[j];
				if(list.contains(n)) continue;
				list.add(n);
			}
		}
		
		Collections.sort(list);
		int[] answer = new int[list.size()];

		for(int i=0; i<list.size(); i++){
			answer[i] = list.get(i);
		}
		
        return answer;
    }
}