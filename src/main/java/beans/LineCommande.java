package beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LineCommande {
	@Column
	private int numcommande;
	@Column
	private int codeArticle;
	@Column
	private int qtrCde;
	
	
	public LineCommande(int numcommande, int codeArticle, int qtrCde) {
		super();
		this.numcommande = numcommande;
		this.codeArticle = codeArticle;
		this.qtrCde = qtrCde;
	}
	public int getNumcommande() {
		return numcommande;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande = numcommande;
	}
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public int getQtrCde() {
		return qtrCde;
	}
	public void setQtrCde(int qtrCde) {
		this.qtrCde = qtrCde;
	}
	
	

}
