import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
		String[] arr = s.split(" ");
		
		List<Integer> list = new ArrayList<>();

		for(String str:arr) {
			list.add(Integer.parseInt(str));
		}

		return answer += Collections.min(list) + " " + Collections.max(list);
    }
}