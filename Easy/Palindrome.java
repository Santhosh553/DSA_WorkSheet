import java.util.Scanner;
public class Palindrome {
    
    public static boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(n>0){
            int num=n%10;
            rev=rev*10+num;
            n/=10;
        }
        if(rev==x)
        return true;
        else 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isPalindrome(n))
        System.out.println("The number is a palindrome");
        else
        System.out.println("The number is not a palindrome");
        sc.close();
    }
    
}