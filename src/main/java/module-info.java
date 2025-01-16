module com.example.tabcalen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tabcalen to javafx.fxml;
    exports com.example.tabcalen;
    exports com.example.groupe;
    opens com.example.groupe to javafx.fxml;
}