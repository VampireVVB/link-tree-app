import java.util.Scanner;
class Matsym{
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
if(row!=col)
{
System.out.println("matrix not symmetric");
}
else
{
boolean symmetric=true;
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(mat[i][j]!=mat[j][i])
{
symmetric=false;
break;
}
}
}
if(symmetric)
{
System.out.println("symmetric");
}
else
{
System.out.println("non symmetric");
}
}
}
}
