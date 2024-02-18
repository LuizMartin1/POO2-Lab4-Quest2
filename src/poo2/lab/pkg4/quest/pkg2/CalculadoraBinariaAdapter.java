/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class CalculadoraBinariaAdapter implements CalculadoraDecimal {

    private CalculadoraBinaria calculadoraBinaria;
    
    public CalculadoraBinariaAdapter(CalculadoraBinaria calculadoraBinaria){
        this.calculadoraBinaria = calculadoraBinaria;
    }
    
    @Override
    public int somar(int a, int b) {
        String resBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
      
        return Integer.parseInt(resBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
       String resBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
       
       return Integer.parseInt(resBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        throw new UnsupportedOperationException("Multiplicacao nao suportada na calculadora binaria.");
    }
    
}
