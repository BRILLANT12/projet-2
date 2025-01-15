package org.example.pzpzp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {
    @FXML private Button valider;
    @FXML private Button exite;
    @FXML private PasswordField nom;
    @FXML private PasswordField identifient;
    @FXML private Text titre;

    public void valider(ActionEvent actionEvent) {
        // Action du bouton Valider
        Button.setOnAction(event -> {
            if (identifient.contains(IDCHEK)){
                navigateBasedOnID(nom, identifient);
            } else {
                showAlert("Erreur", "Veuillez entrer un ID valide.");
            }
        });

        // Configuration de la fenêtre principale
        Stage primaryStage = null;
        primaryStage.setTitle("Navigation par ID");
        primaryStage.setScene(loginScen);
        primaryStage.show();
    }

    // Méthode pour naviguer en fonction de l'ID
    private void navigateBasedOnID(PasswordField nom, PasswordField userId) {
        if (userId.equals("000")) {
            showManagerPage(nom);
        } else if (userId.equals("001")) {
            showEmployeePage(nom);
        } else {
            showAlert("Erreur", "ID inconnu.");
        }
    }

    private void showAlert(String erreur, String s) {
    }

    // Méthode pour afficher la page du Manager
    private void showManagerPage(Stage stage) {
    }
    // Méthode pour afficher la page de l'Employé
    private void showEmployeePage(Stage stage) {
    }

}


