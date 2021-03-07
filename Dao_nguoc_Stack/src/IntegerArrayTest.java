import java.util.*;
public class IntegerArrayTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter quantity");
        int n = sc.nextInt();
        int [] inputArr = new int[n];

        System.out.println("Enter value: ");
        for (int i = 0; i < n; i++) {
            inputArr[i] = sc.nextInt();
        }
        ReverseIntegerArray arr = new ReverseIntegerArray();
        int [] result = arr.reverseIntArr(inputArr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
