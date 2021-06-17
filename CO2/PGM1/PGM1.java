// Program to Sort strings
import java.util.Arrays;
import java.util.Scanner;
class PGM1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: strings:");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        System.out.println("Entered strings:");
        for(int i=0;i<n;i++){
        System.out.println(str[i]);
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}