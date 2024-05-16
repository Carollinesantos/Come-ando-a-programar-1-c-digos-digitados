package javadiasvividos;

import java.util.Scanner;

public class JavaDiasvividos {
    public static void main(String[] args) {
        
        float idade,dias;
        Scanner e=new Scanner(System.in);
        System.out.println("Idade ");
        idade=e.nextFloat();
        dias=idade*365;
        System.out.println("Dias vividos até hoje: "+dias);
              
    }
    
}
