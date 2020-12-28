import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame("Tic-tac-toe");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
