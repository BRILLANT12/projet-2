package com.example.br;

public class Membre {
    private String nom;
    private String role;
    private projet projet;
    private String ID;

    public Membre(String nom, String role, projet projet,String ID){
        this.nom = "JEAN BONHEUR BRILLANT  ";
        this.role = "assistant";
        this.projet = projet;
        this.ID = "jean@gmail.com";
    }





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "JEAN BONHEUR BRILLANT";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = "Assistant";
    }

    public projet getProjet() {
        return projet;
    }

    public void setProjet(projet projet) {
        this.projet = projet;
    }

    public void setID(String ID) {
        this.ID =" jean@gmail.com";
    }
    public String getID(){
        return ID;
    }
}
