/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;

/**
 * Interfejs koji predstavlja opsti domenski objekat.
 *
 * @author ACER
 */
public interface OpstiDomenskiObjekat extends Serializable {

	/**
	 * Vraca naziv tabele u bazi.
	 * 
	 * @return naziv tabele u bazi kao String
	 */
	String vratiNazivTabele();

	/**
	 * Vraca naziv kolone koja predstavlja primarni kljuc tabele u bazi.
	 * 
	 * @return naziv kolone koja predstavlja primarni kljuc tabele u bazi kao String
	 */
	String vratiNazivKoloneID();

	/**
	 * Vraca sve nazive kolona u koje se unose podaci prilikom cuvanja novog objekta u bazi.
	 * 
	 * @return String sa svim nazivima kolona u koje se unose podaci prilikom cuvanja novog objekta u bazi
	 */
	String vratiNaziveKolonaZaZapamti();

	/**
	 * Vraca vrednosti koje se unose prilikom cuvanja novog objekta u bazi.
	 * 
	 * @return String sa svim vrednostima koje se unose prilikom cuvanja novog objekta u bazi
	 */
	String vratiVrednostiZaZapamti();

	/**
	 * Vraca nazive kolona koje se koriste za prikazivanje podataka o objektima koji se ucitavaju iz baze.
	 * 
	 * @return String sa nazivima kolona koje se koriste za prikazivanje podataka o objektima koji se ucitavaju iz baze
	 */
	String vratiNaziveKolonaZaUcitajListu();

	/**
	 * Vraca SQL join uslov koji se koristi za prikazivanje podataka o ucitanom objektu iz baze, kada se ucitavaju podaci iz vise tabela.
	 * 
	 * @return String koji predstavlja SQL join uslov koji se koristi za prikazivanje podataka o ucitanom objektu iz baze
	 */
	String vratiJoinUslov();

	/**
	 * Vraca SQL where uslov koji se koristi kada zelimo da se ucitaju samo odredjeni objekti iz tabele baze podataka.
	 * 
	 * @return String koji predstavlja SQL where uslov koji se koristi kada zelimo da se ucitaju samo odredjeni objekti iz tabele baze podataka
	 */
	String vratiWhereUslovZaUcitajListu();

	/**
	 * Vraca SQL where uslov koji se koristi kada zelimo da se promene podaci odredjenog objekta iz tabele baze podataka.
	 * 
	 * @return String koji predstavlja SQL where uslov koji se koristi kada zelimo da se promene podaci odredjenog objekta iz tabele baze podataka
	 */
	String vratiWhereUslovZaPromeni();

	/**
	 * Vraca nazive kolona zajedno sa novim vrednostima koje se unose prilikom promene objekta u bazi.
	 * 
	 * @return String sa nazivima kolona i novim vrednostima koje se unose prilikom promene objekta u bazi
	 */
	String vratiNaziveKolonaSaVrednostimaZaPromeni();

	/**
	 * Vraca SQL order by uslov koji se koristi kada zelimo da sortiramo objekte iz baze podataka u odredjenom redosledu.
	 * 
	 * @return String koji predstavlja SQL order by uslov koji se koristi kada zelimo da sortiramo objekte iz baze podataka u odredjenom redosledu
	 */
	String vratiOrderByUslov();

}
