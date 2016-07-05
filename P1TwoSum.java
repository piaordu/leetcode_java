package piaordu;

public class P1TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = {-1, -1};
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		P1TwoSum test = new P1TwoSum();
		int[] result = test.twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}
}
