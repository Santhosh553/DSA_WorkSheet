import java.util.Scanner;
public class ValidPalindrome{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                
                StringBuilder sb=new StringBuilder();
               
                String ostr=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
                sb.append(ostr);
                String rstr=sb.reverse().toString();
                
                if(ostr.equals(rstr))
                if(ostr.equals(rstr))
                System.out.print(true);
                else
                System.out.print(false);
        }
}