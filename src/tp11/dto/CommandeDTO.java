package tp11.dto;
import java.util.List;


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