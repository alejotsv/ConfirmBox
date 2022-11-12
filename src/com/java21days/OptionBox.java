package com.java21days;

import javax.swing.*;

public class OptionBox extends JFrame {
    int response;

    OptionBox(String title, String message, String[] options){
        response = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                0,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
                );
    }

    int getResponse(){
        return response;
    }
}
