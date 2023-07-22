import java.util.Scanner;
public class BestTimetoBuyandSellStock{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                int[] prices=new int[n];
                for(int i=0;i<n;prices[i++]=sc.nextInt());

                int max=0;
                int pricemin=prices[0];
                for(int i=0;i<prices.length;i++){

                    if(prices[i]>pricemin)
                    max=Math.max(max, (prices[i]-pricemin));
                    else
                    pricemin=prices[i];

                }
               System.out.println(max);
    }
}