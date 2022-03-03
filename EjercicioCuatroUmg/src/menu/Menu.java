package menu;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo;

public class Menu {
    
    public static void main(String[] args) {
        
        System.out.println("Cuadrado");System.out.println("");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calcularPerimetro(4, 6);
        cuadrado.calcularArea(4);
        cuadrado.calcularVolumen(4);
        System.out.println("Los grados del cuadrado son: " +cuadrado.getGrados() );
        int gradosCuadrado = (int)(Math.random()*360 +1);
        System.out.println("Se ha girado " + gradosCuadrado + " °" );
        System.out.println("El color del cuadrado es :" + cuadrado.getColor() + " Color predefinido");
        System.out.println("El nuevo color del cuadrado es :" + cuadrado.setColor("\033[35m")+ " Nuevo Color");
        System.out.println("");System.out.println("Circulo");System.out.println("");
        Circulo circulo = new Circulo();
        circulo.calcularPerimetro((int) 3.1416, 6);
        circulo.calcularArea((int) 3.1416,4);
        circulo.calcularVolumen(4/3, (int) 3.1416,3);
        System.out.println("Los grados del cuadrado son: " +cuadrado.getGrados() );
        int gradosCirculo = (int)(Math.random()*360 +1);
        System.out.println("Se ha girado " + gradosCirculo + " °" );
        System.out.println("\033[30m"+"El color del cuadrado es :"+circulo.getColor() + " Color predefinido");
        System.out.println("El nuevo color del cuadrado es :" + circulo.setColor("\033[34m")+ " Nuevo Color");System.out.println("");
        System.out.println("Triangulo");System.out.println("");
        Triangulo triangulo = new Triangulo();
        triangulo.calcularPerimetro(2,4,6);
        triangulo.calcularArea(3,5);
        triangulo.calcularVolumen(20,16);
        System.out.println("Los grados del cuadrado son: " +cuadrado.getGrados() );
        int gradosTriangulo = (int)(Math.random()*360 +1);
        System.out.println("Se ha girado " + gradosTriangulo + " °" );
        System.out.println("\033[30m"+"El color del cuadrado es :"+ triangulo.getColor() + " Color predefinido");
        System.out.println("El nuevo color del cuadrado es :" + circulo.setColor("\033[33m")+ " Nuevo Color");System.out.println("");
        System.out.println("Rectangulo");System.out.println("");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularPerimetro(8,6);
        rectangulo.calcularArea(10,5);
        rectangulo.calcularVolumen(7,7);
        System.out.println("Los grados del cuadrado son: " +cuadrado.getGrados() );
        int gradosRectangulo = (int)(Math.random()*360 +1);
        System.out.println("Se ha girado " + gradosTriangulo + " °" );
        System.out.println("\033[30m"+"El color del cuadrado es :"+ rectangulo.getColor() + " Color predefinido");
        System.out.println("El nuevo color del cuadrado es :" + rectangulo.setColor("\033[32m")+ " Nuevo Color");System.out.println("");
    }
    

}
