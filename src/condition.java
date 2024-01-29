import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the number to check if it is odd or even : ");
                Scanner in = new Scanner(System.in);
                x = in.nextInt();

        if( x % 2 == 0)
            System.out.println("the number entered is an even number.");

        else
            System.out.println("the number you entered is an odd number.");
    }
}


