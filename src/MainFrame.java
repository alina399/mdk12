import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
        setTitle(title);
        MainPanel panel = new MainPanel();
        add(panel);
        pack();
    }
}
