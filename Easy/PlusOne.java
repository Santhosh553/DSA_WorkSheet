import java.util.Scanner;
/* 
 *  For this program, focus on 3 test cases: [1,2,3] which is normal we can add the last element
 * [1,9,9] which is a carry case, we need to add 1 to the next element and make the last element 0, here we need a loop to check for carry
 * [9, 9, 9] here, [1, 0, 0, 0] is the answer, so we need to create a new array and add 1 to the first element.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<number; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = plusOne(arr);
        System.out.println("The array after adding one is:");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}