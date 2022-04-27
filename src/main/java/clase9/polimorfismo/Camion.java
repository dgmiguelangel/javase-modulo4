package clase9.polimorfismo;

import java.time.LocalDate;

public class Camion extends Transporte {
	
	private int ejes;
	private double capacidad;
	
	public Camion() {
		super();
	}
	
	
	public Camion(String color, String marca, Patente patente, boolean encendido, String licencia, String tipo, int ejes,
			double capacidad) {
		super(color, marca, patente, encendido, licencia, tipo);
		this.ejes = ejes;
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + ", capacidad=" + capacidad + ", toString()=" + super.toString() + "]";
	}
	

	@Override
	public void vender() {
		System.out.println("camion vendido " + this);		
	}
	
	@Override
	public void reparar(LocalDate fecha, String autoParte, String mecanico) {
		System.out.println("camion reparado el " + fecha + ", por el mecanico " + mecanico);		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}



}
