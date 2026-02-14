public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 5, 7, 9, 1, 7 };
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }

        for (int num : newArr) {
            System.out.println(num);
        }
    }
}