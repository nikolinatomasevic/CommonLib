package rs.ac.bg.fon.ps.communication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.ps.domain.MasinaIliAlat;

class ResponseTest {

	Response response;

	@BeforeEach
	void setUp() throws Exception {
		response = new Response();
	}

	@AfterEach
	void tearDown() throws Exception {
		response = null;
	}

	@Test
	void testSetResponseTip() {
		response.setResponseTip(ResponseType.SUCCES);

		assertEquals(ResponseType.SUCCES, response.getResponseTip());
	}

	@Test
	void testSetRezultat() {
		MasinaIliAlat masinaIliAlat = new MasinaIliAlat(2l, "Brusilica", 23, 5);
		response.setRezultat(masinaIliAlat);

		assertEquals(masinaIliAlat, response.getRezultat());
	}

	@Test
	void testSetException() {
		Exception exception = new Exception("Greska");
		response.setException(exception);

		assertEquals(exception, response.getException());
	}

}
