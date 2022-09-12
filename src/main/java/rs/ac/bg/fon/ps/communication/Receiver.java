/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author nikolinatomasevic
 */
public class Receiver {

	private Socket socket;

	public Receiver(Socket socket) {
		this.socket = socket;
	}

	public Object receive() throws Exception {
		try {
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			return in.readObject();
		} catch (IOException ex) {
			// throw new Exception("Greska prilikom citanja objekta: " + ex.getMessage());
			throw new Exception("Server trenutno nije dostupan.");
		}
	}

}
