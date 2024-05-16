
package javaladomenoremaior;

import java.util.Scanner;

public class Javaladomenoremaior {

    public static void main(String[] args) {
        
        /*Crie um projeto java que peça os lados: menor e maior de um terreno retangular e calcule e mostre a área.
        area=ladomenor*ladomaior        
        */
        Scanner e=new Scanner(System.in);
        float menor, maior,area;
        System.out.println("Lado menor: ");
        menor=e.nextFloat();
        System.out.println("Lado maior: ");
        maior=e.nextFloat();
        
        area=menor*maior;
        System.out.println("A área desse terreno é de: m²"+area);

        
        
        
    }
    
}
