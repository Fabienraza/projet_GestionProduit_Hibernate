package Dao;

import beans.Produit;

public interface IProduitDao {
	
	public void  create(Produit pr);
	
	public void delete(int id);
}
