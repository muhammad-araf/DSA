
import java.util.*;

public class index {

    public static void main(String[] args) {
        System.out.println("Print");

        System.out.println("Hello, World!");

        // add two numbers
        int a = 5;
        int b = 5;
        System.out.println(a + b);
        // find even odd
        int num = 4;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("fing largest number among three numbers");

        int x = 10, y = 20, z = 15;
        if (x >= y && x >= z) {
            System.out.println("x is largest");
        } else if (y >= x && y >= z) {
            System.out.println("y is largest");
        } else {
            System.out.println("z is largest");
        }

        System.out.println("print multiplication table");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        System.out.println("factorial of a number");
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);

        System.out.println("Reverse a String");
        String str = "Hello";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);

        System.out.println("Check palindrome");
        String original = "madam";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        System.out.println("Simple Calculator");
        int num1 = 10, num2 = 5;
        char operator = '+';
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println("1 Basic Array task ");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("2 Basic Array task ");
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arr2[0]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("3.0 Basic Array task ");
        int[] arr3 = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr3.length; i++) {
            scan.nextInt(arr3[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("3.5 Basic Array task ");

        int[] arr4 = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr4.length; i++) {
            sum = arr4[i];
        }
        System.out.println(sum);

    }
}
