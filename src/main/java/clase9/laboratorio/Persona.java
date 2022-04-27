package clase9.laboratorio;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona implements Persistencia {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private LocalDate fechaNacimiento;
	
	private static int contador = 0;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento) {
		super();
		id = ++contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}	
		
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	public int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public boolean esMayorEdad() {
		return calcularEdad() >= 18 ? true : false;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
