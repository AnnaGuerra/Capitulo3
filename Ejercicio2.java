package cap3;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        int mult;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        num1=intro.nextInt();
        System.out.println("Ingrese segundo numero");
        num2=intro.nextInt();
        suma=num1+num2;
        System.out.println("Suma: "+suma);
        mult=num1*num2;
        System.out.println("Multiplicacion: "+mult);
                
    }
    
}
