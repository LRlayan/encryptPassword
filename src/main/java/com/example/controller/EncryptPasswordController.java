package com.example.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

public class EncryptPasswordController {

    @FXML
    private JFXTextField txtPassword;

    @FXML
    void btnOnAction(ActionEvent event) {
        String password = txtPassword.getText();
        String encryptPass = encryptPassword(password);
        System.out.println("Encrypt Password : " + encryptPass);
    }

    public String encryptPassword(String pass){
        return new String(Base64.encodeBase64(pass.getBytes(StandardCharsets.UTF_8)));
    }
}
