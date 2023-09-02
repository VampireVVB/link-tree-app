import java.util.Scanner;
class result{
public static void main(String args[]){
int a,b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the first number: ");
a=in.nextInt();
System.out.println("Enter the second number: ");
b=in.nextInt();
System.out.println((a<<2)+(b>>2));
System.out.println(b>0);
System.out.println((a+b*100)/10);
System.out.println(a&b);
}}
