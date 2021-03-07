import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }return false;
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }return stack.removeFirst();
    }



    }