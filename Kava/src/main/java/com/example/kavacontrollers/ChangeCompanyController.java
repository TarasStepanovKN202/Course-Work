package com.example.kavacontrollers;

import Commands.ProductsInBus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeCompanyController {

    @FXML
    private Button secdonebutton;

    @FXML
    private TextField secidline;

    @FXML
    private TextField secnewcompanyline;

    @FXML
    void initialize(){
        secdonebutton.setOnAction(event -> {
            int id = Integer.parseInt(secidline.getText().trim());
            String newcompany = secnewcompanyline.getText().trim();
            ProductsInBus prod = new ProductsInBus();
            prod.ChangeImporter(id,newcompany);

            secdonebutton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ViewProduct.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root =loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}

