package Matala2;

public class Ex5 {
    public static void main(String[] args) {
        int[] numbers = {-5, 0, 2, 6, 8, 100, 3, 2, 0};
        System.out.println(isUpDown(numbers));

    }

    public static int isUpDown(int[] arr) {

        boolean isUp = true;
        int result = -1;

        if (arr.length > 2) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (isUp) {
                    if (arr[i + 1] > arr[i]) {
                        result = arr[i + 1];
                    } else {
                        isUp = false;
                    }
                } else {
                    if (arr[i + 1] > arr[i]) {
                        result = -1;
                        break;
                    }
                }
            }
            if (isUp) {
                result = -1;
            }
        }
        return result;
    }
}
