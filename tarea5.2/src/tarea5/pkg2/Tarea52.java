/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5.pkg2;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		String palabra;
		int pos;
		char carter;
		System.out.println("Introduzca la palabra: ");
		palabra = scan.next();
		pos = palabra.length() - 2;
		while (pos >= 0){
			carter = palabra.charAt(pos);
			palabra = palabra + carter;
			pos--;
		}
		System.out.println("Palabra espejo: " + palabra);
   }
    
}
