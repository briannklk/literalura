package com.alura.literalura;
import com.fasterxml.jackson.databind.ObjectMapper;
/*Profe aca me paso algo, en la página de trello cuando le doy a la opcion de jackson me lleva a jackson core,
no a la de databind y parace ser que lo de objectmapper no está en jackson core, puse la dependencia con el core
y no me dejaba poner lo de objetmapper*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {SpringApplication.run(LiteraluraApplication.class, args);
		Scanner keloke = new Scanner(System.in);
		HttpClient client = HttpClient.newHttpClient();
		ObjectMapper mapper = new ObjectMapper();
		int opcion;

		while (true) {
			System.out.println("----------------------");
			System.out.println("Elija una opción correcta");
			System.out.println("\n1) Buscar libro");
			System.out.println("2) Libros Registrados");
			System.out.println("3) Autores Registrados");
			System.out.println("4) Autores vivos en un determinado año");
			System.out.println("5) Libros por idioma");
			System.out.println("0) Salir");
			keloke.nextInt();
			try {
				opcion = keloke.nextInt();
				keloke.nextLine();
			}catch (Exception e){
				System.out.println("Por favor Ingresa Un Numero.");
				keloke.nextLine();
				continue;
			}
			if (opcion == 0) {
				System.out.println("Saliendo de la aplicacion");
				break;
			}
			if(opcion < 1 || opcion >5){
				System.out.println("Opcion invalida, por favor selecciones una de las opciones estipuladas.");

				continue;
			}
			double resultado = 0;
			switch (opcion) {
				case 1:
					System.out.println("Ingrese el nombre del libro que sea buscar");
					break;
				case 2:
					System.out.println("Libros registrados...\n");

					break;
				case 3:
					System.out.println("Autores registrados....\n");

					break;
				case 4:
					System.out.println("Autores vivos del año sugerido");

					break;
				case 5:
					System.out.println("Seleccione el idioma deseado para libros disponibles");

					break;
				default:
					System.out.println("Opción inválida");
			}
		}
	}
}
