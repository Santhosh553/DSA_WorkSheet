import java.util.Scanner;
public class SecondlargeSmallArray  {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        for(int i:a)
        {
            if(i>large)
            {
                slarge = large;
                large = i;
            }
            else if(i>slarge && i!=large)
            slarge=i;

        }
        //System.out.print("slarge: "+slarge);

        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        for(int i:a)
        {
            if(i<small)
            {
                ssmall = small;
                small = i;
            }
            else if(i<ssmall && i!=small)
            ssmall=i;

        }
        //System.out.print("ssmall: "+ssmall);
        return new int[]{slarge,ssmall};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int []result = getSecondOrderElements(n,a);
        System.out.println(result[0]+" "+result[1]);
        sc.close();
    }

}

// 1 2 4 3 5

// large = -; 
// slarge = -;    

// i>large
// slarge = large;
// large = i;

// 1   1>- T
// slarge=-
// large=1

// 2  2>1
// slarge=1
// large=2

// 3  4>2
// slarge=2
// large=4

// 4  3>4 False  i>slarge  3>2 T && 3!=4
// slarge=3

// 5  5>4
// slarge=4
// large=5











