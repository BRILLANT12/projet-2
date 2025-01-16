package org.example.pag3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PROJET {
    private String nom;
    private String role;
    private String dateDebut;
    private String dateFin;

    public PROJET(String nom, String role, String dateDebut, String dateFin) {
        this.nom = nom;
        this.role = role;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "Nom='" + nom + '\'' +
                ", Rôle='" + role + '\'' +
                ", Date Début='" + dateDebut + '\'' +
                ", Date Fin='" + dateFin + '\'' +
                '}';
    }
}