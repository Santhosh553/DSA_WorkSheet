/*
 *   How many times you can rotate a string to get another string ? Input String , Goal String
 *  Example : Input : "abcde" , "cdeab" Output : true 
 *  Idea: input String : A+A = "abcdeabcde" , check if B is a substring of A+A, if we add then the goal string will be in the middle of the input string 
 */
import java.util.Scanner;
public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if(A.length()!=B.length()){
            System.out.println(false);
            return;
        }
        A = A+A;
        if(A.contains(B))
            System.out.println(true);
    }
}
