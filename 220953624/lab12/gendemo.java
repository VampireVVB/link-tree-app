class Student 
{
    private String name;

    public Student(String name)
    {
        this.name = name;
    }

    public String toString() 
    {
        return "Student: " + name;
    }
}

class Employee 
{
    private String name;

    public Employee(String name)
    {
        this.name = name;
    }

    public String toString() 
    {
        return "Employee: " + name;
    }
}

class studemp<T>
{
  T ob;
  studemp( T o) 
  {
     ob=o; 
  }
  T getOb()
  {
      return ob;
  }
  void showType()
  {
      System.out.println("The type of class is:"+ob.getClass().getName());
  }
}
class gendemo
{
    public static void main(String args[])
    {
        Student s1=new Student("Student Roveena");
        studemp<Student>Sob=new studemp<Student>(s1);
        Sob.showType();
        
        Employee e1=new Employee("Employee Simran");
        studemp<Employee>Eob=new studemp<Employee>(e1);
        Eob.showType();
        
    }
}