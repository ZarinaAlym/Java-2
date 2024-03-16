package collections.lists;
import java.util.Stack;
import java.util.Vector;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(33);
        System.out.println(stack);
        System.out.println(stack.pop());

        Vector<Integer> vector= new Vector<>();
        vector.add(33);
        vector.add(23);
        vector.add(44);
        System.out.println(vector);
        System.out.println(vector.get(1));

    }
}
