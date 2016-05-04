package cap3;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int edad = 0;
        int numPulsaciones;
        
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese edad");
        edad=intro.nextInt();
        numPulsaciones=(220-edad/10);
        System.out.println("Numero de pulsaciones cada diez segundos: "+numPulsaciones);
        
        
    }
    
}
