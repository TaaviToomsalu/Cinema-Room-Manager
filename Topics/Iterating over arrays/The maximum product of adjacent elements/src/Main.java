import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        if (nums.length < 2){
            System.out.println(0);
        }else {

            int maxProduct = 0;

            for (int i = 0; i < n; i++) {
                if (n-1 == i){
                    break;
                }
                int product = nums[i] * nums[i + 1];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
            System.out.println(maxProduct);
        }
    }
}