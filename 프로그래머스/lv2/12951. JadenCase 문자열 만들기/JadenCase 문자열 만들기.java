class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals("")) {
        		answer += " ";
        	} else {
        		answer += arr[i].substring(0,1).toUpperCase();
        		answer += arr[i].substring(1).toLowerCase();
        		answer += " ";
        	}
        }
        
        if(s.lastIndexOf(" ")==s.length()-1) {
        	return answer;
        } else {
        	return answer.substring(0,answer.length()-1);
        }
    }
}