package com.java21days;

import javax.swing.*;

public class InputBox extends JFrame {
    String response;
    InputBox(String title){
        response = JOptionPane.showInputDialog(
          null,
          "What's your name?",
          "Name",
          JOptionPane.QUESTION_MESSAGE
        );
    }

    String getResponse(){
        return response;
    }
}
