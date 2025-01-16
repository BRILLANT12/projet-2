package org.example.pag3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController2 {
    @FXML private Button exite;
    @FXML private Button nextache;
    @FXML private Text titre;
    @FXML private TableView tableau;
    @FXML private TextField identifient;
    @FXML private TextField nom;
    @FXML private TextField date;
    @FXML private TableColumn un;
    @FXML private TableColumn deux;
    @FXML private AnchorPane pane;
    Stage stage;



    // public void créetache(ActionEvent actionEvent) {
        //send requeste nouvelletache(nom);
     //   System.out.println("vous avez envoier la commande");
        ;




    public void exite(ActionEvent actionEvent) {
        stage=(Stage) pane.getScene().getWindow();
        System.out.println("vous avez quiter la page");
        stage.close();
    }
}