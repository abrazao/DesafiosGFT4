// Ler um n�mero e mostrar os n�meros pares at� esse n�mero, inclusive ele mesmo.

import java.io.IOException;
import java.util.Scanner;

public class NumerosPares {
	
    public static void main(String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);
    	
    	int numerodigitado = 0;
    	
    	numerodigitado = sc.nextInt();
    	
    	for (int i = 1; i <= numerodigitado; i++) {
    			if (i % 2 == 0) {
    				System.out.println(i);
    			}
    	}
    	sc.close();
    }
    
    }
	