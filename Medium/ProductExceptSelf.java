import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // Input : [1,2,3,4] 
        // Output:[24,12,8,6]

        // Product of all other elements except current element.

        // Logic: 1
        /* 
         * Calc: Pre mul except curr in order - [1,1,2,6]
         * Calc: Post mul except curr reverse order - [24,12,4,1]
         * Finally: multiply: pre and post we will get - [24,12,8,6] : output
         */


         // Logic: 2 - Efficient
        /* Intialize result arr as 1.  Maintain pre, post var to update with curr value.
         * Calc: Pre mul along curr in order - [1,2,6,24], along with update pre var by multiply with curr element.
         * update post var by multiply with curr element.
         * Calc: Post mul along curr reverse order - [24,12,8,6]
         * link to refer: https://www.youtube.com/watch?v=SBaDmCdwaQU
         */


        int pre = 1;
        int post = 1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++) result[i] = 1;

        for(int i=0;i<nums.length;i++){
            result[i] *= pre;
            pre *= nums[i];    
        }

        for(int i=nums.length-1;i>=0;i--){
            result[i] *= post;
            post *= nums[i];    
        }
        System.out.println(Arrays.toString(result));
    }

}
