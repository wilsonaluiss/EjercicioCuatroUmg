/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author lexlp
 */
public class Triangulo extends FigurasGeometricas{
    
    
    public int calcularPerimetro(int a, int b, int c){
        System.out.println("Calculando el perimetro...");
        int resultado = a + b + c;
        System.out.println("El perimetro es :"+ resultado);
        return resultado;
    }
    @Override
    public int calcularArea(int a, int b){
        System.out.println("Calculando el area...");
        int resultado = (int) (0.5 * (a * b));
        System.out.println("El area es :"+ resultado);
        return resultado;
    }
    
    @Override
    public int calcularVolumen(int a, int b){
        System.out.println("Calculando el volumen...");
        int resultado = (int) 0.033 /(a * b);
        System.out.println("El volumen es :" + resultado);
        return resultado;
    }
    
}
