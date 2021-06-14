import java.util.Scanner;
class PGM4{
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
        System.out.println("Entered elements in odd positions are :");
        for(int i=1;i<n;i+=2){
            System.out.println(a[i]);
        }
    }
}