import java.util.Scanner;
class Fib implements Runnable{
    public void run(){
        int a=0,b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit :");
        int n=sc.nextInt();
        System.out.println("fibonacci series are :");
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }
}

class Even implements Runnable{
    public void run(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter limit :");
        int num=sc.nextInt();
        System.out.println("even numbers in given range are :");
        for(int i=1;i<num;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}

public class PGM6{
    public static void main(String [] args){
         Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("Enter choice :");
        System.out.println("1.fibonacci series \n2.even numbers");
        ch=c.nextInt();
        if (ch==1){
             Fib f1=new Fib();
             Thread t1 = new Thread(f1);
        t1.start();
        }
        else if(ch==2){
             Even e1 = new Even();
             Thread t2 = new Thread(e1);
            t2.start(); 
        }
      else{
          System.out.println("wrong choice!!!");
      }
    }
}