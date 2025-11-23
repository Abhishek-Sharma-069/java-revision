public class boxingUnboxing {

    public static void main (String args[])
    {
        int x = 44;
        Integer obj1 = new Integer(x); // boxing
        Integer obj2 = new Integer(99);

        //int y = int java.lang.Integer.intValue(); // Unboxing

        System.out.println(obj1);
        System.out.println(obj2);

        Integer m = 45; // auto boxing
        System.out.println(m); // auto unboxing
    }
}