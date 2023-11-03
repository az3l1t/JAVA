package practice_12;
//                                       Dequeue.
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGame3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] players = input.split(" ");

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            player1.addFirst(Integer.parseInt(players[0].charAt(i) + ""));
            player2.addFirst(Integer.parseInt(players[1].charAt(i) + ""));
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pollLast();
            int card2 = player2.pollLast();

            if (card1 > card2) {
                player1.addFirst(card1);
                player1.addFirst(card2);
            } else {
                player2.addFirst(card1);
                player2.addFirst(card2);
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