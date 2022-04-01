public class Ejercicio4_sem1 {
    public static void main(String[] args) {

   double AFPT, AFPE, pagoAFP, pagoT, pagoF, sueldo ;


        Sueldo= 500;
        AFPT= 0.06;
        AFPE = 0.065;
        PagoAFP = Sueldo* AFPT;

            PagoT = Sueldo * AFPE; PagoF = PagoAFP + PagoT;

        System.out.println("Usted esta pagando a AFP la cantidad de:" + PagoF);
    }

}
