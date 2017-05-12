import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void testDaLiRadiOsnovnoNapred() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "",'N',-1,-1);
		pe.executeCommand("f");
		assertEquals(" 1 -1",pe.executeCommand("f"));
	}
	
	@Test
	public void testDaLiRadiOsnovnoNazad() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "",'N',1,1);
		pe.executeCommand("b");
		assertEquals(" 9 1", pe.executeCommand("b"));
	}
	
	@Test
	public void testDaLiRadiOsnovnoNapredE() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "",'E',1,1);
		pe.executeCommand("f");
		assertEquals(" 9 1", pe.executeCommand("f"));
	}
	
	@Test
	public void testDaLiRadiOsnovnoNazadE() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "",'E',-1,-1);
		pe.executeCommand("b");
		assertEquals(" 1 -1", pe.executeCommand("b"));
	}
	
	@Test
	public void testDaLiRadiOsnovnoNazadW() {
		PlanetExplorer pe = new PlanetExplorer(10, 10, "",'W',0,-1);
		pe.executeCommand("f");
		assertEquals(" 0 1", pe.executeCommand("f"));
	}
}
