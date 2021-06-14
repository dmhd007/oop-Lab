import java.util.Scanner;
class PGM5{
    public static void main(String args[]){
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no: elements:");
        n= sc.nextInt();
        int[] a = new int[n];
        int large = a[0];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i] > large){
                large = a[i];
            }
        }
        System.out.println("largest element of the array :");
            System.out.println(large);
    }
}