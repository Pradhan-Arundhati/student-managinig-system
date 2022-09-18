import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;


class Introduction extends JFrame implements ActionListener {

    JRadioButton about,login;
    JButton bi;


    Introduction() {

        about = new JRadioButton("About  ");
        about.setBounds(100, 50, 200, 30);
        login = new JRadioButton("Login");
        login.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(about);
        bg.add(login);
        bi = new JButton("submit");
        bi.setBounds(100, 150, 80, 30);
        bi.addActionListener(this);
        add(about);
        add(login);
        add(bi);
        setSize(900, 600);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (about.isSelected()) {
            //JOptionPane.showMessageDialog(this,"Option 1 selected.");
            //new AboutUs().setVisible(true);

        }
        if (login.isSelected()) {
            //JOptionPane.showMessageDialog(this,"Option 2 selected");
            new Login().setVisible(true);
        }
    }


    public static void main(String[] args){
        new Introduction();
    }

}
