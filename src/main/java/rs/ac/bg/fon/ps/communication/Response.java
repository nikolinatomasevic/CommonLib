/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 * Predstavlja odgovor servera.
 *
 * @author nikolinatomasevic
 */
public class Response implements Serializable {

	/**
	 * Tip odgovora. Moze biti SUCCES ili ERROR
	 */
	private ResponseType responseTip;
	/**
	 * Rezultat koji se salje u slucaju da je tip odgovora SUCCES
	 */
	private Object rezultat;
	/**
	 * Izuzetak koji se baca u slucaju da je tip odgovora ERROR
	 */
	private Exception exception;

	/**
	 * Inicijalizuje novi odgovor.
	 */
	public Response() {
	}

	/**
	 * Vraca tip odgovora.
	 * 
	 * @return tip odgovora kao enumeracija tipa ResponseType
	 */
	public ResponseType getResponseTip() {
		return responseTip;
	}

	/**
	 * Postavlja novu vrednost za atribut tip odgovora.
	 * 
	 * @param responseTip novi tip odgovora
	 */
	public void setResponseTip(ResponseType responseTip) {
		this.responseTip = responseTip;
	}

	/**
	 * Vraca rezultat odgovora.
	 * 
	 * @return rezultat odgovora tipa Object
	 */
	public Object getRezultat() {
		return rezultat;
	}

	/**
	 * Postavlja novu vrednost za atribut rezultat odgovora.
	 * 
	 * @param rezultat novi rezultat odgovora
	 */
	public void setRezultat(Object rezultat) {
		this.rezultat = rezultat;
	}

	/**
	 * Vraca izuzetak odgovora.
	 * 
	 * @return izuzetak odgovora tipa Exception
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 * Postavlja novu vrednost za atribut izuzetak odgovora.
	 * 
	 * @param exception novi izuzetak odgovora
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}

}
