package com.gabogar.Practica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica1Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);

		System.out.println("---- Bienvenido ----");
		System.out.println("Ingrese la opción deseada: ");
		System.out.println("1. Mostrar una tabla de multiplicar");
		System.out.println("2. Mostrar tablas del 2 al 5");
		System.out.println("3. Salir del programa");

		while (true) {
			int opcion = 0;
			try {
				opcion = System.in.read();
			} catch (Exception e) {
				System.out.println("Error al leer la opción");
			}
			switch (opcion) {
				case 1:
					System.out.println("Ingrese el número de la tabla que desea mostrar: ");
					int tabla = 0;
					try {
						tabla = System.in.read();
					} catch (Exception e) {
						System.out.println("Error al leer el número de la tabla");
					}
					for (int i = 1; i <= 10 && i > 1; i++) {
						System.out.println(tabla + " x " + i + " = " + tabla * i);
					}
					break;
				case 2:
					for (int i = 2; i <= 5; i++) {
						System.out.println("Tabla del " + i);
						for (int j = 1; j <= 10; j++) {
							System.out.println(i + " x " + j + " = " + i * j);
						}
					}
					break;
				case 3:

				default:
					System.out.println("Opción no válida");
					break;
			}
		}
	}

}
