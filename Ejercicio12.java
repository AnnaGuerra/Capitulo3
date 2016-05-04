package cap3;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main (String[] args) {
        
        int monto;
        float kinesiologia;
        float ginecologia;
        float traumatologia;
        float pediatria;
        
        Scanner intro = new Scanner (System.in);
        
        System.out.println ("Ingrese monto");
        monto = intro.nextInt();
        kinesiologia = monto * 0.2F;
        ginecologia = monto * 0.25F;
        traumatologia = monto * 0.3F;
        pediatria = monto * 0.25F;
        System.out.println ("Kinesiologia recibira un monto de "+kinesiologia);
        System.out.println ("Ginecologia recibira un monto de "+ginecologia);
        System.out.println ("Traumatologia recibira un monto de "+traumatologia);
        System.out.println ("Pediatria recibira un monto de "+pediatria);
    }
    
}
