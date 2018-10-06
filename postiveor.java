import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        a = scan.nextInt();
        if(a > 0)
        {
            System.out.println("The given number "+a+" is Positive");
        }
        else if(a < 0)
        {
            System.out.println("The given number "+a+" is Negative");
        }
        else
        {
            System.out.println("The given number "+a+" is neither Positive nor Negative ");
        }
    }
}