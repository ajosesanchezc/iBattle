/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

/**
 *
 * @author lab_l11
 */
public class CreateUserException extends Exception
{
   public CreateUserException()
    {
        super();
    }
    public CreateUserException( String mensaje)
    {
        super("Error al crear el juego: " + mensaje);
    }
}
