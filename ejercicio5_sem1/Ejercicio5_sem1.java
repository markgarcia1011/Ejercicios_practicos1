package ejercicio5_sem1;
public class Ejercicio5_sem1 {
    
    public static void main(String[] args) {
        
  double SalarioT, Sueldo, Horas, SueldoH, HorasT, Renta, RentaT, Tiempo, TotalF;

         Sueldo= 10;
         Tiempo= 30;
         Horas= 50;
         SueldoH = 0.10;
         Renta= 0.10;
         
         SalarioT = Sueldo* Tiempo;
         HorasT = Horas * SueldoH;
         TotalF= SalarioT + HorasT;
         RentaT= TotalF - Renta;
      

       System.out.println("Su Salario Total es:" + RentaT);

    }
    
    
}
