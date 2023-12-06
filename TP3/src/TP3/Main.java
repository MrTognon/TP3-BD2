package TP3;
import java.util.List;
import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	private static Validator validator;
	
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
	
  public static void main(String[] args) {
    // Lire les enregistrements existants  
    //System.out.println("******* Lecture *******");
    //List<Client> clients = list();
    //System.out.println("******* Total clients: " + clients.size());
	  
	  setUpValidator();

    Article article = new Article();
    article.setNumSerie("SN-abc123456");
    article.setDescription("Description");
    article.setQuantite_disponible(10);
    article.setPrix_unitaire(100);
    
    Set<ConstraintViolation<Article>> constraintViolations =
            validator.validate(article);

    if (constraintViolations.isEmpty()) {
        addArticle(article);
    } else {
        // Gérez ou imprimez les violations de contrainte ici
        constraintViolations.forEach(violation -> System.out.println(violation.getMessage()));
    }
  }

  private static void addArticle(Article article) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    Transaction tx = null;

    try {
        tx = session.beginTransaction();
        session.save(article); // La validation se produit ici
        tx.commit();
        System.out.println("Article ajouté avec succès");
    } catch (Exception ex) {
        // Gestion des autres exceptions
        if (tx != null) tx.rollback();
        System.err.println("Erreur lors de l'ajout de l'article: " + ex);
    } finally {
        session.close();
    }
  }

  private static List<Client> list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    try {
	      System.out.println("Before list");
	      
	      List<Client> clients = session.createQuery("from Client", Client.class).getResultList();
	      
	      System.out.println("After list");
	      
	      session.close();
	      return clients;
	      
	    } catch (Exception ex) {
	        session.close();
	        System.err.println("Initial SessionFactory creation failed." + ex);
	        return null; //(List<Client>) new HashSet<Client>();
	    }
	}
}
