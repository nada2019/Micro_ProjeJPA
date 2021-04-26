package model.dao;

import java.util.List;

import beans.Client;
import beans.Commandes;

public class TraitementsClient {
	
public boolean  authentification(String email,String pass) {
		
		Dao g= new Dao();
		List<Client> list=g.findAll();
		  for (Client client : list) {
			  
				if((client.getEmail()).equals(email) && (client.getPassword()).equals(pass)){
					
					
					return true;
				}
			  
			  
		  }
		return false;
	}
	
     public String getNameByEmail(String email) {
    	
    	Dao g= new Dao();
 		List<Client> list=g.findAll();
 		  for (Client client : list) {
 			  
 				if((client.getEmail()).equals(email)){
 					
 					return client.getFirstName();
 				}
 			  
 			  
 		  }
		return null;
	}
	
     
     public Client getClientByEmail(String email) {
     	
    	Dao g= new Dao();
 		List<Client> list=g.findAll();
 		  for (Client client : list) {
 			  
 				if((client.getEmail()).equals(email)){
 					
 					return client;
 				}
 			  
 			  
 		  }
		return null;
	}
	public void inscription(String nom,String prenom,String address,String email,String pass) {

		Dao g= new Dao();
		Client c=new Client();
		
	    
		
		
		c.setFirstName(nom);
		c.setLastName(prenom);
		c.setAdress(address);
		c.setEmail(email);
		c.setPassword(pass);
		
		
		g.addClient(c);
		 
	}
	
	
	public List<Commandes> commandes(Client c){
		Dao g= new Dao();
		List<Commandes> l=g.getProduitParMc(c);
		return l;
		
	}


}
