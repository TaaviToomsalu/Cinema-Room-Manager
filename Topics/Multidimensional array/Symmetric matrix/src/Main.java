import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] twoDimArray = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                twoDimArray[i][j] = in.nextInt();
            }
        }
        String output = "YES";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    output = "NO";
                    break;
                }
            }
        }
        System.out.println(output);
    }
}