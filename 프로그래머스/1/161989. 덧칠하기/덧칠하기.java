class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
		
		int[] wall = new int[n];
		for(int i=0; i<section.length; i++){
			wall[section[i]-1] = 1;
		}

		for(int i=0; i<wall.length; i++){
			if(wall[i]==1){
				int brush = i;
				for(int j=0; j<m; j++){
					wall[brush] = 0;
					if(brush>=wall.length-1) {
						break;
					} else{
						brush++;
					}
				}
				answer++;
			}
		}
		return answer;
    }
}