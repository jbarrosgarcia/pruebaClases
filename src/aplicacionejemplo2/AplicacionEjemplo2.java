
package aplicacionejemplo2;

import java.util.Scanner;

public class AplicacionEjemplo2 {

    
    public static void main(String[] args) {
//      Scanner teclado=new Scanner(System.in); 
//      float base,altura;
//      System.out.println("Introduzca base");
//      base=teclado.nextFloat();
//      System.out.println("Introduzca altura");
//      altura=teclado.nextFloat();
      Rectangulo rec1=new Rectangulo(3,5);
      System.out.println("Base = "+rec1.getBase());
      System.out.println("Alutra = "+rec1.getAltura());
      System.out.println("Area = "+rec1.calcularArea(7, 8)+" metros cuadrados");
      System.out.println("Perimetro = "+rec1.calcularPerimetro()+" metros");
      
    }
    
}
