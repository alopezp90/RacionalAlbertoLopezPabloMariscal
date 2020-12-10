package racional;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class AppRacional {

    public static void main(String[] args) {
        Racional z = new Racional();
        z.setNumerador(4);
        z.setDenominador(5);

        Racional k = new Racional();
        k.setNumerador(3);
        k.setDenominador(4);

        Racional aleatorio = Racional.aleatorio();
        
        System.out.printf("z = %.2f \n", (double)z.getNumerador() / z.getDenominador());
        System.out.printf("k = %.2f \n", (double)k.getNumerador() / k.getDenominador());
        System.out.printf("aleatorio = %.2f \n", (double)aleatorio.getNumerador() / aleatorio.getDenominador());
    }
}
