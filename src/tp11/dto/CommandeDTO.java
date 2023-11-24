package tp11.dto;
import java.util.List;


/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class CommandeDTO implements TransferableObject{
    private List<LivreDTO> livres;
    private UtilisateurDTO utilisateur ;
    // A vous de d�finir les attributs, le constructeur et les getters/setters
    // Pour vous aider, je vous ai laiss� 2 attributs utilisant les autres DTO. A vous de faire le reste
    // n'oubliez pas : aucune logique m�tier ici !!
}