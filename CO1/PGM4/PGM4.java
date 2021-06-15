// Read a matrix from the console and check whether it is symmetric or not

import java.util.Scanner;
class PGM4{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int m,n,i,j,e=0;
        System.out.println("Enter no: of rows   :");
        m = sc.nextInt();
        System.out.println("Enter no: of cols  :");
        n = sc.nextInt();
        
        int[][] matrix = new int[m][n];

        System.out.println("Enter elements of matrix :");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Matrix :\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n\n");
        }

        System.out.println("Transpose of Matrix :\n");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(matrix[j][i]+ "\t");
            }
            System.out.println(("\n\n"));
        } 

        if(m==n){

            int[][] transpose  = new int[m][n];
 
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    transpose[j][i] = matrix[j][i];
                }
            }
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if(transpose[j][i] == matrix[i][j]){
                        e=1;
                    }
                    else{
                        e=0;
                        break;
                    }
                }
            }
            if(e==1){
                System.out.println("Symmetric!!!");
            }
            else{
                System.out.println("NOT Symmetric!!!");

            }
        }    
        else{
            System.out.println("NOT Symmetric!!!");
        }
    }
}