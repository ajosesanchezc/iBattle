/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import java.util.Comparator;

/**
 *
 * @author lab_l11
 */
public class Ordena implements Comparator
{


    public int compare(Object o1, Object o2)
    {
     Barco elBarco1 = (Barco) o1;
     Barco elBarco2 = (Barco) o2;
     int resultado;
     resultado = elBarco1.getNombre().compareTo(elBarco2.getNombre()); // ordenado por nombre.

     if (resultado < 0)

         return -1;

     else
         return 1;
    }
}
