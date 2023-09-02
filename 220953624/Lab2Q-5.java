import java.util.Scanner;
class Calc{
public static void main(String args[]){
float a,b;
char c,ans;
Scanner in=new Scanner(System.in);
do{
System.out.println("Enter the first number: ");
a=in.nextFloat();
System.out.println("Enter the opertator(+,-,*,/): ");
c=in.next().charAt(0);
System.out.println("Enter the second number: ");
b=in.nextFloat();
switch(c){
case '+':
         System.out.println(a+b);break;
case '-':System.out.println(a-b);break;
case '*':System.out.println(a*b);break;
case '/':System.out.println(a/b);break;
default: System.out.println("Entered operator is invalid");}
System.out.println("Do another(y/n)? ");
ans=in.next().charAt(0);
}while(ans=='y');
}}

