
/*
 * 	nombre: String que guarda el nombre del cliente.
	apellidos: String que guarda el apellido del cliente.
	direccion: guarda la direccion de residencia del cliente.
	tel: guarda el numero de telefono del cliente.
 */

public class CLIENTE {

	String nombre;
	String apellidos;
	String dni;
	String direccion;
	int tel;

	public CLIENTE(String nombre, String apellidos, String dni, String direccion, int tel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.tel = tel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getdni() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return tel;
	}

	public void setTelefono(int tel) {
		this.tel = tel;
	}

}
