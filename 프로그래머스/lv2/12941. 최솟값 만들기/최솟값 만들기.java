import java.util.Arrays;

class Solution
{
    public int solution(int []a, int []b)
    {
        int answer = 0;
        int num = a.length;

        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i<a.length; i++) {
        	answer += a[i]*b[--num];
        }
        return answer;
    }
}