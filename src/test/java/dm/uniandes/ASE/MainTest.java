package dm.uniandes.ASE;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
	
	/**
	 * Metodo principal Prueba 1.
	 */
	@Test
	public void test1() {
		Main test1 = new Main();
		Double resultado = test1.doIntegral(1.1, 9.0);
		assertEquals("La Integral deberia ser 0.35006", 0.35006, resultado, 1e-4);
	}

	/**
	 * Metodo principal Prueba 2.
	 */
	@Test
	public void test2() {
		Main test1 = new Main();
		Double resultado = test1.doIntegral(1.1812, 10.0);
		assertEquals("La Integral deberia ser 0.36757", 0.36757, resultado, 1e-4);
	}
	
	/**
	 * Metodo principal Prueba 3.
	 */
	@Test
	public void test3() {
		Main test1 = new Main();
		Double resultado = test1.doIntegral(2.750 , 30.0);
		assertEquals("La Integral deberia ser 0.49500", 0.49500, resultado, 1e-4);
	}

}
