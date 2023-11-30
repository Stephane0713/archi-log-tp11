package tp11.state;


import tp11.Commande;

/**
 * Etat repr�sentant la commande nouvellement cr��e.
 * Son �tat suivant est : En cours
 */
public class CommandeNouvelle implements CommandeState {

    @Override
    public void next(Commande commande) {
        commande.setStatus("Commande créée");
        commande.setCurrentState(new CommandeEnCours());
    }
}