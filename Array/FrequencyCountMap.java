import java.util.HashMap;
import java.util.Map;

public class FrequencyCountMap {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,1,8,2,9,1,4,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
