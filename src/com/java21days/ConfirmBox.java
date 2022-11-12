package com.java21days;

import javax.swing.*;

public class ConfirmBox extends JFrame {

    ConfirmBox(String title){
        int response = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue?", title ,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
    }
}
