/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Objects;

/**
 * Predstavlja radno mesto radnika u firmi koje ima svoju sifru i naziv.
 *
 * @author ACER
 */
public class RadnoMesto implements OpstiDomenskiObjekat {

	/**
	 * Sifra radnog mesta
	 */
	private Long sifraRM;
	/**
	 * Naziv radnog mesta
	 */
	private String nazivRM;

	/**
	 * Inicijalizuje novo radno mesto.
	 */
	public RadnoMesto() {
	}

	/**
	 * Postavlja sifru i ime radnog mesta na unete vrednosti.
	 * @param sifraRM nova sifra radnog mesta
	 * @param nazivRM novi naziv radnog mesta
	 */
	public RadnoMesto(Long sifraRM, String nazivRM) {
		this.sifraRM = sifraRM;
		this.nazivRM = nazivRM;
	}

	/**
	 * Vraca sifru radnog mesta.
	 * 
	 * @return sifra radnog mesta kao ceo broj tipa Long
	 */
	public Long getSifraRM() {
		return sifraRM;
	}

	/**
	 * Postavlja novu vrednost za atribut sifra radnog mesta.
	 * 
	 * @param sifraRM nova sifra radnog mesta
	 */
	public void setSifraRM(Long sifraRM) {
		this.sifraRM = sifraRM;
	}

	/**
	 * Vraca naziv radnog mesta.
	 * 
	 * @return naziv radnog mesta kao String
	 */
	public String getNazivRM() {
		return nazivRM;
	}

	/**
	 * Postavlja novu vrednost za atribut naziv radnog mesta.
	 * 
	 * @param nazivRM novi naziv radno mesta
	 */
	public void setNazivRM(String nazivRM) {
		this.nazivRM = nazivRM;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + Objects.hashCode(this.sifraRM);
		return hash;
	}

	/**
	 * Poredi dva radna mesta po sifri.
	 * 
	 * @return
	 * <ul>
	 * <li>true - ako je sifra ista za oba radna mesta</li>
	 * <li>false - ako to nije slucaj</li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final RadnoMesto other = (RadnoMesto) obj;
		if (!Objects.equals(this.sifraRM, other.sifraRM)) {
			return false;
		}
		return true;
	}

	/**
	 * Vraca String koji sadrzi naziv radnog mesta.
	 * 
	 * @return String koji sadrzi naziv radnog mesta
	 */
	@Override
	public String toString() {
		return nazivRM;
	}

	@Override
	public String vratiNazivTabele() {
		return "RadnoMesto";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return null;
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		return null;
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "sifraRM, nazivRM";
	}

	@Override
	public String vratiJoinUslov() {
		return "";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "sifraRM";
	}

	@Override
	public String vratiWhereUslovZaUcitajListu() {
		return "";
	}

	@Override
	public String vratiWhereUslovZaPromeni() {
		return "";
	}

	@Override
	public String vratiNaziveKolonaSaVrednostimaZaPromeni() {
		return "";
	}

	@Override
	public String vratiOrderByUslov() {
		return "order by sifraRM asc";
	}

}
