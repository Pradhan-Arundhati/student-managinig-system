import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;


public class Detail extends JFrame implements ActionListener{

    JLabel l1, l2, l3, l4,
            l5, l6, l7, l8,
            l9, l10, l12, l13,
            l14, l11, l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;

    JTextField tf1, tf2, tf3,
            tf4, tf5, tf6,
            tf7, tf8, tf9,
            tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19;

    JTextArea area2, area1;

    JButton fee;

    JRadioButton rb1, rb2, rb3,
            rb4, rb5, rb6,
            rb7;

    JFileChooser f1;


    // Default constructor to
    // initialize the parameters
    Detail()
    {

        l1 = new JLabel("STUDENT DATABASE");           //1
        l1.setBounds(550, 50, 250, 10);


//Kc Logo
        ImageIcon icon = new ImageIcon("C:\\Users\\arundhati\\downloads/kcLogo.png");
        JLabel s23=new JLabel(icon);
        s23.setBounds(1050,50,275,275);

//name
        l2 = new JLabel("Name of the Student:");              //2
        l2.setBounds(50, 100, 250, 10);

        tf1 = new JTextField();
        tf1.setBounds(250, 100, 250, 20);

//father
        l3 = new JLabel("Name of the Father:");           //3
        l3.setBounds(50, 150, 250, 20);

        tf2 = new JTextField();
        tf2.setBounds(250, 150, 250, 20);

//mother
        l16 = new JLabel("Name of the Mother:");          //16
        l16.setBounds(50, 200, 250, 20);

        tf11 = new JTextField();
        tf11.setBounds(250, 200, 250, 20);

//enrollment
        l4 = new JLabel("ENROLLMENT NO.:");
        l4.setBounds(50, 250, 250, 20);

        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);

//Aadhar
        l17 = new JLabel("Aadhar Card Number:");
        l17.setBounds(50, 300, 250, 20);

        tf12 = new JTextField();
        tf12.setBounds(250, 300, 250, 20);

//email
        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 350, 250, 20);

        tf4 = new JTextField();
        tf4.setBounds(250, 350, 250, 20);

//contact
        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 400, 250, 20);

        tf5 = new JTextField();
        tf5.setBounds(250, 400, 250, 20);

//Fathers occupation
        l18 = new JLabel("Father's Occupation:");
        l18.setBounds(50, 450, 250, 20);

        tf13 = new JTextField();
        tf13.setBounds(250, 450, 250, 20);


//mothers occupation
        l19 = new JLabel("Mother's Occupation:");
        l19.setBounds(50, 500, 250, 20);

        tf14 = new JTextField();
        tf14.setBounds(250, 500, 250, 20);


//contact parents
        l20 = new JLabel("Parents Contact Number:");
        l20.setBounds(50, 550, 250, 20);

        tf15 = new JTextField();
        tf15.setBounds(250, 550, 250, 20);

//address
        l7 = new JLabel("Address:");
        l7.setBounds(50, 600, 250, 20);

        area1 = new JTextArea();
        area1.setBounds(250, 600, 250, 20);

//gender
        l9 = new JLabel("Gender:");
        l9.setBounds(50, 640, 250, 20);

        JRadioButton r5 = new JRadioButton(" Male");
        JRadioButton r6 = new JRadioButton(" Female");

        r5.setBounds(250, 640, 100, 20);
        r6.setBounds(350, 640, 100, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);
//nationality
        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 670, 250, 20);

        tf6 = new JTextField();
        tf6.setBounds(250, 670, 250, 20);


//state
        l21 = new JLabel("State:");
        l21.setBounds(550, 100, 150, 20);

        tf16 = new JTextField();
        tf16.setBounds(590, 100, 150, 20);


//district
        l22 = new JLabel("District:");
        l22.setBounds(750, 100, 150, 20);

        tf17 = new JTextField();
        tf17.setBounds(800, 100, 150, 20);


//taluka
        l23 = new JLabel("Taluka:");
        l23.setBounds(550, 150, 150, 20);

        tf18 = new JTextField();
        tf18.setBounds(595, 150, 150, 20);

//pin code
        l24 = new JLabel("Pin code:");
        l24.setBounds(750, 150, 150, 20);

        tf19 = new JTextField();
        tf19.setBounds(800, 150, 150, 20);


        //10th passing
        /*l11 = new JLabel("Year of passing 10th");
        l11.setBounds(550, 250, 250, 20);

        String[] language = { "2016", "2015", "2014" };

        final JComboBox cb1 = new JComboBox(language);

        cb1.setBounds(250, 650, 90, 20);*/

