import java.util.Stack;

public class ReverseIntegerArray<E> {
    Stack <Integer> stack = new Stack<>();
    public int [] reverseIntArr(int [] inputArr){
        int [] outputArr = new int [inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            stack.push(inputArr[i]);
        }
        for (int i = 0; i < inputArr.length; i++) {
            outputArr[i]=stack.pop();
        }
        return outputArr;

    }
}

