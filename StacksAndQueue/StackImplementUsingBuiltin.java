import java.util.*;
;
public class StackImplementUsingBuiltin {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //push
        st.push(20);
        st.push(40);
        st.push(60);
        st.push(80);
        
        System.out.println(st);

        //peek(top)
        System.out.println(st.peek());

        //pop
        st.pop();
        System.out.println(st);

        //size
        System.out.println(st.size());

        //isEmpty
        System.out.println(st.isEmpty());
        
        
    }
}
