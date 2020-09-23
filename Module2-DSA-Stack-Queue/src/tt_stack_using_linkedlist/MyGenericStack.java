package tt_stack_using_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    public LinkedList<E> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(E element) {
        stack.addFirst(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    //Understand
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
