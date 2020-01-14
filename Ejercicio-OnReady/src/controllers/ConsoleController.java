package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import entity.Auto;
import entity.Moto;
import entity.Vehiculo;

public class ConsoleController {

	private ArrayList<Vehiculo> lista;

	public void run() {
		lista = new ArrayList<>();
		Auto auto1 = new Auto("Peugeot", "206", "4", 200000);
		lista.add(auto1);
		Moto moto1 = new Moto("Honda", "Titan", "125c", 60000);
		lista.add(moto1);
		Auto auto2 = new Auto("Peugeot", "208", "5", 250000);
		lista.add(auto2);
		Moto moto2 = new Moto("Yamaha", "YBR", "160c", 80500.50);
		lista.add(moto2);
	}

	public void imprimir() {
		Iterator<Vehiculo> iterador = lista.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().toString());
		}
	}

	public void separador() {
		System.out.println("=========================================");
	}

	public void vehiculoMasBarato() {
		Collections.sort(lista);
		String vehiculoBarato = lista.get((lista.size() - 1)).miniDescripcion();
		System.out.println("Vehículo más barato: " + vehiculoBarato);
	}

	public void vehiculoMasCaro() {
		Collections.sort(lista);
		String vehiculoCaro = lista.get(0).miniDescripcion();
		System.out.println("Vehículo más Caro: " + vehiculoCaro);
	}

	public void vehiculoLetraY() {
		for (Vehiculo v : lista) {
			if (v.getMarca().contains("Y")) {
				System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + v.descripcion());
			}
		}
	}

	public void imprimirOrdenado() {
		Collections.sort(lista);
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		for (Vehiculo v : lista) {
			System.out.println(v.getMarca() + " " + v.getModelo());
		}
	}
}
