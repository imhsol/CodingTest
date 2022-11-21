class Solution {
    public String solution(String new_id) {
               String answer = "";
        
        //1. 대문자 -> 소문자
        answer = new_id.toLowerCase();
        
        //2. 알파벳 소문자, 숫자, -, _, . 제외 문자 제거
        /* [ ] 안에 있는 문자가 ^ 아닌 것 */
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        //3. .가 2번 이상 연속된 부분 하나의 .로 치환
        /* [자바 정규식]
         * \ : escape문자. 다음에 일반 문자가 오면 특수문자 취급하며, 특수문자가 오면 그 문자 자체를 의미
         *     "" 내에서 사용시 \\ 두 번 사용해야 함 (.를 문자로 인식하기 위해 사용) 
         * {2,} : 최소 2자리 이상의 숫자 
         * => \\.{2,} : 최소 2자리 이상의 .(마침표) */
        answer = answer.replaceAll("\\.{2,}", ".");
        
        //4. .가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5. 빈 문자열인 경우 a 대입
        if(answer.length()==0) {
        	answer = answer.replaceAll("", "a");
        }
        
        //6. 길이 16자 이상인 경우 첫 15문자 제외 나머지 제거 (끝에 .있는 경우 제거)
        if(answer.length()>=16) {
        	answer = answer.substring(0,15);
        	/* [.]& : [.으로] 끝나는$ 문자열 */
        	answer = answer.replaceAll("[.]$", "");
        }
    	
        //7. 길이 2자 이하인 경우 마지막 문자를 길이 3 될때까지 반복해 붙임
        if(answer.length()<=2) {
        	for(int i=answer.length();i<3;i++) {
        		char last = answer.charAt(answer.length()-1);
        		answer += last;
        	}
        }
    	
        return answer;
    }

}