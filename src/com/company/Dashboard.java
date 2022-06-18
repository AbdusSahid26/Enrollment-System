package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton profileButton, findGuideButton, guideLeaderboardButton, touristLeaderboardButton, contactUsButton, logoutButton;
    String username;

    Dashboard(String username) {
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
        featurePanel.setBounds(0, 51, 450, 1080);
        featurePanel.setBackground(new Color(51, 51, 51));
        add(featurePanel);

        profileButton = new JButton("Undergraduate Regular Exam Enrollment");
        profileButton.setBackground(new Color(51, 51, 51));
        profileButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        profileButton.setForeground(Color.WHITE);
        profileButton.setBounds(0, 0, 650, 40);
        profileButton.setMargin(new Insets(0, 0, 0, 210));
        profileButton.addActionListener((ActionListener) this);
        //b1.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(profileButton);

        findGuideButton = new JButton("Undergraduate Repeat Exam Enrollment");
        findGuideButton.setBackground(new Color(51, 51, 51));
        findGuideButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        findGuideButton.setForeground(Color.WHITE);
        findGuideButton.setMargin(new Insets(0, 0, 0, 215));
        findGuideButton.setBounds(0, 40, 650, 40);
        //b2.setBorder(BorderFactory.createEmptyBorder());
        findGuideButton.addActionListener(this);
        featurePanel.add(findGuideButton);

        guideLeaderboardButton = new JButton("MSc Enrollment");
        guideLeaderboardButton.setBackground(new Color(51, 51, 51));
        guideLeaderboardButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        guideLeaderboardButton.setForeground(Color.WHITE);
        guideLeaderboardButton.setMargin(new Insets(0, 0, 0, 462));
        guideLeaderboardButton.setBounds(0, 80, 650, 40);
        //b2.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(guideLeaderboardButton);

        contactUsButton = new JButton("Contact US");
        contactUsButton.setBackground(new Color(51, 51, 51));
        contactUsButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        contactUsButton.setForeground(Color.WHITE);
        contactUsButton.setBounds(0, 120, 650, 40);
        contactUsButton.setMargin(new Insets(0, 0, 0, 505));
        contactUsButton.addActionListener(this);
        //b3.setBorder(BorderFactory.createEmptyBorder());
        featurePanel.add(contactUsButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBackground(new Color(51, 51, 51));
        logoutButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBounds(0, 160, 650, 40);
        logoutButton.setMargin(new Insets(0, 0, 0, 545));
        //b3.setBorder(BorderFactory.createEmptyBorder());
        logoutButton.addActionListener(this);
        featurePanel.add(logoutButton);


        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/enroll.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1470, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(450, 50, 1270, 1080);
        add(l1);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == profileButton) {
            System.out.println(username);
            try {
                new UpdateProfile(username).setVisible(true); /// username add 2
                this.setVisible(false);

            } catch (Exception e) {

            }
        } else if (ae.getSource() == findGuideButton) {
            //new FindGuide().setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == guideLeaderboardButton) {

        } else if (ae.getSource() == contactUsButton){
            new Contact(username).setVisible(true);
            this.setVisible(false);
        }else if (ae.getSource() == logoutButton) {
            new SignIn().setVisible(true);
            this.setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
}