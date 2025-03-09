import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran vuong (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ma tran ko hop le");
            return;
        }

        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();

            }

        }

   
        int[][] rotate = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Ma tran sau khi xoay:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}