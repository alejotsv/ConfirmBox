package com.java21days;

import javax.swing.*;

public class MessageBox extends JFrame {
    MessageBox(String message, String title){
        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );
    }

}
