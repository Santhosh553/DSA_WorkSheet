import java.util.Scanner;
public class MaxConSubArray{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;arr[i++]=sc.nextInt());

            int curr=0;
            int max=0;
            for(int i=0;i<n;i++){
                curr=curr+arr[i];
                if(curr<0)
                curr=0;

                if(max<curr)
                max=curr;
            }

            System.out.println(max);
    }
}