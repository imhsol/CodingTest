class Solution {
    public int[] solution(long n) {
         String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int strLen = str.length();
        
        for(int i=0;i<str.length();i++) {
        	strLen--;
        	answer[i] = Character.getNumericValue(str.charAt(strLen));
        }
        return answer;
    }
}