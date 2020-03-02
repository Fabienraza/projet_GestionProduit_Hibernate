package Dao;

import javax.management.Query;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import beans.Produit;

public class ProduitDao implements IProduitDao{
	
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();	//
	Session session = factory.openSession();
	

	@Override
	public void create(Produit pr) {

		session.beginTransaction();
		session.save(pr);
		session.getTransaction().commit();
		System.out.println("insertion réussie");
	}

	//supprimer une ligne dans la BD à partir de l'ID
	
	@Override
	public void delete(int id) {
		session.beginTransaction();
		

		System.out.println("suppression réussie");
	}
	


}
