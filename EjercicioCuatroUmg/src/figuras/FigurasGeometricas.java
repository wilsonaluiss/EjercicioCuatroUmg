package figuras;

public class FigurasGeometricas {

    private Integer dimensiones;
    private String color ="\033[30m";
    private Integer grados = 0;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(Integer dimensiones, String color, Integer grados) {
        this.dimensiones = dimensiones;
        this.color = color;
        this.grados = grados;
    }

    

    public Integer getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Integer dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    public Integer getGrados() {
        return grados;
    }

    public void setGrados(Integer grados) {
        this.grados = grados;
    }

    
    public int calcularPerimetro(int a, int b){
        System.out.println("Calculando el perimetro...");
        int resultado = a * b;
        return resultado;
    }
    
    public int calcularArea(int a, int b){
        System.out.println("Calculando el area...");
        int resultado = a * b;
        return resultado;
    }
    
    public int calcularVolumen(int a, int b){
        System.out.println("Calculando el volumen...");
        int resultado = a * b;
        return resultado;
    }

    
   
}
