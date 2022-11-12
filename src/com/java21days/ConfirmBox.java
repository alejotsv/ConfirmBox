package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ConfirmBox extends JFrame {
    Dimension dim = new Dimension(300, 300);

    ConfirmBox(String title){
        super(title);
        setSize(dim);
        int response = JOptionPane.showConfirmDialog(this, "Do you want to continue?");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
