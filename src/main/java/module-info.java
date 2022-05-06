module com.example.proiectfiszoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector.java;




    opens com.example.proiectfiszoo to javafx.fxml;
    exports com.example.proiectfiszoo;
}