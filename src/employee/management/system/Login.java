package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField tfusername, tfpassword;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(40, 30, 100, 30);
        add(username);

        tfusername = new JTextField();
        tfusername.setBounds(150, 30, 150, 30);
        tfusername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 80, 100, 30);
        add(password);

        tfpassword = new JTextField();
        tfpassword.setBounds(150, 80, 150, 30);
        tfpassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setLocation(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();

            Conn c = new Conn();
            String query = "Select * from login where username= '" + username + "' and password='" + password + "'";

            ResultSet rs = c.s.executeQuery(query);//executing the query
            if (rs.next()) {
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
