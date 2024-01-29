
import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        int m ,n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number of rows and columns of matrix :");
        m = in.nextInt();
        n = in.nextInt();


        int First [][] = new int[m][n];
        int Second [][] = new int[m][n];
        int sum[][]= new int[m][n];

        System.out.println("enter the elements of first matrix");
        for ( c = 0 ; c < m ; c++)
            for ( d = 0 ; d < n ; d++)
                First[c][d] = in.nextInt();

                System.out.println(" enter the elements of second matrix");

                for (c = 0 ; c < m ; c++)
                    for (d = 0 ; d < n ; d++)
                        Second[c][d] = in.nextInt();
                for (c=0 ; c < m ; c++)
                    for (d = 0 ; d < n ; d++)
                        sum[c][d] = First[c][d] + Second[c][d];
                System.out.println("sum of entered matrices :-");
                for (c = 0 ; c < m ; c++) {
                    for (d = 0; d < n; d++)
                        System.out.print(sum[c][d] + "\t");
                    System.out.println();
                }
    }

}
