package com.company.ui;

import com.company.ConnectDB;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndividualGuideProfileViewer2 {
    JPanel rootPanel2;
    JLabel headingLabel;
    JTable table2;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField8;
    private JComboBox comboBox1;
    private JButton button1;
    String emailKey2;
    String count, previousRating;
    String descriptionMessage;

    //private JButton button1;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public IndividualGuideProfileViewer2(String username, String emailKey2){
        System.out.print("Username: ");
        System.out.println(username);
        System.out.print("emailKey2: ");
        System.out.println(emailKey2);
        this.emailKey2 = emailKey2;

            try {

                //System.out.println("OK");
                ConnectDB cc = new ConnectDB();
                ResultSet rs = cc.s.executeQuery("select* from account where emailPhone = '" +emailKey2+ "' "); /// username add 5
                //System.out.println(rs.getFetchSize());
                while (rs.next()) {
                    //System.out.println("OKKKKK");
                    textField1.setText(rs.getString("name"));
                    //System.out.println(rs.getString("name"));
                    textField2.setText(rs.getString("emailPhone"));
                    textField3.setText(rs.getString("languageProficiency"));
                    textField4.setText(rs.getString("country"));
                    textField5.setText(rs.getString("address"));
                    textField6.setText(rs.getString("rating"));
                    count = rs.getString("ratingCounter");
                    previousRating = rs.getString("rating");
                    //System.out.println(count);
                    //System.out.println(previousRating);
                }

            }
            catch( Exception e){
                e.printStackTrace();
            }



        createTable();


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1 ) {
                    int givenRating = Integer.parseInt((String) comboBox1.getSelectedItem());
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


                    System.out.print("Username in button: ");
                    System.out.println(username);
                    System.out.print("Emailkey2 in button: ");
                    System.out.println(emailKey2);

                    descriptionMessage = textField8.getText();
                    System.out.print("Message: ");
                    System.out.println(descriptionMessage);

                    String name = username.trim();
                    String emailk = emailKey2.trim();
                    String dem = descriptionMessage.trim();

                    String query = "insert into reviewMessage(username, emailPhone,message) values('"+username+"', '"+emailKey2+"', '"+descriptionMessage+"' )";

                    String ratingUpdate = "update account set rating = '" + presentRating + "' where emailPhone = '" + emailKey2 + "'";
                    String ratingCount = "update account set ratingCounter = '" + presentCount + "' where emailPhone = '" + emailKey2 + "'";

                    //Statement ss;

                    try {
                        ConnectDB c1 = new ConnectDB();
                        c1.s.executeUpdate(ratingUpdate);

                        ConnectDB c2 = new ConnectDB();
                        c2.s.executeUpdate(ratingCount);

                        ConnectDB c3 = new ConnectDB();
                        c3.s.executeUpdate( query);



                        JOptionPane.showMessageDialog(null, "All detail update successfully");
                        new SearchGUI(username);  /// this line is for going back to search gui
                        this.setVisible(false);
                    } catch (Exception e1) {
                        e1.printStackTrace(); // To check exception
                    }


                }
            }

            private void setVisible(boolean b) {
            }
        });
    }
    /*public IndividualGuideProfileViewer2(String emailKey){
        this.emailKey = emailKey;
    }*/

    public JPanel getRootPanel() {
        return rootPanel2;
    }
    public void createTable(){

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table2.setDefaultRenderer(Object.class, centerRenderer);

        //frame.add(new JScrollPane(table));
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Description");
        //defaultTableModel.addColumn("Language Proficiency");
        //defaultTableModel.addColumn("Address");
        //defaultTableModel.addColumn("Country");
        //defaultTableModel.addColumn("Rating");

        try {
            ConnectDB c = new ConnectDB();
            String query = "select * from reviewMessage where emailPhone = '"+emailKey2+"'";//Storing MySQL query in A string variable
            ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
            int len = query.length();

            if (len == 0) {
                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
            } else {
                while (len-- > 0) {
                    while (resultSet.next()) {
                        String Name = resultSet.getString("username");
                        String Description = resultSet.getString("message");
                       // String LanguageProficiency = resultSet.getString("languageProficiency");
                        //String AddressC = resultSet.getString("address");
                        //String CountryC = resultSet.getString("country");
                        //String Rating = resultSet.getString("rating");
                        defaultTableModel.addRow(new Object[]{Name, Description});



                        //frame.setVisible(true);
                        //frame.validate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        table2.setModel(defaultTableModel);


    }

    public static void main(String[] args) {
        IndividualGuideProfileViewer2 individualGuideProfileViewer2 = new IndividualGuideProfileViewer2("", "");
    }

    public void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
