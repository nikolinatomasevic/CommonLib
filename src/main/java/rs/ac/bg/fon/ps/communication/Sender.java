/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author nikolinatomasevic
 */
public class Sender {

	private Socket socket;

	public Sender(Socket socket) {
		this.socket = socket;
	}

	public void send(Object object) throws Exception {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			out.writeObject(object);
			out.flush();
		} catch (IOException ex) {
			// throw new Exception("Greska prilikom slanja objekta: " + ex.getMessage());
			throw new Exception("Server trenutno nije dostupan.");
		}
	}

}
