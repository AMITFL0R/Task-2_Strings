package Matala2;

public class Ex1 {
    public static void main(String[] args) {
        String theFirstString = "hello java";
        String theSecondString = "hello";
        System.out.println(isSubString(theFirstString, theSecondString));

    }
    public static boolean isSubString(String firstStr, String secondStr) {
        boolean result = false;
        if (secondStr.length() > 0) {
            char startingLetter = secondStr.charAt(0);
            for (int i = 0; i < firstStr.length(); i++) {
                if (firstStr.charAt(i) == startingLetter) {
                    int sumOfLetter = 1;
                    for (int j = 1; j < secondStr.length(); j++) {
                        if (i + j < firstStr.length()) {
                            if (secondStr.charAt(j) == firstStr.charAt(i + j)) {
                                sumOfLetter++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (sumOfLetter == secondStr.length()) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}


