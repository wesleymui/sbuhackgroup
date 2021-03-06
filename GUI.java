import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private ImageIcon image1;
    ArrayList<JButton> holePositions = new ArrayList<JButton>();
    Fox newGame = new Fox("name", (int)(Math.random() * (5) ));
    private int rows = 1;
    private int cols;
    private boolean endGame;

    public GUI(int cols) {
        frame = new JFrame();
        this.cols = cols;


//        JButton button  = new JButton("Click me");
//        button.addActionListener(this);

        frame.setLayout(new FlowLayout());

//        image1 = new ImageIcon(getClass().getResource("background.png"));
        frame.add(new JLabel(image1));

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 400, 200, 400));
        panel.setLayout(new GridLayout(rows, cols, 30, 30));
        for (int i = 0; i < cols; i++) {
            JButton button = new JButton(Integer.toString(i + 1));
            button.setBorder(new RoundedBorder(30));
//            button.setOpaque(true);
            panel.add(button);
//            panel.setOpaque(false);
            holePositions.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    label.setText("Number of clicks: " + count);
                    if (getHole(button)+1 == newGame.getFoxHoleLocation()) {
                        label.setText("Caught!            ");
//                        frame.add(new JLabel(new ImageIcon(getClass().getResource("fox.png"))));
                        endGame = true;
                    }
                    newGame.move();
                }
            });

        }


        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fox in a Hole");
        frame.pack();
        frame.setVisible(true);


    }

    public int getHole(JButton o) {
        return holePositions.indexOf(o);
    }

//    public void setHole(int cols){
//        this.cols = cols;
//    }
//
//    public boolean isEndGame() {
//        return endGame;
//    }

//    public static void main(String[] args) {
//        new GUI();
//        Fox newGame = new Fox("name", 1);
//
////        holePositions.get(1).addActionListener(new ActionListener() {
////            public void actionPerformed(ActionEvent e) {
////                count++;
////                label.setText("Number of clicks: " + count);
////
////            }
////        });
//
////        HolesLayout gt = new HolesLayout(1, 5);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        count++;
//        label.setText("Number of clicks: " + count);
//        if (getHole((JButton) e.getSource()) == newGame.getFoxHoleLocation()) {
//            label.setText("caught");
//        }
//        newGame.move();
    }
}