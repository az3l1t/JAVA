package practice_12;
//                                           with interface (58631-88888)
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGame5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру 'Пьяница'!");
        System.out.println("Введите карты первого игрока (5 карт):");
        String player1Cards = scanner.nextLine();

        System.out.println("Введите карты второго игрока (5 карт):");
        String player2Cards = scanner.nextLine();

        scanner.close();

        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            player1Deck.offer(Integer.parseInt(player1Cards.substring(i, i + 1)));
            player2Deck.offer(Integer.parseInt(player2Cards.substring(i, i + 1)));
        }

        int moves = 0;
        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            if (card1 > card2) {
                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else {
                player2Deck.offer(card1);
                player2Deck.offer(card2);
            }

            moves++;
        }

        if (moves >= 106) {
            System.out.println("botva");
        } else if (player1Deck.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}