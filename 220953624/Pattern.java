import java .util.Scanner;
public class Pattern
{public static void main(String args[])
{int i,j,k=1;
Scanner in=new Scanner(System.in);
for(i=1;i<=5;i++)
{for(j=1;j<=i;j++)
{System.out.print(k+" ");}
System.out.print("\n");
k++;
}
}
}