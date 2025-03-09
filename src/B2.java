import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.printf("Nhap so phan tu mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Tong cac phan tu cua mang: " + sum);
    }
}
