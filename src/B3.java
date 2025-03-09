import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan thu mang: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        int countEven = 0;
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            };

        }
        System.out.println("Tong so luong so chan "+ countEven);
    }
}
