package javacalculomedia;

import java.util.Scanner;

public class JavacalculoMedia {

    public static void main(String[] args) {
 
          Scanner e=new Scanner(System.in);
		int c,soma=1,num;
		for (c=1;c<=5;c++)
		{
             System.out.println("Entre com um número inteiro: ");
			num=e.nextInt();
			soma=soma+num;
		}
		//escreva("soma: ",soma)
		soma=soma/num;
               System.out.println("Média: "+somaa