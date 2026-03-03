public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 3,-4,5,4,-1,7,-8 };
        maxSum(arr);
    }

    static void maxSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
