import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static int[] getIndices(int[] arr, int target){
        int[] arr1 = new int[]{};

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                arr1 = new int[]{map.get(diff),i};
            }

            map.put(arr[i],i);
        }

        return arr1;




    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getIndices(new int[]{1, 2, 3, 5}, 5)));

    }
}
