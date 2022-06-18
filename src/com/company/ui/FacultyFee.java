package com.company.ui;

import com.company.ConnectDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacultyFee extends JFrame {
     JPanel panel1;
     JTextField textFielddept;
     JTextField textFieldFaculty;
     JTextField textFieldLevel;
     JTextField textFieldSemester;
     JTextField textFieldCreditFee;
     JTextField textFieldFacultyFee;
     JTextField textFieldHCFee;
     JTextField textFieldOthersFee;
     JTextField textFieldTotalFee;
     JButton updateButton;
     JButton backButton;
     JPanel extrapanel;
     JPanel buttonpanel;


    public FacultyFee(){
         setLayout(null);
         setBounds(400, 100, 800, 600);
         setContentPane(panel1);
         setVisible(true);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dept = textFielddept.getText();
                String faculty = textFieldFaculty.getText();
                String level = textFieldLevel.getText();
                String semester = textFieldSemester.getText();
                String creditFee = textFieldCreditFee.getText();
                String facultyFee = textFieldFacultyFee.getText();
                String HCFee = textFieldHCFee.getText();
                String others = textFieldOthersFee.getText();
                String total = textFieldTotalFee.getText();

                int lenDept = dept.length();
                int lenFaculty = faculty.length();
                int lenLevel = level.length();
                int lenSemester = semester.length();
                int lenCreditFee = creditFee.length();
                int lenFacultyFee = facultyFee.length();
                int lenHCFee = HCFee.length();
                int lenOthers = others.length();
                int lenTotal = total.length();

                String query = "insert into enrollmentfee(dept, faculty, level, semester, creditfee, facultyfee, hallclearance, others, total) values('"+dept+"', '"+faculty+"', '"+level+"', '"+semester+"' , '"+creditFee+"', '"+facultyFee+"', '"+HCFee+"', '"+others+"', '"+total+"')";
                try{
                    if(lenDept == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Department.");
                    }
                    else if(lenFaculty == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Faculty.");
                    }
                    else if(lenLevel == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Level.");
                    }
                    else if(lenSemester == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Semester.");
                    }
                    else if(lenCreditFee  == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Credit Fee.");
                    }
                    else if(lenFacultyFee  == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Faculty Fee.");
                    }
                    else if(lenHCFee == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Hall Clearance Fee.");
                    }
                    else if(lenOthers  == 0){
                        JOptionPane.showMessageDialog(null, "Please fill the Others Fee.");
                    }
                    else if(lenTotal == 0) {
                        JOptionPane.showMessageDialog(null, "Please fill the Total Fee.");
                    }
                    else if(lenDept != 0 && lenFaculty != 0 && lenLevel != 0 && lenSemester != 0 && lenCreditFee != 0 && lenFacultyFee != 0 && lenHCFee != 0 && lenOthers != 0 && lenTotal != 0 ){
                        ConnectDB c = new ConnectDB();
                        c.s.execute(query);
                        JOptionPane.showMessageDialog(null, "Fee Updated Successfully.");

                        //this.setVisible(false);
                        //new Dashboard(Sid).setVisible(true);
                    }

                }
                catch (Exception E){

                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args){
        /*JFrame frame = new JFrame("App");
        frame.setContentPane(new FacultyFee().panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);*/
    }




}
