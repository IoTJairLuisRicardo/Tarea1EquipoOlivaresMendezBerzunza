package tarea1;

import java.util.Scanner;

public class IgualMayorMenor {

	public static void main(String[] args)
	{
		int a=0, b=0;
      Scanner entrada=new Scanner(System.in);
	while(true)
	{
     System.out.println("\n\nA CONTINUACION INGRESA 2 NUMEROS Y TE INDICAREMOS CUAL ES MAYOR, MENOR O IGUALES.");
     
     System.out.println("\nIngresa el primer numero");
     a=entrada.nextInt();
     
     System.out.println("Ingresa el segundo numero");
     b=entrada.nextInt();
     
     if(a>b)
     {
    	   System.out.println(a+" es mayor que "+b);
    	    
     }
     if(b>a)
     {
    	   System.out.println(b+" es mayor que "+a);
    	    
     }
     if(b==a)
     {
    	   System.out.println(b+" es igual que "+a);
    	    
     }
    
	}
	}

}
