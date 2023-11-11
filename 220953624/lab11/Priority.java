import java.util.*;
class NewThread implements Runnable
{
    Thread t;
    NewThread()
    {
        t=new Thread(this);
        System.out.println("Initial Thread is : "+t);
        t.setPriority(7);
        t.start();
    }    
    public void run()
    {
        try{
            Thread.sleep(2000);

    }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted Exception caught");
            }
        System.out.println("Thread after priority change is: "+t);
        
    }
}
class Priority{
    public static void main(String args[])
    {
        new NewThread();
    }
}