
/*
 * 
 * 	titular: guarda el cliente titular de la cuenta.
	id: guarda el identificador de la cuenta
	saldo: guarda el dinero dentro de la cuenta
	banco: guarda el banco al que pertenece la cuenta
 * 
 * 
 * Cada una de las clases tiene sus constructores, getters y setters pero CUENTA contiene dos métodos extra los cuales son Traspaso y Transferencia
 * 
 */

public class CUENTA {

	CLIENTE titular;
	String id;
	double saldo;
	BANCO banco;

	public CLIENTE getTitular() {
		return titular;
	}

	public void setTitular(CLIENTE titular) {
		this.titular = titular;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public BANCO getBanco() {
		return banco;
	}

	public void setBanco(BANCO banco) {
		this.banco = banco;
	}

	public static boolean TRANSFERENCIA(CUENTA origen, CUENTA destino, double cantidad) {

		if (origen.getSaldo() < cantidad) {
			return false;
		} else {

			origen.setSaldo(origen.getSaldo() - cantidad);

			destino.setSaldo(destino.getSaldo() + cantidad);

			return true;

		}
	}

	public static boolean TRASPASO(CUENTA origen, CUENTA destino, double cantidad) {

		if (origen.getSaldo() < cantidad && origen.getBanco() != destino.getBanco()
				&& origen.getTitular() != destino.getTitular()) {
			return false;
		} else {

			origen.setSaldo(origen.getSaldo() - cantidad);

			destino.setSaldo(destino.getSaldo() + cantidad);

			return true;

		}

	}

	public CUENTA(CLIENTE titular, String id, double saldo, BANCO banco) {
		super();
		this.titular = titular;
		this.id = id;
		this.saldo = saldo;
		this.banco = banco;
	}

}
