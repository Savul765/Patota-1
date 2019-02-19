package tiposdedados;

import javax.swing.*;
public class Exercicio02 {
    public static void main(String args[]){
        
        String aux;
        double n1;
        double n2;
        double soma;
        
        aux = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        
        n1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog("Entre com o segundo número: ");
        
        n2 = Double.parseDouble(aux);
        
        soma = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "A soma dos 2 números é " + soma);
    }
}