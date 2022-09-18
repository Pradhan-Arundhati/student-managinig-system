/*import javax.swing.*;
import java.awt.*;
public class AboutUs extends JFrame {

    AboutUs(){
        setVisible(true);
        JFrame f= new JFrame();
        TextArea area=new TextArea("Welcome to javatpoint");
        area.setBounds(10,30, 300,300);
        f.add(area);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args)
    {
        new AboutUs();
    }


}*/


import java.awt.*;
import javax.swing.*;

public class AboutUs extends JPanel {

    static private JPanel masterPanel = new JPanel();
    static private JLabel finalResults = new JLabel("test");
    static private Double totalGrade = 0.00;
    static private Double totalHours = 0.00;
    static private Double hours;
    static private Double echo;

    // 4 classes
    AboutUs (String class1, String class2, String class3, String class4, double grade1, double grade2, double grade3, double grade4,
                   double hours1, double hours2, double hours3, double hours4) {

        JPanel panel = new JPanel();
        Dimension panelD = new Dimension(125, 100);
        panel.setPreferredSize(panelD);
        add(panel);
        JLabel label = new JLabel(class1 + "  " + grade1);
        JLabel label2 = new JLabel(class2 + "  " + grade2);
        JLabel label3 = new JLabel(class3 + "  " + grade3);
        JLabel label4 = new JLabel(class4 + "  " + grade4);
        double grade = (grade1 * hours1 + grade2 * hours2 + grade3 * hours3 + grade4 * hours4);
        hours =+ hours1 + hours2 + hours3 + hours4;
        echo = grade / hours;
        JLabel results = new JLabel();

        results.setText("average grade: " + echo);
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(results);

        panel.setLayout(new GridLayout (5,2,5,0));
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        totalGrade += grade;
        totalHours += hours;
    }
    // 3 classes
    AboutUs (String class1, String class2, String class3, double grade1, double grade2, double grade3,
                   double hours1, double hours2, double hours3) {
        JPanel panel = new JPanel();
        Dimension panelD = new Dimension(125, 100);
        panel.setPreferredSize(panelD);
        add(panel);
        JLabel label = new JLabel(class1 + "  " + grade1);
        JLabel label2 = new JLabel(class2 + "  " + grade2);
        JLabel label3 = new JLabel(class3 + "  " + grade3);
        double grade = (grade1 * hours1 + grade2 * hours2 + grade3 * hours3);
        hours =+ hours1 + hours2 + hours3;
        echo = grade / hours;
        JLabel results = new JLabel();

        results.setText("average grade: " + echo);
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(results);

        panel.setLayout(new GridLayout (4,2,5,0));
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        totalGrade += grade;
        totalHours += hours;
    }
    // 2 classes
    AboutUs(String class1, String class2, double grade1, double grade2, double hours1, double hours2) {

        JPanel panel = new JPanel();
        Dimension panelD = new Dimension(125, 100);
        panel.setPreferredSize(panelD);
        add(panel);
        JLabel label = new JLabel(class1 + "  " + grade1);
        JLabel label2 = new JLabel(class2 + "  " + grade2);
        double grade = (grade1 * hours1 + grade2 * hours2);
        hours =+ hours1 + hours2;
        echo = grade / hours;
        JLabel results = new JLabel();

        results.setText("average grade: " + echo);
        panel.add(label);
        panel.add(label2);
        panel.add(results);

        panel.setLayout(new GridLayout (3,2,5,0));
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        totalGrade += grade;
        totalHours += hours;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GPA Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        masterPanel.add(new AboutUs("computer class", "philosophy", 4, 4, 2, 3));
        masterPanel.add(new AboutUs("english 1101", "algebra" , "psychology", "human com", 4, 4, 4, 3, 3, 3, 3, 3));
        masterPanel.add(new AboutUs("engl 1102", "precal", "health", 4, 4, 4, 3, 3, 2));
        masterPanel.add(new AboutUs("western civ", "amer lit", "nutrition", "comp prog", 4, 4, 4, 4, 3, 3, 3, 4));

        totalGrade /= totalHours;
        finalResults.setText(totalGrade.toString());
        masterPanel.add(finalResults);

        frame.add(masterPanel);
        frame.pack();
        frame.setVisible(true);
    }

}