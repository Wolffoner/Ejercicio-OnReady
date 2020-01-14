package app;

import controllers.ConsoleController;

public class Main {

	public static void main(String[] args) {

		ConsoleController controlador = new ConsoleController();
		controlador.run();
		controlador.imprimir();
		controlador.separador();
		controlador.vehiculoMasCaro();
		controlador.vehiculoMasBarato();
		controlador.vehiculoLetraY();
		controlador.separador();
		controlador.imprimirOrdenado();
	}
}
