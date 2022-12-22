class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int[] arr = new int[max-min+1];
        int num = min;
        
        for(int i=0;i<max-min+1;i++) {
        	arr[i] = num; 
        	num++;
        	if(num==max+1) {break;}
        }
        
        for(int sum:arr) {
        	answer += sum;
        }
        return answer;
    }
}