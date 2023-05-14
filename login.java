package practica;
import java.util.Scanner;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Scanner tc = new Scanner(System.in);
		String usuario = "Marcos";
		String password = "Hola mundo";
		boolean i = false;
		int cont = 0, cC = 100, cP = 100, cant_a = 0;
		int c = 0;
		double pc = 0, pp = 0, pca = 10.5, pcd = 25.5, precioTotal = 0;
		char op = 0;
	
		while(i == false && cont <3) {
			System.out.println("Ingrese el nombre de usuario");
			String user = tc.nextLine();
			System.out.println("Ingrese la contraseña");
			String contra = tc.nextLine();
if(user.equals(usuario) && contra.equals(password)) {
	System.out.println("Bienvenido al sistema!");
	i = true;
}else {
	System.out.println("Contraseña o usuario incorrecto!. Intente de nuevo");
	System.out.println("Intento " +  (cont + 1) + " de 3");
	cont = cont + 1;
}
		}
System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
	if (cont == 3) {
		System.out.println("Inicio de sesión bloqueado!!");
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
			
	if(i == true) {
		
		Object[][] inventario = new Object[][]{
			{001, "Camisas", 10.5, cC},
			{002, "Pantalones", 25.5, cP}
		};
		
		
		
		while(op != 'e') {
			System.out.println("Ingrese la opción que desea");
			System.out.println("a. Mostrar inventario");
			System.out.println("b. Añadir artículo");
			System.out.println("c. Realizar Venta");
			System.out.println("d. Imprimir factura");
			System.out.println("e. Salir");
	 op = tc.next().charAt(0);		

	 switch(op) {
	 case 'a':
			
		 System.out.println("Codigo | Nombre       | Precio | Cantidad | Total");
	        System.out.println("----------------------------------------------------");
		 for(int j = 0; j < inventario.length; j++) {
			 int codigo = (int)inventario[j][0];
			 String nombre = (String)inventario[j][1];
			 double  precio = (double )inventario[j][2];
			 int cant = 0;
			 if (codigo == 001) {
		            cant = cC;
		        } else if (codigo == 002) {
		            cant = cP;
		        }
			 double total = precio * cant;
			 System.out.printf("%6s | %-12s | %6.2f | %8d | %6.2f%n", codigo, nombre, precio, cant, total);
			 
		 }
		 
		 break;
	 
	 case 'b':
			System.out.println("Ingrese el codigo del producto");
			int cod = tc.nextInt();
		if(cod == 001) {
			System.out.println("Ingrese la cantidad a agregar");
			int cant = tc.nextInt();
			
			if (cant <= 0) {
				System.out.println("Cantidad invalida");
			}else {
				cC = cC + cant;
			}
			
		}else if(cod == 002) {
			System.out.println("Ingrese la cantidad a agregar");
			int cant = tc.nextInt();
			
			if (cant <= 0) {
				System.out.println("Cantidad invalida");
			}else {
				cP = cP + cant;
			}
			
		} else {
			System.out.println("Código inexistente.");
		}
			
		 break;
	 
	 case 'c':
		 
		 
			System.out.println("Ingrese la cantidad de camisas a vender");
		   cant_a = tc.nextInt();
		   if(cant_a < 0 || cant_a > cC) {
			   System.out.println("Valor invalido");
		   }
		   System.out.println("Ingrese la cantidad de pantalones a vender");
		    c = tc.nextInt();
		    if(c < 0 || c>cP){
		    	   System.out.println("Valor invalido");  	
		    }
		   
		   if(cant_a >= 0 && c >= 0 && cant_a <= cC && c <= cP){
			   cC = cC-cant_a;   
			   cP = cP - c;  
			   pc = (cant_a * 10.5);
			   pp = c * 25.5;
		       precioTotal = pc + pp;  
		   } else {
		    	cant_a = 0;
		    	c = 0;
		    }
		    
		
		
		break;
	 
	 case 'd':
		 
			System.out.println("************IMPRIMIENDO VOUCHER DE FACTURA!!*****************************");
			System.out.println("****************************************************");
			System.out.println("Camisas Cantidad: " + cant_a + " p/u: " + pca);
			System.out.println("Cantidad x pagar/camisas: " + pc);
			System.out.println("Pantalones cantidad " + c + " p/u: " + pcd);
			System.out.println("Cantidad x pagar/pantalones: " + pp);
			System.out.println("Precio Total a pagar: " + precioTotal);
			System.out.println("*************************************************************************");		
			
			
			break;
	
	 case 'e':
			System.out.println("Saliendo...");
		 break;
	 }
		 

		}
		
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
		tc.close();
		
	}catch( java.util.InputMismatchException f) {
	System.out.println("Error");
	}
}

}
