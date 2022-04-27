package clase9.polimorfismo;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Auto auto = new Camion("amarillo", "peugeot", new Patente("owc2589", false), true, "12454dfda", "remolque", 4, 500);
//		auto.getCapaciad(); //The method getCapaciad() is undefined for the type Auto		
		auto.reparar(LocalDate.now(), "filtro", "Jose");
		
		Camion camion = (Camion) auto;
		System.out.println("capacidad: " + camion.getCapacidad());
		
		auto = new Compacto("rojo", "audi", new Patente("wer1245", false), true, 2);
		auto.reparar(LocalDate.of(2015, 1, 10), "embrague", "Maria");		
		
	}

}
