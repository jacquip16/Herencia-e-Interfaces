module com.pilli.proyecto2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.proyecto2 to javafx.fxml;
    exports com.pilli.proyecto2;
}
