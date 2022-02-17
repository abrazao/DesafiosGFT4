// O jogo de xadrez possui várias peças com movimentos curiosos: 
// uma delas é a dama, que pode se mover qualquer quantidade de casas na mesma linha, 
// na mesma coluna, ou em uma das duas diagonais

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x1,y1,x2,y2;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
	    	if(x1 == x2 && y1 == y2)		
	    		System.out.println("0"); // Nenhum movimento
	        else if(x1 == x2 || y1 != y2)	
	        	System.out.println("1"); // Um movimento na vertical
	    	else if(x1 != x2 && y1 == y2) // Um movimento na horizontal
	    		System.out.println("1");	
	        else 
	        	System.out.println("2");	
	    }
		sc.close();
	}
}