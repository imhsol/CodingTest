class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowerS = s.toLowerCase();
        int p=0;
        int y=0;
        
        for(int i=0;i<s.length();i++){
            if(lowerS.charAt(i)=='p'){
                p++;
            } else if(lowerS.charAt(i)=='y'){
                y++;
            }
        }
        
        if(p==y){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }
}