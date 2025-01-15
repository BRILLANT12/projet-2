package com.example.br;

import java.util.ArrayList;
import java.util.List;

public class projet {
    private String nom;
    private final List<Tache> taches;
    private List<Membre> membres;
    private List<Livrable>livrables;
    private Tache tache;


    public projet ( String nom){
        this.nom=nom;

        taches= new ArrayList<>();
        this.membres= new ArrayList<>();
        this.livrables= new ArrayList<>();


    }



    //Setter pour nom
    public void setNom(String nom) {
        this.nom= nom;
    }
    //getter pour le nom
    public String getNom() {
        return nom;
    }

    //ajouter une tache
    public void ajouterTache (Tache  tache){
        this.taches.add(tache);
    }
    //ON recupere toutes les taches
    public List<Tache> getTaches() {
        return taches;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public List<Livrable> getLivrables() {
        return livrables;
    }

    public void setLivrables(List<Livrable> livrables) {
        this.livrables = livrables;
    }
}
