/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class StavkaReversa implements OpstiDomenskiObjekat {

	private Revers revers;
	private Integer rb;
	private Integer zaduzenaKolicina;
	private Date datumRazduzenja;
	private Integer razduzenaKolicina;
	private MasinaIliAlat masinaIliAlat;

	public StavkaReversa() {
		this.razduzenaKolicina = 0;
	}

	public StavkaReversa(Revers revers, Integer rb, Integer zaduzenaKolicina, Date datumRazduzenja,
			Integer razduzenaKolicina, MasinaIliAlat masinaIliAlat) {
		this.revers = revers;
		this.rb = rb;
		this.zaduzenaKolicina = zaduzenaKolicina;
		this.datumRazduzenja = datumRazduzenja;
		this.razduzenaKolicina = razduzenaKolicina;
		this.masinaIliAlat = masinaIliAlat;
	}

	public Revers getRevers() {
		return revers;
	}

	public void setRevers(Revers revers) {
		this.revers = revers;
	}

	public Integer getRb() {
		return rb;
	}

	public void setRb(Integer rb) {
		this.rb = rb;
	}

	public Integer getZaduzenaKolicina() {
		return zaduzenaKolicina;
	}

	public void setZaduzenaKolicina(Integer zaduzenaKolicina) {
		this.zaduzenaKolicina = zaduzenaKolicina;
	}

	public Date getDatumRazduzenja() {
		return datumRazduzenja;
	}

	public void setDatumRazduzenja(Date datumRazduzenja) {
		this.datumRazduzenja = datumRazduzenja;
	}

	public Integer getRazduzenaKolicina() {
		return razduzenaKolicina;
	}

	public void setRazduzenaKolicina(Integer razduzenaKolicina) {
		this.razduzenaKolicina = razduzenaKolicina;
	}

	public MasinaIliAlat getMasinaIliAlat() {
		return masinaIliAlat;
	}

	public void setMasinaIliAlat(MasinaIliAlat masinaIliAlat) {
		this.masinaIliAlat = masinaIliAlat;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + Objects.hashCode(this.revers);
		hash = 59 * hash + Objects.hashCode(this.rb);
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
		final StavkaReversa other = (StavkaReversa) obj;
		if (!Objects.equals(this.revers, other.revers)) {
			return false;
		}
		if (!Objects.equals(this.rb, other.rb)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Rb:" + rb + ", zaduzenaKolicina:" + zaduzenaKolicina + ", datumRazduzenja:" + datumRazduzenja
				+ ", razduzenaKolicina:" + razduzenaKolicina + ", masinaIliAlat:" + masinaIliAlat + ";";
	}

	@Override
	public String vratiNazivTabele() {
		return "StavkaReversa";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "rb";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return "revers, rb, zaduzenaKolicina, datumRazduzenja, razduzenaKolicina, masinaIliAlat";
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.revers.getBrojReversa()).append(", ").append(this.rb).append(", ").append(this.zaduzenaKolicina)
				.append(this.datumRazduzenja == null ? ", " : ", '")
				.append(this.datumRazduzenja == null ? null : new java.sql.Date(this.getDatumRazduzenja().getTime()))
				.append(this.datumRazduzenja == null ? ", " : "', ").append(this.razduzenaKolicina).append(", ")
				.append(this.masinaIliAlat.getMasinaIliAlatID());
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "r.brojReversa, r.datumIzdavanja, r.radnik, "
				+ "rad.radnikID, rad.ime, rad.prezime, rad.brojTelefona, rad.mejl, rad.radnoMesto, "
				+ "rm.sifraRM, rm.nazivRM, "
				+ "sr.revers, sr.rb, sr.zaduzenaKolicina, sr.datumRazduzenja, sr.razduzenaKolicina, sr.masinaIliAlat, "
				+ "m.masinaIliAlatID, m.naziv, m.kolicinaUMagacinu, m.kolicinaNaZaduzenju";
	}

	@Override
	public String vratiJoinUslov() {
		return "sr inner join Revers r on r.brojReversa=sr.revers " + "inner join Radnik rad on r.radnik=rad.radnikID "
				+ "inner join RadnoMesto rm on rm.sifraRM=rad.radnoMesto "
				+ "inner join MasinaIliAlat m on sr.masinaIliAlat=m.masinaIliAlatID";
	}

	@Override
	public String vratiWhereUslovZaUcitajListu() {
		StringBuilder sb = new StringBuilder();
		sb.append("where sr.revers=").append(this.revers.getBrojReversa());
		return sb.toString();
	}

	@Override
	public String vratiWhereUslovZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("revers=").append(this.revers.getBrojReversa()).append(" and rb=").append(this.rb);
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaSaVrednostimaZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("razduzenaKolicina=").append(this.razduzenaKolicina).append(", ")
				.append(this.datumRazduzenja == null ? "datumRazduzenja=" : "datumRazduzenja='")
				.append(this.datumRazduzenja == null ? null : new java.sql.Date(this.datumRazduzenja.getTime()))
				.append(this.datumRazduzenja == null ? "" : "'");
		return sb.toString();
	}

	@Override
	public String vratiOrderByUslov() {
		return "order by sr.rb asc";
	}

}
