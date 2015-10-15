
package aplicacionejemplo2;

public class Rectangulo {
   private float base;
   private float altura;
   //constructores
   public Rectangulo(){
       
       
   }
   public Rectangulo(float ba , float al){
       base=ba;
       altura=al;
   }
  //metodos de acceso
   public void setBase(float ba){
       base=ba;
   }
   public float getBase(){
       return base;
   }
    public void setAltura(float al){
       altura=al;
   }
   public float getAltura(){
       return altura;
   }
   public float calcularArea(float bas,float alt){
       return bas*alt;
   }
   public float calcularPerimetro(){
//       float perimetro= altura*2+base*2;
       return 2*(altura+base);
   }
}