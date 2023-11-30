package tp11.adapter;

import tp11.dto.CommandeDTO;
import tp11.dto.LivreDTO;

/*****************************************************************************
 * Ici on souhaite adapter notre Commande, et plus particulièrement la
 * version DTO (légère) de notre Commande afin d'utiliser un service externe qui
 * ne connait pas nos objets.
 * Ce service externe (ici représenté par EmailService, une classe simulant l'envoi d'un email)
 * ne peut pas prendre en paramètre un objet DTO et ne peut fonctionner qu'avec des String
 * (voyez celà comme une API). A vous d'écrire un adaptateur permettant de passer d'un
 * CommandeDTO au service. Regardez le Main pour bien comprendre ce que vous devez envoyer exactement comme
 * textes au service d'emails.
 */
public class EmailNotificationAdapter implements NotificationService {
    private EmailService emailService;

    public EmailNotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void envoyerNotification(CommandeDTO commande) {
        String userEmail = commande.getUtilisateur().getEmail();
        String subject = "Notification de commande";
        StringBuilder builder = new StringBuilder().append("Votre commande ").append(commande.getId())
                .append(" vient de passer dans l'état : ").append(commande.getStatus()).append("\n")
                .append("Récapitulatif de la commande : \n")
                .append("Frais de port : ").append(commande.getFraisDePort()).append("€").append("\n");
        commande.getLivres().forEach(livre -> builder.append("• ").append(livre.getTitre()).append("\n"));

        String body = builder.toString();
        emailService.envoyerEmail(userEmail, subject, body);
    }
}
