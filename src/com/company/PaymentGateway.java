package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentGateway extends JFrame implements ActionListener{
    JButton BkashButton, RocketButton, SureCashButton, NogodButton, UpayButton, BackButton;
    String username;
    PaymentGateway(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // MAXIMIZED_BOTH it will adjust Panel with Screen
        setLayout(null);

        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(null);
        dashboardPanel.setBounds(0, 0, 1920, 50);
        dashboardPanel.setBackground(new Color(255, 128, 0));
        add(dashboardPanel);

        JLabel dashboardLabel = new JLabel("Smart Enrollment System");
        dashboardLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
        dashboardLabel.setForeground(Color.WHITE);
        dashboardLabel.setBounds(10, 5, 1200, 40);
        dashboardPanel.add(dashboardLabel);

        JPanel featurePanel = new JPanel();
        featurePanel.setLayout(null);
        featurePanel.setBounds(0, 51, 250, 1080);
        featurePanel.setBackground(new Color(51, 51, 51));
        add(featurePanel);

        BkashButton = new JButton("Bkash");
        BkashButton.setBackground(new Color(51, 51, 51));
        BkashButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        BkashButton.setForeground(Color.WHITE);
        BkashButton.setBounds(0, 0, 250, 40);
        BkashButton.setMargin(new Insets(0, 0, 0, 150));
        BkashButton.addActionListener((ActionListener) this);
        //b1.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(BkashButton);

        RocketButton = new JButton("Rocket");
        RocketButton.setBackground(new Color(51, 51, 51));
        RocketButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        RocketButton.setForeground(Color.WHITE);
        RocketButton.setMargin(new Insets(0, 0, 0, 140));
        RocketButton.setBounds(0, 40, 250, 40);
        //b2.setBorder(BorderFactory.createEmptyBorder());
        RocketButton.addActionListener(this);
        featurePanel.add(RocketButton);

        SureCashButton = new JButton("Sure Cash");
        SureCashButton.setBackground(new Color(51, 51, 51));
        SureCashButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        SureCashButton.setForeground(Color.WHITE);
        SureCashButton.setMargin(new Insets(0, 0, 0, 107));
        SureCashButton.setBounds(0, 80, 250, 40);
        //b2.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(SureCashButton);


        NogodButton = new JButton("Nogod");
        NogodButton.setBackground(new Color(51, 51, 51));
        NogodButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        NogodButton.setForeground(Color.WHITE);
        NogodButton.setBounds(0, 120, 250, 40);
        NogodButton.setMargin(new Insets(0, 0, 0, 145));
        //b3.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(NogodButton);

        UpayButton = new JButton("Upay");
        UpayButton.setBackground(new Color(51, 51, 51));
        UpayButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        UpayButton.setForeground(Color.WHITE);
        UpayButton.setBounds(0, 160, 250, 40);
        UpayButton.setMargin(new Insets(0, 0, 0, 155));
        //b3.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(UpayButton);

        BackButton = new JButton("Back");
        BackButton.setBackground(new Color(51, 51, 51));
        BackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        BackButton.setForeground(Color.WHITE);
        BackButton.setBounds(0, 200, 250, 40);
        BackButton.setMargin(new Insets(0, 0, 0, 155));
        BackButton.addActionListener((ActionListener) this);
        //b3.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(BackButton);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/enroll.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1080);
        add(l1);

        JLabel headingLabel = new JLabel("Select your preferred mobile banking.");
        headingLabel.setBounds(280, 150, 1400, 100);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 75));
        l1.add(headingLabel);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == BkashButton) {
            try {
                new BkashPayment(username).setVisible(true); /// username add 2
                this.setVisible(false);

            } catch (Exception e) {

            }
        }
        else if(ae.getSource() == RocketButton) {
            //new FindGuide().setVisible(true);
            //this.setVisible(false);
        }
        else if(ae.getSource() == SureCashButton) {

        }
        else if(ae.getSource() == BackButton){
            try {
                new UpdateProfile(username).setVisible(true); /// username add 2
                this.setVisible(false);
            }catch (Exception e){

            }
        }
    }


    public static void main(String[] args) {
        new PaymentGateway("").setVisible(true);
    }

}
