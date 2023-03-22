class Solution {
    public int solution(int n) {
        int answer = 0;
        // Integer.bitCount(i): 주어진 수에서 true(=1)의 수를 반환하는 함수
        int bitCnt = Integer.bitCount(n);
        
        for(int i=n+1;i<2*n;i++) {
        	
        	if(Integer.bitCount(i)!=bitCnt) {
        		continue;
        	} 
        	
        	answer = i; break;
        }
        return answer;
    }
}