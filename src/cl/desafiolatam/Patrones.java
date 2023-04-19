//Programa que permite dibujar patrones simples según el valor que ingrese el usuario
package cl.desafiolatam;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
    	int n; //Declaración de Variables
    	Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de caracteres a mostrar: ");
        n = tecla.nextInt();
        
        System.out.println("Impresión del Patron 1");
        
        // Patrón 1
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println("Patron 2");          
        
        
        // Patrón 2
        for (int i = 1; i <= n; i++) {
        	if ((i % 4) !=0) {
        		System.out.print(i % 4);
        	}
        	else {
        		System.out.print(4);        		
        	}
    
        }
        
        System.out.println();
        System.out.println("Patron 3 ");      
     
        
        // Patrón 3
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("*");
            } else {
                System.out.print("|");
            }
        }
        System.out.println();
        tecla.close();       
        
    }
}

