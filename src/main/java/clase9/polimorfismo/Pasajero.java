package clase9.polimorfismo;

import java.time.LocalDate;

public class Pasajero extends Transporte {

	private boolean accesoEspecial;

	public Pasajero(String color, String marca, Patente patente, boolean encendido, String licencia, String tipo,
			boolean accesoEspecial) {
		super(color, marca, patente, encendido, licencia, tipo);
		this.accesoEspecial = accesoEspecial;
	}

	@Override
	public String toString() {
		return "Pasajero [accesoEspecial=" + accesoEspecial + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void vender() {
		System.out.println("pasajero vendido " + this);
	}

	@Override
	public void reparar(LocalDate fecha, String autoParte, String mecanico) {
		System.out.println("transporte de pasajeros reparado el " + fecha + ", por el mecanico " + mecanico);
	}

	public boolean isAccesoEspecial() {
		return accesoEspecial;
	}

	public void setAccesoEspecial(boolean accesoEspecial) {
		this.accesoEspecial = accesoEspecial;
	}

}
