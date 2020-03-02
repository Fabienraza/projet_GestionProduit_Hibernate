package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 				// pour créer une table Correspondant à la clase dans la base de donnée
@Table(name="Produit_Telephone")		//Pour spécifier le nom de la table dans la base de donnée


public class Produit {
	@Id					// pour définir que l'attribut idProduit correspond à la clé primaire
	@GeneratedValue 		// auto-incrementation de l'Id
	private int idProduit;
	
	private String nomproduit;
	
	@Transient			// Pour spécifier qu'un ne crée pas une colonne description dans la base de donnée 
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
