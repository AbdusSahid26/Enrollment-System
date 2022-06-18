package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateProfile extends JFrame implements ActionListener {
    JTextField nameArea, facultyArea ,deptArea, studentIdArea, semesterArea, levelArea, sessionArea , enrollmentFeeArea, facultyFeeArea, hallClearanceFeeArea, totalFeeArea, othersFeeArea;
    JButton payButton, saveButton, backButton, updatePasswordButton;
    String username;
    UpdateProfile(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // MAXIMIZED_BOTH it will adjust Panel with Screen
        setLayout(null);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/enroll.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel totalLabel = new JLabel(i3);
        totalLabel.setBounds(0, 0, 1920, 1080);
        add(totalLabel);

        JLabel headingLabel = new JLabel("Student Information");
        headingLabel.setBounds(500, 60, 1100, 80);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 65));
        totalLabel.add(headingLabel);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(380, 160, 240, 40);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(nameLabel);

        nameArea = new JTextField();
        nameArea.setBounds(680, 170, 500, 30);
        nameArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nameArea.setBackground(Color.WHITE);
        nameArea.setForeground(new Color(255, 128, 0));
        nameArea.setHorizontalAlignment(SwingConstants.CENTER);
        nameArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(nameArea);

        JLabel studentIdLabel = new JLabel("Student ID");
        studentIdLabel.setBounds(380, 200, 240, 40);
        studentIdLabel.setForeground(Color.WHITE);
        studentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(studentIdLabel);

        studentIdArea = new JTextField();
        studentIdArea.setBounds(680, 210, 500, 30);
        studentIdArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        studentIdArea.setBackground(Color.WHITE);
        studentIdArea.setForeground(new Color(255, 128, 0));
        studentIdArea.setHorizontalAlignment(SwingConstants.CENTER);
        studentIdArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(studentIdArea);

        JLabel facultyLabel = new JLabel("Faculty");
        facultyLabel.setBounds(380, 240, 240, 40);
        facultyLabel.setForeground(Color.WHITE);
        facultyLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(facultyLabel);

        facultyArea = new JTextField();
        facultyArea.setBounds(680, 250, 500, 30);
        facultyArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        facultyArea.setBackground(Color.WHITE);
        facultyArea.setForeground(new Color(255, 128, 0));
        facultyArea.setHorizontalAlignment(SwingConstants.CENTER);
        facultyArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(facultyArea);

        JLabel deptLabel = new JLabel("Dept. Name");
        deptLabel.setBounds(380, 280, 290, 40);
        deptLabel.setForeground(Color.WHITE);
        deptLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(deptLabel);

        deptArea = new JTextField();
        deptArea.setBounds(680, 290, 500, 30);
        deptArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deptArea.setBackground(Color.WHITE);
        deptArea.setForeground(new Color(255, 128, 0));
        deptArea.setHorizontalAlignment(SwingConstants.CENTER);
        deptArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(deptArea);

        JLabel levelLabel = new JLabel("Level");
        levelLabel.setBounds(380, 320, 240, 40);
        levelLabel.setForeground(Color.WHITE);
        levelLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(levelLabel);

        levelArea = new JTextField();
        levelArea.setBounds(680, 330, 500, 30);
        levelArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        levelArea.setBackground(Color.WHITE);
        levelArea.setForeground(new Color(255, 128, 0));
        levelArea.setHorizontalAlignment(SwingConstants.CENTER);
        levelArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(levelArea);

        JLabel semesterLabel = new JLabel("Semester");
        semesterLabel.setBounds(380, 360, 300, 40);
        semesterLabel.setForeground(Color.WHITE);
        semesterLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(semesterLabel);

        semesterArea = new JTextField();
        semesterArea.setBounds(680, 370, 500, 30);
        semesterArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        semesterArea.setBackground(Color.WHITE);
        semesterArea.setForeground(new Color(255, 128, 0));
        semesterArea.setHorizontalAlignment(SwingConstants.CENTER);
        semesterArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(semesterArea);

        JLabel enrollmentFeeField = new JLabel("Credit Fee");
        enrollmentFeeField.setBounds(380, 400, 300, 40);
        enrollmentFeeField.setForeground(Color.WHITE);
        enrollmentFeeField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(enrollmentFeeField);

        enrollmentFeeArea = new JTextField();
        enrollmentFeeArea.setBounds(680, 410, 500, 30);
        enrollmentFeeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        enrollmentFeeArea.setBackground(Color.WHITE);
        enrollmentFeeArea.setForeground(new Color(255, 128, 0));
        enrollmentFeeArea.setHorizontalAlignment(SwingConstants.CENTER);
        enrollmentFeeArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(enrollmentFeeArea);

        JLabel facultyFeeField = new JLabel("Faculty Fee");
        facultyFeeField.setBounds(380, 440, 300, 40);
        facultyFeeField.setForeground(Color.WHITE);
        facultyFeeField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(facultyFeeField);

        facultyFeeArea = new JTextField();
        facultyFeeArea.setBounds(680, 450, 500, 30);
        facultyFeeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        facultyFeeArea.setBackground(Color.WHITE);
        facultyFeeArea.setForeground(new Color(255, 128, 0));
        facultyFeeArea.setHorizontalAlignment(SwingConstants.CENTER);
        facultyFeeArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(facultyFeeArea);

        JLabel hallClearanceFeeField = new JLabel("Hall Clearance Fee");
        hallClearanceFeeField.setBounds(380, 480, 300, 40);
        hallClearanceFeeField.setForeground(Color.WHITE);
        hallClearanceFeeField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(hallClearanceFeeField);

        hallClearanceFeeArea = new JTextField();
        hallClearanceFeeArea.setBounds(680, 490, 500, 30);
        hallClearanceFeeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        hallClearanceFeeArea.setBackground(Color.WHITE);
        hallClearanceFeeArea.setForeground(new Color(255, 128, 0));
        hallClearanceFeeArea.setHorizontalAlignment(SwingConstants.CENTER);
        hallClearanceFeeArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(hallClearanceFeeArea);

        JLabel othersFeeField = new JLabel("Others Fee");
        othersFeeField.setBounds(380, 520, 300, 40);
        othersFeeField.setForeground(Color.WHITE);
        othersFeeField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(othersFeeField);

        othersFeeArea = new JTextField();
        othersFeeArea.setBounds(680, 530, 500, 30);
        othersFeeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        othersFeeArea.setBackground(Color.WHITE);
        othersFeeArea.setForeground(new Color(255, 128, 0));
        othersFeeArea.setHorizontalAlignment(SwingConstants.CENTER);
        othersFeeArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(othersFeeArea);



        JLabel totalFeeField = new JLabel("Total Fee");
        totalFeeField.setBounds(380, 560, 300, 40);
        totalFeeField.setForeground(Color.WHITE);
        totalFeeField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(totalFeeField);

        totalFeeArea = new JTextField();
        totalFeeArea.setBounds(680, 570, 500, 30);
        totalFeeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        totalFeeArea.setBackground(Color.WHITE);
        totalFeeArea.setForeground(new Color(255, 128, 0));
        totalFeeArea.setHorizontalAlignment(SwingConstants.CENTER);
        totalFeeArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(totalFeeArea);

        payButton = new JButton("Pay");
        payButton.setBackground(Color.WHITE);
        payButton.setForeground(new Color(255, 128, 0));
        payButton.setBounds(1030, 610, 150, 40);
        payButton.setBorder(BorderFactory.createEmptyBorder());
        payButton.addActionListener(this);
        totalLabel.add(payButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(new Color(255, 128, 0));
        backButton.setBounds(680, 610, 150, 40);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        totalLabel.add(backButton);

        System.out.println(username);


// For retrieving username and name to profile
        try{
            ConnectDB c =  new ConnectDB();
            ResultSet rs = c.s.executeQuery("select * from account where studentid = '"+username+"'");

            String founddept ="";
            String foundlevel ="";
            String foundsemester ="";
            while(rs.next()){
                nameArea.setText(rs.getString("name"));
                studentIdArea.setText(rs.getString("studentid"));
                facultyArea.setText(rs.getString("faculty"));
                deptArea.setText(rs.getString("dept"));
                founddept = rs.getString("dept");
                levelArea.setText(rs.getString("level"));
                foundlevel = rs.getString("level");
                semesterArea.setText(rs.getString("semester"));
                foundsemester = rs.getString("semester");
            }
            System.out.println(founddept);
            System.out.println(foundsemester);
            System.out.println(foundlevel);



            ResultSet rs2= c.s.executeQuery("select * from enrollmentfee where dept ='"+founddept+"' && level='"+foundlevel+"' && semester='"+foundsemester+"'");

            while(rs2.next()){
                enrollmentFeeArea.setText(rs2.getString("creditfee"));

                facultyFeeArea.setText(rs2.getString("facultyfee"));

                hallClearanceFeeArea.setText(rs2.getString("hallclearance"));

                othersFeeArea.setText(rs2.getString("others"));

                totalFeeArea.setText(rs2.getString("total"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == payButton){
            new PaymentGateway(username).setVisible(true);
            this.setVisible(false);
        }
        /*
        else if(ae.getSource() == saveButton) {
            String name = nameArea.getText();
            String designation = designationArea.getText();
            String emailPh = emailPhoneArea.getText();
            String number = researchFieldArea.getText();


            String nameUpdate = "update account set name = '"+name+"' where username = '"+username+"'";  /// username updat combine 6
            String emailPhUpdate = "update account set emailPhone = '"+emailPh+"' where username = '"+username+"'";
            String numberUpdate = "update account set nidPassport = '"+number+"' where username = '"+username+"'";
            String designationUpdate = "update account set designation = '"+designation+"' where username = '"+username+"'";

            try {
                ConnectDB c1 = new ConnectDB();
                c1.s.executeUpdate(nameUpdate);

                ConnectDB c2 = new ConnectDB();
                c2.s.executeUpdate(emailPhUpdate);

                ConnectDB c3 = new ConnectDB();
                c3.s.executeUpdate(numberUpdate);

                //JOptionPane.showMessageDialog(null, "All detail update successfully");
                //this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace(); // To check exception
            }
        }
        */

        else  if(ae.getSource() == backButton){
            new Dashboard(username).setVisible(true); /// username update 4
            this.setVisible(false);
        }

    }

    public static void main(String[] args){
        new UpdateProfile("").setVisible(true);
    }
}