import java.util.*;
class exchanggen 
{
    public static <T> void exchangeele(T[] arr, int i1,int i2)
    {
        if((i1<0||i1>arr.length)||(i2<0||i2>arr.length))
                {
                   System.out.println("Invalid Exception");
                }
        T temp;
        temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
    public static void main(String[] args) 
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(intArray));
        
        exchangeele(intArray, 1, 3);
        System.out.println("Array after swapping elements at index 1 and 3: " + Arrays.toString(intArray));
        
        String[] strArray = {"apple", "banana", "orange", "grape"};
        System.out.println("Original array: " + Arrays.toString(strArray));
        
        exchangeele(strArray, 0, 2);
        System.out.println("Array after swapping elements at index 0 and 2: " + Arrays.toString(strArray));
    }
}
