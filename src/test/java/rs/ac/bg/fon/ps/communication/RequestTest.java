package rs.ac.bg.fon.ps.communication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.ps.domain.MasinaIliAlat;

class RequestTest {

	@Test
	void testRequest() {
		MasinaIliAlat masinaIliAlat = new MasinaIliAlat(2l, "Brusilica", 23, 5);
		Request request = new Request(4, masinaIliAlat);

		assertEquals(4, request.getOperacija());
		assertEquals(masinaIliAlat, request.getArgument());
	}

}
