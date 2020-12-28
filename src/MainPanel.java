import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    JPanel panel;
    JButton[] buttons = new JButton[9];
    JTextField textField = new JTextField();
    boolean stroke_bl = true;
    boolean full_field = false;
    String x = "X";
    String o = "0";
    boolean pause = false;

    public MainPanel(){
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));

        ActionListener stroke = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                full_field = true;
                for (int i = 0; i < buttons.length; i++){
                    if(buttons[i].getText().equals(" ")) {
                        full_field = false;
                    }
                }
                int selected_btn = 0;
                for (int i = 0; i < buttons.length; i++) {
                    if (buttons[i].hasFocus()) {
                        selected_btn = i;
                    }
                }
                if(!full_field) {
                    if(buttons[selected_btn].getText().equals(" ")) {
                        if (stroke_bl) {
                            buttons[selected_btn].setText("X");
                            stroke_bl = false;
                            textField.setText(" ");
                        } else {
                            buttons[selected_btn].setText("0");
                            stroke_bl = true;
                        }
                    }
                } else {
                    pause();
                    JOptionPane.showMessageDialog(panel,"Поля заполнены");
                }

                // X победы

                if(buttons[0].getText().equals(x) && buttons[1].getText().equals(x) && buttons[2].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[3].getText().equals(x) && buttons[4].getText().equals(x) && buttons[5].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[6].getText().equals(x) && buttons[7].getText().equals(x) && buttons[8].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[0].getText().equals(x) && buttons[3].getText().equals(x) && buttons[6].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[1].getText().equals(x) && buttons[4].getText().equals(x) && buttons[7].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[2].getText().equals(x) && buttons[5].getText().equals(x) && buttons[8].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[0].getText().equals(x) && buttons[4].getText().equals(x) && buttons[8].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel,x + " выиграли!");
                    pause = true;
                }
                if(buttons[2].getText().equals(x) && buttons[4].getText().equals(x) && buttons[6].getText().equals(x)){
                    pause();
                    JOptionPane.showMessageDialog(panel, x + " выиграли!");
                    pause = true;
                }

                // 0 победы

                if(buttons[0].getText().equals(o) && buttons[1].getText().equals(o) && buttons[2].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[3].getText().equals(o) && buttons[4].getText().equals(o) && buttons[5].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[6].getText().equals(o) && buttons[7].getText().equals(o) && buttons[8].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[0].getText().equals(o) && buttons[3].getText().equals(o) && buttons[6].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[1].getText().equals(o) && buttons[4].getText().equals(o) && buttons[7].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[2].getText().equals(o) && buttons[5].getText().equals(o) && buttons[8].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[0].getText().equals(o) && buttons[4].getText().equals(o) && buttons[8].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel,o + " выиграли!");
                    pause = true;
                }
                if(buttons[2].getText().equals(o) && buttons[4].getText().equals(o) && buttons[6].getText().equals(o)){
                    pause();
                    JOptionPane.showMessageDialog(panel, o + " выиграли!");
                    pause = true;
                }
            }
        };

       for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(" ");
            buttons[i] = button;
            button.addActionListener(stroke);
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);

        JButton button = new JButton("Restart");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
                play();
            }
        });
        add(button, BorderLayout.SOUTH);
        
    }

    public void pause() {
        for(int i = 0; i < buttons.length; i ++){
            buttons[i].setEnabled(false);
        }
    }

    public void play() {
        for(int i = 0; i < buttons.length; i ++){
            buttons[i].setEnabled(true);
        }
    }

    public void clear() {
        for(int i = 0; i < buttons.length; i ++){
            buttons[i].setText(" ");
        }
    }

    public int getLength() {
        return buttons.length;
    }
}
