/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 * Predstavlja zahtev koji klijent salje serveru.
 *
 * @author ACER
 */
public class Request implements Serializable {

	/**
	 * Operacija koju treba da izvrsi server
	 */
	private int operacija;
	/**
	 * Podaci koje kljent salje serveru kako bi mogla da se izvrsi zahtevana operacija
	 */
	private Object argument;

	/**
	 * Postavlja operaciju i argument zahteva na unete vrednosti.
	 * 
	 * @param operacija nova operacija zahteva
	 * @param argument novi argument zahteva
	 */
	public Request(int operacija, Object argument) {
		this.operacija = operacija;
		this.argument = argument;
	}

	/**
	 * Vraca operaciju zahteva.
	 * 
	 * @return operacija zahteva kao ceo broj
	 */
	public int getOperacija() {
		return operacija;
	}

	/**
	 * Vraca argument zahteva.
	 * 
	 * @return argument zahteva tipa Object
	 */
	public Object getArgument() {
		return argument;
	}

}
