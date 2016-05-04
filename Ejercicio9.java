package cap3;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int promedio;
        int lunes,martes,miercoles,jueves,viernes,sabado;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el tiempo recorrido el día lunes");
        lunes=intro.nextInt();
        System.out.println("Ingrese el tiempo recorrido el día martes");
        martes=intro.nextInt();
        System.out.println("Ingrese el tiempo recorrido el día miercoles");
        miercoles=intro.nextInt();
        System.out.println("Ingrese el tiempo recorrido el día jueves");
        jueves=intro.nextInt();
        System.out.println("Ingrese el tiempo recorrido el día viernes");
        viernes=intro.nextInt();
        System.out.println("Ingrese el tiempo recorrido el día sabado");
        sabado=intro.nextInt();
        promedio = (int) ((lunes+martes+miercoles+jueves+viernes+sabado)/6);
        System.out.println("El tiempo promedio recorrido es: "+promedio);
        
    }
    
}
