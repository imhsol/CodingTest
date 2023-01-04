class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(true) {
        	if(num==1) {
        		answer = 0; break;
        	} else if(num%2==1) {
        		num = num*3+1;
        	} else if(num%2==0) {
        		num /= 2;
        	}
        	answer++;
        	
        	if(num==1) {
        		break;
        	} else if(answer==500) {
        		answer = -1; break;
        	}
        }
        return answer;
    }
}