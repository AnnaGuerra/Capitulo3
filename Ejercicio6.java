package cap3;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args){
        int compIta,compChi,hamb,churr,cerv,beb;
        int iva;
        int compra=0;
        int totalCompra;
        int valCompIta=690;
        int valCompChi=890;
        int valHamb=990;
        int valChurr=1100;
        int valCerv=700;
        int valBeb=500;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese cantidad de completos italianos");
        compIta=intro.nextInt();
        System.out.println("Ingrese cantidad de completos a la chilena");
        compChi=intro.nextInt();
        System.out.println("Ingrese cantidad de hamburguesas");
        hamb=intro.nextInt();
        System.out.println("Ingrese cantidad de churrascos");
        churr=intro.nextInt();
        System.out.println("Imgrese cantidad de cervezas");
        cerv=intro.nextInt();
        System.out.println("Ingrese cantidad de bebidas");
        beb=intro.nextInt();
        compra = compIta*valCompIta+compChi*valCompChi+hamb*valHamb+churr*valChurr+cerv*valCerv+beb*valBeb;
        iva=(compra*19)/100;
        totalCompra=compra-iva;
        System.out.println("El valor de la compra es :"+compra);
        System.out.println("El iva es: "+iva);
        System.out.println("El valor dela compra mas iva es: "+totalCompra);
    }
    
    
    
}
