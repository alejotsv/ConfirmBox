package com.java21days;

import javax.swing.text.html.Option;

public class DialogBoxes {
    public static void main(String[] args) {
        ConfirmBox confirm = new ConfirmBox("Confirm box");
        InputBox input = new InputBox("What is your name?", "Name");
        String response = input.getResponse();
        MessageBox message = new MessageBox(response, "Greetings");

        String foodTitle = "Favorite food";
        String foodMessage = "What is your favorite food?";
        String[] foodOptions = { "Rice with fried rice", "Sushi", "Ramen", "Pizza", "Tartare" };
        OptionBox optionBox = new OptionBox(foodTitle, foodMessage, foodOptions);

        System.out.println(optionBox.getResponse());
    }
}
