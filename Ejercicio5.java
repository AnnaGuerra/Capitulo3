package cap3;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int sueldo;
        int hrsExtras;
        int montoHrs;
        int desc;
        int porc;
        int total;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese sueldo bse");
        sueldo=intro.nextInt();
        System.out.println("Ingrese numero de horas extras");
        hrsExtras=intro.nextInt();
        System.out.println("Ingrese monto por hora extra");
        montoHrs=intro.nextInt();
        porc = (sueldo*20)/100;
        desc= sueldo-porc;
        total= desc+(hrsExtras*montoHrs);
        System.out.println("Sueldo basico: "+sueldo);
        System.out.println("Total descuento: "+porc);
        System.out.println("Total ganado: "+total);
        
        
        
    }

    private static int sueldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
