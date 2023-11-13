import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeWindow extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    public ShapeWindow() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g, 20);
            }
        };

        getContentPane().add(panel);
        setVisible(true);
    }

    private void drawRandomShapes(Graphics g, int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int shapeType = random.nextInt(3); // 0 = Circle, 1 = Rectangle, 2 = Triangle

            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            g.setColor(randomColor);

            switch (shapeType) {
                case 0:
                    g.fillOval(x, y, 50, 50);
                    break;
                case 1:
                    g.fillRect(x, y, 50, 50);
                    break;
                case 2:
                    int[] triangleX = {x, x + 50, x + 25};
                    int[] triangleY = {y + 50, y + 50, y};
                    g.fillPolygon(triangleX, triangleY, 3);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShapeWindow();
        });
    }
}
