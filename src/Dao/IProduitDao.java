package Dao;

import java.util.List;

import beans.Produit;

public interface IProduitDao {
	
	public int  createProd(Produit pr);
	public int deleteProd(int id);
	//public String listProd();
	
	public List<Produit> getProd();
}


