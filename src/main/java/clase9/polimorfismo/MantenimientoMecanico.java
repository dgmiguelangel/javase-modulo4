package clase9.polimorfismo;

import java.time.LocalDate;

public interface MantenimientoMecanico {
	
	void reparar(LocalDate fecha, String autoParte, String mecanico);

}
