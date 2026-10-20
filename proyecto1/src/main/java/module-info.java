module com.pilli.proyecto1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.proyecto1 to javafx.fxml;
    exports com.pilli.proyecto1;
}
