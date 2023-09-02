import java.util.Scanner;
class bitwise{
public static void main(String args[]){
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value:- ");
a= in.nextInt();
if (a%2==0){
b=a<<1;
c=a>>1;
System.out.println("Number after division is "+c+" and after multiplication it is "+b);}
else{
System.out.println("Given number is not in power of 2");}
}}
