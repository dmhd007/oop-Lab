import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PGM2{
    public static void main(String args[])
    throws IOException
    {
        int n;

        BufferedReader sc = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Enter no: elements:");
        n= Integer.parseInt(sc.readLine());
        int[] a = new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.readLine());
        }
        System.out.println("Entered elements in reverse are :");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}