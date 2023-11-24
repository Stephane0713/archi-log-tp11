package tp11.state;


import tp11.Commande;

/**
 * Etat représentant la commande en cours.
 * Son état suivant est : Expédiée
 */
public class CommandeEnCours implements CommandeState {

    @Override
    public void next(Commande commande) {
        commande.setStatus("Expédiée");
        commande.setCurrentState(new CommandeExpediee());
    }
}