import java.util.Scanner;
public class ValidAnagram{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            char[] s=sc.next().toCharArray();
            char[] t=sc.next().toCharArray();
            int[] arr=new int[26];

            boolean flag=true;
            for(char c:s){
                arr[c-'a']++;
            }
            for(char c:t){
                arr[c-'a']--;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0)
                flag=false;
            }
            if(flag==true)
            System.out.println("Valid Anagram");
            else
            System.out.println("InValid Anagram");
    }
}