import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

		List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i=m-1; i<list.size(); i+=m){
			answer += list.get(i)*m;
		}
		
		System.out.println(answer);
		return answer;
    }
}