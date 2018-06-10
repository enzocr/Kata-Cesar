package ac.cr.cenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.CadenaLetras;

public class CadenaLetrasTest {

	static CadenaLetras cl;

	@Before
	public void init() {
		cl = new CadenaLetras();
	}

	@Test
	public void code() throws Exception {
		assertEquals("A", cl.codificar("Z", 1));
	}

	
}
