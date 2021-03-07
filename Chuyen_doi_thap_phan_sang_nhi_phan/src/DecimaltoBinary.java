import java.util.Scanner;
import java.util.Stack;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal: ");
        int num = sc.nextInt();
        int devided = 1;

        while (num != 0){
            devided = num%2;
            num = num/2;
            stack.push(devided);
        }
        while (true){
            System.out.println(stack.pop());
        }

    }

}
