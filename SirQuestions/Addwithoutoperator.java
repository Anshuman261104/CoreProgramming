import java.util.Scanner;
public class Addwithoutoperator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        int result = a -(-b);
        System.out.println("The sum of the numbers is " + result);
    }
}
