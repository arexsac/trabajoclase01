package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 12 Leer un número entero o decimal y mostrar su doble, triple,
		 * cuadrado y cubo.
		 */
		int l; 
		int doble; 
		int triple; 
		int cuadrado;
		int cubo;
		
		l = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero -> "));	
		
		doble = l*2;
		triple = l*3;
		cuadrado = l*l;
		cubo = l*l*l;
		
		System.out.println("El numero es: "+l);
		System.out.println("El doble es: "+doble);
		System.out.println("El triple es: " + triple);
		System.out.println("El cuadrado es: " + cuadrado);
		System.out.println("El cubo es: " + cubo);
		
	}

}