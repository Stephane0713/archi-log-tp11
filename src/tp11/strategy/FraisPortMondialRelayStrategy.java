package tp11.strategy;

import tp11.Commande;
import tp11.Livre;
import tp11.dto.LivreDTO;
import tp11.repository.LivreRepository;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Mondial Relay
 */
public class FraisPortMondialRelayStrategy implements FraisPortStrategy {

    private Commande contexte;
    private LivreRepository livreRepository;

    // TODO à vous de déterminer s'il y a besoin d'attributs

    public FraisPortMondialRelayStrategy(Commande contexte , LivreRepository livreRepository) {
        this.contexte = contexte;
        this.livreRepository = livreRepository;
    }

    /***
     * Regles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 3kg, fdp = 4€
     * - au delà de 3kg, fdp = 8€
     */
    @Override
    public double calculerFraisPort() {
        double poidsTotal = 0;

        List<Livre> livres = contexte.getLivres(livreRepository);
        for (Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }

        if (poidsTotal <= 3) {
            return 4;
        } else {
            return 8;
        }
    }
}
