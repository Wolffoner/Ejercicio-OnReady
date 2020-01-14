package entity;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto() {
	}

	public Moto(String marca, String modelo, String cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String muestraCilindrada() {
		return "Cilindrada: " + cilindrada;
	}

	public String toString() {
		return muestraMarca() + " // " + muestraModelo() + " // " + muestraCilindrada() + " // " + muestraPrecio();
	}
}
