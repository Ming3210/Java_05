import java.util.Scanner;

public class Addition_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Chèn phần tử");
            System.out.println("2 - Sửa phần tử");
            System.out.println("3 - Xóa phần tử");
            System.out.println("4 - Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị cần chèn:");
                    int value = sc.nextInt();
                    System.out.println("Nhập vị trí cần chèn:");
                    int index = sc.nextInt();

                    if (index >= 0 && index <= size) {
                        int[] newArr = new int[size + 1];
                        for (int i = 0, j = 0; i < newArr.length; i++) {
                            if (i == index) {
                                newArr[i] = value;
                            }
                            else {
                                newArr[i] = arr[j++];
                            }
                        }
                        arr = newArr;
                    } else System.out.println("Vị trí không hợp lệ!");
                    break;

                case 2:
                    System.out.println("Nhập vị trí cần sửa:");
                    index = sc.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.println("Nhập giá trị mới:");
                        arr[index] = sc.nextInt();
                    } else System.out.println("Vị trí không hợp lệ!");
                    break;

                case 3:
                    System.out.println("Nhập vị trí cần xóa:");
                    index = sc.nextInt();
                    if (index >= 0 && index < size) {
                        int[] newArr = new int[size - 1];
                        for (int i = 0, j = 0; i < size; i++) {
                            if (i != index) newArr[j++] = arr[i];
                        }
                        arr = newArr;
                    } else System.out.println("Vị trí không hợp lệ!");
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

            System.out.print("Mảng hiện tại: ");
            for (int num : arr) System.out.print(num + " ");
            System.out.println();

        } while (choice != 4);

    }
}