//12th passing
        l12 = new JLabel("Percentage & Year of passing 12th");
        l12.setBounds(550, 200, 250, 20);

        String[] languagess = { "2019", "2018", "2017" };

        final JComboBox cb1 = new JComboBox(languagess);

        cb1.setBounds(750, 200, 90, 20);


        tf8 = new JTextField();
        tf8.setBounds(850, 200, 120, 20);


        final JComboBox cb2 = new JComboBox(languagess);

        cb2.setBounds(250, 650, 90, 20);
        l8 = new JLabel("courses Offered here are:");
        l8.setBounds(550, 300, 250, 20);

        rb1 = new JRadioButton("ENABLE");
        rb1.setBounds(550, 250, 100, 20);

        rb2 = new JRadioButton("DISABLE");
        rb2.setBounds(650, 250, 100, 20);

        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(rb1);
        bg1.add(rb2);

        rb3 = new JRadioButton("REGULAR");
        rb3.setBounds(780, 250, 100, 20);

        rb4 = new JRadioButton("PRIVATE");
        rb4.setBounds(880, 250, 100, 20);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        String languages[] = { "CSE", "EXTC","IT"};

        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(700, 300, 90, 20);


        final DefaultListModel<String> li1 = new DefaultListModel<>();

        li1.addElement("Fees structure :-");
        li1.addElement("CSE(3,15,000)");
        li1.addElement("EXTC(2, 55, 000)");
        li1.addElement("IT(2, 70, 000)");
        final JList<String> list1 = new JList<>(li1);

        list1.setBounds(850, 300, 125, 120);

        DefaultListModel<String> li2 = new DefaultListModel<>();

        li2.addElement("Installment cases :- ");
        li2.addElement(
                "3 INSTALLMENT OF CSE IN(1,05,000)");
        li2.addElement(
                "3 INSTALLMENT IF EXTC IN(85,000)");
        li2.addElement(
                "3 INSTALLMENT OF IT IN (90,000)");


        final JList<String> list2 = new JList<>(li2);
        list2.setBounds(550, 340, 250, 80);

        JButton Receipt = new JButton("SUBMIT FORM");
        Receipt.setBounds(600, 430, 150, 25);
        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 430, 150, 25);

        area2 = new JTextArea();
        area2.setBounds(550, 470, 600, 255);

        JButton fee = new JButton("Generate receipt");
        fee.setBounds(900, 430, 150, 25);


        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        //add(l11);
        add(l12);
        //add(l13);
        //add(l14);
        add(l16);
        add(l17);
        add(l18);
        add(l19);
        add(l20);
        add(l21);
        add(l22);
        add(l23);
        add(l24);
        add(s23);


        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        //add(tf7);
        add(tf8);
        add(tf11);
        add(tf12);
        add(tf13);
        add(tf14);
        add(tf15);
        add(tf16);
        add(tf17);
        add(tf18);
        add(tf19);
        add(area1);
        add(area2);
        //add(l15);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(r5);
        add(r6);
        add(cb);
        add(cb1);
        add(cb2);
        add(list1);
        add(list2);
        //add(b);
        //add(label);
        add(Receipt);
        add(b2);
        add(fee);


        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        area2.setText("");
                        area1.setText(" ");
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                        tf4.setText("");
                        tf5.setText("");
                        tf6.setText(" ");
                    }
                });

        // Implementing the Print action


        // Generating the receipt
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                area2.setText(
                        "************"
                                + "****** STUDENT DETAILS ******"
                                + "*********"
                                + "**********"
                                + "********\n");

                if (rb1.isSelected()) {
                    area2.setText(area2.getText() + "                 " + "K.C.COLLEGE " + "OF ENGINEERING & MANAGEMENT STUDIES & RESEARCH\n");
                }
                if (rb2.isSelected()) {
                    area2.setText(area2.getText() + "                 " + "K.C.COLLEGE " + "OF ENGINEERING & MANAGEMENT STUDIES & RESEARCH\n");
                }
                area2.setText(area2.getText()
                        + "Student Name: "
                        + tf1.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Father's Name: "
                        + tf2.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Mother's Name: "
                        + tf11.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "ENROLLMENT NO.: "
                        + tf3.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Aadhar Card Number: "
                        + tf12.getText()
                        + "\n");
                area2.setText(area2.getText() + "Email ID: " + tf4.getText() + "\n");
                area2.setText(area2.getText() + "Contact Number: " + tf5.getText() + "\n");
                area2.setText(area2.getText()
                        + "Father's Occupation: "
                        + tf13.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Mother's Occupation: "
                        + tf14.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Parents Contact Number: "
                        + tf15.getText()
                        + "\n");
                area2.setText(area2.getText() + "Course taken: " + cb.getSelectedItem().toString() + "\n");


                if (rb3.isSelected()) {
                    area2.setText(area2.getText() + "Wants to be a " + "REGULAR CANDIDATE \n");
                }
                if (rb4.isSelected()) {
                    area2.setText(area2.getText() + "Wants to be a " + "PRIVATE CANDIDATE \n");
                }
                area2.setText(area2.getText() + "Had chosen: " + list1.getSelectedValue() + "\n");
                area2.setText(area2.getText() + "Had chosen: " + list2.getSelectedValue() + "\n");

                int index2 = list2.getSelectedIndex();
                if (index2 == 0) {
                    area2.setText(area2.getText() + "                    " + "Total amount to be " + "paid is 3,15,000 \n");
                }

                if (index2 == 1) {
                    area2.setText(area2.getText() + "                    " + "Total amount to be paid " + "is 2,55,000  \n");
                }

                if (index2 == 2) {
                    area2.setText(area2.getText() + "                    " + "Total amount to be paid " + "is 2,70,000  \n");
                }

                if (e.getSource() == Receipt) {
                    try {
                        FileWriter fw
                                = new FileWriter(
                                "java.txt", true);
                        fw.write(area2.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }

                JOptionPane.showMessageDialog(
                        area2, "DATA SAVED SUCCESSFULLY");


            };
        });
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we)
                    {
                        System.exit(0);
                    }
                });
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);


    }

    public void actionPerformed(ActionEvent e) {
        if (fee.isSelected()) {
            new FeeReceipt().setVisible(true);
        }
    }

    public static void main(String[] args)
    {
        new Detail();
    }

}

