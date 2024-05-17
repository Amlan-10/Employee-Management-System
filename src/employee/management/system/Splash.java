package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);//dist. from left,top,length,width
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.red);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton click1 = new JButton("CLICK HERE TO CONTINUE");
        click1.setFocusPainted(false);//removes the border around the text inside the button
        click1.setBounds(400, 400, 300, 70);
        click1.setBackground(Color.BLACK);
        click1.setForeground(Color.WHITE);
        click1.addActionListener(this);
        image.add(click1);

        setSize(1170, 650);
        setLocation(90, 25);//dist from left,dist. from top
        setVisible(true);//default hidden
    }

    public static void main(String[] args) {
        new Splash();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();//create an object of login class to open login page
    }
}
