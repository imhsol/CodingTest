class Solution {
    public String solution(int[] food) {
        String answer = "";
		String answer2 = "";
		
		for(int i=1; i<food.length; i++){
			for(int j=1; j<=food[i]/2; j++){
				answer += Integer.toString(i);
				answer2 += Integer.toString(i);
			}
		}
		
		answer += "0";
		for(int i=answer2.length(); i>0; i--){
			answer += answer2.substring(i-1,i);
		}
		
		return answer;
    }
}