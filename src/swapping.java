import java.util.Scanner;
class Swapping



       { public static void main (String[] args) {
        int X,Y,temp;
        Scanner in = new Scanner(System.in);

        System.out.println("value of X :");
        X = in.nextInt();
        in.nextLine();

        System.out.println("value of Y :");
        Y = in.nextInt();



        System.out.println(" before swapping\nx = " +X+ "\ny =" +Y);


        X = X+Y;
        Y = X-Y;
        X = X-Y;

        System.out.print("After swapping\nx = " + X + "\ny =" + Y);

        in.close();


    }
        }

