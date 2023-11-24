package tp11.dto;

import tp11.Livre;

/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
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



