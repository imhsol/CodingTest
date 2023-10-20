import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<nums.length; i++){
			if(set.size()<nums.length/2 && !set.contains(nums[i])){
				set.add(nums[i]);
				answer++;
			}
		}
		return answer;
    }
}