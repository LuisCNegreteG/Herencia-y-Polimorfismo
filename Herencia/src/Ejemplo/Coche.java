package Ejemplo;

/**
 * Created by Intel on 01/06/2015.
 */
public class Coche extends Vehiculo{

    private int puertas;

    public coche(String color, int cv, int puertas){
        super(color,cv,4);
        this.puertas = puertas;
    }
}
