import java.util.*;
class CreateThread implements Runnable
{
    Thread t;
    int n=0,r=0,c=0,a[][];
    CreateThread(int n,int r, int c, int a[][])
    {
        this.n=n;
        this.r=r;
        this.c=c;
        this.a=a;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        if(n==1)
        {
            System.out.println("The matrix is: ");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else if(n==2)
        {
            System.out.println("The transpose of the matrix is: ");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a[j][i]+"\t");
                }
                System.out.println();
            }
		System.out.println("t2 is alive? "+t.isAlive());
        }
        else if(n==3)
        {
            int max=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(a[i][j]>max)
                        max=a[i][j];
                }
            }
            System.out.println("The maximum element in the matrix is: "+max);
        }
        else if(n==4)
        {
            System.out.println("The principal diagonal elements are: ");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i!=j)
                        System.out.print("x\t");
                    else 
                        System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else if(n==5)
        {
            System.out.println("The non principal diagonal elements are: ");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==j)
                        System.out.print("x\t");
                    else 
                        System.out.print(a[i][j]+"\t");
                }
		System.out.println();
            }
        }
    }
}
class MatrixThreads 
{
    public static void main(String args[])
    {
        CreateThread t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the elements: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        do
        {
            System.out.println("Enter your choice:\n1.Display matrix\n2.Display transpose\n3.Largest element\n4.Display prinicpal diagonal\n5.Display non diagonal\n6.Exit");
            int n=sc.nextInt();
try{
            switch(n)
            {
                case 1: t=new CreateThread(1,r,c,a);
			t.t.join();
			System.out.println("t1 is alive? "+t.t.isAlive());
                	break;
                case 2: t=new CreateThread(2,r,c,a);
		t.t.join();
		break;
                case 3: t=new CreateThread(3,r,c,a);
                t.t.join();
		break;
                case 4: t=new CreateThread(4,r,c,a);
                t.t.join();
		break;
                case 5: t=new CreateThread(5,r,c,a);
                t.t.join();
		break;

                case 6:System.exit(0);
            }
	}
catch(InterruptedException e){}
        }while(true);
        }
    }
