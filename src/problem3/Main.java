package problem3;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        System.out.println("Type an integer.");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.printf("Type %d integers.\n", n);

        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scan.nextInt();
        }

        // Printing the array
        System.out.print("Initial Array: {");
        if (array.length > 0) System.out.print(array[0]) ;
        for (int i = 1; i < n; ++i) { System.out.print(", " + array[i]); }
        System.out.println("}");

        // Reversing the array
        for (int i = 0; i < n/2; ++i) {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

        // Printing the array
        System.out.print("Reversed Array: {");
        if (array.length > 0) System.out.print(array[0]) ;
        for (int i = 1; i < n; ++i) { System.out.print(", " + array[i]); }
        System.out.println("}");
    }
}
