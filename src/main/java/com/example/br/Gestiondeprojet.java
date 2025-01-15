package com.example.br;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Gestiondeprojet extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Gestiondeprojet.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        projet projet = new projet("projet");
        projet.setNom("Projet java");


        Tache tache = new Tache("protection", "sensible", "en cours", projet);

        tache.setTitre("String titre");
        tache.setDescription("String description");
        tache.setStatut("String Statut");
        tache.setProjet(projet);

        System.out.println("Titre de la tache:" + tache.getTitre());
        System.out.println("Description :" + tache.getDescription());
        System.out.println("Statut:" + tache.getStatut());
        System.out.println("projet:" + tache.getProjet().getNom());


        projet projet1 = new projet("projet 1");
        projet1.setNom("projet java1");
        System.out.println("Nom du projet 1:" + projet1.getNom());

        Membre membre = new Membre("Jim", "assistant", projet,"br@gmail.com");
        membre.setNom("String Nom");
        membre.setRole("String Role");
        membre.setProjet(projet);
        membre.setID("br@gmail.com");

        System.out.println("Nom:" + membre.getNom());
        System.out.println("Role :" + membre.getRole());
        System.out.println("projet:" + membre.getProjet().getNom());

        projet projet2 = new projet("projet 2");
        projet2.setNom("projet java2");
        System.out.println("Nom du projet2:" + projet2.getNom());

        Livrable livrable = new Livrable("Guitub2", "2026-01-31", "description Guitub2");
        livrable.setNom("String nom");
        livrable.setDateLimite("String date Limite");
        livrable.setDescription("String description");

        System.out.println("Nom:" + livrable.getNom());
        System.out.println("Date Limite :" + livrable.getDateLimite());
        System.out.println("Description:" + livrable.getDescription());




    }
}
