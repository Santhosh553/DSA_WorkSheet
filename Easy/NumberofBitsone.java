// Hamming Weight
// convert integer to binary then count only the number of 1 bit's
import java.util.Scanner;

public class NumberofBitsone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=31;i>=0;i--){
            int k=n>>i;
            if((k&1)>0)
            count++;
        }
        System.out.println(count);
    }
}
