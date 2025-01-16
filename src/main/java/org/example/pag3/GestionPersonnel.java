package org.example.pag3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionPersonnel extends Employe {
    private static List<Employe> employes = new ArrayList<>();
    private static int compteurId = 1;

    public GestionPersonnel(int id, String nom, String prenom, String poste, String date) {
        super(id, nom, prenom, poste, date);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n*** Gestion du Personnel ***");
            System.out.println("1. Créer un employé");
            System.out.println("2. Modifier un employé");
            System.out.println("3. Supprimer un employé");
            System.out.println("4. Visualiser les informations d’un employé");
            System.out.println("5. Afficher l’historique des projets d’un employé");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1 -> creerEmploye(scanner);
                case 2 -> modifierEmploye(scanner);
                case 3 -> supprimerEmploye(scanner);
                case 4 -> visualiserEmploye(scanner);
                case 5 -> afficherHistorique(scanner);
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();
    }

    private static void afficherHistorique(Scanner scanner) {

    }

    private static void visualiserEmploye(Scanner scanner) {

    }

    private static void supprimerEmploye(Scanner scanner) {

    }

    private static void creerEmploye(Scanner scanner) {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Poste : ");
        String poste = scanner.nextLine();
        System.out.print("date : ");
        String date = scanner.nextLine();

        Employe employe = new Employe(compteurId++, nom, prenom, poste, date);
        employes.add(employe);
        System.out.println("Emploi du tepps créé avec succès !");
    }

    private static void modifierEmploye(Scanner scanner) {
        System.out.print("ID de l’employé à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employe employe = trouverEmployeParId(id);
        if (employe != null) {
            System.out.print("Nouveau nom  : ");
            String nom = scanner.nextLine();
            if (!nom.isEmpty()) employe.getNom() = nom;

            System.out.print("Nouveau poste  : ");
            String post = String.valueOf(scanner.nextInt());
            if (!post.isEmpty()) employe.getPost() = post;
        }
    }

    private static void trouverEmployeParId(int id, String nom) {
        return creerEmploye(poste);
    }

}
