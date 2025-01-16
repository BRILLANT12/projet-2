package org.example.pag3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloController3 {
    @FXML private Button exite;
    @FXML private Button fini;
    @FXML private Text texte;
    @FXML private TableView tableau;
    @FXML private TextField textee;
    @FXML private TextField exofin;
    @FXML private TableColumn un;
    @FXML private TableColumn
    @FXML private AnchorPane pane;
    Stage stage;

    public void exite(ActionEvent actionEvent) {
        stage=(Stage) pane.getScene().getWindow();
        System.out.println("vous avez quiter la page");
        stage.close();
    }

    public void fini(ActionEvent actionEvent) {

    }


    public void nom(MouseEvent mouseEvent) {
    }
}