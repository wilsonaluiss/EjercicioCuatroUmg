package figuras;

public class Circulo extends FigurasGeometricas {

    
    @Override
    public int calcularPerimetro(int a, int b){
        System.out.println("Calculando el perimetro...");
        int resultado = a * b;
        System.out.println("El perimetro es :"+ resultado);
        return resultado;
    }
    
    @Override
    public int calcularArea(int a, int b){
        System.out.println("Calculando el area...");
        int resultado = a * b;
        System.out.println("El area es :"+ resultado);
        return resultado;
    }
    
    public int calcularVolumen(int a, int b, int c){
        System.out.println("Calculando el volumen...");
        int resultado = a * b;
        System.out.println("El volumen es :" + resultado);
        return resultado;
    }
}
