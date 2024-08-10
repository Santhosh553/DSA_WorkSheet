import java.util.Scanner;
import java.util.HashMap;


public class RomantoInteger {
    
    // Runtime - 7ms and Memory - 43.08MB
    public static int romanToInt1(String s) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i - 1))) {
                result += roman.get(s.charAt(i)) - 2 * roman.get(s.charAt(i - 1));
            } else {
                result += roman.get(s.charAt(i));
            }
        }
        return result;
    }

    //Optimised - runtime 2ms
    public static int romanToInt2(String s) {
        int result = 0; 
        int num = 0; 
        for (int i = s.length()-1; i>=0; i--){ 
            switch(s.charAt(i)) {
                case 'I': num = 1; break; 
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            
            // If 4 times the current number (num) is less than the result, it means that the current number should be subtracted from the result.
            // This is because in Roman numerals, subtractive notation is used for numbers like IV (4), IX (9), XL (40), XC (90), CD (400), CM (900).
            // So, if the condition is true, subtract the current number from the result. Otherwise, add the current number to the result.
            
            if (4 * num < result) {   
                result -= num; 
            } else { 
                result += num;
            }
        }

        return result; 
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInt2(s));
        sc.close();
    }
    
}