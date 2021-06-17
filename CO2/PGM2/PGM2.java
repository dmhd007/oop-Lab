// Search an element in an array.
import java.util.Scanner;
class PGM2{
    public static void main(String [] args){
        int i,value,n,e = 0,loc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("Enter element to search :");
        value = sc.nextInt();
        for(i=0;i<n;i++){
            if( arr[i]==value ){
               e=1;
               loc = i;
               break;
            }    
            else{
               e=0;
           }
        }
        if(e==1){
            System.out.println(value + " found at location " + loc);
        }
        else{
            System.out.println("not found");
        }
    }
}