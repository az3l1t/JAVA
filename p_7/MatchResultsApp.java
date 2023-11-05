import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultsApp extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchResultsApp() {
        super("Match Results");

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: AC Milan");
                checkWinner();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                checkWinner();
            }
        });

        JPanel panel = new JPanel();
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);
        panel.add(milanButton);
        panel.add(madridButton);

        getContentPane().add(panel);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void checkWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MatchResultsApp();
            }
        });
    }
}