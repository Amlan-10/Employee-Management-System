package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
    JButton add,view,update,remove;
    Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setFocusPainted(false);//removes the border around the text inside the button
        add.setBounds(650, 80, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employee");
        view.setFocusPainted(false);
        view.setBounds(820, 80, 150, 40);
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setFocusPainted(false);
        update.setBounds(650, 140, 150, 40);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setFocusPainted(false);
        remove.setBounds(820, 140, 150, 40);
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120,630);
        setLocation(100,40);
        setVisible(true);
    }   
    public static void main(String[] args){
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == add){
            setVisible(false);
            new AddEmployee();
        }
        else if(ae.getSource() == view){
            setVisible(false);
            new ViewEmployee();
        }
        else if(ae.getSource() == update){
            setVisible(false);
            new ViewEmployee();
        }
        else{
            setVisible(false);
            new RemoveEmployee();
        }
    }
}
