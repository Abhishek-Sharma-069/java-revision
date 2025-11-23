public class myclass1 {

    void sum(int a, int b) {
        System.out.println(a + b);
    }
}
// method overriding means redefining the method in inherits class
class myclass2 extends myclass1 {
    void sum(float a, float b) {
        System.out.println((a + b));
    }

    void sum(String a, String b)
    {
        System.out.println(a.concat(b));
    }
}

class test {
    public static void main(String  args[])
    {
        myclass2 obj1 = new myclass2();
        obj1.sum(4, 5);
        obj1.sum(4.0f, 5.0f);
        obj1.sum("I am the king", "of own world");
    }
}

