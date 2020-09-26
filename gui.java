import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private ImageIcon image1;

    public GUI() {
        frame = new JFrame();

        JButton button  = new JButton("Click me");
        button.addActionListener(this);

        frame.setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("background.png"));
        frame.add(new JLabel(image1));

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 400, 200, 400));
        panel.setLayout(new GridLayout(10, 10));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fox in a Hole");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
