package Logica;
import Logica.Estudiante;
import Logica.Materia;
public class Nota {
	private int Parcial1;
	private int Parcial2;
	private int Parcial3;
	private int ExamenFinal;
	private int NotaFinal;
	private Estudiante universitario;
	private Materia asignatura;
	public Nota(int parcial1, int parcial2, int parcial3, int examenFinal, int notaFinal, Estudiante universitario,
			Materia asignatura) {
		super();
		Parcial1 = parcial1;
		Parcial2 = parcial2;
		Parcial3 = parcial3;
		ExamenFinal = examenFinal;
		NotaFinal = notaFinal;
		this.universitario = universitario;
		this.asignatura = asignatura;
	}
	public Nota() {
		super();
	}
	public int getParcial1() {
		return Parcial1;
	}
	public void setParcial1(int parcial1) {
		Parcial1 = parcial1;
	}
	public int getParcial2() {
		return Parcial2;
	}
	public void setParcial2(int parcial2) {
		Parcial2 = parcial2;
	}
	public int getParcial3() {
		return Parcial3;
	}
	public void setParcial3(int parcial3) {
		Parcial3 = parcial3;
	}
	public int getExamenFinal() {
		return ExamenFinal;
	}
	public void setExamenFinal(int examenFinal) {
		ExamenFinal = examenFinal;
	}
	public int getNotaFinal() {
		return NotaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		NotaFinal = notaFinal;
	}
	public Estudiante getUniversitario() {
		return universitario;
	}
	public void setUniversitario(Estudiante universitario) {
		this.universitario = universitario;
	}
	public Materia getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Materia asignatura) {
		this.asignatura = asignatura;
	}
	
	public void method() {
		
	}
	@Override
	public String toString() {
		return "Nota [Parcial1=" + Parcial1 + ", Parcial2=" + Parcial2 + ", Parcial3=" + Parcial3 + ", ExamenFinal="
				+ ExamenFinal + ", NotaFinal=" + NotaFinal + ", universitario=" + universitario + ", asignatura="
				+ asignatura + "]";
	}
	
}
