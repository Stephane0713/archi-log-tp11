package tp11.dto;

import tp11.Livre;

/********************************************************
 * Les DTO sont des objets simplifiés représentant l'état
 * (les attributs) d'un objet complexe, dont on a retiré
 * toute logique métier. De ce fait, les DTO deviennent
 * des objets plus faciles à sérializer et plus légers
 **********************************************************/
public class LivreDTO  implements TransferableObject{
    private String titre;

    public LivreDTO(Livre livre) {
        this.titre = livre.getTitre();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}



