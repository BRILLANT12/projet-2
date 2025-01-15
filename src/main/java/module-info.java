module com.example.br {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.br to javafx.fxml;
    exports com.example.br;
}