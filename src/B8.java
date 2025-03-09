import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        System.out.printf("Nhap so phan tu mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] countArr = new int[1000];

        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (countArr[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
