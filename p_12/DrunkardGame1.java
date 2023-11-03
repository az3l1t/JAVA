package practice_12;
//                                                 Stack
import java.sql.SQLOutput;
import java.util.Stack;
import java.util.Scanner;

public class DrunkardGame1 { //пьяница
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] players = input.split(" ");

        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 4; i >= 0; i--) {
            player1.push(Integer.parseInt(players[0].charAt(i) + ""));
            player2.push(Integer.parseInt(players[1].charAt(i) + ""));
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pop();
            int card2 = player2.pop();

            if (card1 > card2) {
                tempStack.push(card1);
                tempStack.push(card2);
                while (!tempStack.isEmpty()) {
                    player1.insertElementAt(tempStack.pop(), 0);
                }
            } else {
                tempStack.push(card1);
                tempStack.push(card2);
                while (!tempStack.isEmpty()) {
                    player2.insertElementAt(tempStack.pop(), 0);
                }
            }

            moves++;
        }

        if (moves >= 106) {
            System.out.println("botva");
        } else if (player1.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}