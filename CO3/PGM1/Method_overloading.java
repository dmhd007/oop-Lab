import java.util.Scanner;

public class Method_overloading {


		void area(double r)
		{
			System.out.println("Area of circle is:"+3.14*r*r);
		}
	    void area(int l, int b)
		{
			System.out.println("Area of rectangle is:"+l*b);
		}
		void area(int a )
		{
			System.out.println("Area of square is:"+a*a);
		}
		

		public static void main(String[] args) {
			Method_overloading obj=new Method_overloading();
			System.out.println("Enter the radius of circle:");
			Scanner sc=new Scanner(System.in);
			double r=sc.nextDouble();
			obj.area(r);
			
			System.out.println("Enter the length and breadth of rectangle:");
			int l=sc.nextInt();
			int b=sc.nextInt();
			obj.area(l,b);
			
			System.out.println("Enter the side of square:");
			int a=sc.nextInt();
			obj.area(a);
			

			

		}

}
