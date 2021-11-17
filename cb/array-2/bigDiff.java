public class bigDiff {

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/
	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			int newMin = Math.min(nums[i], nums[i + 1]);
			int newMax = Math.max(nums[i], nums[i + 1]);
			if (newMin <= min) { min = newMin; }
			if (newMax >= max) { max = newMax; }
		}
		return (max - min);
	}

	public static void main(String[] args) {
		bigDiff test = new bigDiff();
		System.out.println(test.bigDiff(new int[] {10, 3, 5, 6}));
                System.out.println(test.bigDiff(new int[] {7, 2, 10, 9}));
                System.out.println(test.bigDiff(new int[] {2, 10, 7, 2}));
	}
}
