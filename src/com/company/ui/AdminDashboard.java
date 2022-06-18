package com.company.ui;

import com.company.ConnectDB;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDashboard extends JFrame {
    JPanel rootPanel;
    JButton viewGuideButton;  // It is same as view all students
    JPanel adminPanel;
    JPanel buttonPanel;
    JPanel displayPanel;
    JTable displayTable;
    JButton messagesButton;
    JButton L1S1E;
    JButton L1S2E;
    JButton L2S1E;
    JButton L2S2E;
    JButton L3S1E;
    JButton L3S2E;
    JButton L4S1E;
    JButton L4S2E;
    JButton L1S1NE;
    JButton L1S2NE;
    JButton L2S1NE;
    JButton L2S2NE;
    JButton L3S1NE;
    JButton L3S2NE;
    JButton L4S1NE;
    JButton L4S2NE;
    JButton repeatEnrollmentButton;
    JButton enrollmentFeeButton;
    private JButton viewEnrollmentFeeButton;

    public AdminDashboard() {
        setLayout(null);
        setBounds(400, 80, 800, 720);
        setContentPane(rootPanel);
        setVisible(true);
        viewGuideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");
                // defaultTableModel.addColumn("Rating");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");

                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
            });



        messagesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("username");
                defaultTableModel.addColumn("text");

               // System.out.println("OKKKKKK");


                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from contactRelation";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String text = resultSet.getString("text");
                                defaultTableModel.addRow(new Object[]{username, text});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });
        L1S1E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='1' && semester='1' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L1S1NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='1' && semester='1' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });


        L1S2E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                // defaultTableModel.addColumn("Rating");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='1' && semester='2' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });


        L1S2NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='1' && semester='2' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L2S1E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='2' && semester='1' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });


        L2S1NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='2' && semester='1' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L2S2E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='2' && semester='2' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L2S2NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='2' && semester='2' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L3S1E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='3' && semester='1' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L3S1NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='1' && semester='1' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L3S2E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='3' && semester='2' && isenrolled='1'";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L3S2NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='3' && semester='2' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L4S1E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='4' && semester='1' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });
        L4S1NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='4' && semester='1' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L4S2E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='4' && semester='2' && isenrolled='1' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        L4S2NE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Username");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Email");
                defaultTableModel.addColumn("Phone");
                defaultTableModel.addColumn("Address");
                defaultTableModel.addColumn("Nationality");

                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from account where level='4' && semester='2' && isenrolled='0' ";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("username");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("studentid");
                                String email = resultSet.getString("email");
                                String phone = resultSet.getString("phone");
                                String address = resultSet.getString("address");
                                String nationality = resultSet.getString("nationality");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");


                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone, address ,nationality, level, semester});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });

        repeatEnrollmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Student ID");
                defaultTableModel.addColumn("Name");
                defaultTableModel.addColumn("Level");
                defaultTableModel.addColumn("Semester");
                defaultTableModel.addColumn("Course Code");


                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from repeatenrollment";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String username = resultSet.getString("studentid");
                                String name = resultSet.getString("name");
                                String studentid = resultSet.getString("level");
                                String email = resultSet.getString("semester");
                                String phone = resultSet.getString("coursecode");



                                defaultTableModel.addRow(new Object[]{username, name, studentid , email, phone});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });
        enrollmentFeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("App");
                frame.setContentPane(new FacultyFee());
                //this.setVisible(false);
            }

            private void setVisible(boolean b) {
            }
        });
        viewEnrollmentFeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();

                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                displayTable.setDefaultRenderer(Object.class, centerRenderer);

                //frame.add(new JScrollPane(table));
                defaultTableModel.addColumn("Department");
                defaultTableModel.addColumn("Faculty");
                defaultTableModel.addColumn("Level");
                defaultTableModel.addColumn("Semester");
                defaultTableModel.addColumn("Credit Fee");
                defaultTableModel.addColumn("Faculty Fee");
                defaultTableModel.addColumn("Hall Clearance Fee");
                defaultTableModel.addColumn("Others");
                defaultTableModel.addColumn("Total");



                try {
                    ConnectDB c = new ConnectDB();
                    String query = "select * from enrollmentfee";//Storing MySQL query in A string variable
                    ResultSet resultSet = c.s.executeQuery(query);//executing query and storing result in ResultSet
                    int len = query.length();

                    if (len == 0) {
                        JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
                    } else {
                        while (len-- > 0) {
                            while (resultSet.next()) {
                                String dept = resultSet.getString("dept");
                                String faculty = resultSet.getString("faculty");
                                String level = resultSet.getString("level");
                                String semester = resultSet.getString("semester");
                                String creditfee = resultSet.getString("creditfee");
                                String facultyfee = resultSet.getString("facultyfee");
                                String hallclearance = resultSet.getString("hallclearance");
                                String others = resultSet.getString("others");
                                String total = resultSet.getString("total");



                                defaultTableModel.addRow(new Object[]{dept, faculty, level, semester, creditfee, facultyfee, hallclearance, others, total});
                                //frame.setVisible(true);
                                //frame.validate();
                            }
                        }
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                displayTable.setModel(defaultTableModel);
            }
        });
    }

    public static void main(String[] args) {
        new AdminDashboard().setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
