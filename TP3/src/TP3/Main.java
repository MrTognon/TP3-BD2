package TP3;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
  public static void main(String[] args) {
		// Lire les enregistrements existants  
		System.out.println("******* Lecture *******");
		List<Client> clients = list();
		System.out.println("******* Total clients: " + clients.size());
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
