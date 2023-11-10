class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int[] result = new int[3];
		
		int n = 0, num = 0;
		String dart = "";
		
		for(int i=0; i<dartResult.length(); i++){
			char c = dartResult.charAt(i);
			
			if(c>='0' && c<='9'){
				dart += String.valueOf(c);
			}
			
			else if(c=='S' || c=='D' || c=='T'){
				num = Integer.parseInt(dart);
				if(c=='S'){
					result[n] = (int)Math.pow(num, 1);
				} else if(c=='D'){
					result[n] = (int)Math.pow(num, 2);
				} else if(c=='T'){
					result[n] = (int)Math.pow(num, 3);
				}
				n++;
				dart = "";
			}
			
			else if(c=='*' || c=='#'){
				if(c=='*'){
					result[n-1] *= 2;
					if(n-2>=0) result[n-2]*=2; 
				} else if(c=='#'){
					result[n-1] *= (-1);
				}
			}
			
		}
		answer = result[0]+result[1]+result[2];
		return answer;
    }
}