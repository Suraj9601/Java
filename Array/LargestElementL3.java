public class LargestElementL3 {
    public static void main(String[] args) {
        int arr[] = { 8, 4, 6, 2, 3, 9, 5 };
        int max = arr[0];

        for(int ele:arr){
            if(max<ele) {
                max = ele;
            }
        }
        System.out.println(max);
    }
}
