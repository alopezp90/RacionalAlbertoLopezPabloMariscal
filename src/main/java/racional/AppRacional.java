package racional;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class AppRacional {

    public static void main(String[] args) {
        //Crea z
        Racional z = new Racional();
        z.setNumerador(4);
        z.setDenominador(5);

        //Crea k
        Racional k = new Racional();
        k.setNumerador(3);
        k.setDenominador(4);

        //Crea racional aleatorio
        Racional aleatorio = Racional.aleatorio();
        
        //Imprime los valores de los racionales, redondeados a 2 decimales
        System.out.printf("z = %.2f \n", (double)z.getNumerador() / z.getDenominador());
        System.out.printf("k = %.2f \n", (double)k.getNumerador() / k.getDenominador());
        System.out.printf("aleatorio = %.2f \n", (double)aleatorio.getNumerador() / aleatorio.getDenominador());
        
        //Compara z y k
        System.out.println("¿Son iguales z y k? " + Racional.igualdad(z,k));
        
        //Suma z y k, lo guarda en z y lo imprime
        System.out.println("Sumamos z y k: ");
        (z.suma(k)).imprimirConsola();
        
        
        //Guarda en un nuevo objeto la division z/k y lo imprime
        Racional x = z.division(k);
        x.imprimirConsola();
    }
}
