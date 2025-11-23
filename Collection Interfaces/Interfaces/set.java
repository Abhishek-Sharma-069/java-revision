import java.util.*;

public class set {
    public static void main(String ...s)
    {
        HashSet<Integer> Myset = new HashSet<>();
        Myset.add(6);
        Myset.add(99);
        Myset.add(6);
        Myset.add(100);
        Myset.add(7);
        Myset.add(10);

        System.out.println(Myset);

        Iterator it = Myset.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }
    }
    
}
