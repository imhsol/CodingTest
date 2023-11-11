class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		String[] baby = {"aya", "ye", "woo", "ma"};
		String[] twin = {"ayaaya", "yeye", "woowoo", "mama"};
		
		for(int i=0; i<babbling.length; i++){
			String s = babbling[i];
			for(int j=0; j<baby.length; j++){
				babbling[i] = babbling[i].replace(twin[j], ".");
				babbling[i] = babbling[i].replace(baby[j], " ");
			}
            
			babbling[i] = babbling[i].replaceAll(" ", "");
			if(babbling[i].length()==0) answer++;
		}
		
		return answer;
    }
}