package tp11.dto;

import tp11.Utilisateur;

/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class UtilisateurDTO  implements TransferableObject{
    // A vous de d�finir les attributs, le constructeur et les getters/setters
    // n'oubliez pas : aucune logique m�tier ici !!

    private String nom;
    private String email;


    public UtilisateurDTO(Utilisateur utilisateur){
        this.nom = utilisateur.getNom();
        this.email = utilisateur.getEmail();
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
}
