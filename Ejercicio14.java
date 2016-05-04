package cap3;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main (String[] args) {

        double cant1,cant2,cant3,total;
        float porcCant1,porcCant2, porcCant3;
        
        Scanner intro=new Scanner(System.in);
        
        System.out.println ("Ingrese la cantidad aportada por el primer amigo");
        cant1=intro.nextDouble();
        System.out.println ("Ingrese la cantidad aportada por el segundo amigo");
        cant2=intro.nextDouble();
        System.out.println ("Ingrese la cantidad aportada por el tercer amigo");
        cant3=intro.nextDouble();
        total=cant1+cant2+cant3;
        porcCant1=(float) ((cant1/total)*100);
        porcCant2=(float) ((cant2/total)*100);
        porcCant3= (float) ((cant3/total)*100);
        System.out.println("Porcentaje aportado por el preimer amigo:"+porcCant1);
        System.out.println("Porcentaje aportado por el segundo amigo:"+porcCant2);
        System.out.println("Porcentaje aportado por el tercer amigo:"+porcCant3);    
    }
    
}
