module org.example.pag3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.example.pag3 to javafx.fxml;
    exports org.example.pag3;
    exports org.example.pzpzp;
    opens org.example.pzpzp to javafx.fxml;
    exports org.example.page3;
    opens org.example.page3 to javafx.fxml;
}