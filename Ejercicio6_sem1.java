package ejercicio6_sem1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio6_sem1 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
         double promedio, ev1, ev2, ev3, ev4, ev5;
         
         ev1 = 8.0 * 0.25;
         ev2 = 7.5 * 0.15;
         ev3 = 9.0 * 0.15;
         ev4 = 8.0 * 0.20;
         ev5 = 9.0 * 0.25;
         
         promedio= ev1 + ev2  + ev3 + ev4 + ev5;
         
              System.out.println("Su promedio finall del ciclo es: " + formato.format(promedio));
    }
}

