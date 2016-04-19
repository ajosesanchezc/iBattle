/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

/**
 *
 * @author lab_l11
 */
public class LoadGameException extends Exception
{
     public LoadGameException()
    {
        super();
    }

     public LoadGameException( String mensaje)
    {
        super("Error al cargar el juego: " + mensaje);
    }
}
