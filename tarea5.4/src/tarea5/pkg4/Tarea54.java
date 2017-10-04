/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5.pkg4;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		String cadena, subcadena, subcadenaUpper;
		System.out.println("Introduzca la cadena: ");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar: ");
		subcadena = scan.nextLine();
		subcadenaUpper = subcadena.toUpperCase();
		cadena = cadena.replace(subcadena, subcadenaUpper);
		System.out.println(cadena);
	
    }
    
}
