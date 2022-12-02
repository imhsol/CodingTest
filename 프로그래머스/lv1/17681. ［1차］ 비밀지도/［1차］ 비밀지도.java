class Solution {
    
public static String[] binaryNum(int n, int[] arr) {
		
		String[] newArr = new String[n];
        
		// 이진수 변환
        for(int i=0;i<n;i++) {
        	newArr[i] = Integer.toBinaryString(arr[i]);
        }
		
        // 0 채우기
		for(int i=0;i<n;i++) {
			int len = n - newArr[i].length();
			
			if(newArr[i].length()!=n) {
				String zero = "";
				for(int j=0;j<len;j++) {
					zero += 0;
				}
				newArr[i] = zero + newArr[i];
			}
		}
		
		return newArr;
		}
		
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 이진수 변환 메소드
        String[] newArr1 = binaryNum(n,arr1);
        String[] newArr2 = binaryNum(n,arr2);
        
        // 암호 변환
        for(int i=0;i<n;i++) {
        	newArr1[i] = newArr1[i].replaceAll("1","#");
        	newArr1[i] = newArr1[i].replaceAll("0"," ");
        	newArr2[i] = newArr2[i].replaceAll("1","#");
        	newArr2[i] = newArr2[i].replaceAll("0"," ");
        }
        
        for(int i=0;i<n;i++) {
        	String s = "";
        	for(int j=0;j<n;j++) {
        		if(newArr1[i].charAt(j)=='#' || newArr2[i].charAt(j)=='#') {
        			s += "#";
        		} else {
        			s += " ";
        		}
        	}
        	System.out.println("s: " + s);
        	answer[i] = s;
        }
        
        return answer;
    }
}