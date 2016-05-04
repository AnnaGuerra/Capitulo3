package cap3;

import java.util.Scanner;

public class Ejercicio13 {
    
        public static void main (String[] args) {
        int costo;
        float ganancia;
        float impuestoLocal;
        float impuestoEstatal;
        float costoAdicional;
        float total;
                
        Scanner intro = new Scanner (System.in);
        
        System.out.println ("Ingrese costo del vehiculo");
        costo =intro.nextInt();
        ganancia = costo*0.08F;
        impuestoLocal = costo*0.03F;
        impuestoEstatal = costo*0.03F;
        costoAdicional = ganancia+impuestoLocal+impuestoEstatal;
        total = costo+costoAdicional;
        System.out.println ("El costo del vehiculo es "+costo);
        System.out.println ("El costo adicional es "+costoAdicional);
        System.out.println ("El costo total es "+total);    
        }
        
}
