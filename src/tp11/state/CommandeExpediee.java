package tp11.state;


import tp11.Commande;

/**
 * Etat représentant la commande expédiée.
 * Son état suivant est : Aucun état
 * En revanche on va modifier le status de la commande par : Livrée
 */
public class CommandeExpediee implements CommandeState {

    @Override
    public void next(Commande commande) {
        commande.setStatus("Livrée");
        commande.setCurrentState(null);
    }
}