import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
		int hit = 1;
		int miss = 5;
        
        if(cacheSize==0) {
			return answer = cities.length*5;
		}
		
		String[] citiesLow = new String[cities.length];
		for(int i=0;i<cities.length;i++) {
			citiesLow[i] = cities[i].toLowerCase();
		}
		
		Queue<String> que = new LinkedList<>();
		
		for(int i=0;i<citiesLow.length;i++) {
			if(que.contains(citiesLow[i])) {
				answer += hit;
				que.remove(citiesLow[i]);
				que.add(citiesLow[i]);
			} else {
				if(que.size()==cacheSize) {
					answer += miss;
					que.poll();
					que.add(citiesLow[i]);
				} else {
					answer += miss;
					que.add(citiesLow[i]);
				}
			}
		}
        return answer;
    }
}