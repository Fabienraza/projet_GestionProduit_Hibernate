package Main;

import Dao.ProduitDao;
import beans.Produit;

public class MainClass {

	public static void main(String[] args) {
		
		Produit prod = new Produit(123, "galaxy S10", "Telephone de la marque Samsung");
		Produit prod1 = new Produit(456, "iPhone 5S", "Produit Apple");
		
		ProduitDao dao = new ProduitDao();
		
//		dao.create(prod);
//		dao.create(prod1);
		
		
		//Suppression d'une ligne dans la base de donnée
		dao.delete(prod1);

		

	}

}
