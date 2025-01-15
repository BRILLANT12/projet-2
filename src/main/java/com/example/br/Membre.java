package com.example.br;

public class Membre {
    private String nom;
    private String role;
    private projet projet;
    private String ID;

    public Membre(String nom, String role, projet projet,String ID){
        this.nom = "Jim";
        this.role = "assistant";
        this.projet = projet;
        this.ID = "br@gmail.com";
    }





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "Jim";
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
        this.ID =" br@gmail.com";
    }
    public String getID(){
        return ID;
    }
}
