package cap3;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int promedio;
        int suma;
        int num1Doble;
        int num2Triple;
        int num3Cuadrado;
        
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        num1=intro.nextInt();
        System.out.println("Ingrese segundo numero");
        num2=intro.nextInt();
        System.out.println("Ingrese tercer numero");
        num3=intro.nextInt();
        promedio=(num1+num2+num3)/3;
        System.out.println("Promedio: "+promedio);
        suma=num1+num2+num3;
        System.out.println("Suma: "+suma);
        num1Doble=num1*2;
        System.out.println("Doble del primero numero: "+num1Doble);
        num2Triple=num2*3;
        System.out.println("Triple del segundo numero: "+num2Triple);
        num3Cuadrado=num3*num3;
        System.out.println("Cuadrado del tercer numero: "+num3Cuadrado);
        
        
    }
    
}
