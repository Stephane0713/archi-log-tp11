package tp11.dto;
import tp11.Commande;
import tp11.Livre;
import tp11.repository.LivreRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class CommandeDTO implements TransferableObject{
    private List<LivreDTO> livres;
    private UtilisateurDTO utilisateur ;
    private double fraisDePort;
    private String status;
    private int id;
    // A vous de d�finir les attributs, le constructeur et les getters/setters
    // Pour vous aider, je vous ai laiss� 2 attributs utilisant les autres DTO. A vous de faire le reste
    // n'oubliez pas : aucune logique m�tier ici !!
    public CommandeDTO(int id, double fraisDePort, String status, UtilisateurDTO user, List<LivreDTO> livres) {
        this.id = id;
        this.fraisDePort = fraisDePort;
        this.status = status;
        this.utilisateur = user;
        this.livres = livres;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UtilisateurDTO getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFraisDePort() {
        return fraisDePort;
    }

    public void setFraisDePort(double fraisDePort) {
        this.fraisDePort = fraisDePort;
    }

    public List<LivreDTO> getLivres() {
        return livres;
    }

    public void setLivres(List<LivreDTO> livres) {
        this.livres = livres;
    }
}