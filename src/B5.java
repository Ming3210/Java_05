import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean hasNumber = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] %2 != 0) {
                hasNumber = true;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(hasNumber) {

            for(int i = 0; i < n; i++) {
                if(arr[i] % 2!= 0) {
                    if(arr[i] > max && arr[i] % 2 != 0) {
                        max = arr[i];
                    }
                    if(arr[i] < min && arr[i] %2 !=0) {
                        min = arr[i];
                    }
                }
            }
            System.out.println("Phan tu le nho nhat trong mang: " + min);
            System.out.println("Phan tu le lon nhat trong mang: " + max);
        } else {
            System.out.println("Khong co phan tu le nguyen duong trong mang.");
        }
    }
}
