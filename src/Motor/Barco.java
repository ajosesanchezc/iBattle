package Motor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tony
 */
public class Barco implements Comparable {

   private String nombre;
   private int longitud;
   private int vida; //NUEVO de la ultima actualizacion que hicimos. 
   private int [] posicion = new int [2*longitud];

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int logitud) {
        this.longitud = logitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Barco() {
    }

    public Barco(String nombre, int longitud, int[] posicion,int vida) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.posicion = posicion;
        this.vida =  vida;  
    }

    public Barco(String nombre, int longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public Barco(String nombre, int longitud, int vida) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vida = vida;
    }

@Override
    public String toString() {
        return String.format("Nombre: "+nombre + "  Longitud: "+longitud +  " pos: "+ posicion[0]);
    }

 public int compareTo(Object o) {
        Barco elBarco = (Barco) o;
        return this.nombre.compareTo(elBarco.nombre);
    }
}
