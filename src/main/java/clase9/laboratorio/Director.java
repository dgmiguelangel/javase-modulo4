package clase9.laboratorio;

import java.time.LocalDate;

public class Director extends Empleado {
	
	private String carrera;

	public Director(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento,
			LocalDate fechaCargo, double sueldo, String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}

	
	
	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
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
