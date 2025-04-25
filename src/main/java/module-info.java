module com.example.javafxbrocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxbrocode to javafx.fxml;
    exports com.example.javafxbrocode;
}