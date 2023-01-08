class Solution {
    public boolean solution(int x) {
        boolean answer;
        String str = Integer.toString(x);
        int sum = 0;
        
        for(int i=0; i<str.length();i++) {
        	sum += Character.getNumericValue(str.charAt(i));
        }
        
        return answer = (x%sum==0) ? true : false;
    }
}