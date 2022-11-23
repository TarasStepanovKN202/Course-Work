package com.example.kavacontrollers;

import java.io.IOException;

import Commands.ProductsInBus;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class HelloController extends ProductsInBus {

    @FXML
    private Button addprod;

    @FXML
    private Button changecompany;

    @FXML
    private Button filtersearchprod;

    @FXML
    private Button updpriceprod;

    @FXML
    private Button viewlist;

    @FXML
    void initialize() {
        viewlist.setOnAction(event -> {
            viewlist.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ViewProduct.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root =loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("CoffeeBus");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        addprod.setOnAction(event -> {
            addprod.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("AddProduct.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root =loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("CoffeeBus");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        updpriceprod.setOnAction(event -> {
                    updpriceprod.getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("UpdPrice.fxml"));
                    try {
                        loader.load();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
            stage.setTitle("CoffeeBus");
                    stage.setScene(new Scene(root));
                    stage.showAndWait();
                });
        changecompany.setOnAction(event -> {
            changecompany.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ChangeCompany.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root =loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("CoffeeBus");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        filtersearchprod.setOnAction(event -> {
            filtersearchprod.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FilterSearch.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root =loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("CoffeeBus");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
