import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        System.out.printf("Nhap so phan tu mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        if(n<=0){
            System.out.println("Mang rong : ");
            return;
        }
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                int j = i + 1;
                while (j < n && arr[j] % 2 != 0) {
                    j++;
                }
                if (j < n) {
                    int evenNum = arr[j];
                    for (int k = j; k > i; k--) {
                        arr[k] = arr[k-1];
                    }
                    arr[i] = evenNum;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
