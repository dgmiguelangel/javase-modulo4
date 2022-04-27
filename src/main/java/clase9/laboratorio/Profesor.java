package clase9.laboratorio;

import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Empleado {
	
	private String[] cursos;

	public Profesor(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento,
			LocalDate fechaCargo, double sueldo, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [cursos=" + Arrays.toString(cursos) + ", toString()=" + super.toString() + "]";
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idPersona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Persona persona) {
		// TODO Auto-generated method stub
		
	}

}
