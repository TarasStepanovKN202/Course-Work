package com.example.kavacontrollers;

import Commands.ProductsInBus;
import KavaInfo.Coffee;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddProductController extends HelloController {

    @FXML
    private Button donebutton;
    @FXML
    private TextField companyline;

    @FXML
    private TextField packtypeline;

    @FXML
    private TextField physstanline;

    @FXML
    private TextField pricekgline;

    @FXML
    private TextField productidline;

    @FXML
    private TextField quantityline;

    @FXML
    private TextField sortline;

    @FXML
    private TextField weightline;

    @FXML
    void initialize(){
        donebutton.setOnAction(event -> {
            int productid = Integer.parseInt(productidline.getText().trim());
            int weight = Integer.parseInt(weightline.getText().trim());
            String sort = sortline.getText().trim();
            String physstan = physstanline.getText().trim();
            int pricekg = Integer.parseInt(pricekgline.getText().trim());
            String packtype = packtypeline.getText().trim();
            int quantity = Integer.parseInt(quantityline.getText().trim());
            String company = companyline.getText().trim();
            Coffee coffee = new Coffee(productid,weight,sort,physstan,pricekg,packtype,quantity,company);
            ProductsInBus prod = new ProductsInBus();
            prod.AddProduct(coffee);
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
