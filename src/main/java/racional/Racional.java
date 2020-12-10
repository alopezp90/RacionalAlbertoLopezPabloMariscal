package racional;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Racional {

    private int numerador, denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            this.denominador = 1;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            this.denominador = 1;
        }
    }

    public void imprimirConsola() {
        System.out.println("El racional es: " + numerador + "/" + denominador);
    }

}
