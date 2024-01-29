import java.util.Scanner;
class loop {
    public static void main(String[] args){
        int n , num = 1 , c ,d ;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the number of rows of floyd's traingle you want to print");
        n = in.nextInt();

        System.out.println(" Floyd's traingle ");

       for (c = 1 ; c <= n ; c++)
       {
            for (d = 1 ; d <= c; d++)
            {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }
    }





}

