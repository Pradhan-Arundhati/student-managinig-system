import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;


class Login extends JFrame implements ActionListener {
    JRadioButton admin, student;
    JButton bu;

    Login() {
        admin = new JRadioButton("Admin Login ");
        admin.setBounds(100, 50, 200, 30);
        student = new JRadioButton("Student Login");
        student.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(admin);
        bg.add(student);
        bu = new JButton("Ok");
        bu.setBounds(100, 150, 80, 30);
        bu.addActionListener(this);
        add(admin);
        add(student);
        add(bu);
        setSize(370, 600);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (admin.isSelected()) {
            //JOptionPane.showMessageDialog(this,"Option 1 selected.");
            new LoginFrame().setVisible(true);

        }
        if (student.isSelected()) {
            //JOptionPane.showMessageDialog(this,"Option 2 selected");
            new StudentFrame().setVisible(true);
        }
    }

    public static void main(String[] args){
        new Login();
    }


}

