package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField contactField;

    @FXML
    private TextField postalField;

    @FXML
    public Label errorLabel;

    public void onSubmitButtonClicked() {
        String name = nameField.getText();
        String contact = contactField.getText();
        String postalCode = postalField.getText();

        if (validateName(name) && validateContactNumber(contact) && validatePostalCode(postalCode)) {
            errorLabel.setText("All fields are valid.");
        } else {
            errorLabel.setText("Please check your input fields.");
        }
    }

    private boolean validateName(String name) {
        return name.matches("[A-Z][a-zA-Z]*");
    }

    private boolean validateContactNumber(String contact) {
        return contact.matches("\\d{3}[- ]?\\d{3}[- ]?\\d{4}");
    }

    private boolean validatePostalCode(String postalCode) {
        return postalCode.matches("[A-Za-z]\\d[A-Za-z][- ]?\\d[A-Za-z]\\d");
    }
}
