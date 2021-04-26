package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
	 
	    @Id
		private int ref;
	    @Column
		private String cat;
		
		
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Categorie(int ref, String cat) {
			super();
			this.ref = ref;
			this.cat = cat;
		}
		public int getRef() {
			return ref;
		}
		public void setRef(int ref) {
			this.ref = ref;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
		
		

}
