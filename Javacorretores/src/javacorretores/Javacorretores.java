
package javacorretores;

import java.util.Scanner;
public class Javacorretores {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        /* Faça um projeto que peça: o nome de 3 corretores(corretor1,corretor2,corretor3),as vendas dos 3(venda1,venda2,venda3).
        Calcule e mostre a comissão dos 3(comissao1,comissao2,comissao3) e o total de vendas(vendas1,vendas2,vendas3)
        vendas>5000
        comissao=venda*0.12
        vendas<=3000 && vendas<=5000
        comissao=vendas*0.095
        vendas<3000
        comissao=vendas*0.07
        */
        String corretor1="",corretor2="",corretor3="";
        int vendas1=0,vendas2=0,vendas3=0,totalvendas=0;
        int comissao1=0,comissao2=0,comissao3=0;
        
        System.out.println("Entre com o nome do corretor 1: ");
        corretor1=e.next();
        System.out.println("Entre com a venda dele: ");
        vendas1=e.nextInt();
        if (vendas1>5000)
                {
        comissao1=(int) (vendas1*0.12);
                }
        if (vendas1<=3000 && vendas1<=5000)
        {
        comissao1=(int) (vendas1*0.095);
        }
        if (vendas1<3000)
        {
        comissao1=(int) (vendas1*0.07);
                }
        System.out.println("Comissão corretor 1: "+comissao1);
                
        System.out.println("Entre com o nome do corretor 2: ");
        corretor2=e.next();
        System.out.println("Entre com a venda dele: ");
        vendas2=e.nextInt();
        
          if (vendas2>5000)
                {
        comissao2=(int) (vendas2*0.12);
                }
        if (vendas2<=3000 && vendas2<=5000)
        {
        comissao2=(int) (vendas2*0.095);
        }
        if (vendas2<3000)
        {
        comissao2=(int) (vendas2*0.07);
                }
        System.out.println("Comissão corretor 2: "+comissao2);
        
        System.out.println("Entre com o nome do corretor 3: ");
        corretor3=e.next();
        System.out.println("Entre com a venda dele: ");
        vendas3=e.nextInt();
              
          if (vendas3>5000)
                {
        comissao3=(int) (vendas3*0.12);
                }
        if (vendas3<=3000 && vendas3<=5000)
        {
        comissao3=(int) (vendas3*0.095);
        }
        if (vendas3<3000)
        {
        comissao3=(int) (vendas3*0.07);
                }
        System.out.println("Comissão corretor 3: "+comissao3);
          
        totalvendas=vendas1+vendas2+vendas3;
        System.out.println("Total da venda dos 3 corretores é de : "+totalvendas);
        
        }
    
}
