/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

/**
 * Predstavlja radnika koji ima radno mesto sa sifrom 1 i nazivom "Radnik u magacinu".
 * Nasledjuje klasu Radnik i ima dodatan atribut sifra koji predstavlja lozinku.
 * @see Radnik
 * 
 * @author ACER
 */
public class Magacioner extends Radnik implements OpstiDomenskiObjekat {

	/**
	 * Sifra magacionera, odnosno lozinka za prijavljivanje na sistem
	 */
	private String sifra;

	/**
	 * Postavlja radno mesto sa sifrom 1 i nazivom "Radnik u magacinu" za magacionera.
	 */
	public Magacioner() {
		this.setRadnoMesto(new RadnoMesto(1l, "Radnik u magacinu"));
	}

	/**
	 * Postavlja ID, ime, prezime, broj telefona, mejl i sifru magacionera na unete vrednosti.
	 * 
	 * @param radnikID novi ID magacionera
	 * @param ime novo ime magacionera
	 * @param prezime novo prezime magacionera
	 * @param brojTelefona  novi broj telefona magacionera
	 * @param mejl novi mejl magacionera
	 * @param sifra nova sifra magacionera
	 */
	public Magacioner(Long radnikID, String ime, String prezime, String brojTelefona, String mejl, String sifra) {
		super(radnikID, ime, prezime, brojTelefona, mejl, new RadnoMesto(1l, "Radnik u magacinu"));
		setSifra(sifra);
	}

	/**
	 * Vraca sifru magacionera.
	 * 
	 * @return sifra magacionera kao String
	 */
	public String getSifra() {
		return sifra;
	}

	/**
	 * Postavlja novu vrednost za atribut sifra magacionera.
	 * 
	 * @param sifra nova sifra magacionera
	 * @throws java.lang.NullPointerException u slucaju da je uneta sifra null
	 * @throws java.lang.IllegalArgumentException u slucaju da je uneta sifra prazan String
	 */
	public void setSifra(String sifra) {
		if (sifra == null) {
			throw new NullPointerException("Polje 'sifra' magacionera ne sme biti prazno\n!");
		}
		if (sifra.isEmpty()) {
			throw new IllegalArgumentException("Polje 'sifra' magacionera ne sme biti prazno\n!");
		}
		this.sifra = sifra;
	}

	@Override
	public String vratiNazivTabele() {
		return "Magacioner";
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "r.radnikID, r.ime, r.prezime, r.brojTelefona, r.mejl, r.radnoMesto, m.radnikID, m.sifra, "
				+ "rm.sifraRM, rm.nazivRM";
	}

	@Override
	public String vratiJoinUslov() {
		return "m inner join Radnik r on m.radnikID = r.radnikID inner join RadnoMesto rm on r.radnoMesto = rm.sifraRM";
	}

}
