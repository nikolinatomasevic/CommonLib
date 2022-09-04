package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RadnoMestoTest {

	RadnoMesto radnoMesto;

	@BeforeEach
	void setUp() throws Exception {
		radnoMesto = new RadnoMesto();
	}

	@AfterEach
	void tearDown() throws Exception {
		radnoMesto = null;
	}

	@Test
	void testRadnoMestoLongString() {
		radnoMesto = new RadnoMesto(1l, "Radnik u magacinu");

		assertEquals(1l, radnoMesto.getSifraRM());
		assertEquals("Radnik u magacinu", radnoMesto.getNazivRM());
	}

	@Test
	void testSetSifraRM() {
		radnoMesto.setSifraRM(2l);

		assertEquals(2l, radnoMesto.getSifraRM());
	}

	@Test
	void testSetNazivRM() {
		radnoMesto.setNazivRM("Sef gradilista");

		assertEquals("Sef gradilista", radnoMesto.getNazivRM());
	}

	@ParameterizedTest
	@CsvSource({
		"1, 1, true",
		"1, 12, false"
		})
	void testEqualsObject(Long sifraRM1, Long sifraRM2, boolean equals) {
		radnoMesto.setSifraRM(sifraRM1);

		RadnoMesto radnoMesto2 = new RadnoMesto();
		radnoMesto2.setSifraRM(sifraRM2);

		assertEquals(equals, radnoMesto.equals(radnoMesto2));
	}

	@Test
	void testToString() {
		radnoMesto.setSifraRM(2l);
		radnoMesto.setNazivRM("Sef gradilista");

		String s = radnoMesto.toString();

		assertTrue(s.contains("Sef gradilista"));
	}

}
