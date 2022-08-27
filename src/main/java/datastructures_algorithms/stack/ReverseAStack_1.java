package datastructures_algorithms.stack;

import java.util.Stack;

public class ReverseAStack_1 {
    public static Stack<Integer> reverseAStack(Stack<Integer> st, Stack<Integer> reverseSt) {
        if (st.isEmpty()) {
            System.out.println(reverseSt);
            return reverseSt;
        }
        int temp = st.peek();
        reverseSt.push(temp);
        st.pop();
        return reverseAStack(st,reverseSt);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> reverseSt = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        reverseAStack(st, reverseSt);
    }
}
