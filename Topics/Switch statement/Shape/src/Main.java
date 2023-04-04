import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        String response = switch (n) {
            case 1 : yield "You have chosen a square";
            case 2 : yield "You have chosen a circle";
            case 3: yield "You have chosen a triangle";
            case 4: yield "You have chosen a rhombus";
            default: yield "There is no such shape!";
        };
        System.out.println(response);
    }
}
