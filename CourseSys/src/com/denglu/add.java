package com.denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class add {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    public String username;
    public String password;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    add window = new add();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public add() {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(400, 200, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("用户名：");
        lblNewLabel.setBounds(100, 56, 54, 15);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("密码：");
        lblNewLabel_1.setBounds(100, 102, 54, 15);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(196, 53, 100, 21);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(196, 96,100, 21);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("注册");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                    new prompt();
                    frame.removeNotify();
                    //  System.out.println("成功");


            }
        });
        btnNewButton.setBounds(81, 169, 93, 23);
        frame.getContentPane().add(btnNewButton);

        JButton returnButton = new JButton("返回");
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new login();
                frame.removeNotify();

            }
        });
        returnButton.setBounds(223, 169, 93, 23);
        frame.getContentPane().add(returnButton);

    }

}