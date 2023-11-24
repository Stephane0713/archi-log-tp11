package tp11;

import tp11.dto.CommandeDTO;
import tp11.dto.Entity;
import tp11.repository.LivreRepository;
import tp11.state.CommandeState;
import tp11.strategy.FraisPortStrategy;

import java.util.ArrayList;
import java.util.List;

/******************************************************************
 * Il s'agit d'une entité (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique métier.
 * Cet objet propose une méthode toDTO() qui fournira la version légère
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Commande implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private Utilisateur utilisateur;
    private String status;
    private CommandeState currentState = null ; // état actuel de la commande
    private double fraisDePort ;


    // TODO à vous d'écrire les getters/setters, le(s) constructeur(s) et tout ce dont vous aurez besoin notamment pour le lazy loading
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
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

    public CommandeState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CommandeState currentState) {
        this.currentState = currentState;
    }

    public Commande() {
        this.status = "Nouvelle";
    }

    // Attributs liés au LazyLoading
    private List<Integer> livreIds = new ArrayList<>();
    private transient List<Livre> livres; // Chargé à la demande

    /**
     * Dans cette implémentation, addLivreId() ajoute simplement l'ID d'un livre à la liste livreIds. Lorsque getLivres()
     * est appelé, il utilise cette liste pour charger les livres correspondants depuis le LivreRepository, en implémentant ainsi le lazy loading.
     * Les livres sont chargés uniquement lors de la première invocation de getLivres(), et les appels ultérieurs retournent la liste déjà chargée.
     */
    public void addLivreId(int livreId) {
        // TODO à coder
        livreIds.add(livreId);
    }
    public List<Livre> getLivres(LivreRepository repo) {
        // TODO à coder
        if (livres == null) {
            livres = new ArrayList<>();
            for (Integer id : livreIds) {
                Livre livre = repo.findById(id);
                if (livre != null) {
                    livres.add(livre);
                }
            }
        }
        return new ArrayList<>(livres);
    }
    // Fin Lazyloading


    // Pattern Strategy
    public double calculerFraisDePort(FraisPortStrategy strategy)
    {
        // TODO à coder
        return strategy.calculerFraisPort();
    }

    // Pattern State
    public void etatSuivant()
    {
        // TODO à coder
    }
    public CommandeDTO toDTO() {
        // TODO à coder
       return null;
        }

}