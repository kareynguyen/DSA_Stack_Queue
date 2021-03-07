import java.util.Stack;

public class ReverseStringArray <E>{
    Stack <E> wStack = new Stack<>();
    String mWord = "fhery";
    String [] sWord = mWord.split("");

    public String[] reverseStr() {
        String [] outP = new String[sWord.length];
        for (int i = 0; i < sWord.length; i++) {
            wStack.push((E) sWord[i]);
        }
        for (int i = 0; i < sWord.length; i++) {
            outP[i] = (String) wStack.pop();
        }
        return outP;
    }
}
