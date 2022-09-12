package rs.ac.bg.fon.ps.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReversTest {

	Revers revers;

	@BeforeEach
	void setUp() throws Exception {
		revers = new Revers();
	}

	@AfterEach
	void tearDown() throws Exception {
		revers = null;
	}

	@Test
	void testReversLongDateRadnikListOfStavkaReversa() {
		try {
			revers.setBrojReversa(15l);
			Date datumIzdavanja = new SimpleDateFormat("dd.MM.yyyy.").parse("4.8.2022.");
			revers.setDatumIzdavanja(datumIzdavanja);
			RadnoMesto radnoMesto = new RadnoMesto(2l, "Sef gradilista");
			Radnik radnik = new Radnik(5l, "Marko", "Markovic", "0637792469", "marko.markovic@ps.fon.bg.ac.rs",
					radnoMesto);
			revers.setRadnik(radnik);
			MasinaIliAlat masinaIliAlat1 = new MasinaIliAlat(2l, "Brusilica", 23, 5);
			StavkaReversa stavkaReversa1 = new StavkaReversa(revers, 1, 8, null, 3, masinaIliAlat1);
			MasinaIliAlat masinaIliAlat2 = new MasinaIliAlat(3l, "Agregat", 5, 1);
			Date datumRazduzenja = new SimpleDateFormat("dd.MM.yyyy.").parse("29.8.2022.");
			StavkaReversa stavkaReversa2 = new StavkaReversa(revers, 2, 1, datumRazduzenja, 1, masinaIliAlat2);
			List<StavkaReversa> stavke = new LinkedList<StavkaReversa>();
			stavke.add(stavkaReversa1);
			stavke.add(stavkaReversa2);
			revers.setStavke(stavke);

			assertEquals(15l, revers.getBrojReversa());
			assertEquals(datumIzdavanja, revers.getDatumIzdavanja());
			assertEquals(radnik, revers.getRadnik());
			assertEquals(stavke, revers.getStavke());
		} catch (ParseException e) {

		}
	}

	@Test
	void testSetBrojReversa() {
		revers.setBrojReversa(5l);

		assertEquals(5l, revers.getBrojReversa());
	}

	@Test
	void testSetDatumIzdavanjaNull() {
		assertThrows(java.lang.NullPointerException.class, () -> revers.setDatumIzdavanja(null));
	}
	
	@Test
	void testSetDatumIzdavanja() {
		try {
			Date datumIzdavanja = new SimpleDateFormat("dd.MM.yyyy.").parse("4.8.2022.");
			revers.setDatumIzdavanja(datumIzdavanja);

			assertEquals(datumIzdavanja, revers.getDatumIzdavanja());
		} catch (ParseException e) {

		}
	}

	@Test
	void testSetRadnikNull() {
		assertThrows(java.lang.NullPointerException.class, () -> revers.setRadnik(null));
	}
	
	@Test
	void testSetRadnik() {
		RadnoMesto radnoMesto = new RadnoMesto(2l, "Sef gradilista");
		Radnik radnik = new Radnik(5l, "Marko", "Markovic", "0637792469", "marko.markovic@ps.fon.bg.ac.rs", radnoMesto);
		revers.setRadnik(radnik);

		assertEquals(radnik, revers.getRadnik());
	}
	
	@Test
	void testSetStavkeNull() {
		assertThrows(java.lang.NullPointerException.class, () -> revers.setStavke(null));
	}
	
	@Test
	void testSetStavkeNemaStavki() {
		List<StavkaReversa> stavke = new LinkedList<StavkaReversa>();
		assertThrows(java.lang.IllegalArgumentException.class, () -> revers.setStavke(stavke));
	}

	@Test
	void testSetStavke() {
		try {
			MasinaIliAlat masinaIliAlat1 = new MasinaIliAlat(2l, "Brusilica", 23, 5);
			StavkaReversa stavkaReversa1 = new StavkaReversa(revers, 1, 8, null, 3, masinaIliAlat1);
			MasinaIliAlat masinaIliAlat2 = new MasinaIliAlat(3l, "Agregat", 5, 1);
			Date datumRazduzenja = new SimpleDateFormat("dd.MM.yyyy.").parse("29.8.2022.");
			StavkaReversa stavkaReversa2 = new StavkaReversa(revers, 2, 1, datumRazduzenja, 1, masinaIliAlat2);
			List<StavkaReversa> stavke = new LinkedList<StavkaReversa>();
			stavke.add(stavkaReversa1);
			stavke.add(stavkaReversa2);
			revers.setStavke(stavke);

			assertEquals(stavke, revers.getStavke());
		} catch (ParseException e) {

		}
	}

	@ParameterizedTest
	@CsvSource({
		"1, 1, true",
		"1, 12, false"
		})
	void testEqualsObject(Long brojReversa1, Long brojReversa2, boolean equals) {
		revers.setBrojReversa(brojReversa1);

		Revers revers2 = new Revers();
		revers2.setBrojReversa(brojReversa2);

		assertEquals(equals, revers.equals(revers2));
	}

	@Test
	void testToString() {
		try {
			revers.setBrojReversa(15l);
			Date datumIzdavanja = new SimpleDateFormat("dd.MM.yyyy.").parse("4.8.2022.");
			revers.setDatumIzdavanja(datumIzdavanja);

			String s = revers.toString();

			assertTrue(s.contains("15"));
			assertTrue(s.contains((new SimpleDateFormat("dd.MM.yyyy.").parse("4.8.2022.")).toString()));
		} catch (ParseException e) {

		}
	}

}
