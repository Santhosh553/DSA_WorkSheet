import java.util.Scanner;

public class NearestMultiples {
    // Nearest mulitples Formula
    /*
     *    (number + multiple/2) / multiple) * multiple;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("Enter the multiple: ");
        int multiple = sc.nextInt();
        int nearestMultiple = ((number + multiple/2) / multiple) * multiple;
        System.out.println("Nearest Multiple for the number: "+nearestMultiple);
    }
}
