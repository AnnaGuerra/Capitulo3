package cap3;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        int edad;
        int dia,mes,año;
        int diaActual,mesActual,añoActual;
        float diasDelAño=365.242189F;
        int diasVividos;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento(día/mes/año)");
        dia=intro.nextInt(); 
        mes=intro.nextInt();
        año=intro.nextInt();
        System.out.println("Ingrese fecha actual(día/año/mes)");
        diaActual=intro.nextInt();
        mesActual=intro.nextInt();
        añoActual=intro.nextInt();
        diasVividos=(int) (((añoActual-año)*(diasDelAño))+((diaActual+dia)+((mesActual-mes)*diasDelAño/12)));
        System.out.println("Días vividos: "+diasVividos);
    }
    
}
