package Ejemplo;

/**
 * Created by Intel on 01/06/2015.
 */
public class Vehiculo {

    private String color;
    private int cv, ruedas;
    private int velocidad;

    public Vehiculo(String color, int cv, int ruedas) {
        this.color = color;
        this.cv = cv;
        this.ruedas = ruedas;
    }

    public int getCv() {
        return cv;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera(){
        velocidad += cv/20;
    }

    public void frena(){
        velocidad= 0;
    }
}
