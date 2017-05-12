import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void testDaLiRadi() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "","N");
		pe.executeCommand("f");
		assertEquals("(1,0)",pe.executeCommand("f"));
	}
}
