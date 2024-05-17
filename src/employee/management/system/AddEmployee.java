package employee.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    Random rand = new Random();
    int num = rand.nextInt(999999);
    
    JTextField tfname,tffname,tfsalary,tfaddress,tfphno,tfemail,tfdes,tfaadhar;
    JComboBox tfed;
    JLabel tfeid;
    JButton add,back;
    JDateChooser dcdob;
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(280, 30, 500, 50);
        heading.setFont(new Font("serif",Font.BOLD,25));
        add(heading);
        
        JLabel lbname = new JLabel("Name");
        lbname.setBounds(50,130, 80, 30);
        lbname.setFont(new Font("san_serif",Font.PLAIN,20));
        add(lbname);
        
        tfname = new JTextField();
        tfname.setBounds(200,130, 150, 30);
        tfname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfname);
        
        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400,130, 200, 30);
        fname.setFont(new Font("san_serif",Font.PLAIN,20));
        add(fname);
        
        tffname = new JTextField();
        tffname.setBounds(560,130,150,30);
        tffname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tffname);
        
        JLabel lbdob = new JLabel("Date of Birth");
        lbdob.setBounds(50,190, 150, 30);
        lbdob.setFont(new Font("san_serif",Font.PLAIN,20));
        add(lbdob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200,190,150,30);
        dcdob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(dcdob);
        
        JLabel salary = new JLabel("Enter the Salary");
        salary.setBounds(400,190, 200, 30);
        salary.setFont(new Font("san_serif",Font.PLAIN,20));
        add(salary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(560,190,150,30);
        tfsalary.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfsalary);
        
        JLabel address = new JLabel("Address");
        address.setBounds(50,250, 150, 30);
        address.setFont(new Font("san_serif",Font.PLAIN,20));
        add(address);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        tfaddress.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfaddress);
        
        JLabel phnno = new JLabel("Phone Number");
        phnno.setBounds(400,250, 200, 30);
        phnno.setFont(new Font("san_serif",Font.PLAIN,20));
        add(phnno);
        
        tfphno = new JTextField();
        tfphno.setBounds(560,250,150,30);
        tfphno.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfphno);
        
        JLabel email = new JLabel("Email");
        email.setBounds(50,310, 150, 30);
        email.setFont(new Font("san_serif",Font.PLAIN,20));
        add(email);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,310,150,30);
        tfemail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfemail);
        
        
        JLabel education = new JLabel("Highest Edu.");
        education.setBounds(400,310, 200, 30);
        education.setFont(new Font("san_serif",Font.PLAIN,20));
        add(education);
        
        String [] courses={"BBA","BCA","BA","BSC","B.Tech","B.Com","MBA","MCA","MA","M.Tech"};
        tfed = new JComboBox(courses);
        tfed.setBounds(560,310,150,30);
        tfed.setBackground(Color.WHITE);
        tfed.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfed);
        
        JLabel des = new JLabel("Designation");
        des.setBounds(50,370, 150, 30);
        des.setFont(new Font("san_serif",Font.PLAIN,20));
        add(des);
        
        tfdes = new JTextField();
        tfdes.setBounds(200,370,150,30);
        tfdes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfdes);
        
        JLabel aadhar = new JLabel("Aadhar no.");
        aadhar.setBounds(400,370, 200, 30);
        aadhar.setFont(new Font("san_serif",Font.PLAIN,20));
        add(aadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(560,370,150,30);
        tfaadhar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfaadhar);
        
        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(50,430, 150, 30);
        empid.setFont(new Font("san_serif",Font.PLAIN,20));
        add(empid);
        
        tfeid = new JLabel(""+num);
        tfeid.setBounds(200,430,150,30);
        tfeid.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tfeid);
        
         add = new JButton("Add Details");
        add.setFocusPainted(false);
        add.setBounds(240, 550, 150, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setFocusPainted(false);
        back.setBounds(440, 550, 150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(800,800);
        setLocation(180,25);
        setVisible(true);
    }
    public static void main(String[] args){
       new AddEmployee();
   } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name=tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphno.getText();
            String email = tfemail.getText();
            String education = (String) tfed.getSelectedItem();
            String designation = tfdes.getText();
            String aadhar = tfaadhar.getText();
            String empid = tfeid.getText();
            
            try{
                Conn conn=new Conn();
                String query = "Insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empid+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added Succesfully");
                setVisible(false);
                new Home();
            }
            catch(Exception ae){
                ae.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new Home();
        }
    }
}
