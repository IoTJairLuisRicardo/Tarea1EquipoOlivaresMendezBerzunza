package tarea1;

import java.util.Scanner;

public class CalculoDeMBI233 {

	public static void main(String[] args) 
	{
		double peso=0, altura=0, res=0;
		
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("          Instituto Nacinal De Salud\n \n       "
        		+          "   VALORES DE BMI\n"
        		+          " Bajo peso: menos de:   18.5\n"
        		+          " Normal:                18.5 y 24.9\n"
        		+          " Sobre peso:            25 y 29.9\n"
        		+ ""
        		+          " Obesidad:              30 o mas\n");

        System.out.println("Ingrese su peso.");
        peso=entrada.nextDouble();
        System.out.println("Ingrese su altura en metros.");
        altura=entrada.nextDouble();
	 
        res= peso/(altura*altura);
        System.out.println("Su indice de masa corporal (BMI) es de:  "+res);
	
	}

}
