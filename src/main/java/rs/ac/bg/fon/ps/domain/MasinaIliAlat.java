/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Objects;

/**
 * Predstavlja masinu ili alat koji imaju svoj ID, naziv, kolicinu u magacinu i kolicinu na zaduzenju.
 *
 * @author ACER
 */
public class MasinaIliAlat implements OpstiDomenskiObjekat {
	
	/**
	 * ID masine ili alata
	 */
	private Long masinaIliAlatID;
	/**
	 * Naziv masine ili alata
	 */
	private String naziv;
	/**
	 * Broj komada te masine ili alata koji se nalaze na stanju u magacinu
	 */
	private Integer kolicinaUMagacinu;
	/**
	 * Broj komada te masine ili alata koji se nalaze na zaduzenju
	 */
	private Integer kolicinaNaZaduzenju;

	/**
	 * Postavlja kolicinu u magacinu i kolicinu na zaduzenju na 0 za novu masinu ili alat.
	 */
	public MasinaIliAlat() {
		this.kolicinaUMagacinu = 0;
		this.kolicinaNaZaduzenju = 0;
	}

	/**
	 * Postavlja ID, naziv, kolicinu u magacinu i kolicinu na zaduzenju masine ili alata na unete vrednosti.
	 * 
	 * @param masinaIliAlatID novi ID masine ili alata
	 * @param naziv novi naziv masine ili alata
	 * @param kolicinaUMagacinu nova kolicina u magacinu masine ili alata
	 * @param kolicinaNaZaduzenju nova kolicina na zaduzenju masine ili alata
	 */
	public MasinaIliAlat(Long masinaIliAlatID, String naziv, Integer kolicinaUMagacinu, Integer kolicinaNaZaduzenju) {
		setMasinaIliAlatID(masinaIliAlatID);
		setNaziv(naziv);
		setKolicinaUMagacinu(kolicinaUMagacinu);
		setKolicinaNaZaduzenju(kolicinaNaZaduzenju);
	}

	/**
	 * Vraca kolicinu na zaduzenju masine ili alata.
	 * 
	 * @return kolicina na zaduzenju masine ili alata kao ceo broj
	 */
	public Integer getKolicinaNaZaduzenju() {
		return kolicinaNaZaduzenju;
	}

	/**
	 * Postavlja novu vrednost za atribut kolicina na zaduzenju masine ili alata.
	 * 
	 * @param kolicinaNaZaduzenju nova kolicina na zaduzenju masine ili alata
	 * @throws java.lang.NullPointerException u slucaju da je uneta kolicina na zaduzenju null
	 * @throws java.lang.IllegalArgumentException u slucaju da je uneta kolicina na zaduzenju < 0
	 */
	public void setKolicinaNaZaduzenju(Integer kolicinaNaZaduzenju) {
		if (kolicinaNaZaduzenju == null) {
			throw new NullPointerException("Polje 'kolicina na zaduzenju' masine ili alata ne sme biti prazno!\n");
		}
		if (kolicinaNaZaduzenju < 0) {
			throw new IllegalArgumentException(
					"Polje 'kolicina na zaduzenju' masine ili alata mora sadrzati vrednost koja je >=0!");
		}
		this.kolicinaNaZaduzenju = kolicinaNaZaduzenju;
	}

	/**
	 * Vraca ID masine ili alata.
	 * 
	 * @return ID masine ili alata kao ceo broj tipa Long
	 */
	public Long getMasinaIliAlatID() {
		return masinaIliAlatID;
	}

	/**
	 * Postavlja novu vrednost za atribut ID masine ili alata.
	 * 
	 * @param masinaIliAlatID novi ID masine ili alata
	 */
	public void setMasinaIliAlatID(Long masinaIliAlatID) {
		this.masinaIliAlatID = masinaIliAlatID;
	}

	/**
	 * Vraca naziv masine ili alata.
	 * 
	 * @return naziv masine ili alata kao String
	 */
	public String getNaziv() {
		return naziv;
	}

	/**
	 * Postavlja novu vrednost za atribut naziv masine ili alata.
	 * 
	 * @param naziv novi naziv masine ili alata
	 * @throws java.lang.NullPointerException u slucaju da je uneti naziv null
	 */
	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new NullPointerException("Polje 'naziv' masine ili alata ne sme biti prazno!\n");
		}
		this.naziv = naziv;
	}

	/**
	 * Vraca kolicinu u magacinu masine ili alata.
	 * 
	 * @return kolicina u magacinu masine ili alata kao ceo broj
	 */
	public Integer getKolicinaUMagacinu() {
		return kolicinaUMagacinu;
	}

	/**
	 * Postavlja novu vrednost za atribut kolicina u magacinu masine ili alata.
	 * 
	 * @param kolicinaUMagacinu nova kolicina u magacinu masine ili alata
	 * @throws java.lang.NullPointerException u slucaju da je uneta kolicina u magacinu null
	 * @throws java.lang.IllegalArgumentException u slucaju da je uneta kolicina u magacinu < 0
	 */
	public void setKolicinaUMagacinu(Integer kolicinaUMagacinu) {
		if (kolicinaUMagacinu == null) {
			throw new NullPointerException("Polje 'kolicina u magacinu' masine ili alata ne sme biti prazno!\n");
		}
		if (kolicinaUMagacinu < 0) {
			throw new IllegalArgumentException(
					"Polje 'kolicina u magacinu' masine ili alata mora sadrzati vrednost koja je >=0!");
		}
		this.kolicinaUMagacinu = kolicinaUMagacinu;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.masinaIliAlatID);
		return hash;
	}

	/**
	 * Poredi dve masine ili alata po ID-u.
	 * 
	 * @return
	 * <ul>
	 * <li>true - ako je ID isti za obe masine ili alat</li>
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
		final MasinaIliAlat other = (MasinaIliAlat) obj;
		if (!Objects.equals(this.masinaIliAlatID, other.masinaIliAlatID)) {
			return false;
		}
		return true;
	}

	/**
	 * Vraca String koji sadrzi naziv masine ili alata.
	 * 
	 * @return String koji sadrzi naziv masine ili alata
	 */
	@Override
	public String toString() {
		return naziv;
	}

	@Override
	public String vratiNazivTabele() {
		return "MasinaIliAlat";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return "masinaIliAlatID, naziv, kolicinaUMagacinu, kolicinaNaZaduzenju";
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.masinaIliAlatID).append(", '").append(this.naziv).append("', ").append(this.kolicinaUMagacinu)
				.append(", ").append(this.kolicinaNaZaduzenju);
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "masinaIliAlatID, naziv, kolicinaUMagacinu, kolicinaNaZaduzenju";
	}

	@Override
	public String vratiJoinUslov() {
		return "";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "masinaIliAlatID";
	}

	@Override
	public String vratiWhereUslovZaUcitajListu() {
		return "";
	}

	@Override
	public String vratiWhereUslovZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("masinaIliAlatID=").append(this.masinaIliAlatID);
		return sb.toString();
	}

	@Override
	public String vratiNaziveKolonaSaVrednostimaZaPromeni() {
		StringBuilder sb = new StringBuilder();
		sb.append("naziv='").append(this.naziv).append("', ").append("kolicinaUMagacinu=")
				.append(this.kolicinaUMagacinu).append(", ").append("kolicinaNaZaduzenju=")
				.append(this.kolicinaNaZaduzenju);
		return sb.toString();
	}

	@Override
	public String vratiOrderByUslov() {
		return "";
	}

}
