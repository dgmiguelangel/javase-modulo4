package clase9.interfaces;

import java.time.LocalDate;

public interface MantenimientoMecanico {
	
	void reparar(LocalDate fecha, String autoParte, String mecanico);

}
