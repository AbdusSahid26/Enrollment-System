package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndividualGuideProfileViewer extends JFrame implements ActionListener {
    JTextField nameArea, emailPhoneArea, reviewArea, currentRatingArea, languageProficiencyArea, countryArea, addressArea;
    JButton saveButton, backButton, sendButton;
    String emailKey;
    Choice choice1;
    String count, previousRating;

    JFrame frame;
    //DefaultTableModel defaultTableModel;
    JTable table;

    private JTable dataTable;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public IndividualGuideProfileViewer(String emailKey) {

        this.emailKey = emailKey;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // MAXIMIZED_BOTH it will adjust Panel with Screen
        setLayout(null);

        ImageIcon backgroundImage = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/hotel10.jpg"));
        Image i2 = backgroundImage.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel totalLabel = new JLabel(i3);
        totalLabel.setBounds(0, 0, 1920, 1080);
        add(totalLabel);

        JLabel headingLabel = new JLabel("Guide Profile");
        headingLabel.setBounds(640, 20, 1100, 80);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 65));
        totalLabel.add(headingLabel);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(380, 100, 240, 40);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(nameLabel);

        nameArea = new JTextField();
        nameArea.setBounds(680, 110, 500, 30);
        nameArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        nameArea.setBackground(Color.WHITE);
        nameArea.setForeground(new Color(255, 128, 0));
        nameArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(nameArea);

        JLabel emailPhoneLabel = new JLabel("Email/Phone");
        emailPhoneLabel.setBounds(380, 140, 240, 40);
        emailPhoneLabel.setForeground(Color.WHITE);
        emailPhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(emailPhoneLabel);

        emailPhoneArea = new JTextField();
        emailPhoneArea.setBounds(680, 150, 500, 30);
        emailPhoneArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        emailPhoneArea.setBackground(Color.WHITE);
        emailPhoneArea.setForeground(new Color(255, 128, 0));
        emailPhoneArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(emailPhoneArea);


        JLabel languageProficiencyLabel = new JLabel("Language Proficiency");
        languageProficiencyLabel.setBounds(380, 180, 290, 40);
        languageProficiencyLabel.setForeground(Color.WHITE);
        languageProficiencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(languageProficiencyLabel);

        languageProficiencyArea = new JTextField();
        languageProficiencyArea.setBounds(680, 190, 500, 30);
        languageProficiencyArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        languageProficiencyArea.setBackground(Color.WHITE);
        languageProficiencyArea.setForeground(new Color(255, 128, 0));
        languageProficiencyArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(languageProficiencyArea);

        JLabel countryLabel = new JLabel("Country");
        countryLabel.setBounds(380, 220, 240, 40);
        countryLabel.setForeground(Color.WHITE);
        countryLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(countryLabel);

        countryArea = new JTextField();
        countryArea.setBounds(680, 230, 500, 30);
        countryArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        countryArea.setBackground(Color.WHITE);
        countryArea.setForeground(new Color(255, 128, 0));
        countryArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(countryArea);


        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(380, 260, 240, 40);
        addressLabel.setForeground(Color.WHITE);
        addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(addressLabel);

        addressArea = new JTextField();
        addressArea.setBounds(680, 270, 500, 30);
        addressArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addressArea.setBackground(Color.WHITE);
        addressArea.setForeground(new Color(255, 128, 0));
        addressArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(addressArea);

        JLabel currentRating = new JLabel("Current Rating");
        currentRating.setBounds(380, 300, 300, 40);
        currentRating.setForeground(Color.WHITE);
        currentRating.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(currentRating);

        currentRatingArea = new JTextField();
        currentRatingArea.setBounds(680, 310, 500, 30);
        currentRatingArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        currentRatingArea.setBackground(Color.WHITE);
        currentRatingArea.setForeground(new Color(255, 128, 0));
        currentRatingArea.setBorder(BorderFactory.createEmptyBorder());
        totalLabel.add(currentRatingArea);

        JLabel choiceArea = new JLabel("Rate this guide");
        choiceArea.setBounds(380, 340, 300, 40);
        choiceArea.setForeground(Color.WHITE);
        choiceArea.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(choiceArea);

        choice1 = new Choice();
        choice1.add("1");
        choice1.add("2");
        choice1.add("3");
        choice1.add("4");
        choice1.add("5");
        choice1.setBounds(680, 350, 500, 60);
        totalLabel.add(choice1);


        JLabel reviewLabel = new JLabel("Review");
        reviewLabel.setBounds(380, 370, 300, 40);
        reviewLabel.setForeground(Color.WHITE);
        reviewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        totalLabel.add(reviewLabel);

        reviewArea = new JTextField();
        reviewArea.setBounds(680, 380, 500, 80);
        reviewArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        reviewArea.setBackground(Color.WHITE);
        reviewArea.setForeground(new Color(255, 128, 0));
        reviewArea.setBorder(BorderFactory.createEmptyBorder());
        //reviewArea.setLineWrap(true);
        //reviewArea.setWrapStyleWord(true);
        totalLabel.add(reviewArea);



        sendButton = new JButton("Send");
        sendButton.setBackground(Color.WHITE);
        sendButton.setForeground(new Color(255, 128, 0));
        sendButton.setBounds(680, 470, 500, 30);
        sendButton.setBorder(BorderFactory.createEmptyBorder());
        sendButton.addActionListener(this);
        totalLabel.add(sendButton);



        frame = new JFrame("Guide List");
        frame.setLayout(new FlowLayout());
        frame.setBounds(400, 100, 750, 600);

        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(800, 600));
        table.setFillsViewportHeight(true);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table.setDefaultRenderer(Object.class, centerRenderer);

        frame.add(new JScrollPane(table));
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Email/Phone");
        defaultTableModel.addColumn("Language Proficiency");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Country");

        try {
            ConnectDB cc = new ConnectDB();
            ResultSet rs = cc.s.executeQuery("select * from account where emailPhone = '" + emailKey + "'"); /// username add 5
            while (rs.next()) {
                nameArea.setText(rs.getString("name"));
                emailPhoneArea.setText(rs.getString("emailPhone"));
                languageProficiencyArea.setText(rs.getString("languageProficiency"));
                countryArea.setText(rs.getString("country"));
                addressArea.setText(rs.getString("address"));
                currentRatingArea.setText(rs.getString("rating"));
                count=rs.getString("ratingCounter");
                previousRating = rs.getString("rating");
                //System.out.println(count);
                //System.out.println(previousRating);
            }



            ConnectDB c = new ConnectDB();
            String query = "select * from account where choice = 'Guide'";//Storing MySQL query in A string variable
            ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
            int len = query.length();

            if (len == 0) {
                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
            } else {
                while (len-- > 0) {
                    while (resultSet.next()) {
                        String Name = resultSet.getString("name");
                        String Phone = resultSet.getString("emailPhone");
                        String LanguageProficiency = resultSet.getString("languageProficiency");
                        String AddressC = resultSet.getString("address");
                        String CountryC = resultSet.getString("country");
                        defaultTableModel.addRow(new Object[]{Name, Phone, LanguageProficiency, AddressC, CountryC});
                        frame.setVisible(true);
                        frame.validate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }




/*

// For retrieving username and name to profile
        try {
            ConnectDB c = new ConnectDB();
            ResultSet rs = c.s.executeQuery("select * from account where emailPhone = '" + emailKey + "'"); /// username add 5
            while (rs.next()) {
                nameArea.setText(rs.getString("name"));
                emailPhoneArea.setText(rs.getString("emailPhone"));
                languageProficiencyArea.setText(rs.getString("languageProficiency"));
                countryArea.setText(rs.getString("country"));
                addressArea.setText(rs.getString("address"));
                currentRatingArea.setText(rs.getString("rating"));
                count=rs.getString("ratingCounter");
                previousRating = rs.getString("rating");
                //System.out.println(count);
                //System.out.println(previousRating);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        //createTable();
        //setVisible(true);
    //}

    public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == sendButton) {
             int givenRating = Integer.parseInt(choice1.getSelectedItem());
             //System.out.print("Given Rating: ");
             //System.out.println(givenRating);

             //System.out.println(givenRating);
             int countInt = Integer.parseInt(count);
             //System.out.print("previousCountInt: ");
             //System.out.println(countInt);
             //if(countInt != 0){
             countInt++;
             //}
             //System.out.print("Incremented CountInt: ");
             //System.out.println(countInt);
             double currentRatingInt = Double.parseDouble(previousRating);
             currentRatingInt += givenRating;
             //System.out.println("Summation Result: ");
             //System.out.println(currentRatingInt);
             currentRatingInt /= countInt;
             //System.out.println("Divide Result: ");
             //System.out.println(currentRatingInt);

             String presentRating = String.valueOf(currentRatingInt);
             //System.out.print("Present Rating: ");
             //System.out.println(presentRating);
             String presentCount = String.valueOf(countInt);


             String ratingUpdate = "update account set rating = '" + presentRating + "' where emailPhone = '" + emailKey + "'";
             String ratingCount = "update account set ratingCounter = '" + presentCount + "' where emailPhone = '" + emailKey + "'";

             try {
                 ConnectDB c1 = new ConnectDB();
                 c1.s.executeUpdate(ratingUpdate);

                 ConnectDB c2 = new ConnectDB();
                 c2.s.executeUpdate(ratingCount);

                 JOptionPane.showMessageDialog(null, "All detail update successfully");
                 //new SearchGUI(username);  /// username update 4
                 this.setVisible(false);
             } catch (Exception e) {
                 e.printStackTrace(); // To check exception
             }
         }
    }




    public static void main(String[] args) {
        new UpdateProfile("").setVisible(true);
    }
}