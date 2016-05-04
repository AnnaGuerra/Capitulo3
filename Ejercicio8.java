package cap3;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        int salario;
        int nuevoSalario;
        
        Scanner intro = new Scanner (System.in);
        System.out.println("Ingrese salario");
        salario=intro.nextInt();
        nuevoSalario=(int) (salario+(salario*0.10));
        System.out.println("El nuevo salario es: "+nuevoSalario);
        
                
        
    }
    
}
