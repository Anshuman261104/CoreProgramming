import java.util.Scanner;
public class Subtractwithoutopertor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        int result = a + (~b + 1);
        System.out.println("The difference of the numbers is " + result);
    }
}
