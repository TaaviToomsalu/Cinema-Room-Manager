import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        int[] nums = new int[j];

        for (int i = 0; i < j; i++){
            nums[i] = s.nextInt();
        }

        int n = s.nextInt();
        int result = 0;
        for (int i = 0; i < j; i++){
            if (nums[i] == n){
                result += 1;
            }
        }

        System.out.println(result);

    }
}