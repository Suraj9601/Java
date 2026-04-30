import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] twoSum(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st < end) {
            if (nums[st] + nums[end] == target)
                return new int[] { st, end };
            if (nums[st] + nums[end] > target)
                end--;
            if (nums[st] + nums[end] < target)
                st++;
        }

        return new int[] { -1, -1 };
    }
}
