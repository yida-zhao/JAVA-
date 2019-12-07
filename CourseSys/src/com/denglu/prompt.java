package com.denglu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prompt {
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    prompt window = new prompt();
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
    public prompt() {
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

        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("注册成功 !");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 41));
        lblNewLabel.setBounds(77, 51, 215, 46);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("返回登录");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new login();
                frame.removeNotify();
            }
        });
        btnNewButton.setBounds(157, 153, 103, 33);
        frame.getContentPane().add(btnNewButton);
    }

}
