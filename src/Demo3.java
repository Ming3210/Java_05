import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("Nhap cac phan tu\n");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + (i) + "] : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("\n Mang sau khi nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Nhap phan tu muon them: ");
        int insertNumber = scanner.nextInt();
        System.out.print("Nhap vi tri muon them: ");
        int insertIndex = scanner.nextInt();
        int[] newArr;
        if(insertIndex < 0){
            newArr = new int[0];
            System.out.println("Khong ton tai chi so "+ insertIndex);
        }
        else if(insertIndex < arr.length){
            newArr = new int[n+1];
            for(int i = 0; i < newArr.length; i++){
                if(i<insertIndex){
                    newArr[i] = arr[i];
                } else if (i== insertIndex) {
                    newArr[i] = insertNumber;
                }else {
                    newArr[i] = arr[i-1];
                }
            }

        }else{
            newArr = new int[insertIndex+1];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            newArr[insertIndex] = insertNumber;

        }

        System.out.println("\n Mang sau khi nhap: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


    }
}
