import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeworkEleven {
    static int clicks = 0;
    public static void main (String[] args) {
        JFrame mainFrame = new JFrame();

        mainFrame.setBounds(300, 300, 300, 200);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainFrame.add(mainPanel);
        JButton click = new JButton(String.valueOf(clicks));
        click.setSize(60, 20);
        mainPanel.setVisible(true);
        mainFrame.add(click);
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks++;
                click.setText(String.valueOf(clicks));
            }
        });
    }
}
