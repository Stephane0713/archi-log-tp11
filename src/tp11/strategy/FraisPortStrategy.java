package tp11.strategy;

/********************************************
 * L'utilisateur peut choisir plusieurs modes de livraison, ici repr�sent�es par des strat�gies.
 * On vous demandera d'en impl�menter deux :
 * - Colissimo
 * - Mondial Relay
 * Le but de chaque strat�gie est de calculer les frais de port de la commande en fonction de son poids.
 * Le d�tail du calcul est fourni dans chaque classe d'impl�mentation
 */
public interface FraisPortStrategy {
    double calculerFraisPort();
}

