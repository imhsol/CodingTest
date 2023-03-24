class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] arr = new int[sizes.length][2];
        int width = 0;
        int length = 0;
        
        for(int i=0;i<sizes.length;i++) {
        	arr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
        	arr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        	
        	width = arr[i][0]>width ? arr[i][0] : width;
        	length = arr[i][1]>length ? arr[i][1] : length;
        }
        
//        Arrays.deepToString(): 다차원 배열의 값을 문자열로 리턴받아 출력 가능
//        System.out.println(Arrays.deepToString(arr));
        
        return answer = width*length;
    }
}