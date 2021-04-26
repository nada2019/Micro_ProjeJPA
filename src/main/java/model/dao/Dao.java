package model.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.*;


public class Dao {
	    private Configuration configuration;
	    private SessionFactory sessionFactory;
	    private Session session;
	    private Transaction transaction;
	
	public Dao() {
		
		this.configuration = new Configuration().configure();
     this.sessionFactory = configuration.buildSessionFactory();
	}

	 protected Session getSession() {
     if (session == null) {
         this.session = sessionFactory.openSession();
     }
     return this.session;
 }
 protected Transaction getTransaction() {
     if (this.transaction == null) {
         this.transaction = getSession().beginTransaction();
     }
     if (!this.transaction.isActive()) {
         this.transaction.begin();
     }
     return transaction;
 }
	public void addClient(Client c) {
		try {
         getSession().save(c);
         getTransaction().commit();
     } catch (Exception e) {
         getTransaction().rollback();
     } finally {
         getSession().close();
     }
	   
		
		
	}
	
	
	
	public List<Commandes> getProduitParMc(Client  codeclient) {
    
		  Query query = getSession().createQuery("from Commande where code_client='"+codeclient.getId()+"' ");
	        return query.list();
	}

	
	
	  @SuppressWarnings("deprecation")
	public List<Client> findAll() {
		  Query query = getSession().createQuery("from Client");
	        return query.list();
	    }
		
		public List<Categorie> GetCategorie(){
			 Query query = getSession().createQuery("from Categorie");
		        return query.list();
		}
	
		public List<Article> GetCatalogue(String g){
			 Query query = getSession().createQuery("from Article where categ='"+g+"' ");
		        return query.list();
		}
	
}
