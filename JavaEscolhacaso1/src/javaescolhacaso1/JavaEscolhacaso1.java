package javaescolhacaso1;

import java.util.Scanner;

public class JavaEscolhacaso1 {

    public static void main(String[] args) {
        int op=0;
        Scanner e=new Scanner(System.in);
        System.out.println("1-Fatorial ");
        System.out.println("2-Raiz quadrada ");
        System.out.println("3-Tabuada ");
        System.out.println("4-Sair ");
    op=e.nextInt();
        switch(op)
        {
            case 1: 
                //fatorial
                fatorial();
                break;
            case 2:
                //Raiz quadrada
                Raizquadrada();
                break;
            case 3:
                //Tabuada
                Tabuada();                
                break;
            case 4:
                //Sair
                break;
            default:
                System.out.println("");
                
     }
        
        
    }

    private static void fatorial() {
 
         Scanner e=new Scanner(System.in);
         int c=1,fator=1,num=0;
         System.out.println("Digite um número: ");
         num=e.nextInt();
         for(c=num;c>=1;c--)
            
    if (c<= num)
        {
          fator=fator*c;
    }
        System.out.println("Fatorial de "+num+ " = "+fator);
    
    }

    private static void Raizquadrada() {
            Scanner e=new Scanner(System.in);
            int num=0;
            for(int c=1;c<=3;c++){
            System.out.println("Entre com um n°: ");
            num=e.nextInt();
            System.out.println("Raiz quadrada de "+num+" é "+Math.sqrt(num));
            
    }

    private static void Tabuada() {
            Scanner e=new Scanner(System.in);
            int num=0;
            System.out.println("Entre com n°? ");
            num=e.nextInt();
            for(int c=1;c<=13;c++){
                System.out.println(num+" x "+c+" = "+num*c);
            }
                
                
            }
    }
    