class Solution {
    public int solution(int a, int b, int n) {   
        int left = n;
        int result = 0;
  
        while(left>=a || left==0){
        	int get = (left/a)*b;
        	result += get; 
        	left = (left%a) + get;
        }
        
        return result;
    }
}