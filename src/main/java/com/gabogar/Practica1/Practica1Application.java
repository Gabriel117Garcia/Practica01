package com.gabogar.Practica1;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Practica1Application {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("¿Cúal es su nombre?");
			String nombre = scanner.nextLine();
			System.out.println("Hola " + nombre + "!");

			System.out.println("Ingrese la opción deseada: ");
			System.out.println("1. Mostrar una tabla de multiplicar");
			System.out.println("2. Mostrar tablas del 2 al 5");
			System.out.println("3. Salir del programa");

			while (true) {
				int opcion = scanner.nextInt();

				switch (opcion) {
					case 1:
						System.out.println("Ingrese el número de la tabla que desea mostrar: ");
						int tabla = scanner.nextInt();
						for (int i = 1; i <= 10; i++) {
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
						System.out.println("Saliendo del programa...");
						System.out.println("¡Hasta luego " + nombre + "!");
						return;
					default:
						System.out.println("Opción no válida");
						break;
				}
			}
		}
	}

