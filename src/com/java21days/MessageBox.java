package com.java21days;

import javax.swing.*;

public class MessageBox extends JFrame {
    MessageBox(String name, String title){
        super(title);
        String message = "Hello, " + name;
        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );
    }

}
