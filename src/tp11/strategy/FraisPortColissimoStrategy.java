package tp11.strategy;

import tp11.Commande;
import tp11.dto.LivreDTO;
import tp11.Livre;
import tp11.repository.LivreRepository;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Colissimo
 */
public class FraisPortColissimoStrategy implements FraisPortStrategy {

    private Commande contexte;
    private LivreRepository livreRepository;

    public FraisPortColissimoStrategy(Commande contexte , LivreRepository livreRepository ) {
        this.contexte = contexte;
        this.livreRepository = livreRepository;
    }

    /***
     * Regles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 1kg, fdp = 3€
     * - si le poids total de la commande est compris entre 1kg et 3kg, fdp = 5€
     * - au delà de 3kg, fdp = 15€
     */
    @Override
    public double calculerFraisPort() {
        double poidsTotal = 0;

        List<Livre> livres = contexte.getLivres(livreRepository);
        for (Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }

        if (poidsTotal <= 1) {
            contexte.setFraisDePort(3);
        } else if (poidsTotal <= 3) {
            contexte.setFraisDePort(5);
        } else {
            contexte.setFraisDePort(15);
        }
        return contexte.getFraisDePort();
    }
}
