package leetcode215;

import java.util.Arrays;


//对撞指针
// 时间复杂度 O(n)
//空间复杂度 O(1)
public class Solution {
	public int[] twoSum(int[] nums, int target){
		assert ( nums.length >= 2);
		int l = 0;
		int r = nums.length -1;
		while (l < r){
			if (nums[l] + nums[r] == target){
				int[] res =  { l+1, r+1};
				return res;
			} else if (nums[l] + nums[r] < target){
				l ++;
			}else {
				r --;
			}
		}
		return null; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tst = { 1,2,3,4,5,6,7};
		Solution testSolution = new Solution();
		int[] answer = testSolution.twoSum(tst,8);
		System.out.println(Arrays.toString(answer));
	}

}
