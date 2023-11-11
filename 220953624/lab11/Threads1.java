import java.util.*;
class Thread1 implements Runnable{
Thread t;
Thread1()
{
    t=new Thread(this);
    t.start();
}
public void run()
{
    System.out.println("Thread is implemented using Runnable Interface");
}
}
class Thread2 extends Thread{
    Thread2()
    {
        new Thread(this);
        start();
    }
    public void run()
     {
         System.out.println("Thread is implemented using Thread Class");
     }
}
class Threads1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter your choice:\n1.Using Runnable Interface\n2.UsingThread Class\n3.Exit");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:try{
            Thread1 obj1=new Thread1();
            obj1.t.join();
            }
            catch(InterruptedException e){}
            break;
            case 2: try{
            Thread2 obj2=new Thread2();
            obj2.join();
            }
            catch(InterruptedException e){}
            break;
            case 3: System.exit(0);
        }
    
    }while(true);
    }
}