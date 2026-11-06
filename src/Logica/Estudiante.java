package Logica;
import Logica.Materia;
public class Estudiante {
	private String nombre;
	private String apellido;
	private String ci;
	private String carrera;
	
	public Estudiante(String nombre, String apellido, String ci, String carrera) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.carrera = carrera;
	}
	public Estudiante() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void method() {
		
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", carrera=" + carrera + "]";
	}
	
}
