package aplicationcarol;

import java.util.Scanner;

public class Aplicationcarol {

    public static void main(String[] args) {
        /*Programa que pede nome do vendedor, salario fixo, total de vendas, calcula a comissão e o salário final e mostra essa comissão e o salário final*/
        
        String vendedor="";
        float salariofixo=0,totalvendas=0,comissao=0,salariofinal=0;
        Scanner e=new Scanner(System.in);
        System.out.println("Vendedor? ");
        vendedor=e.next();
        System.out.println("Salário fixo? ");
        salariofixo=e.nextFloat();
        System.out.println("Total vendas? ");
        totalvendas=e.nextFloat();
        comissao=(float) (totalvendas*0.15);
        salariofinal=salariofixo+comissao;
        System.out.println("Comissão: "+comissao);
        System.out.println("Salário final: "+salariofinal);
                
                
        
  
        
        
        
       
        
    }
    
}
