package Ejercicio1;

public class Empleado {
	//ATRIBUTOS
	private String nombre;
	private String puesto;
	private int horas;
	private Departamento departamento;
	private double salario;
	//CONSTRUCTOR
	public Empleado(String nombre, String puesto, int horas, Departamento departamento, double salario) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.horas = horas;
		this.departamento = departamento;
		this.salario = salario;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//MÉTODO
	public int calcular_sueldo() {
		
		
	}
	
}
