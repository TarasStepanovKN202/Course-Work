package Commands;

import KavaInfo.Coffee;
import com.example.kavacontrollers.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class ProductsInBus extends ChangeCompanyController {

    public static ObservableList<Coffee> coffees = FXCollections.observableArrayList();
    public ObservableList<Coffee> getCoffees() {
        return coffees;
    }
    public void PlusProduct() {

        String dbCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=CoffeeBuss;encrypt=true;trustServerCertificate=true;";
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connect = DriverManager.getConnection(dbCon, "BussWorker", "1111");
            Statement st = connect.createStatement();

            String selectSql = "SELECT * FROM Coffee";
            ResultSet resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                coffees.add(new Coffee(resultSet.getInt("ProductID"),resultSet.getInt("Weight"),resultSet.getString("Sort"),
                        resultSet.getString("PhysStanID"),resultSet.getInt("PriceKg"),resultSet.getString("PacktypeID"),
                        resultSet.getInt("QuantityofProduct"),resultSet.getString("CompanyName")) );
            }
            connect.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void AddProduct(Coffee coffee) {

        String dbCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=CoffeeBuss;encrypt=true;trustServerCertificate=true;";
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connect = DriverManager.getConnection(dbCon, "BussWorker", "1111");
            Statement st = connect.createStatement();

            String insertSql = "INSERT INTO Coffee (ProductID, Weight, Sort, PhysStanID, PriceKg, PacktypeID, QuantityofProduct, CompanyName) VALUES (" +
                    coffee.getProductid() +", " + coffee.getWeight() + ", '" + coffee.getSort() +
                    "', '" + coffee.getPhysstan() + "', " + coffee.getPricekg() + ", '" +
                    coffee.getPacktype()+ "', " + coffee.getQuantity() + ", '" +
                    coffee.getCompany() + "');";
            ResultSet resultSet = st.executeQuery(insertSql);
            connect.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void UpdPrice(int id, int newprice){
        String dbCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=CoffeeBuss;encrypt=true;trustServerCertificate=true;";
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connect = DriverManager.getConnection(dbCon, "BussWorker", "1111");
            Statement st = connect.createStatement();

            String insertSql = "UPDATE Coffee SET PriceKg = "+ newprice +" WHERE ProductID =" + id + ";";
            ResultSet resultSet = st.executeQuery(insertSql);
            connect.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void ChangeImporter(int id, String newcompany){
        String dbCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=CoffeeBuss;encrypt=true;trustServerCertificate=true;";
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connect = DriverManager.getConnection(dbCon, "BussWorker", "1111");
            Statement st = connect.createStatement();

            String insertSql = "UPDATE Coffee SET CompanyName = '"+ newcompany +"' WHERE ProductID =" + id + ";";
            ResultSet resultSet = st.executeQuery(insertSql);
            connect.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void FilterSearch(String column, String searchval) {

        String dbCon = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=CoffeeBuss;encrypt=true;trustServerCertificate=true;";
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connect = DriverManager.getConnection(dbCon, "BussWorker", "1111");
            Statement st = connect.createStatement();

            String selectSql = "SELECT * FROM Coffee WHERE "+ column +" = '"+ searchval + "';";
            ResultSet resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                coffees.add(new Coffee(resultSet.getInt("ProductID"),resultSet.getInt("Weight"),resultSet.getString("Sort"),
                        resultSet.getString("PhysStanID"),resultSet.getInt("PriceKg"),resultSet.getString("PacktypeID"),
                        resultSet.getInt("QuantityofProduct"),resultSet.getString("CompanyName")) );
            }
            connect.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
