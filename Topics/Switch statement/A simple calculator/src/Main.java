import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long firstNum = scanner.nextLong();
        String operand = scanner.next();
        long secondNum = scanner.nextLong();

        switch (operand) {
            case "+" -> System.out.println(firstNum + secondNum);
            case "-" -> System.out.println(firstNum - secondNum);
            case "/" -> {
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
            }
            case "*" -> System.out.println(firstNum * secondNum);
            default -> System.out.println("Unknown operator");
        }
    }
}