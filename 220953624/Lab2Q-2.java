import java.util.Scanner;
class Conv{
public static void main(String args[]){
int a;
byte b;
char c;
double d;
Scanner in=new Scanner(System.in);
System.out.println("Enter integer value:- ");
a= in.nextInt();
System.out.println("Enter char value:- ");
c=in.next().charAt(0);
System.out.println("Enter double Value:- ");
d=in.nextDouble();
byte p=(byte)a;
int q=(int)c;
byte r=(byte)d;
int s=(int)d;
System.out.println("After Conversion Values are"+p+","+q+","+r+" and "+s);
}
}

