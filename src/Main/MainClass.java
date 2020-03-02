package Main;

import java.util.ArrayList;
import java.util.List;

import Dao.ProduitDao;
import beans.Produit;

public class MainClass {

	public static void main(String[] args) {
		
		Produit prod = new Produit("galaxy S10", "Telephone de la marque Samsung");
		Produit prod1 = new Produit("iPhone 5S", "Produit Apple");
		
		ProduitDao dao = new ProduitDao();
		
		//Ajout d'une ligne de produit dans la base de donnée
//		dao.createProd(prod);
//		dao.createProd(prod1);
		
		
		//Suppression d'une ligne dans la base de donnée
//		dao.deleteProd(1);
		
		List<Produit> produit = dao.getProd();
		
		System.out.println(produit);

		
	}

}
