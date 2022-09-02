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
public class Request implements Serializable {

	private int operacija;
	private Object argument;

	public Request(int operacija, Object argument) {
		this.operacija = operacija;
		this.argument = argument;
	}

	public int getOperacija() {
		return operacija;
	}

	public Object getArgument() {
		return argument;
	}

}
