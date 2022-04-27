package clase9.laboratorio;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Alumno[] alumnos;
		byte ca = 0, cc;

		String nombre, apellido;

		String tipoDocumento;
		int numeroDocumento;

		LocalDate fechaNacimiento;

		String[] cursos;

		System.out.println("Ingrese cantidad de alumnos");
		ca = sc.nextByte();
		alumnos = new Alumno[ca];		

		for (byte i = 0; i < alumnos.length; i++) {
			
			System.out.println("Ingrese el tipo de persona");
			System.out.println("1-Alumno");
			System.out.println("2-Director");
			System.out.println("3-Profesor");
			System.out.println("4-Administrativo");

			System.out.println("Ingrese el nombre");
			nombre = sc.nextLine();

			sc.nextLine();
			System.out.println("Ingrese el apellido");
			apellido = sc.nextLine();

			System.out.println("Ingrese el tipo de documento");
			tipoDocumento = sc.next();

			System.out.println("Ingrese el nro de documento");
			numeroDocumento = sc.nextInt();

			System.out.println("Ingrese la fecha de nacimiento");
			fechaNacimiento = ingresarFechaNacimiento();
			
			switch (key) {
			case value:
				
				break;

			default:
				break;
			}
			

			System.out.println("Ingrese la cantidad de cursos");
			cc = sc.nextByte();
			cursos = ingresarCursos(cc);

			alumnos[i] = new Alumno(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
					cursos);

		}

		
		System.out.println("\nDatos de los alumnos");

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}

		sc.close();

	}

	private static String[] ingresarCursos(byte cc) {
		String[] cursos = new String[cc];

		for (int i = 0;  i< cursos.length; i++) {
			System.out.println("Ingrese el curso");
			cursos[i] = sc.next();
		}

		return cursos;
	}

	private static LocalDate ingresarFechaNacimiento() {
		int anio, mes, dia;

		System.out.print("Ingrese el año: ");
		anio = sc.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese el dia: ");
		dia = sc.nextInt();

		return LocalDate.of(anio, mes, dia);
	}

}
