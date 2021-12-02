
package Matala2;

public class Ex6 {
    public static int[] checkIntersection(int[] arr1, int[] arr2) {
        int counter = 1;
        int[] arrEquals = new int[counter];
        for (int s = 0; s < arr1.length; s++)
            if (arr1[s] < 10 || arr1[s] > 99) {
                System.out.println("Please enter double-digit numbers");
            }
        for (int a = 0; a < arr2.length; a++)
            if (arr2[a] < 10 || arr1[a] > 99) {
                System.out.println("Please enter double-digit numbers");
            }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    counter++;
                    for (int k = 0; k < arrEquals.length; k++)
                        arrEquals[k] = arr2[j];
                    break;
                }
            }
        }
        return arrEquals;
    }
    public static boolean differentNumbers(int[] arr1, int[] arr2) {
        boolean different = false;
        for (int s = 0; s < arr1.length; s++)
            if (arr1[s] < 10 || arr1[s] > 99) {
                System.out.println("Please enter double-digit numbers");
            }
        for (int a = 0; a < arr2.length; a++)
            if (arr2[a] < 10 || arr1[a] > 99) {
                System.out.println("Please enter double-digit numbers");
            }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    different = true;
                } else {
                    different = true;
                    break;
                }
            }
        }
        return different;
    }

    public static void main(String[] args) {
        int[] arrEquals = {14, 24, 45, 46, 29, 63, 14};
        int[] arrEquals2 = {14, 55, 12, 945, 11, 16};
        checkIntersection(arrEquals, arrEquals2);
    }
}


