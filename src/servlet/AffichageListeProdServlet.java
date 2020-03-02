package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.IProduitDao;
import Dao.ProduitDao;
import beans.Produit;


@WebServlet("/list")
public class AffichageListeProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
    public AffichageListeProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listeproduits.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProduitDao dao = new ProduitDao();
		List<Produit> prod = dao.getProd();
		request.setAttribute("listeProduit", prod);
		//dao.listProd();
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listeproduits.jsp").forward(request, response);
	}

}
