import java.util.Scanner;
public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        
        //"flow".indexOf("flower") returns -1 (indicating "flower" is not a prefix of "flow").
        // in while loop, "flow".indexOf("flowe") returns -1 (still not a prefix).
        // "flow".indexOf("flow") returns 0
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
        sc.close();    
    }
}
