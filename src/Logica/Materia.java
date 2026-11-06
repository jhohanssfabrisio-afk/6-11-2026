package Logica;

public class Materia {
	private String nombre;
	private String codigo;
	private int creditos;
	private int semestre;
	public Materia() {
		super();
	}
	public Materia(String nombre, String codigo, int creditos, int semestre) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.semestre = semestre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public void method() {
		
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos + ", semestre=" + semestre
				+ "]";
	}
	
}
