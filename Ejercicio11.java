package cap3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        float parcial;
        float talleres;
        float tareas;
        float exposicion;
        float calificacionFinal;
        
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese calificación parcial");
        parcial=intro.nextInt();
        System.out.println("Ingrese promedio de talleres");
        talleres=intro.nextInt();
        System.out.println("Ingrese promedio de tareas");
        tareas=intro.nextInt();
        System.out.println("Ingrese exposición de investigación");
        exposicion=intro.nextInt();
        
        calificacionFinal=((parcial*50)/100)+((talleres*25)/100)+((tareas*15)/100)+((exposicion*10)/100);
        System.out.println("Su calificacion final es: "+ calificacionFinal);
        
        
        
        
    }
    
    
}
