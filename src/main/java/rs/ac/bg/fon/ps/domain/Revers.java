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
 * Predstavlja revers koji ima svoj broj, datum izdavanja, radnika na koga se odnosi i listu stavki.
 * Revers se odnosi na samo jednog radnika koji moze zaduziti vise masina ili alata.
 *
 * @author nikolinatomasevic
 */
public class Revers implements OpstiDomenskiObjekat {

	/**
	 * Jedinstveni broj reversa
	 */
	private Long brojReversa;
	/**
	 * Datum izdavanja reversa
	 */
	private Date datumIzdavanja;
	/**
	 * Radnik na koga se odnosi taj revers
	 */
	private Radnik radnik;
	/**
	 * Lista stavki reversa
	 * @see StavkaReversa
	 */
	private List<StavkaReversa> stavke;

	/**
	 * Inicijalizuje novi revers.
	 */
	public Revers() {
		stavke = new ArrayList<>();
	}

	/**
	 * Postavlja broj reversa, datum izdavanja, radnika i stavke reversa na unete vrednosti.
	 * 
	 * @param brojReversa novi broj reversa
	 * @param datumIzdavanja novi datum izdavanja reversa
	 * @param radnik novi radnik na koga se odnosi revers
	 * @param stavke nova lista stavki reversa
	 */
	public Revers(Long brojReversa, Date datumIzdavanja, Radnik radnik, List<StavkaReversa> stavke) {
		setBrojReversa(brojReversa);
		setDatumIzdavanja(datumIzdavanja);
		setRadnik(radnik);
		setStavke(stavke);
	}

	/**
	 * Vraca broj reversa.
	 * 
	 * @return broj reversa kao ceo broj tipa Long
	 */
	public Long getBrojReversa() {
		return brojReversa;
	}

	/**
	 * Postavlja novu vrednost za atribut broj reversa.
	 * 
	 * @param brojReversa novi broj reversa
	 */
	public void setBrojReversa(Long brojReversa) {
		this.brojReversa = brojReversa;
	}

	/**
	 * Vraca datum izdavanja reversa.
	 * 
	 * @return datum izdavanja reversa
	 */
	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	/**
	 * Postavlja novu vrednost za atribut datum izdavanja reversa.
	 * 
	 * @param datumIzdavanja novi datum izdavanja reversa
	 * @throws java.lang.NullPointerException u slucaju da je uneti datum izdavanja null
	 */
	public void setDatumIzdavanja(Date datumIzdavanja) {
		if (datumIzdavanja == null) {
			throw new NullPointerException("Polje 'datum izdavanja' reversa ne sme biti prazno!\n");
		}
		this.datumIzdavanja = datumIzdavanja;
	}

	/**
	 * Vraca radnika na koga se odnosi revers.
	 * 
	 * @return radnik na koga se odnosi revers kao objekat tipa Radnik
	 * @see Radnik
	 */
	public Radnik getRadnik() {
		return radnik;
	}

	/**
	 * Postavlja novu vrednost za atribut radnik.
	 * 
	 * @param radnik novi radnik na koga se odnosi revers
	 * @throws java.lang.NullPointerException u slucaju da je uneti radnik null
	 */
	public void setRadnik(Radnik radnik) {
		if (radnik == null) {
			throw new NullPointerException("Polje 'radnik' reversa ne sme biti prazno!\n");
		}
		this.radnik = radnik;
	}

	/**
	 * Vraca sve stavke reversa.
	 * 
	 * @return lista sa svim stavkama reversa
	 */
	public List<StavkaReversa> getStavke() {
		return stavke;
	}

	/**
	 * Postavlja stavke reversa.
	 * 
	 * @param stavke sve stavke reversa unete u jednu listu
	 * @throws java.lang.NullPointerException u slucaju da su unete stavke null
	 * @throws java.lang.IllegalArgumentException u slucaju da uneta lista ne sadrzi nijednu stavku
	 */
	public void setStavke(List<StavkaReversa> stavke) {
		if (stavke == null) {
			throw new NullPointerException("Polje 'stavke' reversa ne sme biti prazno!\n");
		}
		if (stavke.size() == 0) {
			throw new IllegalArgumentException("Revers mora sadrzati barem jednu stavku!\n");
		}
		this.stavke = stavke;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.brojReversa);
		return hash;
	}

	/**
	 * Poredi dva reversa po broju reversa.
	 * 
	 * @return
	 * <ul>
	 * <li>true - ako je broj reversa isti za oba reversa</li>
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
		final Revers other = (Revers) obj;
		if (!Objects.equals(this.brojReversa, other.brojReversa)) {
			return false;
		}
		return true;
	}

	/**
	 * Vraca String sa svim podacima o reversu.
	 * 
	 * @return String sa svim podacima o reversu
	 */
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
