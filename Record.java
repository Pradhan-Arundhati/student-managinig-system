import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;


class Record extends JFrame implements ActionListener {
    JRadioButton rb1, rb2,rb3;
    JButton b;

    Record() {

        ImageIcon icon = new ImageIcon("C:\\Users\\arundhati\\downloads/kcLogo.png");
        JLabel s23=new JLabel(icon);
        s23.setBounds(80,50,275,275);

        rb1 = new JRadioButton("Admission Form ");
        rb1.setBounds(150, 350, 200, 30);
        rb2 = new JRadioButton("Fees Receipt ");
        rb2.setBounds(150, 400, 200, 30);
        rb3 = new JRadioButton("Attendance ");
        rb3.setBounds(150, 450, 200, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        b = new JButton("submit");
        b.setBounds(150, 500, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(rb3);
        add(b);
        add(s23);
        setSize(450,650);
        //setSize(370, 600);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            new Detail().setVisible(true);
        }
        if (rb2.isSelected()) {
            new FeeReceipt().setVisible(true);
        }
        if (rb3.isSelected()) {
            new Add().setVisible(true);
        }

    }

    public static void main(String[] args){
        new Record();

    }

}
