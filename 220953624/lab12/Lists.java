class node<T> 
{
    T data;
    node<T> next;

    public node(T data) 
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> 
{
    private node<T> head;

    public void add(T data)
    {
        node<T> newNode = new node<>(data);
        if (head == null)
            head = newNode;
        else 
        {
            node<T> current = head;
            while (current.next != null) 
               current = current.next;
            current.next = newNode;
        }
    }

    public void display() 
    {
        node<T> current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Lists
{
    public static void main(String[] args)
    {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println("Integer Linked List:");
        intList.display();

        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.add(1.5);
        doubleList.add(2.7);
        doubleList.add(3.9);

        System.out.println("Double Linked List:");
        doubleList.display();
    }
}