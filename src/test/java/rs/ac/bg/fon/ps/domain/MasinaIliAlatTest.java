package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MasinaIliAlatTest {

	MasinaIliAlat masinaIliAlat;

	@BeforeEach
	void setUp() throws Exception {
		masinaIliAlat = new MasinaIliAlat();
	}

	@AfterEach
	void tearDown() throws Exception {
		masinaIliAlat = null;
	}

	@Test
	void testMasinaIliAlat() {
		assertEquals(0, masinaIliAlat.getKolicinaUMagacinu());
		assertEquals(0, masinaIliAlat.getKolicinaNaZaduzenju());
	}

	@Test
	void testMasinaIliAlatLongStringIntegerInteger() {
		masinaIliAlat = new MasinaIliAlat(2l, "Brusilica", 12, 9);

		assertEquals(2l, masinaIliAlat.getMasinaIliAlatID());
		assertEquals("Brusilica", masinaIliAlat.getNaziv());
		assertEquals(12, masinaIliAlat.getKolicinaUMagacinu());
		assertEquals(9, masinaIliAlat.getKolicinaNaZaduzenju());

	}

	@Test
	void testSetKolicinaNaZaduzenju() {
		masinaIliAlat.setKolicinaNaZaduzenju(23);

		assertEquals(23, masinaIliAlat.getKolicinaNaZaduzenju());
	}

	@Test
	void testSetMasinaIliAlatID() {
		masinaIliAlat.setMasinaIliAlatID(1l);

		assertEquals(1l, masinaIliAlat.getMasinaIliAlatID());
	}

	@Test
	void testSetNaziv() {
		masinaIliAlat.setNaziv("Brusilica");

		assertEquals("Brusilica", masinaIliAlat.getNaziv());
	}

	@Test
	void testSetKolicinaUMagacinu() {
		masinaIliAlat.setKolicinaUMagacinu(15);

		assertEquals(15, masinaIliAlat.getKolicinaUMagacinu());
	}

	@ParameterizedTest
	@CsvSource({
		"1, 1, true",
		"1, 12, false"
		})
	void testEqualsObject(Long masinaIliAlatID1, Long masinaIliAlatID2, boolean equals) {
		masinaIliAlat.setMasinaIliAlatID(masinaIliAlatID1);

		MasinaIliAlat masinaIliAlat2 = new MasinaIliAlat();
		masinaIliAlat2.setMasinaIliAlatID(masinaIliAlatID2);

		assertEquals(equals, masinaIliAlat.equals(masinaIliAlat2));
	}

	@Test
	void testToString() {
		masinaIliAlat.setMasinaIliAlatID(2l);
		masinaIliAlat.setNaziv("Brusilica");

		String s = masinaIliAlat.toString();

		assertTrue(s.contains("Brusilica"));
	}

}
