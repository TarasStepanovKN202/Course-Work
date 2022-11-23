module com.example.kavacontrollers {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;


    opens com.example.kavacontrollers to javafx.fxml;
    opens KavaInfo to javafx.fxml;
    exports com.example.kavacontrollers;
    exports KavaInfo;
    exports Commands;
    opens Commands to javafx.fxml;
}