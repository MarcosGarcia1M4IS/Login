package practica;
import java.util.Scanner;
public class binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
		int binario;
		double octal = 0;
		
		System.out.println("Ingrese el número binario");
		binario = tc.nextInt();
		
		String numer = String.valueOf(binario);
		char[] digito = numer.toCharArray();
		int[] digitos = new int [digito.length];
		int[] decimal = new int[digitos.length];
        
		for (int i = 0; i < digito.length; i++) {
            digitos[i] = Character.getNumericValue(digito[i]);
        }
        
		
		
        for(int i = 0; i < decimal.length; i++) {
        	decimal[i] = (int) Math.pow(2, digitos.length - (i+1));
   octal = decimal[i] * digitos[i] + octal; 
        
         
        }
        
       System.out.println(octal);

	tc.close();
	}
	
}
