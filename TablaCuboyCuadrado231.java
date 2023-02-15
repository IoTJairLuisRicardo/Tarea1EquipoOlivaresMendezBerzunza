package tarea1;

import java.util.Scanner;

public class TablaCuboyCuadrado231 {

	public static void main(String[] args) 
	{
		int a=0,b=0, res=0;
		
		Scanner entrada=new Scanner(System.in);
		
		 System.out.println("       TABLA DE VALORES AL CUBO Y ALCUADRADO\n"
		 		+           "         numero        cuadrado        cubo \n"
		 		+           "         0             0               0    \n"
		 		+           "         1             1               1    \n"
		 		+           "         2             4               6    \n"
		 		+           "         3             9               27   \n"
		 		+           "         4             16              64   \n"
		 		+           "         5             25              125  \n"
		 		+           "         6             36              216  \n"
		 		+           "         7             49              343  \n"
		 		+           "         8             64              512  \n"
		 		+           "         9             81              729  \n"
		 		+           "         10            100             1000 \n");
  while(a<3)
    {
		 System.out.println("\n\n¿Que quieses calcular?\n1.El cuadrado de un numero.\n2.EL cubo de un numero.");
	     a=entrada.nextInt();
	 
	     if(a==1)
	     {
	    	 
	    	 System.out.println("Cual es el numero que quieres calcular");
	    	 b=entrada.nextInt();
	    	 res=b*b;
	    	 System.out.println(b+" al cuadrado es: "+res);
	    	 
	     }
	     if(a==2)
	     {
	    	 System.out.println("Cual es el numero que quieres calcular");
	    	 b=entrada.nextInt();
	    	 res=(b*b)*b;
	    	 System.out.println(b+" al cubo es: "+res);
	     }
	   }
	   System.out.println("\n\n   SELECCIONESTE ALGO DIFERENTE AL MENO VUELVE A CORRER EL PROGRAMA.");
   	

	}

}
