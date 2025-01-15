package com.example.br;



public class Livrable {
    private String nom;
    private String dateLimite;
    private String description;

    public Livrable(String nom,String dateLimite,String description){
        this.nom = "Guitub2";
        this.dateLimite = "2026-01-3";
        this.description = "description Guitub2";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(String dateLimite) {
        this.dateLimite ="2026-01-3";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = "description Guitub2";
    }
}



