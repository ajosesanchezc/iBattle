package Motor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tony
 */
public class Jugador
{

    private Persona laPersona;
    private Tablero elTablero;

    public Jugador() {
    }



    public Jugador(Persona laPersona, Tablero elTablero) {
        this.laPersona = laPersona;
        this.elTablero = elTablero;
    }

    public Persona getLaPersona() {
        return laPersona;
    }

    public void setLaPersona(Persona laPersona) {
        this.laPersona = laPersona;
    }

    public Jugador(Persona laPersona)
    {
        this.laPersona = laPersona;
    }

    public Tablero getElTablero() {
        return elTablero;
    }

    public void setElTablero(Tablero elTrablero) {
        this.elTablero = elTrablero;
    }

      @Override
    public String toString() {
        return String.format("La Persona: "+ laPersona );
    }
  }
