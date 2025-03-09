import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.print("m: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        do{
            System.out.println("****************MENU****************");
            System.out.println("1. Nhap gia tri tca phan tu");
            System.out.println("2. Xuat ma tran");
            System.out.println("3. Kiem tra phan tu ton tai");
            System.out.println("4. Thoat");
            System.out.println("Lua chon:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n;i++){
                        for (int j = 0; j < m; j++){
                            System.out.print("matrix[" + i + "][" + j + "]: ");
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ma tran vua nhap:");
                    for (int i = 0; i < n; i++){
                        for (int j = 0; j < m; j++){
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.printf("Nhap gia tri can tim: ");
                    int target = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0;i<n;i++){
                        for (int j = 0; j<m; j++){
                            if (matrix[i][j] == target){
                                System.out.println("Phan tu " + target + " xuat hien tai o vi tri [" + i + "][" + j + "]");
                                found = true;
                                break;
                            }
                        }
                    }
                    if (!found){
                        System.out.println("Phan tu " + target + " khong xuat hien trong ma tran");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
            }
        } while (1==1);
    }
}
