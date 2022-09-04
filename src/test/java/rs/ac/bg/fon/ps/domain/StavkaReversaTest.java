package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StavkaReversaTest {

	StavkaReversa stavkaReversa;

	@BeforeEach
	void setUp() throws Exception {
		stavkaReversa = new StavkaReversa();
	}

	@AfterEach
	void tearDown() throws Exception {
		stavkaReversa = null;
	}

	@Test
	void testStavkaReversa() {
		assertEquals(0, stavkaReversa.getRazduzenaKolicina());
	}

	@Test
	void testStavkaReversaReversIntegerIntegerDateIntegerMasinaIliAlat() {
		try {
			Revers revers = new Revers();
			revers.setBrojReversa(1l);
			Date datumIzdavanja = new SimpleDateFormat("dd.MM.yyyy.").parse("8.6.2022.");
			revers.setDatumIzdavanja(datumIzdavanja);
			RadnoMesto radnoMesto = new RadnoMesto(2l, "Sef gradilista");
			Radnik radnik = new Radnik(5l, "Marko", "Markovic", "0637792469", "marko.markovic@ps.fon.bg.ac.rs",
					radnoMesto);
			revers.setRadnik(radnik);
			Date datumRazduzenja = new SimpleDateFormat("dd.MM.yyyy.").parse("3.9.2022.");
			MasinaIliAlat masinaIliAlat = new MasinaIliAlat(2l, "Brusilica", 23, 5);
			stavkaReversa = new StavkaReversa(revers, 1, 5, datumRazduzenja, 5, masinaIliAlat);

			assertEquals(revers, stavkaReversa.getRevers());
			assertEquals(1, stavkaReversa.getRb());
			assertEquals(5, stavkaReversa.getZaduzenaKolicina());
			assertEquals(datumRazduzenja, stavkaReversa.getDatumRazduzenja());
			assertEquals(5, stavkaReversa.getRazduzenaKolicina());
			assertEquals(masinaIliAlat, stavkaReversa.getMasinaIliAlat());
		} catch (ParseException e) {

		}
	}

	@Test
	void testSetRevers() {
		try {
			Revers revers = new Revers();
			revers.setBrojReversa(1l);
			Date datumIzdavanja;
			datumIzdavanja = new SimpleDateFormat("dd.MM.yyyy.").parse("4.8.2022.");
			revers.setDatumIzdavanja(datumIzdavanja);
			RadnoMesto radnoMesto = new RadnoMesto(2l, "Sef gradilista");
			Radnik radnik = new Radnik(5l, "Marko", "Markovic", "0637792469", "marko.markovic@ps.fon.bg.ac.rs",
					radnoMesto);
			revers.setRadnik(radnik);
			stavkaReversa.setRevers(revers);

			assertEquals(revers, stavkaReversa.getRevers());
		} catch (ParseException e) {

		}
	}

	@Test
	void testSetRb() {
		stavkaReversa.setRb(2);

		assertEquals(2, stavkaReversa.getRb());
	}

	@Test
	void testSetZaduzenaKolicina() {
		stavkaReversa.setZaduzenaKolicina(6);

		assertEquals(6, stavkaReversa.getZaduzenaKolicina());
	}

	@Test
	void testSetDatumRazduzenja() {
		try {
			Date datumRazduzenja = new SimpleDateFormat("dd.MM.yyyy.").parse("3.9.2022.");
			stavkaReversa.setDatumRazduzenja(datumRazduzenja);

			assertEquals(datumRazduzenja, stavkaReversa.getDatumRazduzenja());
		} catch (ParseException e) {

		}
	}

	@Test
	void testSetRazduzenaKolicina() {
		stavkaReversa.setRazduzenaKolicina(3);

		assertEquals(3, stavkaReversa.getRazduzenaKolicina());
	}

	@Test
	void testSetMasinaIliAlat() {
		MasinaIliAlat masinaIliAlat = new MasinaIliAlat(2l, "Brusilica", 23, 5);
		stavkaReversa.setMasinaIliAlat(masinaIliAlat);

		assertEquals(masinaIliAlat, stavkaReversa.getMasinaIliAlat());
	}

	@ParameterizedTest
	@CsvSource({
		"1, 1, 1, 1, true",
		"1, 1, 1, 12, false",
		"1, 2, 5, 2, false",
		"1, 2, 3, 4, false"
		})
	void testEqualsObject(Long brojReversa1, Integer rb1, Long brojReversa2, Integer rb2, boolean equals) {
		Revers revers1 = new Revers();
		revers1.setBrojReversa(brojReversa1);
		stavkaReversa.setRevers(revers1);
		stavkaReversa.setRb(rb1);

		Revers revers2 = new Revers();
		revers2.setBrojReversa(brojReversa2);
		StavkaReversa stavkaReversa2 = new StavkaReversa();
		stavkaReversa2.setRevers(revers2);
		stavkaReversa2.setRb(rb2);

		assertEquals(equals, stavkaReversa.equals(stavkaReversa2));
	}

	@Test
	void testToString() {
		try {
			stavkaReversa.setRb(1);
			stavkaReversa.setZaduzenaKolicina(5);
			Date datumRazduzenja = new SimpleDateFormat("dd.MM.yyyy.").parse("3.9.2022.");
			stavkaReversa.setDatumRazduzenja(datumRazduzenja);
			stavkaReversa.setRazduzenaKolicina(5);

			String s = stavkaReversa.toString();

			assertTrue(s.contains("1"));
			assertTrue(s.contains("5"));
			assertTrue(s.contains((new SimpleDateFormat("dd.MM.yyyy.").parse("3.9.2022.")).toString()));
			assertTrue(s.contains("5"));
		} catch (ParseException e) {

		}
	}

}
