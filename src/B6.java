public class B6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,2,6,7,8,9,10,1,2,3,4,5,6,7,8};
        int[] countArr = new int[1000];

        for (int num : arr) {
            countArr[num]++;

        }


        int maxCount = 0;
        for (int count : countArr) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == maxCount) {
                System.out.println("Phan tu : " + i + ", So lan xuat hien: " + countArr[i]);
            }
        }
    }
}
