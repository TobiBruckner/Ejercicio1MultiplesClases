package Ejercicio1;

public class Empresa {
	//ATRIBUTOS
	private String nombre;
	private String direccion;
	private int cuit;
	//CONSTRUCTOR
	public Empresa(String nombre, String direccion, int cuit) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cuit = cuit;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	
}
