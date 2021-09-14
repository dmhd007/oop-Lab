import java.util.Scanner;
class Mul extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i + "*" + 5 + "=" + i*5);
        }
    }
}
class Prime extends Thread{
    public void run(){
        int ct=0,n=0,i=1,j=1,num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit :");
    num = sc.nextInt(); 
    System.out.println("prime numbers are :");
while(n<num)  
{  
    j=1;  
    ct=0;  
    while(j<=i)  
        {  
        if(i%j==0)  
        ct++;  
        j++;   
        }  
    if(ct==2)  
    {  
    System.out.printf("%d ",i);  
    n++;  
    }  
    i++;  
}  
    }}
public class PGM5 {
    public static void main(String [] args){
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("Enter choice :");
        System.out.println("1.multiplication Table\n2.prime numbers");
        ch=c.nextInt();
        if (ch==1){
             Mul t1=new Mul();
        t1.start();
        }
        else if(ch==2){
             Prime t2 = new Prime();
       t2.start(); 
        }
      else{
          System.out.println("wrong choice!!!");
      }
    }
}