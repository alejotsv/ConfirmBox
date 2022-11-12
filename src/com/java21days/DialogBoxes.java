package com.java21days;

import javax.swing.text.html.Option;

public class DialogBoxes {
    public static void main(String[] args) {
        ConfirmBox confirm = new ConfirmBox("Confirm box");
        InputBox input = new InputBox("What is your name?", "Name");
        String name = input.getResponse();
        String greetingMessage = "Hello, " + name;
        MessageBox greeting = new MessageBox(greetingMessage, "Greetings");

        String foodTitle = "Favorite food";
        String foodMessage = "What is your favorite food?";
        String[] foodOptions = { "Rice with fried rice", "Sushi", "Ramen", "Pizza", "Tartare" };
        OptionBox optionBox = new OptionBox(foodTitle, foodMessage, foodOptions);

        String favoriteFoodMessage = name + ", good to know that your favorite food is " + optionBox.getResponse();
        MessageBox favoriteFood = new MessageBox(favoriteFoodMessage, "Your favorite food");

    }
}
