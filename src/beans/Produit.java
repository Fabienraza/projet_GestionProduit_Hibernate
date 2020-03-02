package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 				// pour cr�er une table Correspondant � la clase dans la base de donn�e
@Table(name="Produit_Telephone")		//Pour sp�cifier le nom de la table dans la base de donn�e


public class Produit {
	@Id					// pour d�finir que l'attribut idProduit correspond � la cl� primaire
	@GeneratedValue 		// auto-incrementation de l'Id
	private int idProduit;
	
	private String nomproduit;
	
	@Transient			// Pour sp�cifier qu'un ne cr�e pas une colonne description dans la base de donn�e 
	private String description;
	
	
	
	
	public Produit() {

	}
	

	public Produit(int idProduit, String nomproduit, String description) {
		super();
		this.idProduit = idProduit;
		this.nomproduit = nomproduit;
		this.description = description;
	}





	public int getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}


	public String getNomproduit() {
		return nomproduit;
	}


	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
