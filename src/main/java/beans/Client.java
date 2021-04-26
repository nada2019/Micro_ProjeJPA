package beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	private String firstName;
	private String lastName;
	@Column(unique=true)
	private String email;
	private String password;
	private String adress;
	private String ville;
	private int codePostal;
	private int phoneNumber;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Commandes.class,mappedBy="Id")
    private  List<Commandes> Commandes=new ArrayList<Commandes>();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String firstName, String lastName, String email, String password, String adress, String ville,
			int codePostal, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.adress = adress;
		this.ville = ville;
		this.codePostal = codePostal;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", adress=" + adress + ", ville=" + ville + ", codePostal=" + codePostal + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	public List<Commandes> getCommandes() {
		return Commandes;
	}
	public void setCommandes(List<Commandes> commandes) {
		Commandes = commandes;
	}
	
	
	


}
