/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Revers implements OpstiDomenskiObjekat {

	private Long brojReversa;
	private Date datumIzdavanja;
	private Radnik radnik;
	private List<StavkaReversa> stavke;

	public Revers() {
		stavke = new ArrayList<>();
	}

	public Revers(Long brojReversa, Date datumIzdavanja, Radnik radnik, List<StavkaReversa> stavke) {
		this.brojReversa = brojReversa;
		this.datumIzdavanja = datumIzdavanja;
		this.radnik = radnik;
		this.stavke = stavke;
	}

	public Long getBrojReversa() {
		return brojReversa;
	}

	public void setBrojReversa(Long brojReversa) {
		this.brojReversa = brojReversa;
	}

	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public Radnik getRadnik() {
		return radnik;
	}

	public void setRadnik(Radnik radnik) {
		this.radnik = radnik;
	}

	public List<StavkaReversa> getStavke() {
		return stavke;
	}

	public void setStavke(List<StavkaReversa> stavke) {
		this.stavke = stavke;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.brojReversa);
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
		final Revers other = (Revers) obj;
		if (!Objects.equals(this.brojReversa, other.brojReversa)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Revers{" + "brojReversa=" + brojReversa + ", datumIzdavanja=" + datumIzdavanja + ", radnik=" + radnik
				+ ", stavke=" + stavke + '}';
	}

	@Override
	public String vratiNazivTabele() {
		return "Revers";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "brojReversa";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return "brojReversa, datumIzdavanja, radnik";
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.brojReversa).append(", '").append(new java.sql.Date(this.getDatumIzdavanja().getTime()))
				.append("', ").append(this.radnik.getRadnikID());
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "r.brojReversa, r.datumIzdavanja, r.radnik, "
				+ "rad.radnikID, rad.ime, rad.prezime, rad.brojTelefona, rad.mejl, rad.radnoMesto, rm.sifraRM, rm.nazivRM";
	}

	@Override
	public String vratiJoinUslov() {
		return "r inner join Radnik rad on r.radnik=rad.radnikID inner join RadnoMesto rm on rad.radnoMesto=rm.sifraRM";
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
		return "order by r.brojReversa asc";
	}

}
