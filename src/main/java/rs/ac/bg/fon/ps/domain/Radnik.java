/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Radnik implements OpstiDomenskiObjekat {

	private Long radnikID;
	private String ime;
	private String prezime;
	private String brojTelefona;
	private String mejl;
	private RadnoMesto radnoMesto;

	public Radnik() {
	}

	public Radnik(Long radnikID, String ime, String prezime, String brojTelefona, String mejl, RadnoMesto radnoMesto) {
		this.radnikID = radnikID;
		this.ime = ime;
		this.prezime = prezime;
		this.brojTelefona = brojTelefona;
		this.mejl = mejl;
		this.radnoMesto = radnoMesto;
	}

	public RadnoMesto getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(RadnoMesto radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public Long getRadnikID() {
		return radnikID;
	}

	public void setRadnikID(Long radnikID) {
		this.radnikID = radnikID;
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

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getMejl() {
		return mejl;
	}

	public void setMejl(String mejl) {
		this.mejl = mejl;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.radnikID);
		return hash;
	}

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
