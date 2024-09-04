public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '*'; 

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
