import java.util.Scanner;
public class Multiplywithoutoperator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a; // Add 'a' to result 'b' times
        }

        System.out.println("The product of the numbers is " + result);
        sc.close();
    }
}
