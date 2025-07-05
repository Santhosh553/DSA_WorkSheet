import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        /*
         * Lucky Integer:  a lucky integer is an integer that has a frequency in the array equal to its value.
         * Return the largest lucky integer in the array. If there is no lucky integer return -1.
         */

         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getKey()==e.getValue())
            max = Math.max(max, e.getValue());
        }

        System.out.println(max);
    }
}
