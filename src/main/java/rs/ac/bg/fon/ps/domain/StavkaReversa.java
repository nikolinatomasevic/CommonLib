/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Date;
import java.util.Objects;

/**
 * Predstavlja stavku reversa koja ima svoj redni broj, zaduzenu kolicinu, datum razduzenja, razduzenu kolicinu i masinu ili alat na koji se odnosi.
 * Jedna stavka reversa se odnosi na jednu masinu ili alat.
 *
 * @author ACER
 */
public class StavkaReversa implements OpstiDomenskiObjekat {

	/**
	 * Revers kome pripada ta stavka reversa
	 */
	private Revers revers;
	/**
	 * Redni broj stavke reversa u reversu
	 */
	private Integer rb;
	/**
	 * Zaduzena kolicina masine ili alata iz te stavke reversa
	 */
	private Integer zaduzenaKolicina;
	/**
	 * Datum razduzenja celokupne zaduzene kolicine masine ili alata stavke reversa
	 */
	private Date datumRazduzenja;
	/**
	 * Razduzena kolicina stavke reversa
	 */
	private Integer razduzenaKolicina;
	/**
	 * Masina ili alat na koju se odnosi stavka reversa
	 */
	private MasinaIliAlat masinaIliAlat;

	/**
	 * Postavlja razduzenu kolicinu na 0 za novu stavku reversa.
	 */
	public StavkaReversa() {
		this.razduzenaKolicina = 0;
	}

	/**
	 * Postavlja revers, redni broj, zaduzenu kolicinu, datum razduzenja, razduzenu kolicinu i masinu ili alat na unete vrednosti.
	 * 
	 * @param revers novi revers
	 * @param rb novi redni broj stavke reversa
	 * @param zaduzenaKolicina nova razduzena kolicina stavke reversa
	 * @param datumRazduzenja novi datum razduzenja stavke reversa
	 * @param razduzenaKolicina nova razduzena kolicina stavke reversa
	 * @param masinaIliAlat nova masina ili alat na koju se odnosi stavka reversa
	 */
	public StavkaReversa(Revers revers, Integer rb, Integer zaduzenaKolicina, Date datumRazduzenja,
			Integer razduzenaKolicina, MasinaIliAlat masinaIliAlat) {
		this.revers = revers;
		this.rb = rb;
		this.zaduzenaKolicina = zaduzenaKolicina;
		this.datumRazduzenja = datumRazduzenja;
		this.razduzenaKolicina = razduzenaKolicina;
		this.masinaIliAlat = masinaIliAlat;
	}

	/**
	 * Vraca revers kome pripada ta stavka reversa.
	 * 
	 * @return revers kome pripada ta stavka reversa kao objekat tipa Revers
	 * @see Revers
	 */
	public Revers getRevers() {
		return revers;
	}

	/**
	 * Postavlja novu vrednost za atribut revers kome pripada ta stavka reversa.
	 * 
	 * @param revers novi revers kome pripada ta stavka reversa
	 */
	public void setRevers(Revers revers) {
		this.revers = revers;
	}

	/**
	 * Vraca redni broj stavke reversa.
	 * 
	 * @return redni broj stavke reversa kao ceo broj
	 */
	public Integer getRb() {
		return rb;
	}

	/**
	 * Postavlja novu vrednost za atribut redni broj stavke reversa.
	 * 
	 * @param rb novi redni broj stavke reversa
	 */
	public void setRb(Integer rb) {
		this.rb = rb;
	}

	/**
	 * Vraca zaduzenu kolicinu stavke reversa.
	 * 
	 * @return zaduzena kolicina stavke reversa kao ceo broj
	 */
	public Integer getZaduzenaKolicina() {
		return zaduzenaKolicina;
	}

	/**
	 * Postavlja novu vrednost za atribut zaduzena kolicina stavke reversa.
	 * 
	 * @param zaduzenaKolicina nova zaduzena kolicina stavke reversa
	 */
	public void setZaduzenaKolicina(Integer zaduzenaKolicina) {
		this.zaduzenaKolicina = zaduzenaKolicina;
	}

	/**
	 * Vraca datum razduzenja stavke reversa.
	 * 
	 * @return datum razduzenja stavke reversa
	 */
	public Date getDatumRazduzenja() {
		return datumRazduzenja;
	}

	/**
	 * Postavlja novu vrednost za atribut datum razduzenja stavke reversa.
	 * 
	 * @param datumRazduzenja novi datum razduzenja stavke reversa
	 */
	public void setDatumRazduzenja(Date datumRazduzenja) {
		this.datumRazduzenja = datumRazduzenja;
	}

	/**
	 * Vraca razduzenu kolicinu stavke reversa.
	 * 
	 * @return razduzena kolicina stavke reversa kao ceo broj
	 */
	public Integer getRazduzenaKolicina() {
		return razduzenaKolicina;
	}

	/**
	 * Postavlja novu vrednost za atribut razduzena kolicina stavke reversa.
	 * 
	 * @param razduzenaKolicina nova razduzena kolicina stavke reversa
	 */
	public void setRazduzenaKolicina(Integer razduzenaKolicina) {
		this.razduzenaKolicina = razduzenaKolicina;
	}

	/**
	 * Vraca masinu ili alat stavke reverse.
	 * 
	 * @return masina ili alat stavke reversa tipa MasinaIliAlat
	 */
	public MasinaIliAlat getMasinaIliAlat() {
		return masinaIliAlat;
	}

	/**
	 * Postavlja novu vrednost za atribut masina ili alat stavke reversa.
	 * 
	 * @param masinaIliAlat nova masina ili alat stavke reversa
	 */
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

	/**
	 * Poredi dve stavke reversa po reversu kome pripada ta stavka i rednom broju.
	 * 
	 * @return
	 * <ul>
	 * <li>true - ako je revers kome pripada ta stavka i redni broj stavke isti za obe stavke reversa</li>
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
		final StavkaReversa other = (StavkaReversa) obj;
		if (!Objects.equals(this.revers, other.revers)) {
			return false;
		}
		if (!Objects.equals(this.rb, other.rb)) {
			return false;
		}
		return true;
	}

	/**
	 * Vraca String sa podacima o rednom broju, zaduzenoj kolicini, datumu razduzenja, razduzenoj kolicini i masini ili alatu stavke reversa.
	 * 
	 * @return String sa podacima o rednom broju, zaduzenoj kolicini, datumu razduzenja, razduzenoj kolicini i masini ili alatu stavke reversa
	 */
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
