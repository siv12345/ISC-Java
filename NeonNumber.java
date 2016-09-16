import java.util.Scanner;
public class NeonNumber {   
    public static void main(String args[]) {
        
        int square, total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = sc.nextInt();
        square = n * n;
        while (square != 0) {
            total += (square % 10);
            square = square / 10;
        }

        if (total == n) {
            System.out.println("The number is a neon number ");
        } else {
            System.out.println("The number is not a neon number");
        }

    } 
} 