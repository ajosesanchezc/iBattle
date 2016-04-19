/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jugador;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author tony
 */
public class MetodosUtiles {

    public static String obtenerFormatoContraseña (char [] password)
   {
       String passwordNuevo = new String();
       for (int i = 0; i < password.length; i++)
       {
                passwordNuevo = passwordNuevo + password[i];
       }
       return(passwordNuevo);

   }

    public static String obtenerNick(JComboBox jCBListaNickJugador)
    {
            int indice = jCBListaNickJugador.getSelectedIndex();
            String passwordNuevo = new String();
            ArrayList <String> listaNickObtenida = Comunicacion.obtenerListaNick().getListaNick();
            return(listaNickObtenida.get(indice));
    }

}
