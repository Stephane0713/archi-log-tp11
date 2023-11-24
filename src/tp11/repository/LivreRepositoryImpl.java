package tp11.repository;

import tp11.Livre;

import java.util.ArrayList;
import java.util.List;


/**
 * Implémentation simulée du repository (pas de base de données réelle)
 * Dans une application réelle, le repository sera responsable de la
 * persistance et donc de la connexion/gestion de la base de données.
 */


public class LivreRepositoryImpl implements LivreRepository {
    private final List<Livre> livres;

    public LivreRepositoryImpl() {
          this.livres = new ArrayList<Livre>();
    }

    @Override
    public Livre findById(int id) {
        return this.livres.stream().filter(livre -> id == livre.getId())
                .findAny()
                .orElse(null);
    }

    @Override
    public List<Livre> findAll() {
        return livres;
    }

    @Override
    public void save(Livre livre) {
        livres.add(livre);
    }
}