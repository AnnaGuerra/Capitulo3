package cap3;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int alumnos;
        int reprobados,aprobados,notables,sobresalientes;
        float porcReprobados,porcAprobados,porcNotables,porcSobresalientes;
        
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese número total de alumnos");
        alumnos=intro.nextInt();
        System.out.println("Ingrese número de alumnos reprobados");
        reprobados=intro.nextInt();
        System.out.println("Ingrese número de alumnos aprobados");
        aprobados=intro.nextInt();
        System.out.println("Ingrese número de alumnos notables");
        notables=intro.nextInt();
        System.out.println("Ingrese número de alumnos sobresalientes");
        sobresalientes=intro.nextInt();
        
        porcReprobados=(reprobados*alumnos)/100;
        System.out.println("Porcentaje reprobados: "+ porcReprobados);
        porcAprobados=(aprobados*alumnos)/100;
        System.out.println("Porcentaje aprobados: "+ porcAprobados);
        porcNotables=(notables*alumnos)/100;
        System.out.println("Porcentaje reprobados: "+ porcNotables);
        porcSobresalientes=(sobresalientes*alumnos)/100;
        System.out.println("Porcentaje reprobados: "+ porcSobresalientes);
        
    }
    
}
