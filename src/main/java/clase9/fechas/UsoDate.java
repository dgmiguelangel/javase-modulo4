package clase9.fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class UsoDate {

	public static void main(String[] args) {

		System.out.println("\n---------------FECHA ACTUAL");
		fechaActual();

		System.out.println("---------------FECHA");
		fechaEspecifica();

		System.out.println("\n---------------FECHA Y HORA");
		fechaYHora();

		System.out.println("\n---------------CALCULAR EDAD");
		calcularEdad();

		System.out.println("\n---------------COMPARAR FECHAS");
		compararFechas();

		System.out.println("\n---------------FORMATEAR FECHAS");
		formatearFechas();

		System.out.println("\n---------------CONVERTIR FECHAS");
		convertToDate();

		System.out.println("\n---------------FECHA");
		leerFecha();		
	}

	private static void fechaActual() {
		Date fecha = new Date();
		System.out.println("Año: " + fecha.getYear() + 1900);
		System.out.println("Mes: " + fecha.getMonth() + 1);
		System.out.println("Dia: " + fecha.getDate());
	}

	private static void fechaEspecifica() {
		Date fecha = new Date(122, 3, 25); // 2022-1900=122, 4-1=3
		System.out.println(fecha);
	}

	private static void fechaYHora() {
		Date fecha = new Date(122, 3, 25, 10, 11, 30); // (10)hora (11)minuto (30)segundo
		System.out.println(fecha);
		System.out.println("Año: " + (fecha.getYear() + 1900));
		System.out.println("Mes: " + (fecha.getMonth() + 1));
		System.out.println("Dia: " + fecha.getDate());
		System.out.println("Dia de la semana " + fecha.getDay());
		System.out.println("Hora: " + fecha.getHours());
		System.out.println("Minutos: " + fecha.getMinutes());
		System.out.println("Segundos: " + fecha.getSeconds());
	}

	private static void calcularEdad() {
		Date fechaNacimiento = new Date(1968 - 1900, 11 - 1, 9);
		Date fechaActual = new Date();

		long difMiliSeg = fechaActual.getTime() - fechaNacimiento.getTime();
		Date edad = new Date(difMiliSeg);
		System.out.println(edad.getYear() - 70);
	}

	private static void compararFechas() {
		Date date1 = new Date();
		Date date2 = new Date();

		if (date1.compareTo(date2) == 0) {
			System.out.println("IGUALES");
			
		} else {
			System.out.println("DIFERENTES");
		}
	}

	private static void formatearFechas() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(sdf.format(date));
	}

	private static void convertToDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.now();
		Date fecha2 = Date.from(fecha1.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(sdf.format(fecha2));
	}

	private static void leerFecha() {
		Scanner sc = new Scanner(System.in);
		int anio, mes, dia;
		Date fecha;

		System.out.print("Ingrese el año: ");
		anio = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();

		fecha = new Date(anio - 1900, mes - 1, dia);
		System.out.println(fecha);

		sc.close();
	}

}
