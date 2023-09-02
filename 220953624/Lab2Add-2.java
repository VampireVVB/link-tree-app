import java.util.Scanner;
class Largeandsmall{
public static void main(String args[]){
int a,b,c,d,e,f,g;
Scanner in=new Scanner(System.in);
System.out.println("Enter first number: ");
a=in.nextInt();
System.out.println("Enter second number: ");
b=in.nextInt();
System.out.println("Enter thrid number: ");
c=in.nextInt();
e=a>b?a:b;
d=c>e?c:e;
System.out.println("The largest number is "+d);
f=a<b?a:b;
g=c<f?c:f;
System.out.println("The smallest number is "+g);
}}