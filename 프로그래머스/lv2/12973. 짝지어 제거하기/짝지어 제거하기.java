import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(!st.isEmpty() && st.peek()==s.charAt(i)) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		
		answer = st.size()==0? 1 : 0;
		return answer;
    }
}