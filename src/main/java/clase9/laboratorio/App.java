package clase9.laboratorio;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Persona[] personas;
		byte cp = 0, cc;

		String nombre, apellido;

		String tipoDocumento;
		int numeroDocumento;

		LocalDate fechaNacimiento;

		String[] cursos;
		
		Persona persona = null;
		int tipoPersona;
		
		LocalDate fechaCargo;
		double sueldo;
		String carrera;		

		System.out.println("Ingrese cantidad de personas");
		cp = sc.nextByte();		
		personas = new Persona[cp];		

		for (byte i = 0; i < personas.length; i++) {
			
			System.out.println("Ingrese el tipo de persona:");
			System.out.println("1-Alumno");
			System.out.println("2-Director");
			System.out.println("3-Profesor");
			System.out.println("4-Administrativo");
			
			tipoPersona = sc.nextInt();			

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
			fechaNacimiento = ingresarFecha();
			
			
			switch (tipoPersona) {
				case 1: // alumno					
					System.out.println("Ingrese la cantidad de cursos");
					cc = sc.nextByte();
					cursos = ingresarCursos(cc);
	
					persona = new Alumno(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
							cursos);
	
					break;
					
	
				case 2: // director
					System.out.println("Ingrese la fecha de inicio del cargo: ");
					fechaCargo = ingresarFecha();
	
					System.out.print("Ingrese el sueldo: ");
					sueldo = sc.nextDouble();
	
					sc.nextLine();
					System.out.println("Ingrese la carrera: ");
					carrera = sc.nextLine();
	
					persona = new Director(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
							fechaCargo, sueldo, carrera);
	
					break;
					
					
				case 3: // profesor
					System.out.println("Ingrese la fecha de inicio del cargo: ");
					fechaCargo = ingresarFecha();
	
					System.out.print("Ingrese el sueldo: ");
					sueldo = sc.nextDouble();
	
					System.out.print("Ingrese la cantidad de cursos: ");
					cc = sc.nextByte();
					cursos = ingresarCursos(cc);
	
					persona = new Profesor(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), fechaNacimiento,
							fechaCargo, sueldo, cursos);
	
					break;
					
					
				case 4: // administrativo
					System.out.println("Ingrese la fecha de inicio del cargo: ");
					fechaCargo = ingresarFecha();
	
					System.out.print("Ingrese el sueldo: ");
					sueldo = sc.nextDouble();
	
					persona = new Administrativo(nombre, apellido, new Documento(tipoDocumento, numeroDocumento),
							fechaNacimiento, fechaCargo, sueldo);
	
					break;
					
			}
			
			personas[i] = persona;

		}

		
		System.out.println("\nDatos de las personas");

		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
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

	
	private static LocalDate ingresarFecha() {
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
