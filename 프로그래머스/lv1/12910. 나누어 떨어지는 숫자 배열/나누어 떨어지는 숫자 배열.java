import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        int num = 0;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) { size++; }
        }
        
        if(size==0) {
        	int[] answer = {-1};
        	return answer;
        } else {
        	int[] answer = new int[size];
            
            for(int i=0;i<arr.length;i++) {
            	if(arr[i]%divisor==0) {
            		answer[num] = arr[i];
            		num++;
            	}
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}