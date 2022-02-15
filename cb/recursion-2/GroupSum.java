public class GroupSum {
  public static boolean groupSum(int start, int[] nums, int target) {
    if (start == nums.length) {
      return false;
    }
    if (groupSum(start + 1, nums, target, target - nums[start])) {
      return true;
    }
    return groupSum (start + 1, nums, target);
  }
}
