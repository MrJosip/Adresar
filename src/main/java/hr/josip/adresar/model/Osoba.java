package hr.josip.adresar.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Osoba {

	@Id
	@Column
	@GeneratedValue
	private int ID_osoba;
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private Date rodj;
	@Column
	private String email;
	@Column
	private String kucniBr;
	@Column
	private String ulica;
	@Column
	private int postanskiBr;
	
	//-----------------------------------------------------
	 @ManyToOne
	    private Mjesto mjesto;
	 
	//------------------------------------------------------
	 @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="ID_osoba")
	    private Set<Broj> brojevi;
	 //-----------------------------------------------------
	 
	public int getID_osoba() {
		return ID_osoba;
	}
	public void setID_osoba(int iD_osoba) {
		ID_osoba = iD_osoba;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Date getRodj() {
		return rodj;
	}
	public void setRodj(Date rodj) {
		this.rodj = rodj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKucniBr() {
		return kucniBr;
	}
	public void setKucniBr(String kucniBr) {
		this.kucniBr = kucniBr;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public int getPostanskiBr() {
		return postanskiBr;
	}
	public void setPostanskiBr(int postanskiBr) {
		this.postanskiBr = postanskiBr;
	}
	
	
}
