

package aplicacionejemplo2;

import java.util.Scanner;

public class AplicacionEjemplo2 {

    
    public static void main(String[] args) {
      Metodos teclado=new Metodos();
     
      float base,altura;
      base=teclado.pedirFloat();
      altura=teclado.pedirFloat();
      Rectangulo rec1=new Rectangulo(base,altura);
      System.out.println("Base = "+rec1.getBase());
      System.out.println("Alutra = "+rec1.getAltura());
      System.out.println("Area = "+rec1.calcularArea(base, altura)+" metros cuadrados");
      System.out.println("Perimetro = "+rec1.calcularPerimetro()+" metros");
      
    }
    
}
