package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsoLocalDate {

	public static void main(String[] args) {

		System.out.println("\n---------------FECHA ACTUAL");
		fechaActual();

		System.out.println("---------------FECHA");
		fechaEspecifica();

		System.out.println("\n---------------FECHA Y HORA");
		fechaYHora();

		System.out.println("\n---------------CALCULAR EDAD");
		calcularEdad();

		System.out.println("\n---------------FORMATEAR FECHAS");
		formatearFechas();

		System.out.println("\n---------------COMPARAR FECHAS");
		compararFechas();

		System.out.println("\n---------------CONVERTIR TIPOS");
		convertToLocalDate();

	}

	private static void fechaActual() {
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
	}

	private static void fechaEspecifica() {
		LocalDate fecha = LocalDate.of(1968, 10, 9);
		System.out.println(fecha);
	}

	private static void fechaYHora() {
		LocalDateTime fechaHora = LocalDateTime.of(2018, 10, 10, 11, 25, 30);
		System.out.println(fechaHora);
	}

	private static void calcularEdad() {
		int edad = Period.between(LocalDate.of(1968, 10, 9), LocalDate.now()).getYears();
		System.out.println("edad= " + edad);
	}

	private static void formatearFechas() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha.format(dtf));
	}

	private static void compararFechas() {
		String fechaS1 = "2015-01-01";
		String fechaS2 = "2015-02-01";

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fecha1 = LocalDate.parse(fechaS1, dtf);
		LocalDate fecha2 = LocalDate.parse(fechaS2, dtf);

		if (fecha1.isEqual(fecha2)) {
			System.out.println("Fecha 1 es igual a fecha2");

		} else if (fecha1.isAfter(fecha2)) {
			System.out.println("Fecha 1 es mayor a fecha2");

		} else if (fecha1.isBefore(fecha2)) {
			System.out.println("Fecha 1 es menor a fecha2");
		}
	}

	public static void convertToLocalDate() {
		Date fecha = new Date();
		System.out.println(fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}

}
