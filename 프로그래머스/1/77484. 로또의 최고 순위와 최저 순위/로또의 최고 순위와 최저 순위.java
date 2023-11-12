class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int zero=0, cnt=0;

		for(int i=0; i<lottos.length; i++) {
			if(lottos[i]==0) zero++;
			for(int j=0; j<win_nums.length; j++) {
				if(lottos[i]==win_nums[j]) cnt++;
			}
		}

		// 최고
		answer[0] = zero+cnt <2 ? 6 : 7-(zero+cnt);
		// 최저
		answer[1] = cnt==0 ? 6: 7-cnt;
		
		return answer;
    }
}