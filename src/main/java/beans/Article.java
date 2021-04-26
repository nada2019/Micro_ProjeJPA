package beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Article {
	 
	 @Id
     private int codeArt;
     private String desig;
     private double prix;
     private int stock;
     private byte photo;
     private String  categ;
     @Embedded
     private LineCommande line;
     
     
	public Article(int codeArt, String desig, double prix, int stock, byte photo, String categ, LineCommande line) {
		super();
		this.codeArt = codeArt;
		this.desig = desig;
		this.prix = prix;
		this.stock = stock;
		this.photo = photo;
		this.categ = categ;
		this.line = line;
	}
	
	
	@Override
	public String toString() {
		return "Article [codeArt=" + codeArt + ", desig=" + desig + ", prix=" + prix + ", stock=" + stock + ", photo="
				+ photo + ", categ=" + categ + ", line=" + line + "]";
	}


	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(int codeArt) {
		this.codeArt = codeArt;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public byte getPhoto() {
		return photo;
	}
	public void setPhoto(byte photo) {
		this.photo = photo;
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public LineCommande getLine() {
		return line;
	}
	public void setLine(LineCommande line) {
		this.line = line;
	}
     
     

}
