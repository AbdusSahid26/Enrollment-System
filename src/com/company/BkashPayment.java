package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashPayment extends JFrame implements ActionListener{

    JTextField BkashAccountNumberArea, BkashPinNumberArea;
    JButton Submit, backButton;
    String username;
    BkashPayment(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // MAXIMIZED_BOTH it will adjust Panel with Screen
        setLayout(null);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/enroll.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel totalLabel = new JLabel(i3);
        totalLabel.setBounds(0, 0, 1920, 1080);
        add(totalLabel);

        JLabel headingLabel = new JLabel("Payment Stage");
        headingLabel.setBounds(600, 90, 1100, 80);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 65));
        totalLabel.add(headingLabel);


        JLabel BkashAccountNumberLabel = new JLabel("Bkash Account");
        BkashAccountNumberLabel.setBounds(420, 250, 300, 40);
        BkashAccountNumberLabel.setForeground(Color.WHITE);
        BkashAccountNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(BkashAccountNumberLabel);

        BkashAccountNumberArea = new JTextField();
        BkashAccountNumberArea.setBounds(650, 255, 500, 30);
        BkashAccountNumberArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BkashAccountNumberArea.setBackground(Color.WHITE);
        BkashAccountNumberArea.setForeground(new Color(255, 128, 0));
        BkashAccountNumberArea.setHorizontalAlignment(SwingConstants.CENTER);
        BkashAccountNumberArea.setBorder(BorderFactory.createEmptyBorder());
        add(BkashAccountNumberArea);

        JLabel BkashPinNumberLabel = new JLabel("Pin");
        BkashPinNumberLabel.setBounds(420, 310, 240, 40);
        BkashPinNumberLabel.setForeground(Color.WHITE);
        BkashPinNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(BkashPinNumberLabel);

        BkashPinNumberArea = new JTextField();
        BkashPinNumberArea.setBounds(650, 315, 500, 30);
        BkashPinNumberArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BkashPinNumberArea.setBackground(Color.WHITE);
        BkashPinNumberArea.setForeground(new Color(255, 128, 0));
        BkashPinNumberArea.setHorizontalAlignment(SwingConstants.CENTER);
        BkashPinNumberArea.setBorder(BorderFactory.createEmptyBorder());
        add(BkashPinNumberArea);

        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(new Color(255, 128, 0));
        backButton.setBounds(650, 400, 150, 40);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        totalLabel.add(backButton);

        Submit = new JButton("Submit");
        Submit.setBackground(Color.WHITE);
        Submit.setForeground(new Color(255, 128, 0));
        Submit.setBounds(1000, 400, 150, 40);
        Submit.setBorder(BorderFactory.createEmptyBorder());
        Submit.addActionListener(this);
        totalLabel.add(Submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Submit) {

            String BkashAccountNumber = BkashAccountNumberArea.getText();
            String BkashPinNumber = BkashPinNumberArea.getText();

            int lenBkashAccountNumber = BkashAccountNumber.length();
            int lenBkashPinNumber = BkashPinNumber.length();
            if(lenBkashAccountNumber == 0 && lenBkashPinNumber == 0){
                JOptionPane.showMessageDialog(null, "Please fill up the account and pin.");
            }else if(lenBkashAccountNumber == 0){
                JOptionPane.showMessageDialog(null, "Please fill up the account number.");
            }
            else if(lenBkashPinNumber == 0){
                JOptionPane.showMessageDialog(null, "Please fill up the pin number.");
            }
            else if(lenBkashAccountNumber != 0 && lenBkashPinNumber != 0) {
                int availableMoneyInStudentAccount = 6000, totalFee = 4560;
                if(availableMoneyInStudentAccount >= totalFee){
                    try {
                        BkashAccountNumberArea.setText("");
                        BkashPinNumberArea.setText("");
                        JOptionPane.showMessageDialog(null, "Your enrollment is successful.");
                        //new BkashPayment(username).setVisible(true); /// username add 2
                        //this.setVisible(false);
                    } catch (Exception e) {

                    }
                }
                else{
                    try {
                        JOptionPane.showMessageDialog(null, "Your enrollment is unsuccessful due to insufficient balance.");
                        //new BkashPayment(username).setVisible(true); /// username add 2
                        //this.setVisible(false);
                    } catch (Exception e) {

                    }
                }
            }
        }
        else if(ae.getSource() == backButton){
            try {
                new PaymentGateway(username).setVisible(true); /// username add 2
                this.setVisible(false);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        new BkashPayment("").setVisible(true);
    }
}