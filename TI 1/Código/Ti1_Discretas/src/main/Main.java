package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import model.Edificio;
import model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Persona> personas = new LinkedList<>();
		int cantED = sc.nextInt();
		for (int i = 0; i < cantED; i++) {
			Edificio x = new Edificio();
			String nombreED = sc.next();
			int cantPersonas = sc.nextInt();
			int cantPisos = sc.nextInt();
			int cantOficinas = sc.nextInt();
			for (int j = 0; j < cantPersonas; j++) {
				String nombre = sc.next();
				int pisoACT = sc.nextInt();
				int oficina = sc.nextInt();
				Persona person = new Persona(nombre, pisoACT, oficina);
				personas.add(person);
			}
			System.out.println("\n" + "Movimientos edificio " + nombreED);
			cantOficinas = cantOficinas * cantPisos;
			for (int j = 0; j < cantPersonas; j++) {
				System.out.println(x.ascensor(personas.poll(), cantOficinas));
			}
			System.out.println(x.print(cantPersonas));
			
		}
	}

}
