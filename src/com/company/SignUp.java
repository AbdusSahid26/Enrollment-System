package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    JButton createButton, backButton;
    JTextField nameArea, emailArea, usernameArea, phoneArea, sidArea,levelArea, semesterArea, addressArea, nationalityArea, deptArea, facultyArea;
    Choice choice1;
    JPasswordField  passwordArea;
    public SignUp(){

        setExtendedState(JFrame.MAXIMIZED_BOTH); // MAXIMIZED_BOTH it will adjust Panel with Screen
        setLayout(null);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/enroll.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel totalLabel = new JLabel(i3);
        totalLabel.setBounds(0, 0, 1920, 1080);
        add(totalLabel);

        JLabel headingLabel = new JLabel("Sign Up");
        headingLabel.setBounds(670, 20, 1100, 80);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 65));
        totalLabel.add(headingLabel);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(380, 110, 240, 40);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(nameLabel);

        nameArea = new JTextField();
        nameArea.setBounds(680, 115, 500, 30);
        nameArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nameArea.setBackground(Color.WHITE);
        nameArea.setForeground(new Color(255, 128, 0));
        nameArea.setHorizontalAlignment(SwingConstants.CENTER);
        nameArea.setBorder(BorderFactory.createEmptyBorder());
        add(nameArea);

        JLabel sidLabel = new JLabel("Student ID");
        sidLabel.setBounds(380, 160, 240, 40);
        sidLabel.setForeground(Color.WHITE);
        sidLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(sidLabel);

        sidArea = new JTextField();
        sidArea.setBounds(680, 165, 500, 30);
        sidArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        sidArea.setBackground(Color.WHITE);
        sidArea.setForeground(new Color(255, 128, 0));
        sidArea.setHorizontalAlignment(SwingConstants.CENTER);
        sidArea.setBorder(BorderFactory.createEmptyBorder());
        add(sidArea);

        JLabel levelLabel = new JLabel("Level");
        levelLabel.setBounds(380, 210, 240, 40);
        levelLabel.setForeground(Color.WHITE);
        levelLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(levelLabel);

        levelArea = new JTextField();
        levelArea.setBounds(680, 215, 500, 30);
        levelArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        levelArea.setBackground(Color.WHITE);
        levelArea.setForeground(new Color(255, 128, 0));
        levelArea.setHorizontalAlignment(SwingConstants.CENTER);
        levelArea.setBorder(BorderFactory.createEmptyBorder());
        add(levelArea);

        JLabel semesterLabel = new JLabel("Semester");
        semesterLabel.setBounds(380, 260, 240, 40);
        semesterLabel.setForeground(Color.WHITE);
        semesterLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(semesterLabel);

        semesterArea = new JTextField();
        semesterArea.setBounds(680, 265, 500, 30);
        semesterArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        semesterArea.setBackground(Color.WHITE);
        semesterArea.setForeground(new Color(255, 128, 0));
        semesterArea.setHorizontalAlignment(SwingConstants.CENTER);
        semesterArea.setBorder(BorderFactory.createEmptyBorder());
        add(semesterArea);

        JLabel deptLabel = new JLabel("Department");
        deptLabel.setBounds(380, 310, 240, 40);
        deptLabel.setForeground(Color.WHITE);
        deptLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(deptLabel);

        deptArea = new JTextField();
        deptArea.setBounds(680, 315, 500, 30);
        deptArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deptArea.setBackground(Color.WHITE);
        deptArea.setForeground(new Color(255, 128, 0));
        deptArea.setHorizontalAlignment(SwingConstants.CENTER);
        deptArea.setBorder(BorderFactory.createEmptyBorder());
        add(deptArea);

        JLabel facultyLabel = new JLabel("Faculty");
        facultyLabel.setBounds(380, 360, 240, 40);
        facultyLabel.setForeground(Color.WHITE);
        facultyLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(facultyLabel);

        facultyArea = new JTextField();
        facultyArea.setBounds(680, 365, 500, 30);
        facultyArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        facultyArea.setBackground(Color.WHITE);
        facultyArea.setForeground(new Color(255, 128, 0));
        facultyArea.setHorizontalAlignment(SwingConstants.CENTER);
        facultyArea.setBorder(BorderFactory.createEmptyBorder());
        add(facultyArea);






        JLabel emailPhoneLabel = new JLabel("Username");
        emailPhoneLabel.setBounds(380, 410, 290, 40);
        emailPhoneLabel.setForeground(Color.WHITE);
        emailPhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(emailPhoneLabel);

        usernameArea = new JTextField();
        usernameArea.setBounds(680, 415, 500, 30);
        usernameArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        usernameArea.setBackground(Color.WHITE);
        usernameArea.setForeground(new Color(255, 128, 0));
        usernameArea.setHorizontalAlignment(SwingConstants.CENTER);
        usernameArea.setBorder(BorderFactory.createEmptyBorder());
        add(usernameArea);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(380, 460, 300, 40);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(passwordLabel);

        passwordArea = new JPasswordField();
        passwordArea.setBounds(680, 465, 500, 30);
        passwordArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordArea.setBackground(Color.WHITE);
        passwordArea.setForeground(new Color(255, 128, 0));
        passwordArea.setHorizontalAlignment(SwingConstants.CENTER);
        passwordArea.setBorder(BorderFactory.createEmptyBorder());
        add(passwordArea);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(380, 510, 300, 40);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(emailLabel);

        emailArea = new JTextField();
        emailArea.setBounds(680, 515, 500, 30);
        emailArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        emailArea.setBackground(Color.WHITE);
        emailArea.setForeground(new Color(255, 128, 0));
        emailArea.setHorizontalAlignment(SwingConstants.CENTER);
        emailArea.setBorder(BorderFactory.createEmptyBorder());
        add(emailArea);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(380, 560, 240, 40);
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(phoneLabel);

        phoneArea = new JTextField();
        phoneArea.setBounds(680, 565, 500, 30);
        phoneArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        phoneArea.setBackground(Color.WHITE);
        phoneArea.setForeground(new Color(255, 128, 0));
        phoneArea.setHorizontalAlignment(SwingConstants.CENTER);
        phoneArea.setBorder(BorderFactory.createEmptyBorder());
        add(phoneArea);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(380, 610, 240, 40);
        addressLabel.setForeground(Color.WHITE);
        addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(addressLabel);

        addressArea = new JTextField();
        addressArea.setBounds(680, 615, 500, 30);
        addressArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addressArea.setBackground(Color.WHITE);
        addressArea.setForeground(new Color(255, 128, 0));
        addressArea.setHorizontalAlignment(SwingConstants.CENTER);
        addressArea.setBorder(BorderFactory.createEmptyBorder());
        add(addressArea);

        JLabel nationalityLabel = new JLabel("Country");
        nationalityLabel.setBounds(380, 660, 240, 40);
        nationalityLabel.setForeground(Color.WHITE);
        nationalityLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(nationalityLabel);

        nationalityArea = new JTextField();
        nationalityArea.setBounds(680, 665, 500, 30);
        nationalityArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nationalityArea.setBackground(Color.WHITE);
        nationalityArea.setForeground(new Color(255, 128, 0));
        nationalityArea.setHorizontalAlignment(SwingConstants.CENTER);
        nationalityArea.setBorder(BorderFactory.createEmptyBorder());
        add(nationalityArea);


        createButton = new JButton("Create");
        createButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        createButton.setForeground(new Color(255, 128, 0));
        createButton.setBackground(Color.WHITE);
        createButton.setBorder(BorderFactory.createEmptyBorder());
        createButton.setBounds(680, 720, 100, 30);
        createButton.addActionListener(this);
        totalLabel.add(createButton);

        // Back Button

        backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        backButton.setForeground(new Color(255, 128, 0));
        backButton.setBackground(Color.WHITE);
        backButton.setBounds(1080, 720, 100, 30);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        totalLabel.add(backButton);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == createButton){
            String Name = nameArea.getText();
            String Sid = sidArea.getText();
            String Level = levelArea.getText();
            String Username = usernameArea.getText();
            String Password = passwordArea.getText();
            String Email = emailArea.getText();
            String Phone = phoneArea.getText();
            String Address = addressArea.getText();
            String Nationality = nationalityArea.getText();
            String Semester = semesterArea.getText();
            String Dept = deptArea.getText();
            String Faculty = facultyArea.getText();


            int lenName = Name.length();
            int lenSid = Sid.length();
            int lenSemester = Semester.length();
            int lenLevel = Level.length();
            int lenDept = Dept.length();
            int lenFaculty = Faculty.length();
            int lenUsername = Username.length();
            int lenPassword = Password.length();
            int lenEmail = Email.length();
            int lenPhone = Phone.length();
            int lenAddress = Address.length();
            int lenNationality = Nationality.length();

            String query = "insert into account(username, name, studentid, email, phone, address, nationality, level, semester, isenrolled, dept, faculty, password) values('"+Username+"', '"+Name+"', '"+Sid+"', '"+Email+"' , '"+Phone+"', '"+Address+"', '"+Nationality+"', '"+Level+"', '"+Semester+"', '0' , '"+Dept+"', '"+Faculty+"', '"+Password+"')";
            try{
                if(lenName == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the name.");
                }
                else if(lenSid == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Student ID.");
                }
                else if(lenLevel == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Level.");
                }
                else if(lenSemester == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Semester.");
                }
                else if(lenUsername  == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the username.");
                }
                else if(lenPassword  == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the password.");
                }
                else if(lenEmail == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Email.");
                }
                else if(lenPhone  == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Phone.");
                }
                else if(lenAddress == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Address.");
                }
                else if(lenNationality == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Nationality.");
                }
                else if(lenDept == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Department.");
                }
                else if(lenFaculty == 0){
                    JOptionPane.showMessageDialog(null, "Please fill the Faculty.");
                }
                else if(lenName != 0 && lenSid != 0 && lenLevel != 0 && lenSemester != 0 && lenUsername != 0 && lenPassword != 0 && lenEmail != 0 && lenPhone != 0 && lenAddress != 0 && lenNationality != 0 && lenDept != 0 && lenDept != 0){
                    ConnectDB c = new ConnectDB();
                    c.s.execute(query);
                    JOptionPane.showMessageDialog(null, "Account Created Successfully.");

                    this.setVisible(false);
                    new Dashboard(Sid).setVisible(true);
                }

            }
            catch (Exception e){

            }

        }else if(ae.getSource() == backButton){
            new SignIn().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SignUp().setVisible(true);
    }
}
