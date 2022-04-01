/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_sem1;


public class Ejercicio3_sem1 {
    
public static void main(String[] args) {

//Declaracion de variables

  double SalarioTL, Renta, RentaTL,SueldoxH, Hora,  Total;


     SueldoxH = 8;
     Hora = 36;
     Renta = 0.10;

     SalarioTL= SueldoxH * Hora;
     RentaTL = SalarioTL * Renta;
     Total = SalarioTL - RentaTL;


     System.out.println("El salario total es:" + Total);
   }
}

