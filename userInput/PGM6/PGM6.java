import java.util.Scanner;
class PGM6{
    public static void main(String args[]){
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no: elements:");
        n= sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();        
        }
        int small = a[0];
        for(int i=0;i<n;i++){
            if(a[i] < small){
                small = a[i];
            }
        }
        System.out.println("smallest element of the array :");
            System.out.println(small);
    }
}