package entity;

public class Auto extends Vehiculo {

	private String puertas;

	public Auto() {
	}

	public Auto(String marca, String modelo, String puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public String muestraPuertas() {
		return "Puertas: " + puertas;
	}

	public String toString() {
		return muestraMarca() + " // " + muestraModelo() + " // " + muestraPuertas() + " // " + muestraPrecio();
	}

}
