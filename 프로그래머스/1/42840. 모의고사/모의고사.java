import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; 
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] score = {0,0,0};

		for(int i=0; i<answers.length; i++) {
			if(answers[i] == a[i%a.length]) score[0] += 1; 
			if(answers[i] == b[i%b.length]) score[1] += 1; 
			if(answers[i] == c[i%c.length]) score[2] += 1; 
		} 
		
		int max = Math.max(score[0], Math.max(score[1], score[2]));
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<score.length; i++){
			if(max == score[i]) list.add(i+1);
		}
		Collections.sort(list);
		
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
    }
}