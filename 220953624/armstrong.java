import java .util.Scanner;
public class Armstrong
{public static void main(String args[])
{int a,arm=0,n,temp;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number: ");
n=in.nextInt();
temp=n;
while(n!=0)
{a=n%10;
arm=arm+(a*a*a);
n=n/10;
}
if(arm==temp)
System.out.println("It is an armstrong number");
else
System.out.println("It is not an armstrong number");

}
}