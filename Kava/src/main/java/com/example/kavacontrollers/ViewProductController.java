package com.example.kavacontrollers;


import Commands.ProductsInBus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import KavaInfo.Coffee;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ViewProductController extends HelloController {

        @FXML
        private TableView<Coffee> Viewlist;
        @FXML
        private TableColumn<Coffee, String> col_companyname;
        @FXML
        private TableColumn<Coffee, String> col_packtypeid;

        @FXML
        private TableColumn<Coffee, String> col_physstanid;

        @FXML
        private TableColumn<Coffee, Integer> col_pricekg;

        @FXML
        private TableColumn<Coffee, Integer> col_productid;

        @FXML
        private TableColumn<Coffee, Integer> col_quantityofproduct;

        @FXML
        private TableColumn<Coffee, String> col_sort;

        @FXML
        private TableColumn<Coffee, Integer> col_weight;



    @FXML
    private Button backtomenu;

    @FXML
    void initialize() {
        backtomenu.setOnAction(event -> {
            backtomenu.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));
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
        ProductsInBus prod = new ProductsInBus();
        prod.coffees.clear();
        prod.PlusProduct();
        col_productid.setCellValueFactory(new PropertyValueFactory<Coffee, Integer>("productid"));
        col_weight.setCellValueFactory(new PropertyValueFactory<Coffee, Integer>("weight"));
        col_sort.setCellValueFactory(new PropertyValueFactory<Coffee, String>("sort"));
        col_physstanid.setCellValueFactory(new PropertyValueFactory<Coffee, String>("physstan"));
        col_pricekg.setCellValueFactory(new PropertyValueFactory<Coffee, Integer>("pricekg"));
        col_packtypeid.setCellValueFactory(new PropertyValueFactory<Coffee, String>("packtype"));
        col_quantityofproduct.setCellValueFactory(new PropertyValueFactory<Coffee, Integer>("quantity"));
        col_companyname.setCellValueFactory(new PropertyValueFactory<Coffee, String>("company"));
        Viewlist.setItems(prod.getCoffees());
    }
}

