import java.util.Scanner;
class Employee {

    String empName = "";
    String city = "";
    double basicSalary = 0.0;
    float DA  = 0;
    float HR = 0;
    double total=0;
    
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        empName = sc.nextLine();
        System.out.println("Enter city: ");
        city = sc.nextLine();
        System.out.println("Enter basic salary: ");
        basicSalary = sc.nextDouble();
        System.out.println("Enter dearness allowance%: ");
        DA = sc.nextFloat();
        System.out.println("Enter house rent%: ");
        HR = sc.nextFloat();
    }
    double calc()
    {
        total = basicSalary+basicSalary*DA+basicSalary*HR;
        return total;
    }
    void display()
    {
        System.out.print(empName+" from "+city+" has total salary "+total);
    }
    public static void main(String args[])
    {
        Employee obj = new Employee();
        obj.getData();
        obj.calc();
        obj.display();
    }
}