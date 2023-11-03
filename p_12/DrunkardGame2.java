package practice_12;
//                                          Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class DrunkardGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] players = input.split(" ");

        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            player1.offer(Integer.parseInt(players[0].charAt(i) + ""));
            player2.offer(Integer.parseInt(players[1].charAt(i) + ""));
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.poll();
            int card2 = player2.poll();

            if (card1 > card2) {
                player1.offer(card1);
                player1.offer(card2);
            } else {
                player2.offer(card1);
                player2.offer(card2);
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