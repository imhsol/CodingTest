class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
		int len1 = arr1[0].length;
		
        int[][] answer = new int[len][len1];
        
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len1;j++) {
        		answer[i][j] = arr1[i][j];
        	}
        }
        
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len1;j++) {
        		answer[i][j] += arr2[i][j];
        	}
        }
        
        return answer;
    }
}