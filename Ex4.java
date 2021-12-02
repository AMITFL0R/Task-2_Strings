
package Matala2;

public class Ex4 {
    public static void main(String[] args) {
        int[] fullArr = {1 , 1 , 1 , 1 , 8 , 8 , 8,9,9,9,9,10,10,10,10 };
        int[] finalArr = noDuplicate(fullArr);
        for (int i = 0; i < finalArr.length; i++) {
            System.out.print(finalArr[i]+" , ");

        }
    }

    public static int[] noDuplicate(int[] fullArr) {
        int count = 0;
        int[] noDuplicateArr = new int[fullArr.length];
        for (int i = 0; i < noDuplicateArr.length; i++) {
            noDuplicateArr[i] = -2147483648; // integer minimum
        }
        for (int i = 0; i < fullArr.length; i++) {
            boolean found = false;
            for (int j = 0; j < noDuplicateArr.length; j++) {
                if (fullArr[i] == noDuplicateArr[j]) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                noDuplicateArr[count] = fullArr[i];
                count++;
            }
        }

        int[] finalArr = new int[count];
        for (int i = 0; i < count; i++) {
            finalArr[i] = noDuplicateArr[i];
        }

        return finalArr;

    }

}
