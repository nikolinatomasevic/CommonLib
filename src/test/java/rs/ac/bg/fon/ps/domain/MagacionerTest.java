package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MagacionerTest {

	Magacioner magacioner;

	@BeforeEach
	void setUp() throws Exception {
		magacioner = new Magacioner();
	}

	@AfterEach
	void tearDown() throws Exception {
		magacioner = null;
	}

	@Test
	void testMagacioner() {
		RadnoMesto radnoMesto = new RadnoMesto(1l, "Radnik u magacinu");

		assertEquals(radnoMesto, magacioner.getRadnoMesto());
	}

	@Test
	void testMagacionerLongStringStringStringStringString() {
		RadnoMesto radnoMesto = new RadnoMesto(1l, "Radnik u magacinu");
		magacioner = new Magacioner(1l, "Marko", "Markovic", "0625786252", "marko.markovic@ps.fon.bg.ac.rs", "mm12345");

		assertEquals(1l, magacioner.getRadnikID());
		assertEquals("Marko", magacioner.getIme());
		assertEquals("Markovic", magacioner.getPrezime());
		assertEquals("0625786252", magacioner.getBrojTelefona());
		assertEquals("marko.markovic@ps.fon.bg.ac.rs", magacioner.getMejl());
		assertEquals(radnoMesto, magacioner.getRadnoMesto());
		assertEquals("mm12345", magacioner.getSifra());
	}

	@Test
	void testSetSifra() {
		magacioner.setSifra("mm12345");

		assertEquals("mm12345", magacioner.getSifra());
	}

}
