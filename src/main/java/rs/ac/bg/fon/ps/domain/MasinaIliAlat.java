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
public class MasinaIliAlat implements OpstiDomenskiObjekat {

	private Long masinaIliAlatID;
	private String naziv;
	private Integer kolicinaUMagacinu;
	private Integer kolicinaNaZaduzenju;

	public MasinaIliAlat() {
		this.kolicinaUMagacinu = 0;
		this.kolicinaNaZaduzenju = 0;
	}

	public MasinaIliAlat(Long masinaIliAlatID, String naziv, Integer kolicinaUMagacinu, Integer kolicinaNaZaduzenju) {
		this.masinaIliAlatID = masinaIliAlatID;
		this.naziv = naziv;
		this.kolicinaUMagacinu = kolicinaUMagacinu;
		this.kolicinaNaZaduzenju = kolicinaNaZaduzenju;
	}

	public Integer getKolicinaNaZaduzenju() {
		return kolicinaNaZaduzenju;
	}

	public void setKolicinaNaZaduzenju(Integer kolicinaNaZaduzenju) {
		this.kolicinaNaZaduzenju = kolicinaNaZaduzenju;
	}

	public Long getMasinaIliAlatID() {
		return masinaIliAlatID;
	}

	public void setMasinaIliAlatID(Long masinaIliAlatID) {
		this.masinaIliAlatID = masinaIliAlatID;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getKolicinaUMagacinu() {
		return kolicinaUMagacinu;
	}

	public void setKolicinaUMagacinu(Integer kolicinaUMagacinu) {
		this.kolicinaUMagacinu = kolicinaUMagacinu;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.masinaIliAlatID);
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
		final MasinaIliAlat other = (MasinaIliAlat) obj;
		if (!Objects.equals(this.masinaIliAlatID, other.masinaIliAlatID)) {
			return false;
		}
		return true;
	}

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
