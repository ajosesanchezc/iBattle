/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jugador;

import java.util.ArrayList;

/**
 *
 * @author tony
 */
public class ManejoArrayList {
     ArrayList <String> listaNick = new ArrayList();

    public ArrayList<String> getListaNick() {
        return listaNick;
    }

    public void setListaNick(ArrayList<String> listaNick) {
        this.listaNick = listaNick;
    }

    public boolean agregarElemento(String objeto)
    {
        return listaNick.add(objeto);
    }

}
