package Dao;



import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import beans.Produit;

public class ProduitDao implements IProduitDao{
	
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();	//
	Session session = factory.openSession();
	

	
	// ajout d'une ligne de produit dans la base de donnée
	@Override
	public int createProd(Produit pr) {
		try {
			session.beginTransaction();
			session.save(pr);
			session.getTransaction().commit();
			System.out.println("insertion réussie");
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	

	//	supprimer une ligne dans la BD à partir de l'ID
	@Override
	public int deleteProd(int id) {
		Produit produit = new Produit();
		produit.setIdProduit(id);

		try {
			session.beginTransaction();
			session.delete(produit);
			session.getTransaction().commit();
			System.out.println("suppression réussie");
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}



	//	affichage liste des produits dans la base de donnée 
//	@Override
//	public String listProd() {
//		session.beginTransaction();
//		SQLQuery requete = session.createSQLQuery("select * from produit_telephone");
//		return requete.toString();
//	}
	
	
	public List<Produit> getProd() {
		List<Produit> listProd = new ArrayList<Produit>();
		try {
			session.beginTransaction();
			SQLQuery query = session.createSQLQuery("select * from produit_telephone");
			query.addEntity(Produit.class);
			listProd = query.list();
			return listProd;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
