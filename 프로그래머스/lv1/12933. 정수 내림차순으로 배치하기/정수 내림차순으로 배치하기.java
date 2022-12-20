class Solution {
    public long solution(long n) {
        
        long answer = 0;
        String str = Long.toString(n);
       
        int[] arr = new int[str.length()];   
        
        for(int i=0;i<str.length();i++) {
        	//Character.getNumericValue(char) : 숫자 형태의 char를 int로 변환하는 메소드
        	arr[i] = Character.getNumericValue(str.charAt(i));
        }
        
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=i;j<arr.length;j++) {
        		int num=0;
        		if(arr[i]<arr[j]) {
        			num = arr[i];
        			arr[i]=arr[j];
        			arr[j]=num;
        		}
        	}
        }
        
        String StrAnswer = "";
        for(int i=0;i<arr.length;i++) {
        	StrAnswer += String.valueOf(arr[i]);
        }
        
        answer = Long.parseLong(StrAnswer);
        
        return answer;
    }
}