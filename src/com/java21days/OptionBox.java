package com.java21days;

import javax.swing.*;

public class OptionBox extends JFrame {
    String response;

    OptionBox(String title, String message, String[] options){
        int selected = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                0,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
                );
        response = options[selected];
    }

    String getResponse(){
        return response;
    }
}
