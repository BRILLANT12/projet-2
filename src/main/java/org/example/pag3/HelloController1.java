package org.example.pag3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class helloController1 {
    @FXML private Button validé;
    @FXML private AnchorPane pane;
    @FXML private Button exite;
    @FXML private PasswordField nom;
    @FXML private PasswordField identifient;
    @FXML private Text titre;
    Stage stage;

    public void  valider (ActionEvent event) {
        if (identifient.contains(IDCHEK)){
            if (identifient.contains(Mid)
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/resource/vueM.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }catch (Exception e) {
                e.printStackTrace();
            }
            else{
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/resource/hello-view.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public void exite(javafx.event.ActionEvent actionEvent) {
        stage=(Stage) pane.getScene().getWindow();
        System.out.println("vous avez quiter la page");
        stage.close();
    }
}