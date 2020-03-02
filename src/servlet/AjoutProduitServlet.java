package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.IProduitDao;
import Dao.ProduitDao;
import beans.Produit;


@WebServlet("/add")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AjoutProduitServlet() {
        super();
    }


    
    
    // Affichage de page formulaire
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/formulaire.jsp").forward(request,response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit prod = new Produit();
		prod.setNomproduit(request.getParameter("name"));
		prod.setDescription(request.getParameter("description"));
		
		IProduitDao dao = new ProduitDao();
		
		int i = dao.createProd(prod);
		if(i==1)
			{
			request.setAttribute("msg", "This product was created successfuly");
			}
		else
			{
			request.setAttribute("msg", "Error...");
			}	
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/produits.jsp").forward(request, response);
	}

}
