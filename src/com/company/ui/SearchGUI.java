package com.company.ui;

import com.company.ConnectDB;
import com.company.IndividualGuideProfileViewer2Search;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchGUI {

    private JPanel rootPanel;
    private JPanel searchPanel;
    private JTextField searchTextField;
    private JScrollPane tableScrollPane;
    private JTable dataTable;
    private JButton Button1;
    //private JButton button1;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    String username;

    public SearchGUI(String username){
        this.username = username;
        createTable();
        searchTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String searchString = searchTextField.getText();
                search(searchString);
            }
        });

        dataTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = dataTable.getSelectedRow();
                if(row < 0){
                    JOptionPane.showMessageDialog(null, "Please Select a guide.");

                }
                else{
                    String email = (String)dataTable.getValueAt(row , 1);
                    //System.out.printf(user_name);

                    //new IndividualGuideProfileViewer(user_name).setVisible(true);

                    System.out.println(email);
                    new IndividualGuideProfileViewer2Search(username, email).setVisible(true);

                    /*
                    if(user_name == "Ron"){
                        try {
                            new IndividualGuideProfileViewer(user_name).setVisible(true); /// username add 2
                            //this.setVisible(false);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                     */

                    // By clicking selected guide we will get his profile





                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
    private void createTable(){

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        dataTable.setDefaultRenderer(Object.class, centerRenderer);

        //frame.add(new JScrollPane(table));
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Email/Phone");
        defaultTableModel.addColumn("Language Proficiency");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Country");
        defaultTableModel.addColumn("Rating");

        try {
            ConnectDB c = new ConnectDB();
            String query = "select * from account where choice = 'Guide' order by rating desc, name asc";//Storing MySQL query in A string variable
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
                        String Rating = resultSet.getString("rating");
                        defaultTableModel.addRow(new Object[]{Name, Phone, LanguageProficiency, AddressC, CountryC ,Rating});



                        //frame.setVisible(true);
                        //frame.validate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        dataTable.setModel(defaultTableModel);
        //new Dashboard(username).setVisible(true);

    }

    public void search(String str){
            defaultTableModel = (DefaultTableModel) dataTable.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(defaultTableModel);
            dataTable.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(str));
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
