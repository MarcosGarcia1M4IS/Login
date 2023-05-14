package practica;
import java.util.Arrays;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tc = new Scanner(System.in);
int op = 0;		

int [][] matriz = new int[3][3];
		System.out.println("Ingrese los elementos de la matriz");
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = tc.nextInt(); 
			}
		}
	
		
	while(op!=5) {
		
		System.out.println("Ingrese la opción que desea");
		System.out.println("1. Mostrar matriz");
		System.out.println("2. Diagonal principal");
		System.out.println("3. Elementos sobre D/P");
		System.out.println("4. Elementos bajo D/P");
		System.out.println("5. Salir");
		
		op = tc.nextInt();
		
		switch(op){
		case 1: 	
			for(int[] cadena : matriz) {
				System.out.println(Arrays.toString(cadena));
				}		
		break;
		case 2: 
		for(int i = 0; i<matriz.length; i ++) {
			System.out.println(matriz[i][i]);
		}
		break;
		
		case 3:
			for (int i = 0; i<matriz.length; i++) {
				for(int j = i + 1; j < matriz.length; j++) {
					System.out.println(matriz[i][j] + " ");
				}
			}
			break;
			
		case 4: 
			for (int i = 1; i < matriz.length; i++) {
		        for(int j = 0; j < i; j++) { 
		            System.out.println(matriz[i][j] + " ");
		        }
		    }
			break;
		case 5: 
			System.out.println("Saliendo...");
			break;
		}
	 
	
	}
	
	
	
	
		tc.close();
	}

}
