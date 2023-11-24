package tp11.state;


import tp11.Commande;

/**
 * Etat représentant la commande nouvellement créée.
 * Son état suivant est : En cours
 */
public class CommandeNouvelle implements CommandeState {

    @Override
    public void next(Commande commande) {
        commande.setCurrentState(new CommandeEnCours());
    }
}