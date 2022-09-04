package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RadnikTest {

	Radnik radnik;

	@BeforeEach
	void setUp() throws Exception {
		radnik = new Radnik();
	}

	@AfterEach
	void tearDown() throws Exception {
		radnik = null;
	}

	@Test
	void testRadnikLongStringStringStringStringRadnoMesto() {
		RadnoMesto radnoMesto = new RadnoMesto(1l, "Radnik u magacinu");
		radnik = new Radnik(1l, "Marko", "Markovic", "0627756256", "marko.markovic@ps.fon.bg.ac.rs", radnoMesto);

		assertEquals(1l, radnik.getRadnikID());
		assertEquals("Marko", radnik.getIme());
		assertEquals("Markovic", radnik.getPrezime());
		assertEquals("0627756256", radnik.getBrojTelefona());
		assertEquals("marko.markovic@ps.fon.bg.ac.rs", radnik.getMejl());
		assertEquals(radnoMesto, radnik.getRadnoMesto());
	}

	@Test
	void testSetRadnoMesto() {
		RadnoMesto radnoMesto = new RadnoMesto(2l, "Sef gradilista");
		radnik.setRadnoMesto(radnoMesto);

		assertEquals(radnoMesto, radnik.getRadnoMesto());
	}

	@Test
	void testSetRadnikID() {
		radnik.setRadnikID(1l);

		assertEquals(1l, radnik.getRadnikID());
	}

	@Test
	void testSetIme() {
		radnik.setIme("Marko");

		assertEquals("Marko", radnik.getIme());
	}

	@Test
	void testSetPrezime() {
		radnik.setPrezime("Markovic");

		assertEquals("Markovic", radnik.getPrezime());
	}

	@Test
	void testSetBrojTelefona() {
		radnik.setBrojTelefona("0654445162");

		assertEquals("0654445162", radnik.getBrojTelefona());
	}

	@Test
	void testSetMejl() {
		radnik.setMejl("marko.markovic@ps.fon.bg.ac.rs");

		assertEquals("marko.markovic@ps.fon.bg.ac.rs", radnik.getMejl());
	}

	@ParameterizedTest
	@CsvSource({
		"1, 1, true",
		"1, 12, false"
		})
	void testEqualsObject(Long radnikID1, Long radnikID2, boolean equals) {
		radnik.setRadnikID(radnikID1);

		Radnik radnik2 = new Radnik();
		radnik2.setRadnikID(radnikID2);

		assertEquals(equals, radnik.equals(radnik2));
	}

	@Test
	void testToString() {
		radnik.setRadnikID(1l);
		radnik.setIme("Pera");
		radnik.setPrezime("Peric");

		String s = radnik.toString();

		assertTrue(s.contains("Pera"));
		assertTrue(s.contains("Peric"));
	}

}
