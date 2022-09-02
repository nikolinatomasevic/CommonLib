/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public interface OpstiDomenskiObjekat extends Serializable {

	String vratiNazivTabele();

	String vratiNazivKoloneID();

	String vratiNaziveKolonaZaZapamti();

	String vratiVrednostiZaZapamti();

	String vratiNaziveKolonaZaUcitajListu();

	String vratiJoinUslov();

	String vratiWhereUslovZaUcitajListu();

	String vratiWhereUslovZaPromeni();

	String vratiNaziveKolonaSaVrednostimaZaPromeni();

	String vratiOrderByUslov();

}
