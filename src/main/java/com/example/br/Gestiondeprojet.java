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

    public static void afficherInfosMembre(Membre membre) {
        System.out.println("Nom: " + membre.getNom());
        System.out.println("Role: " + membre.getRole());
        System.out.println("Projet: " + membre.getProjet().getNom());
        System.out.println("ID: " + membre.getID());
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

        Membre membre1 = new Membre("JEAN BONHEUR BRILLANT NGUEMA", "assistant", projet, "jean@gmail.com");
        Membre membre2 = new Membre("RÉMI FOURES ", "Développeur", projet, "remi@gmail.com");
        Membre membre3 = new Membre("MAEVA ESSOME", "Designer", projet, "maeva@gmail.com");


        //Affichage des informations des membres


        System.out.println("Membre1:");
        afficherInfosMembre(membre1);

        System.out.println("\nMembre2:");
        afficherInfosMembre(membre2);


        System.out.println("\nMembre3:");
        afficherInfosMembre(membre3);


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
