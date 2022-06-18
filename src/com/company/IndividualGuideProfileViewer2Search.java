package com.company;

import com.company.ui.IndividualGuideProfileViewer2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndividualGuideProfileViewer2Search extends JFrame implements ActionListener {

    String emailKey;
    String username;

    public static void main(String[] args) {


        new IndividualGuideProfileViewer2Search().setVisible(true);
    }

    public IndividualGuideProfileViewer2Search(String username, String emailkey){
        this.username = username;
        this.emailKey = emailkey;

        System.out.print("Here: ");
        System.out.println(emailkey);


        System.out.print("Create GUI2: ");
        System.out.println(emailkey);
        IndividualGuideProfileViewer2 ui = new IndividualGuideProfileViewer2(username, emailkey);
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    IndividualGuideProfileViewer2Search(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI2();
            }
        });
    }
    public void createGUI2(){
        /*
        System.out.print("Create GUI2: ");
        System.out.println(emailKey);
        IndividualGuideProfileViewer2 ui = new IndividualGuideProfileViewer2(emailKey);
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
