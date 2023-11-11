import java.util.*;
class Synch1
{
    synchronized void meth(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        System.out.println("]");
    }
}
class Caller1 extends Thread{
    String msg;
    Synch1 obj;
    Caller1(Synch1 obj,String msg)
    {
        this.obj=obj;
        this.msg=msg;
    }
    public void run()
    {
        obj.meth(msg);
    }
}
class Synch2
{
    void meth(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        System.out.println("]");
    }
}
class Caller2 extends Thread{
    String msg;
    Synch2 obj;
    Caller2(Synch2 obj,String msg)
    {
        this.obj=obj;
        this.msg=msg;
    }
    public void run()
    {
        synchronized(obj){
        obj.meth(msg);
        }
    }
}
class UsingSynchronized{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String s=sc.nextLine();
    Synch1 obj1=new Synch1();
    Synch2 obj3=new Synch2();
    Caller1 obj2=new Caller1(obj1,s);
    Caller2 obj4=new Caller2(obj3,s);
    System.out.println("Enter your option:\n1.Using Synchronized method\n2.Using Synchronized block");
    int n=sc.nextInt();
    switch(n)
    {
        case 1:  
        obj2.start();
        System.out.println("Implemented using synchronized method");
        break;
        case 2:  
        obj4.start();
        System.out.println("Implemented using synchronized block");
        break;
    }
    }
}