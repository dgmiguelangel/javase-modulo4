package clase9.laboratorio;

import java.time.LocalDate;

public class Administrativo extends Empleado {	

	public Administrativo(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento,
			LocalDate fechaCargo, double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
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
