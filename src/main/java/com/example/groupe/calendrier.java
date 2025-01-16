
package com.example.groupe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;

public class calendrier extends Application {

    private final HashMap<LocalDate, String> taches = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calendrier avec Tâches");

        TextField anneetextfield= new TextField();
        anneetextfield.setPromptText("saisir l'année");

        int annee = 2025;
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20;");

        Label titre = new Label("Calendrier de l'année " + annee);
        titre.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #333333;");
        titre.setPadding(new javafx.geometry.Insets(10));

        GridPane calendrier = creerCalendrierAnnuel(annee);
        ScrollPane scrollPaneVertical = new ScrollPane(calendrier);
        scrollPaneVertical.setFitToWidth(true);
        scrollPaneVertical.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 10;");

        HBox horizontalBox = new HBox(15);
        horizontalBox.getChildren().add(scrollPaneVertical);

        ScrollPane scrollPaneHorizontal = new ScrollPane(horizontalBox);
        scrollPaneHorizontal.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPaneHorizontal.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneHorizontal.setFitToHeight(true);
        scrollPaneHorizontal.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 10;");

        root.getChildren().addAll(titre, scrollPaneHorizontal);

        Scene scene = new Scene(root, 1200, 890);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane creerCalendrierAnnuel(int annee) {
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setStyle("-fx-padding: 20;");

        Locale locale = Locale.getDefault();

        for (int mois = 1; mois <= 12; mois++) {
            YearMonth yearMonth = YearMonth.of(annee, mois);
            GridPane calendrierMois = creerCalendrierMensuel(yearMonth);

            Label nomMois = new Label(yearMonth.getMonth().getDisplayName(TextStyle.FULL, locale));
            nomMois.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #4a90e2;");
            nomMois.setPadding(new javafx.geometry.Insets(5));

            VBox boxMois = new VBox(15, nomMois, calendrierMois);
            grid.add(boxMois, (mois - 1) % 4, (mois - 1) / 4);
        }

        return grid;
    }

    private GridPane creerCalendrierMensuel(YearMonth yearMonth) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);


        String[] jours = {"Lun", "Mar", "Mer", "Jeu", "Ven", "Sam", "Dim"};
        for (int i = 0; i < jours.length; i++) {
            Label jourLabel = new Label(jours[i]);
            jourLabel.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text-fill: #333333;");
            jourLabel.setMinWidth(50);
            jourLabel.setAlignment(javafx.geometry.Pos.CENTER);
            grid.add(jourLabel, i, 0);
        }


        int decalage = yearMonth.atDay(1).getDayOfWeek().getValue() % 7;
        int jour = 1;
        int row = 1;

        for (int col = 0; col < decalage; col++) {
            grid.add(new Label(""), col, row);
        }

        for (int col = decalage; jour <= yearMonth.lengthOfMonth(); col++) {
            Button jourBouton = new Button(String.valueOf(jour));
            jourBouton.setStyle("-fx-font-size: 12px; -fx-background-color: #ffffff; -fx-border-color: #cccccc; -fx-border-radius: 5px;");
            jourBouton.setMinWidth(50);
            jourBouton.setMaxHeight(50);
            jourBouton.setTextFill(Color.BLACK);
            int finalJour = jour;
            jourBouton.setOnAction(e -> ouvrirFenetreTaches(yearMonth.atDay(finalJour)));

            grid.add(jourBouton, col % 7, row);

            jour++;
            if (col % 7 == 6) {
                row++;
            }
        }

        return grid;
    }

    private void ouvrirFenetreTaches(LocalDate date) {
        Stage fenetreTaches = new Stage();
        fenetreTaches.setTitle("Tâches pour le " + date);

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color: #f9f9f9;");

        Label titre = new Label("Tâches pour le " + date);
        titre.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #4a90e2;");
        titre.setPadding(new javafx.geometry.Insets(10));

        TextArea zoneTaches = new TextArea(taches.getOrDefault(date, ""));
        zoneTaches.setPrefSize(300, 150);
        zoneTaches.setStyle("-fx-border-color: #cccccc; -fx-border-radius: 5px;");

        Button sauvegarder = new Button("Sauvegarder");
        sauvegarder.setStyle("-fx-background-color: #4a90e2; -fx-text-fill: white; -fx-font-size: 14px;");
        sauvegarder.setOnAction(e -> {
            taches.put(date, zoneTaches.getText());
            fenetreTaches.close();
        });

        root.getChildren().addAll(titre, zoneTaches, sauvegarder);

        Scene scene = new Scene(root, 350, 250);
        fenetreTaches.setScene(scene);
        fenetreTaches.initModality(Modality.APPLICATION_MODAL);
        fenetreTaches.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
