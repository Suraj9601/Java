import java.util.ArrayList;

public class SearchAllOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,1,7,5,8,2,1};
        int target = 1;
        System.out.println("Indexes : "+ linearSearch(arr, target));
    }

    static ArrayList<Integer> linearSearch(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
