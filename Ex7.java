package Matala2;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int count = 0;
        int boardSize = 9;
        int player = 2;
        boolean winning = false;
        char symbol = 'x';

        char[] board = new char[boardSize];
        System.out.println("player 1 start the game, your symbol is x" + ("\n"));
        printBoard(board);

        do {
            int place = getPositionFromUser(board);
            winning = placeSymbolOnBoard(board, place, symbol);
            count++;
            if (player == 1) {
                symbol = 'x';
                player = 2;
            } else {
                symbol = 'o';
                player = 1;
            }
            if (count == 9) {
                winning = true;
            }

        }
        while (winning == false);
        if (count == 9 && checkWinner(board) != 'x' && checkWinner(board) != 'o') {
            System.out.println("There no winner");
        }

    }


    public static void printBoard(char[] board) {
        System.out.print(board[0] + " | " + board[1] + " | " + board[2] +
                ("\n" + board[3] + " | " + board[4] + " | " + board[5]) +
                ("\n" + board[6] + " | " + board[7] + " | " + board[8]) +
                ("\n"));

    }

    public static boolean isAvailable(char[] board, int place) {
        if (board[place] == 'o' || board[place] == 'x') {
            return false;
        } else {
            return true;
        }
    }


    public static int getPositionFromUser(char[] board) {
        Scanner scanner = new Scanner(System.in);
        int place;
        do {
            System.out.println(("\n") + "Which place do you want? enter a number between 1-9");
            place = scanner.nextInt();
            if (place < 1 || place > 9) {
                System.out.println("The place you chose is invalid");
            } else if (!isAvailable(board, place - 1)) {
                System.out.println("That place is already taken");
            }
        } while (place < 1 || place > 9 || !isAvailable(board, place - 1));
        return place;
    }

    public static char checkWinner(char[] board) {
        for (int i = 0; i < board.length; i += 3) {
            if (board[i] == board[i + 1] && board[i + 1] == board[i + 2]) {
                return board[i];
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == board[i + 3] && board[i + 3] == board[i + 6]) {
                return board[i];
            }
        }
        if ((board[0] == board[4] && board[4] == board[8]) || (board[2] == board[4] && board[4] == board[6])) {
            return board[4];
        }
        return '-';
    }

    public static boolean placeSymbolOnBoard(char[] board, int userChoice, char symbol) {
        board[userChoice - 1] = symbol;
        printBoard(board);

        if (checkWinner(board) == 'x') {
            System.out.println(" player x win!! ");
            return true;
        } else if (checkWinner(board) == 'o') {
            System.out.println(" player o win!! ");
            return true;
        }
        return false;
    }

}

