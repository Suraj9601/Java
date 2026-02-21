import java.util.Arrays;
class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,3,2,0,6,0,4};
        int j = 0;
        for (int i = 0; i< nums.length; i++) {
            if(nums[i] != 0 ) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    
    }
}