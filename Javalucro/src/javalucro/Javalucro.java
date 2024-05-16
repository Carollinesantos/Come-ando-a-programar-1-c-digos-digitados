
package javalucro;

import java.util.Scanner;

public class Javalucro {

    public static void main(String[] args) {
 
        /*Crie um projeto que peça o preço de custo e o percentual de lucro e calcule e mostre na tela:
        PerLucro=perLucro/100;
        precovenda=precocusto+(precocusto*precolucro)
        */
        
        float custo=0,lucro=0,precovenda=0;
        Scanner e=new Scanner(System.in);
        System.out.println("Valor de custo: ");
        custo=e.nextFloat();
        System.out.println("Percentual de lucro: ");
        lucro=e.nextFloat();
        lucro=lucro/100;
        precovenda=custo+(custo+lucro);
        System.out.println("Total: "+precovenda);
        
        
  
        
        
        
        
    }
    
}
