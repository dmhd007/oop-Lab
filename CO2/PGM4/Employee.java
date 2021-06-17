import java.util.Scanner;
class Employee{
    int emp_no;
    String emp_name;
    double salary;

void readData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employee no:");
    emp_no = sc.nextInt();
    System.out.println("Enter employee name:");
    emp_name = sc.next();
    System.out.println("Enter employee salary:");
    salary = sc.nextDouble();

}

void displayData(){
    System.out.println("Employee no:" + emp_no);
    System.out.println("Employee name:" + emp_name);
    System.out.println("Employee salary:" + salary);
    
}
    public static void main(String[] args){
        int n,i,e=0,loc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: employees :");
        n = sc.nextInt();
        Employee [] emp = new Employee[n];
        for(i=0;i<n;i++){
            emp[i] = new Employee();
        }
        for(i=0;i<n;i++){
        System.out.println("\n\nENTER DETAILS OF EMPLOYEE " + (i+1));   
        emp[i].readData();
        }
        for(i=0;i<n;i++){
        System.out.println("\n\nDETAILS OF EMPLOYEE " + (i+1));   
        emp[i].displayData();
        }
    
        System.out.println("\n\nEnter employee no: to search:");
        int value = sc.nextInt();
        for(i=0;i<n;i++){
            if(value == emp[i].emp_no){
                e=1;
                loc = i;
                break;
            }
            else{
                e=0;
           }
        }   
           if(e==1){
               System.out.println("Employee found\n");
                emp[loc].displayData();
           }
           else{
               System.out.println("not found");

           }
    }
}
