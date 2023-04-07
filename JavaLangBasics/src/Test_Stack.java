import java.util.Stack;

public class Test_Stack {
    public static void main(String[] args) {
        //Creating a new Stack which can hold Strings
        Stack<String> st = new Stack<>();

        //Method 1 : isEmpty() : returns true if stack is empty, else false
        System.out.println(st.isEmpty()); //output : true

        //Method 2: push() :  pushes data into the stack
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        System.out.println(st.isEmpty()); //output : false

        //Print all Elements in a Stack
        System.out.println(st);  //output: [A, B, C, D]

        //Method 3: pop() :  deletes the top most element of stack, if it is available
        String temp = st.pop();          // if we perform pop() on empty stack, then it will <EmptyStackException>
                                         // pop, will return the deleted object from top of stack

        //Print all Elements in a Stack
        System.out.println(st);  //output: [A, B, C]

        //Print the popped element from stack
        System.out.println(temp);

        //Method 4: peek() : returns the top most element from stack, without deleting it
        System.out.println(st.peek()); //output : C



    }
}
