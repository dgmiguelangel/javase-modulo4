package clase9.interfaces;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Camion c1 = new Camion("amarillo", "peugeot", new Patente("owc2589", false), true, "12454dfda", "remolque", 4, 500);
		c1.reparar(LocalDate.now(), "filtro", "Jose");
		
	}

}
