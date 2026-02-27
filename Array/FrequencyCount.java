public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 5, 8, 1, 5 };
        int left = 0;
        int right = 1;
        int count = 0;

        while(left<right){
            if (arr[left]==arr[right]) {
                count++;
                right++;
            }
        }
        

        
    }
}
