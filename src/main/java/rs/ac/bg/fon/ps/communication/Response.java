/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class Response implements Serializable {

	private ResponseType responseTip;
	private Object rezultat;
	private Exception exception;

	public Response() {
	}

	public ResponseType getResponseTip() {
		return responseTip;
	}

	public void setResponseTip(ResponseType responseTip) {
		this.responseTip = responseTip;
	}

	public Object getRezultat() {
		return rezultat;
	}

	public void setRezultat(Object rezultat) {
		this.rezultat = rezultat;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

}
