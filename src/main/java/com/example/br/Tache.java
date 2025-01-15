package com.example.br;

public class Tache {
    private String titre;
    private String description;
    private String statut;
    private projet projet;



    public Tache(String titre,String description,String statut,projet projet) {
        this.titre = "protection";
        this.description = "sensible";
        this.statut = "en cours";
        this.projet = projet;
    }




    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public projet getProjet() {
        return projet;
    }

    public void setProjet(projet projet) {
        this.projet = projet;
    }
}
