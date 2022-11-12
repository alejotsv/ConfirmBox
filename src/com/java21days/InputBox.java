package com.java21days;

import javax.swing.*;

public class InputBox extends JFrame {
    String response;
    InputBox(String message, String title){
        response = JOptionPane.showInputDialog(
          null,
          message,
          title,
          JOptionPane.QUESTION_MESSAGE
        );
    }

    String getResponse(){
        return response;
    }
}
