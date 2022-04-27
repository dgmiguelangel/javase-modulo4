package fechas;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UsoCalendar {

	public static void main(String[] args) {

		System.out.println("\n---------------CALENDAR");
		fechaActual();
		
		System.out.println("\n---------------FECHA");
		leerFecha();
	}

	private static void fechaActual() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		System.out.println("Año: " + c.get(Calendar.YEAR));
		System.out.println("Mes: " + (c.get(Calendar.MONTH) + 1));
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
	}

	private static void leerFecha() {
		Scanner sc = new Scanner(System.in);
		int anio, mes, dia;
		Calendar fecha;

		System.out.print("Ingrese el año: ");
		anio = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();

		fecha = Calendar.getInstance();
		fecha.set(anio, mes, dia);
		System.out.println(
				fecha.get(Calendar.YEAR) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.DAY_OF_MONTH));

		sc.close();
	}

}
