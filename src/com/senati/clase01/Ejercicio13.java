package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 13 Lea una cantidad en nuevos soles y obtenga su equivalencia en
		 * euros. Debe leer también el tipo de cambio del día (es decir, a cuánto
		 * equivale un euro en nuevos soles).
		 */
		float l; 
		float cambio; 
	
		l = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero -> "));	
		
		cambio = l*35/10;
		
		System.out.println("su dinero es: "+l);
		System.out.println("El cambio del euro al dia es: 3.5 soles ");
		System.out.println("Su cambio es: "+cambio);
	}

}
