package Matala2;

import java.util.Scanner;

public class Ex2 {
    public static void aboveAverage() {
        Scanner scanner = new Scanner(System.in);
        int num, average, sum = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter num:");
            num = scanner.nextInt();
            numbers[i] = num;
            sum = sum + num;
        }
        average = (sum / numbers.length);
        System.out.println("Your average is:" + " " + average);
        for (int j = 0; j < numbers.length; j++)
            if (numbers[j] > average) {
                System.out.println("Your number's above average:" + + numbers[j]);
            } else System.out.println(" ");
    }

    public static void main(String[] args) {

        aboveAverage();
    }
}
