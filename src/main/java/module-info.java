module com.example.zooproiectpaginaanimale {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zooproiectpaginaanimale to javafx.fxml;
    exports com.example.zooproiectpaginaanimale;
}