class Stack<T> 
{
    private Object[] items;
    private int size;
    private static final int MAX = 10;

    public Stack()
    {
        items = new Object[MAX];
        size = 0;
    }

    public void push(T item) 
    {
        ensureCapacity();
        items[size] = item;
        size++;
    }

    public T pop() 
    {
        if (!isEmpty()) 
        {
            size--;
            return (T) items[size];
        } 
        else 
        {
            return null;
        }
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private void ensureCapacity()
    {
        if (size == items.length) 
        {
            int newSize = items.length * 2;
            items = java.util.Arrays.copyOf(items, newSize);
        }
    }
}

class Student 
{
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }
}

class Employee 
{
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId)
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() 
    {
        return name;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }
}

public class StudempStack
{
    public static void main(String[] args)
    {
        Stack<Student> studentStack = new Stack<>();
        Student s1 = new Student("Simran", 2209);
        Student s2 = new Student("Rohan",2210);

        studentStack.push(s1);
        studentStack.push(s2);

        System.out.println("Students in the stack:");
        while (!studentStack.isEmpty())
        {
            Student student = studentStack.pop();
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber());
        }

        Stack<Employee> employeeStack = new Stack<>();
        Employee e1 = new Employee("Prerit", 2211);
        Employee e2 = new Employee("Om", 2212);

        employeeStack.push(e1);
        employeeStack.push(e2);

        System.out.println("\nEmployees in the stack:");
        while (!employeeStack.isEmpty()) 
        {
            Employee employee = employeeStack.pop();
            System.out.println("Name: " + employee.getName() + ", Employee ID: " + employee.getEmployeeId());
        }
    }
}