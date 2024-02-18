/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinariaFunc();
        
        CalculadoraDecimal adaptador = new CalculadoraBinariaAdapter(calculadoraBinaria);
        
        //FUNCIONAMENTO DA CALCULADORA
        System.out.println("Somar: " + adaptador.somar(5, 2));
        System.out.println("Subtrair : " + adaptador.subtrair(15, 5));
        System.out.println("Multiplicar : " + adaptador.multiplicar(2, 5));
    }
    
}
