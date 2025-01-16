package org.example.pag3;

import java.util.ArrayList;
import java.util.List;

class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private List<PROJET> historiqueProjets;

    public Employe(int id, String nom, String prenom, String poste, String date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.historiqueProjets = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void ajouterProjet(PROJET projet) {
        historiqueProjets.add(projet);
    }

    public List<PROJET> getHistoriqueProjets() {
        return historiqueProjets;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "ID=" + id +
                ", Nom='" + nom + '\'' +
                ", Prénom='" + prenom + '\'' +
                ", Poste='" + poste + '\'' +
                '}';
    }

    public String postee(String nom, String identifient) {
        return poste;
    }

    public String getNom() {
        return nom;
    }


}
