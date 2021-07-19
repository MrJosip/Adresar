package hr.josip.adresar.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Mjesto {

	@Id
	@Column
	private int postanskiBr;
	@Column
	private String mjesto;
	@Column
	private String zupanija;
	@Column
	private String zemlja;
	//-------------------------------------------------------------
	 @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="postanskiBr")
	    private Set<Osoba> osobe;
	 //-------------------------------------------------------------
	public int getPostanskiBr() {
		return postanskiBr;
	}
	public void setPostanskiBr(int postanskiBr) {
		this.postanskiBr = postanskiBr;
	}
	public String getMjesto() {
		return mjesto;
	}
	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}
	public String getZupanija() {
		return zupanija;
	}
	public void setZupanija(String zupanija) {
		this.zupanija = zupanija;
	}
	public String getZemlja() {
		return zemlja;
	}
	public void setZemlja(String zemlja) {
		this.zemlja = zemlja;
	}
	
	
}
