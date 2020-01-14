package entity;

import java.text.DecimalFormat;

public abstract class Vehiculo implements IVehiculo, Comparable<Vehiculo> {

	private String marca;
	private String modelo;
	private double precio;

	public Vehiculo() {

	}

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String muestraMarca() {
		return ("Marca: " + getMarca());
	}

	public String muestraModelo() {
		return ("Modelo: " + getModelo());
	}

	public String muestraPrecio() {
		DecimalFormat formatoPrecio = new DecimalFormat("###,###.00");
		return "Precio: $" + formatoPrecio.format(getPrecio());
	}

	public String toString() {
		return muestraMarca() + " // " + muestraModelo() + " // " + muestraPrecio();
	}

	public String descripcion() {
		return getMarca() + " " + getModelo() + " $" + getPrecio();
	}

	public String miniDescripcion() {
		return getMarca() + " " + getModelo();
	}

	public int compareTo(Vehiculo otroV) {
		if (otroV.getPrecio() < precio) {
			return -1;
		} else if (otroV.getPrecio() == precio) {
			return 0;
		} else {
			return 1;
		}

	}

}
