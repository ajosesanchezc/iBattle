/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

/**
 *
 * @author lab_l11
 */
public class CreateGameException extends Exception
{
    public CreateGameException()
    {
        super();
    }
    public CreateGameException( String mensaje)
    {
        super("Error al crear el juego: " + mensaje);
    }
}
