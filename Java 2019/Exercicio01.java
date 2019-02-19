package tiposdedados;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String args[]){
        
        int num1;
        int num2;
        int soma;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro número: ");
        num1 = scan.nextInt();
        
        System.out.print("Entre com o segundo número: ");
        num2 = scan.nextInt();
        
        soma = num1 + num2;
        
        System.out.print("A soma é igual à " + soma);
    }
}