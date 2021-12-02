package Matala2;

public class Ex3 {
    public static String fixNumberCell(String strNumber) {
        int i = 0;
        if
        (strNumber.length() == 10 && strNumber.charAt(i) == '0' && strNumber.charAt(i + 1) == '5' && (strNumber.charAt(i + 2) == '0' || strNumber.charAt(i + 2) == '1' || strNumber.charAt(i + 2) == '2' || strNumber.charAt(i + 2) == '3' || strNumber.charAt(i + 2) == '4' || strNumber.charAt(i + 2) == '5' || strNumber.charAt(i + 2) == '6' || strNumber.charAt(i + 2) == '7' || strNumber.charAt(i + 2) == '8' || strNumber.charAt(i + 2) == '9'))
            return mySubString(strNumber, i, i + 3) + '-' + mySubString(strNumber, i + 3, i + 10);

        else if
        (strNumber.length() == 11 && (strNumber.charAt(i) == '0' && strNumber.charAt(i + 1) == '5' && strNumber.charAt(i + 2) == '0' || strNumber.charAt(i + 2) == '1' || strNumber.charAt(i + 2) == '2' || strNumber.charAt(i + 2) == '3' || strNumber.charAt(i + 2) == '4' || strNumber.charAt(i + 2) == '5' || strNumber.charAt(i + 2) == '6' || strNumber.charAt(i + 2) == '7' || strNumber.charAt(i + 2) == '8' || strNumber.charAt(i + 2) == '9' && strNumber.charAt(i + 3) == '-'))
            return strNumber;

        else if
        (strNumber.length() == 12 && (strNumber.charAt(i) == '9' && strNumber.charAt(i + 1) == '7' && strNumber.charAt(i + 2) == '2'))
            return '0' + mySubString(strNumber, i + 3, i + 5) + '-' + mySubString(strNumber, i + 5, i + 12);

        else
            return " ";
    }

    public static String mySubString(String str, int start, int end) {
        String newStr = " ";
        for (int i = start; i < end; i++) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        String newStr = fixNumberCell("9725887639813");
        System.out.println(newStr);
    }
}

