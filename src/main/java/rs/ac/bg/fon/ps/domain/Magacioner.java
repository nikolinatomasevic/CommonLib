/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

/**
 *
 * @author ACER
 */
public class Magacioner extends Radnik implements OpstiDomenskiObjekat {

	private String sifra;

	public Magacioner() {
		this.setRadnoMesto(new RadnoMesto(1l, "Radnik u magacinu"));
	}

	public Magacioner(Long radnikID, String ime, String prezime, String brojTelefona, String mejl, String sifra) {
		super(radnikID, ime, prezime, brojTelefona, mejl, new RadnoMesto(1l, "Radnik u magacinu"));
		this.sifra = sifra;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
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
