import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
int year;
Scanner in=new Scanner(System.in);
System.out.println("Enter the year: ");
year= in.nextLine();
if (year%4!=0){
System.out.println("It is a common year");}
else_if (year%100!=0){
System.out.println("It is a common year");}
else_if (year%400!=0){
System.out.println("It is a common year");}
else {
System.out.println("It is a leap year");}
}
}