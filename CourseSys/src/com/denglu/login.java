package com.denglu;

import com.baidu.studentmanage.ShowStuInfoFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
   // public Component frame;
    public JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton quitBt;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login window = new login();
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
    public login() {
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

        JLabel j1=new JLabel("***学生登录页面***");
        j1.setBounds(120, 26, 180, 15);
        frame.getContentPane().add(j1);


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

        passwordField = new JPasswordField();
        passwordField.setBounds(196, 96,100, 21);
        frame.getContentPane().add(passwordField);

        JButton btnNewButton = new JButton("登录");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ShowStuInfoFrame();
                frame.setVisible(false);
            }
        });
        btnNewButton.setBounds(41, 169, 93, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("注册");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new add();
                frame.removeNotify();

            }
        });
        btnNewButton_1.setBounds(183, 169, 93, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton j2 = new JButton("退出");
        j2.setBounds(323, 169, 93, 23);
        frame.getContentPane().add(j2);
        j2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                if(e.getActionCommand().equals("退出")){
                    System.exit(0);
                }
            }
        });



    }

    private void add(JButton quitBt2) {
        // TODO Auto-generated method stub

    }

    private Container getContentPane() {
        // TODO Auto-generated method stub
        return null;
    }


}
