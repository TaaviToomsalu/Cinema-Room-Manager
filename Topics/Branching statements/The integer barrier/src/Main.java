import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = scanner.nextInt();
        int sum = 0;

        while (true){
            sum += i;
            if (sum >= 1000){
                System.out.println(sum - 1000);
                break;
            }
            i = scanner.nextInt();
            if (i == 0){
                System.out.println(sum);
                break;
            }
        }
    }
}