import java.util.Stack;

class Solution {
	boolean solution(String s) {
        boolean answer = true;
        Stack st = new Stack();

        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='(') {
        		st.push('(');
        	} else if(s.charAt(i)==')') {
        		if(st.empty()) {
        			return answer = false;
        		} else {
        			st.pop();
        		}
        	}
        }
        return answer = st.empty();
    }
}