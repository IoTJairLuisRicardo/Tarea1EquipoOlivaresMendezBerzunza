package tarea1;

import java.util.Scanner;

public class SumPromPromProdMaMe217 
{
	public static void main(String[] args)
	{
		int a=0, b=0, c=0, suma=0;
      Scanner entrada=new Scanner(System.in);
		
     System.out.println("A continuacion ingresaras 3 numeros y te indicaremosLa SUMA de los 3 numeros\n el PROMEDIO, el PRODUCTO y cual es menor y mayor.");
     
     System.out.println("\nIngresa el primer numero");
     a=entrada.nextInt();
     
     System.out.println("Ingresa el segundo numero");
     b=entrada.nextInt();
     
     System.out.println("Ingresa el tercer numero");
     c=entrada.nextInt();
     
     
     suma=a+b+c;
     System.out.println("\nLa suma de "+a+"+"+b+"+"+c+" = "+suma);
     
     suma=suma/3;
     System.out.println("\nEl promedio de "+a+"+"+b+"+"+c+" / 3 = "+suma);
     
     System.out.println("\nEl producto "+a+"+"+b+"+"+c+" = "+suma+"\n");
     
     if(a>b && c>b)
     {
    	   System.out.println(b+" es menor que "+a+" y "+c);
    	    
     }
     if(b>a && c>a )
     {
    	   System.out.println(a+" es meor que "+b+" y "+c);
    	    
     }
     if(a>c && b>c )
     {
    	   System.out.println(c+" es menor que "+a+" y "+b);
    	    
     }
    
	}

}
