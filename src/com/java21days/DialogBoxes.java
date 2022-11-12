package com.java21days;

public class DialogBoxes {
    public static void main(String[] args) {
        ConfirmBox confirm = new ConfirmBox("Confirm box");
        InputBox input = new InputBox("What is your name?", "Name");
        String response = input.getResponse();
        MessageBox message = new MessageBox(response, "Greetings");
    }
}
