import java.util.*;

public class stack {
    public static void main(String ...s)
    {
        Stack<String> st = new Stack<>();
        st.push("Abhishek Sharma");
        st.push("Amrendra Pratap Singh");
        st.push("Abhishesh Yadav");
        st.push("Akhand Pratap Singh");

        System.out.print(st);
        while(!st.empty())
        {
            System.out.println(st.pop());
        }
    }
    
}
