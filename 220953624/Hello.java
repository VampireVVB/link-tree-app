import java.util.Scanner;
class CircumArea
{public static void main(String args[])
{int l,b,circum,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of length and breadth: ");
l=sc.nextInt();
b=sc.nextInt();
circum=2*(l+b);
area=l*b;
System.out.println("Circumference and Area are "+circum+" and "+area); 
}
}