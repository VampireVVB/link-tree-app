import java.util.Scanner;
public class arraySearch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        int flag=0;
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        System.out.print("The element "+key+" is found at"); 
        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                System.out.print((i+1)+", ");
                flag =1;
            }
        }
        if(flag==0)
            System.out.print(" NOWHERE!");
    }
}