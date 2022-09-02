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
public class RadnoMesto implements OpstiDomenskiObjekat {

	private Long sifraRM;
	private String nazivRM;

	public RadnoMesto() {
	}

	public RadnoMesto(Long sifraRM, String nazivRM) {
		this.sifraRM = sifraRM;
		this.nazivRM = nazivRM;
	}

	public Long getSifraRM() {
		return sifraRM;
	}

	public void setSifraRM(Long sifraRM) {
		this.sifraRM = sifraRM;
	}

	public String getNazivRM() {
		return nazivRM;
	}

	public void setNazivRM(String nazivRM) {
		this.nazivRM = nazivRM;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + Objects.hashCode(this.sifraRM);
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
		final RadnoMesto other = (RadnoMesto) obj;
		if (!Objects.equals(this.sifraRM, other.sifraRM)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return nazivRM;
	}

	@Override
	public String vratiNazivTabele() {
		return "RadnoMesto";
	}

	@Override
	public String vratiNaziveKolonaZaZapamti() {
		return null;
	}

	@Override
	public String vratiVrednostiZaZapamti() {
		return null;
	}

	@Override
	public String vratiNaziveKolonaZaUcitajListu() {
		return "sifraRM, nazivRM";
	}

	@Override
	public String vratiJoinUslov() {
		return "";
	}

	@Override
	public String vratiNazivKoloneID() {
		return "sifraRM";
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
		return "order by sifraRM asc";
	}

}
