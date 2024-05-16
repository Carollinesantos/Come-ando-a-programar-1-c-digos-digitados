
package javacarol;

import java.util.Scanner;

public class Javacarol {

    public static void main(String[] args) {
        /*Crie um projeto que peça dois números inteiros e troque o valor entre esses números.
        Use uma variável auxiliar para trocar esses valores*/
   
       int a=0,b=0;
        int aux=0;
        Scanner e=new Scanner(System.in);
        System.out.println("Digite número 1: ");
        a=e.nextInt();
        System.out.println("Digite número 2: ");
        b=e.nextInt();
       
  
        aux=a;
        a=b;
        b=aux;
               
        System.out.println("O número de A é: "+a);
        System.out.println("O número de B é: "+b);
             
            
        
        
         
        
        
        
    }
    
}
