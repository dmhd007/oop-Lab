// Read 2 matrices from the console and perform matrix addition.

import java.util.Scanner;
class PGM2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter no: of rows  for both matrices :");
        m = sc.nextInt();
        System.out.println("Enter no: of cols for both matrices :");
        n = sc.nextInt();
        int[][] first = new int[m][n];
        System.out.println("Enter elements of matrix1 :");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                first[i][j] = sc.nextInt();
            }
        }

        int[][] second = new int[m][n];
        System.out.println("Enter elements of matrix2 :");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                second[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix1 :\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(first[i][j] + "\t");
            }
            System.out.println("\n\n");
        }

        System.out.println("Matrix2 :\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(second[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
        int[][] sum = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("Matrix1 + Matrix2 = \n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }
}