class Solution {
    public static int solution(int number, int limit, int power) {
		int answer = 0;
		
		for(int i=1; i<number+1; i++) {
			int n = count(i);
			if(n>limit) n = power;
			answer += n;
		}
		return answer;
	}
	
	public static int count(int n) {
		int cnt = 0;
		
		for(int i=1; i*i<=n; i++) {
			if(i*i == n) {
				cnt++;
			} else if(n%i == 0) {
				cnt += 2;
			}
		}
		return cnt;
	}
}