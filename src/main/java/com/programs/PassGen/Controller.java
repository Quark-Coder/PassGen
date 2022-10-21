package com.programs.PassGen;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private Button generate, copy;

    @FXML
    private TextField pasOutput, pasLenght;

    @FXML
    private CheckBox useSpecSym, useUpCase, useNumbers;

    @FXML
    public void generate(ActionEvent event){
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println("Password generated.");
        pasOutput.setText(passwordGenerator.passGen());
    }

    @FXML
    public void selectSpecSym() {
        if(useSpecSym.isSelected()) {
            System.out.println("Special Symbols selected.");
        }
    }

    @FXML
    public void selectUpCase() {
        if(useUpCase.isSelected()) {
            System.out.println("Upper-case symbols selected.");
        }
    }

    @FXML
    public void selectNumbers() {
        if(useNumbers.isSelected()) {
            System.out.println("Numbers selected.");
        }
    }

    @FXML
    public void copyPass() {
        System.out.println("Password copied.");
    }
}
