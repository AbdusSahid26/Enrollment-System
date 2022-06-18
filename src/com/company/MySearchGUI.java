package com.company;

import com.company.ui.SearchGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySearchGUI extends JFrame implements ActionListener {

    public static void main(String[] args) {


        new MySearchGUI().setVisible(true);
    }



    /// Work running
    public MySearchGUI(String username){
        SearchGUI ui = new SearchGUI(username);
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /// Work end



    MySearchGUI(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
    private  static void createGUI(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
