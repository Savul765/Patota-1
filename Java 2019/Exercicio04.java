package tiposdedados;

import java.util.Scanner;
public class Exercicio04 {
    public static void main (String args[]){
        
        int a;
        int b;
        int aux;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("A = ");
        a = scan.nextInt();
        
        System.out.print("B = ");
        b = scan.nextInt();
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.print("\nTroca\n");
        System.out.print("a = " + a);
        System.out.print("\nb = " + b);
    }
}