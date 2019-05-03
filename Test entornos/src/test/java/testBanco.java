import static org.junit.Assert.*;

import org.junit.Test;

public class testBanco {

	/*
	 * Para los test he creado dos bancos, dos clientes y tres cuentas con una cantidad exacta de dinero en su cuenta 
	 * con el fin de conocer cuanto tendran siempre que sume o les reste saldo
	 */
	private BANCO broBANK = new BANCO("broBANK", "0049");
	private BANCO caixa = new BANCO("caixa", "6969");

	private CLIENTE c1 = new CLIENTE("Iban", "Jimene", "465468764A", "C/exactamente pues si", 97652378);
	private CLIENTE c2 = new CLIENTE("Ale", "Jimenez", "457546545B", "C/micasa!!!", 973265497);

	private CUENTA cuentaA = new CUENTA(c1, "00491111222233334444", 150, broBANK);
	private CUENTA cuentaA1 = new CUENTA(c1, "00492222333344445555", 100, broBANK);

	private CUENTA cuentaB = new CUENTA(c2, "69699364273417320192", 759.50, caixa);

	
	/*
	 * En el primer test compruebo mediante un bucle if si cuentaA y cuentaA1 son el mismo titular en ese caso imprimira un OK
	 */
	@Test
	public void testClienteIgual() {

		if (cuentaA.getTitular() == cuentaA1.getTitular()) {
			System.out.println("OK");
		} else {
			System.out.println("***************ERROR*******************");
		}

	}

	
	/*
	 * Se hace una transferencia de 20 euros de la cuentaA a la cuentaB y se hace una comprobacion de que la cuentaA haya perdido esos 20 euros
	 */
	
	@Test
	public void testSaldoOrigen() {

		CUENTA.TRANSFERENCIA(cuentaA, cuentaB, 20);

		if (cuentaA.getSaldo() == 130) {

			System.out.println("Correcto");

		} else {
			fail();
		}

	}

	/*
	 *En este test se hace lo mismo que en el anterior pero comprobando que la cuentaB tenga el saldo con 20 euros mas que en el inicio. 
	 */
	@Test
	public void testSaldoDestino() {

		CUENTA.TRANSFERENCIA(cuentaA, cuentaB, 20);

		if (cuentaB.getSaldo() == 779.50) {

			System.out.println("Correcto");

		} else {
			fail();
		}

	}
	
	/*
	 * los dos siguientes test se ha hecho con el método assertEquals que me devolverá un 
	 * true o false segun lo que haya escrito en la primera parte (true o false)
	 * y la operación posterior que deberá devolver un true o false si es posible de realizar, 
	 * entonces si los dos coinciden en el valor booleano el assert devolverá un true
	 */

	@Test
	public void testDineroSuficiente() {

		assertEquals(true, CUENTA.TRANSFERENCIA(cuentaA, cuentaB, 50));

	}

	@Test
	public void testDineroInsuficiente() {
		assertEquals(false, CUENTA.TRANSFERENCIA(cuentaA, cuentaB, 200));

	}

	/*
	 * 
	 * test procede a hacer un traspaso y a comprobar que los diferentes 
	 * campos de la cuenta sean los mismos ademas de que se 
	 * haya realizado la operación con éxito en caso contrario dará error
	 * 
	 */
	
	@Test
	public void testSaldoTDD() {
		CUENTA.TRASPASO(cuentaA, cuentaA1, 80);

		if (	cuentaA.getTitular() == cuentaA1.getTitular() 
				&& cuentaA.getBanco() == cuentaA1.getBanco()
				&& cuentaA.getSaldo() == 150 - 80 
				&& cuentaA1.getSaldo() == 100 + 80) {
			System.out.println("Correcto");
		} else {
			fail();
		}
	}

}
