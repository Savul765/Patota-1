package tiposdedados;

import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String args[]){
        
        String aux;
        double fahrenheit;
        double celsius;
        
        aux = JOptionPane.showInputDialog("Insira a temperaura em Fahrenheit ");
        
        fahrenheit = Double.parseDouble(aux);
        
        celsius = 5*(fahrenheit - 32)/9;
        
        JOptionPane.showMessageDialog(null, "A temperatura em Celsius é " + celsius + "ºC");
    }
}