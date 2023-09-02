import java.util.Scanner;
class Matrix{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                               
int i,j,sum=0,row,col;
System.out.println("enter no of rows");
row=sc.nextInt();
System.out.println("enter no of col");
col=sc.nextInt();
  int[][]mat=new int[row][col];

System.out.println("enter number of elements");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
  mat[i][j]=sc.nextInt();
}
}
System.out.println("the elements are");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat[i][j]+"\t");
}
System.out.println("");
}
System.out.println("diagonal elements are");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(i==j)
{
System.out.println(i);
}
}
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(i==j)
{
sum=sum+mat[i][j];
}
}
}
System.out.println("sum is"+sum);
}
}
