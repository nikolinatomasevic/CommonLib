/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Objects;

/**
 * Predstavlja radnika koji ima svoj ID, ime, prezime, broj telefona, mejl i radno mesto.
 *
 * @author nikolinatomasevic
 */
public class Radnik implements OpstiDomenskiObjekat {

	/**
	 * ID radnika
	 */
	private Long radnikID;
	/**
	 * Ime radnika.
	 */
	private String ime;
	/**
	 * Prezime radnika
	 */
	private String prezime;
	/**
	 * Broj telefona radnika
	 */
	private String brojTelefona;
	/**
	 * Mejl radnika
	 */
	private String mejl;
	/**
	 * Radno mesto radnika
	 */
	private RadnoMesto radnoMesto;

	/**
	 * Inicijalizuje novog radnika.
	 */
	public Radnik() {
	}

	/**
	 * Postavlja ID, ime, prezime, broj telefona, mejl i radno mesto radnika na unete vrednosti.
	 * 
	 * @param radnikID novi ID radnika
	 * @param ime novo ime radnika
	 * @param prezime novo prezime radnika
	 * @param brojTelefona novi broj telefona radnika
	 * @param mejl novi mejl radnika
	 * @param radnoMesto novo radno mesto radnika
	 */
	public Radnik(Long radnikID, String ime, String prezime, String brojTelefona, String mejl, RadnoMesto radnoMesto) {
		setRadnikID(radnikID);
		setIme(ime);
		setPrezime(prezime);
		setBrojTelefona(brojTelefona);
		setMejl(mejl);
		setRadnoMesto(radnoMesto);
	}

	/**
	 * Vraca radno mesto radnika.
	 * 
	 * @return radno mesto radnika kao objekat tipa RadnoMesto
	 */
	public RadnoMesto getRadnoMesto() {
		return radnoMesto;
	}

	/**
	 * Postavlja novu vrednost za atribut radno mesto radnika.
	 * 
	 * @param radnoMesto novo radno mesto radnika
	 */
	public void setRadnoMesto(RadnoMesto radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	/**
	 * Vraca ID radnika.
	 * 
	 * @return ID radnika kao ceo broj tipa Long
	 */
	public Long getRadnikID() {
		return radnikID;
	}

	/**
	 * Postavlja novu vrednost za atribut ID radnika.
	 * 
	 * @param radnikID novi ID radnika
	 */
	public void setRadnikID(Long radnikID) {
		this.radnikID = radnikID;
	}

	/**
	 * Vraca ime radnika.
	 * 
	 * @return ime radnika kao String
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * Postavlja novu vrednost za atribut ime radnika.
	 * 
	 * @param ime novo ime radnika
	 * @throws java.lang.NullPointerException u slucaju da je uneto ime null
	 */
	public void setIme(String ime) {
		if (ime == null) {
			throw new NullPointerException("Polje 'ime' radnika ne sme biti prazno!\n");
		}
		this.ime = ime;
	}

	/**
	 * Vraca prezime radnika.
	 * 
	 * @return prezime radnika kao String
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * Postavlja novu vrednost za atribut prezime radnika.
	 * 
	 * @param prezime novo prezime radnika
	 * @throws java.lang.NullPointerException u slucaju da je uneto prezime null
	 */
	public void setPrezime(String prezime) {
		if (prezime == null) {
			throw new NullPointerException("Polje 'prezime' radnika ne sme biti prazno!\n");
		}
		this.prezime = prezime;
	}

	/**
	 * Vraca broj telefona radnika.
	 * 
	 * @return broj telefona radnika kao String
	 */
	public String getBrojTelefona() {
		return brojTelefona;
	}

	/**
	 * Postavlja novu vrednost za atribut broj telefona radnika.
	 * 
	 * @param brojTelefona novi broj telefona radnika
	 */
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	/**
	 * Vraca mejl radnika.
	 * 
	 * @return mejl radnika kao String
	 */
	public String getMejl() {
		return mejl;
	}

	/**
	 * Postavlja novu vrednost za atribut mejl radnika.
	 * 
	 * @param mejl novi mejl radnika
	 * @throws java.lang.NullPointerException u slucaju da je uneti mejl null
	 * @throws java.lang.IllegalArgumentException u slucaju da je uneti mejl prazan String
	 */
	public void setMejl(String mejl) {
		if (mejl == null) {
			throw new NullPointerException("Polje 'mejl' radnika ne sme biti prazno!\n");
		}
		if (mejl.isEmpty()) {
			throw new IllegalArgumentException("Polje 'mejl' radnika ne sme biti prazno!\n");
		}
		this.mejl = mejl;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.radnikID);
		return hash;
	}

	/**
	 * Poredi dva radnika po ID-u.
	 * 
	 * @return
	 * <ul>
	 * <li>true - ako je ID isti za oba radnika</li>
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
		final Radnik other = (Radnik) obj;
		if (!Objects.equals(this.radnikID, other.radnikID)) {
			return false;
		}
		return true;
	}

	/**
	 * Vraca String koji sadrzi ime i prezime radnika.
	 * 
	 * @return String koji sadrzi ime i prezime radnika
	 */
	@Override
	public String toString() {
		return ime + " " + prezime;
	}

	@Override
	public String vratiNazivTabele() {
		return "Radnik";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return "radnikID, ime, prezime, brojTelefona, mejl, radnoMesto";
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.radnikID).append(", '").append(this.ime).append("', '").append(this.prezime)
				.append(this.brojTelefona == null ? "', " : "', '")
				.append(this.brojTelefona == null ? null : this.brojTelefona)
				.append(this.brojTelefona == null ? ", '" : "', '").append(this.mejl).append("', ")
				.append(this.radnoMesto.getSifraRM());
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "r.radnikID, r.ime, r.prezime, r.brojTelefona, r.mejl, r.radnoMesto, rm.sifraRM, rm.nazivRM";
	}

	@Override
	public String vratiJoinUslov() {
		return "r inner join RadnoMesto rm on r.radnoMesto = rm.sifraRM";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "radnikID";
	}

	@Override
	public String vratiWhereUslovZaUcitajListu() {
		return "";
	}

	@Override
	public String vratiWhereUslovZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("radnikID=").append(this.radnikID);
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaSaVrednostimaZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("ime='").append(this.ime).append("', ").append("prezime='").append(this.prezime).append("', ")
				.append(this.brojTelefona == null ? "brojTelefona=" : "brojTelefona='").append(this.brojTelefona)
				.append(this.brojTelefona == null ? ", " : "', ").append("mejl='").append(this.mejl).append("', ")
				.append("radnoMesto=").append(this.radnoMesto.getSifraRM());
		return sb.toString();
	}

	@Override
	public String vratiOrderByUslov() {
		return "";
	}

}
