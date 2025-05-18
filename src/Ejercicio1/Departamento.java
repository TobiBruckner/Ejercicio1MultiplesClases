package Ejercicio1;

public class Departamento {
	//ATRIBUTOS
	private String nombre;
	private int bonificacion;
	private int cantidad_empleados;
	private Empresa empresa;
	//CONSTRUCTOR
	public Departamento(String nombre, int bonificacion, int cantidad_empleados, Empresa empresa) {
		this.nombre = nombre;
		this.bonificacion = bonificacion;
		this.cantidad_empleados = cantidad_empleados;
		this.empresa = empresa;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	public int getCantidad_empleados() {
		return cantidad_empleados;
	}
	public void setCantidad_empleados(int cantidad_empleados) {
		this.cantidad_empleados = cantidad_empleados;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
