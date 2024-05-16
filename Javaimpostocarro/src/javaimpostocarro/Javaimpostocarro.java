
package javaimpostocarro;

import java.util.Scanner;

public class Javaimpostocarro {

    public static void main(String[] args) {

        /*Crie um projeto java que peça: o custo do carro e calcule e mostre impostos e preço final:
        Preçoimposto=preçocusto+(preçocusto*0.45)
        Preçofinal=preçoimposto+(preçoimposto*0.28)*/
              
        float precofinal=0,precoimposto=0,custo=0;
       
        Scanner e=new Scanner(System.in);
        System.out.println("Valor de custo do carro: ");
        custo=e.nextFloat();
       precoimposto=(float) (custo+(custo*0.45));
       precofinal=(float) (precoimposto+(precoimposto*0.28));
      
        System.out.println("Valor de impostos: "+precoimposto);
        System.out.println("Preço final do carro: "+precofinal);
        
        
    }
    
}
