package clase9.laboratorio;

public interface Persistencia {
	
	void guardar(Persona persona);
	
	void eliminar(int idPersona);
	
	void modificar(Persona persona);

}
