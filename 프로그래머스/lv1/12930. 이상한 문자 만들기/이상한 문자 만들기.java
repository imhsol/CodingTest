class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        int n = 1;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals(" ")) {
        		answer += " ";
        		n = 1;
        		continue;
        	}
        	answer += n%2==1 ? arr[i].toUpperCase() : arr[i].toLowerCase();
        	n++;
        }
        
        return answer;
    }
}