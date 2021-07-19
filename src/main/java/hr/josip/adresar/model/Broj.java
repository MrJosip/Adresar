package hr.josip.adresar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Broj {
	@Id
	@Column
	private String broj;
	
	@Column
	private int iD_osoba;
	
	@Column
	private String tip;
	
	//---------------------------------------- 
	 @ManyToOne
	    private Osoba osoba;
	//----------------------------------------
	 
	public int getiD_osoba() {
		return iD_osoba;
	}
	public void setID_osoba(int iD_osoba) {
		this.iD_osoba = iD_osoba;
	}
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}

	
}
