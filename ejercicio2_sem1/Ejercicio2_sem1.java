package ejercicio2_sem1;

public class Ejercicio2_sem1 {
  public static void main(String[] args) {
   //declaramos variables
    double  Dolares, Europa, Reino_u, Australia, Canada, Usd;
    
    //Establecemos valores a las variables
    Dolares = 100;
    Europa = 0.70;
    Reino_u = 0.61;
    Australia = 0.95;
    Canada = 0.97;
    Usd = 1.00;
    
      //realizamos  conversion
      double conversion1 = Dolares * Europa;
      System.out.println("La covensercion de Dolares a la moneda de Europa es : " + conversion1); 
      double conversion2 = Dolares * Reino_u;
      System.out.println("La covensercion de Dolares a la moneda de Reino Unido es : " + conversion2); 
      double conversion3 = Dolares * Australia;
      System.out.println("La covensercion de dolares a la moneda de Australia es : " + conversion3); 
      double conversion4 = Dolares * Canada;
      System.out.println("La covensercion de dolares a la moneda de Canada es : " + conversion4); 
      double conversion5 = Dolares * Usd;
      System.out.println("La covensercion de dolares a la moneda  de USD es : " + conversion5); 
    
    
  } 
}
