package com.java21days;

public class DialogBoxes {
    public static void main(String[] args) {
        ConfirmBox confirm = new ConfirmBox("Confirm box");
        InputBox input = new InputBox("What is your name?", "Name");
        String response = input.getResponse();
        System.out.println("Hello, " + response);
    }
}
