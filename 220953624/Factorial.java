import java.util.Scanner;
class Fact
{public static void main(String args[])
{int i,n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
n=sc.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;}
System.out.println("Factorial of "+n+" is "+fact); 
}
}