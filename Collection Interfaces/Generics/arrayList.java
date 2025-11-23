import java.util.*;

public class arrayList {
    public static <T> void printArray(T arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String Args[])
    {
        Integer arr[] = { 1, 2, 3, 45, 5 };
        String sa[] = { "ab", "cd", "ef" };
        Float fa[] = { 1.2f, 1.9f };
        printArray(arr);
        printArray(sa);
        printArray(fa);
    }
}
