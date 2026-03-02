

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6, 3, 2, 6 };
        repeatingElement(arr);
    }

    static void repeatingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j =i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("First repeated element : "+arr[i]);
                    return;
                }
            }
        }
        System.out.println("No repeated element in array.");
    }
}
