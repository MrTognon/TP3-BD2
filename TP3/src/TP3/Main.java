package TP3;

import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    private static Validator validator; // Validateur de contraintes de Bean Validation

    public static void setUpValidator() { // Initialisation du validateur
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); // Création du validateur
        validator = factory.getValidator(); // Récupération du validateur
    }

    public static void main(String[] args) {
        setUpValidator(); // Initialisation du validateur

        Article article = new Article(); // Création d'un nouvel article
        article.setNumSerie("SN-abc123456"); // Numéro de série valide
        article.setDescription("Description");
        article.setQuantite_disponible(10);
        article.setPrix_unitaire(100);

        // Validation de l'article
        Set<ConstraintViolation<Article>> constraintViolations = validator.validate(article);

        if (constraintViolations.isEmpty()) { // Si aucune violation de contrainte n'est détectée
            addArticle(article); // Ajout de l'article
        } else { // Sinon, on affiche les erreurs
            constraintViolations.forEach(violation -> System.out.println(violation.getMessage()));
        }
    }

    // Ajout d'un article dans la base de données
    private static void addArticle(Article article) { 
        SessionFactory sf = HibernateUtil.getSessionFactory(); // Récupération de la session Hibernate
        Session session = sf.openSession(); // Ouverture d'une session Hibernate
        Transaction tx = null; // Déclaration de la transaction

        try { // Ajout de l'article
            tx = session.beginTransaction();
            session.save(article);
            tx.commit();
            System.out.println("Article ajouté avec succès");
        } catch (Exception ex) { // En cas d'erreur, on affiche l'erreur et on annule la transaction
            if (tx != null)
                tx.rollback();
            System.err.println("Erreur lors de l'ajout de l'article: " + ex);
        } finally { // Fermeture de la session
            session.close();
        }
    }
}
