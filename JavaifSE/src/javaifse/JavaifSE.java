package javaifse;

import java.util.Scanner;

public class JavaifSE {
    public static void main(String[] args) {
  
        String nome1="",nome2="";
        int ano1=0,ano2=0;
        Scanner e=new Scanner(System.in);
        System.out.println("1° Nome: ");
        nome1=e.next();
        System.out.println("2° Nome: ");
        nome2=e.next();
        System.out.println("Ano 1° nome: ");
        ano1=e.nextInt();
        System.out.println("Ano 2° nome: ");
        ano2=e.nextInt();
        
        if(ano1>ano2)
        {
            System.out.println(nome1+" É mais nova ");
        }
        if(ano2>ano1)
        {
            System.out.println(nome2+" É a mais nova ");
        }
    
    }
    
}
