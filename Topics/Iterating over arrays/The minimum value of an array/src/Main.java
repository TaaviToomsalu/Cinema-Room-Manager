import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = in.nextInt();
        }

        int minimum = nums[0];
        for (int num : nums){
            if (num  < minimum){
                minimum = num;
            }
        }
        System.out.println(minimum);

    }
}