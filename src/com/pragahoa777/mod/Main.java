package com.pragahoa777.mod;

import com.pragahoa777.mod.func.Math;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("tua pra gob");
        frame.setSize(640,480);
        frame.setLayout(null);

        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(20,20,400,50);
        frame.add(inputTextField);

        JLabel label = new JLabel("tua pra gob");
        label.setBounds(20,70,400,30);
        frame.add(label);

        JButton btn = new JButton("calculate");
        btn.setBounds(20,150,250,60);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = inputTextField.getText();
                int input = Integer.parseInt(temp);
                String ans = Math.mod_func(input);
                label.setText(ans);
            }
        });
        frame.add(btn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}