import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();
        int user = stages.length;
        
        for(int i=0;i<N;i++) {
        	int cnt = 0;
        	for(int j=0;j<stages.length;j++) {
        		if(stages[j]==i+1) {
        			cnt++;
        		}
        	}
        	map.put(i+1, cnt==0? 0.0:(double)cnt/user);
        	user -= cnt;
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for(int i=0;i<N;i++) {
        	answer[i] = list.get(i).getKey();
        }
        
        return answer;
    }
}