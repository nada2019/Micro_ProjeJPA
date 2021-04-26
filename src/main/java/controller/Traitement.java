package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.TraitementsClient;



public class Traitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Traitement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String action=request.getParameter("action");
		if(action!=null) {
		if(action.equals("Inscrire")) {
			String nom=request.getParameter("nom");
	    	String pre=request.getParameter("prenom");
	    	String add=request.getParameter("add");
	    	String email=request.getParameter("email");
	    	String pass=request.getParameter("pass");
	    	
	        TraitementsClient trait = new TraitementsClient();
			this.getServletContext().getRequestDispatcher("authen.jsp" ).forward( request, response );

	    	trait.inscription(nom,pre,add,email,pass) ;
			
		}
		else if(action.equals("login")) {
			String email=request.getParameter("email");
	    	String pass=request.getParameter("pass");

	    	TraitementsClient trait = new TraitementsClient();
	    	
			if(trait.authentification(email,pass)==true) {
				HttpSession session=request.getSession();	
				session.setAttribute("email",email);
				session.setAttribute("valnom",trait.getNameByEmail(email));
				this.getServletContext().getRequestDispatcher("accueil.jsp" ).forward( request, response );
				System.out.println("bien");
			}
			else {
				
				this.getServletContext().getRequestDispatcher("authen.jsp" ).forward( request, response );
				System.out.println("fausse");
			}
			
			
		}
		}
	}
}
	
	


