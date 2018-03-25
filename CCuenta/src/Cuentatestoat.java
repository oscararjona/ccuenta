import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Cuentatestoat {
	

		

	@Test
	
	public void testnuevacuenta() {
		Ccuenta nueva=new Ccuenta("Ana","lopez",3200,1);
		assertNotNull(nueva);
	}

	@Test
	public void testGetSaldo() {
		Ccuenta nueva=new Ccuenta("Ana","lopez",3200,1);
		assertEquals(3200, nueva.getSaldo(),0);
	}

	@Test
	public void testIngresar() throws Exception{
    Ccuenta nueva=new Ccuenta("Ana","Lopez",3200,1);
	nueva.ingresar(500);
	assertEquals(3700,nueva.getSaldo(),0);
		
		
	}
	@Test(expected=Exception.class)
	public void testIngresarnegativo() throws Exception{
	Ccuenta nueva=new Ccuenta("Ana","López",3200,1);
	nueva.ingresar(-600);
	}
	@Test
	public void testRetirar() throws Exception{
		Ccuenta nueva=new Ccuenta("Ana","lopez",3200,1);
		nueva.retirar(500);
		assertEquals(2700,nueva.getSaldo(),0);
	}

	@Test(expected=Exception.class)
	public void testGetCuenta()throws Exception {
		Ccuenta nueva=new Ccuenta("Ana","lopez",3200,1);
		nueva.retirar(3500);
	}

}
