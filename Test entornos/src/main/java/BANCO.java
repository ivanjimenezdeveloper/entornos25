
/*
 * 
 * compania: guarda el nombre de la compañia.	
 * id: guarda el numero inicial de las cuentas bancarias asociadas a este banco.
 */
public class BANCO {

	String compania;
	String id;
	
	
	public BANCO(String compania, String id) {
		super();
		this.compania = compania;
		this.id = id;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getId() {
		return id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	
	

}
