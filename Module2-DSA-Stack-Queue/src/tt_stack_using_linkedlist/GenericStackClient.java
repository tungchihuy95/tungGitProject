package tt_stack_using_linkedlist;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers: ");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings: ");
        stackOfStrings();
    }

    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3.  Size of stack after pop operations: " + stack.size());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.printf("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations: " + stack.size());
    }
}
