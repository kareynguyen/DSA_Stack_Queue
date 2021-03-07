public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack1 = new MyGenericStack();
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack1.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack1.isEmpty()) {
            System.out.printf(" %d", stack1.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack1.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}


