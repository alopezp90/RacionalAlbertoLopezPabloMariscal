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

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public Racional suma(Racional racional) {
        if (this.denominador == racional.getDenominador()){
            this.numerador += racional.getNumerador();
        }else{
            this.numerador = (this.numerador * racional.getDenominador()) + (this.denominador * racional.getNumerador());
            this.denominador *= racional.getDenominador();
        }
        return new Racional (this.numerador, this.denominador);
    }
    
    public Racional resta(Racional racional) {
        if (this.denominador == racional.getDenominador()){
            this.numerador -= racional.getNumerador();
        }else{
            this.numerador = (this.numerador * racional.getDenominador()) - (this.denominador * racional.getNumerador());
            this.denominador *= racional.getDenominador();
        }
        return new Racional (this.numerador, this.denominador);
    }
}
