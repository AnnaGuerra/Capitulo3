package cap3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int r;
        int h;
        float pi=3.14F;
        int area;
        int volumen;
        Scanner intro = new Scanner (System.in);
        
        System.out.println("Ingrese radio");
        r = intro.nextInt();
        System.out.println("Ingrese altura");
        h = intro.nextInt();
        area =(int) pi*2*r*(h*r);
        System.out.println("Area:"+area);
        volumen =(int) pi*(r*r)*h;
        System.out.println("Volumen"+volumen);
        
    }
    
}
