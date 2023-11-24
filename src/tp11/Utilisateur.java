package tp11;

import tp11.dto.Entity;
import tp11.dto.UtilisateurDTO;

/******************************************************************
 * Il s'agit d'une entité (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique métier.
 * Cet objet propose une méthode toDTO() qui fournira la version légère
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Utilisateur implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private String nom;
    private String email;
    private boolean isPremium = false ;

    // TODO à vous d'écrire les getters/setters, le(s) constructeur(s) et tout ce dont vous aurez besoin

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom= nom;
    }

    public String getEmail() {
        return email;
    }

    public  void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsPremium(){
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public UtilisateurDTO toDTO() {
        // TODO a coder
        return null;
    }
}