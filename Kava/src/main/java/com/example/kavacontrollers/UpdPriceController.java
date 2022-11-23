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

public class UpdPriceController extends HelloController {

    @FXML
    private Button donebutton;

    @FXML
    private TextField idline;

    @FXML
    private TextField newpriceline;

    @FXML
    void initialize(){
        donebutton.setOnAction(event -> {
            int id = Integer.parseInt(idline.getText().trim());
            int newprice = Integer.parseInt(newpriceline.getText().trim());
            ProductsInBus prod = new ProductsInBus();
            prod.UpdPrice(id,newprice);

            donebutton.getScene().getWindow().hide();
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
