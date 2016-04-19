/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

import java.util.*;
/**
 *
 * @author tony
 */
public class ListaBarcos
{
    private ArrayList <Barco> lista;


    public ListaBarcos(ArrayList <Barco> lista)
    {
        this.lista = new ArrayList(lista);
    }

    public ListaBarcos()
    {
        lista = new ArrayList();
    }

    public void setLista(ArrayList<Barco> lista) {
        this.lista = lista;
    }
    
    public ArrayList<Barco> getLista()
    {
        return lista;
    }

    /**
    * firma agregar un barco a la lista
    * @param  el objeto de tipo barco
    * @return un boolean indicado si se pudo o no agregar
    */
    public boolean agregarBarco(Barco barco)
    {
        if (lista.add(barco))
            return (true);
        return (false);
    }

    /**
    * firma para eliminar de la lista de barcos activos un barco que no contenga vida
    * @return un boolean indicado si se pudo o no eliminar
    */
    public boolean eliminarBarcoConVidaCero()
    {
        Barco barcoAuxiliar = null;
        boolean encontrado = false;
        int i, tam;

        i = 0;
        tam = lista.size();

        while(!encontrado && i<tam)
        {
           barcoAuxiliar = (Barco)lista.get(i);

           if (barcoAuxiliar.getVida() == 0)
               encontrado = true;
           i++;
        }

        if (encontrado)
        {
            if (lista.remove(barcoAuxiliar))
                return true;
        }
        return false;
    }
    
    
     public void imprimirBarcos()
    {
     int [] vector= new int[10];
     Barco barco =new Barco();
     Iterator iterador = lista.iterator();
     System.out.println("LISTA DE TODOS LOS BARCOS ORDENADOS POR NOMBRE REPETIDOS \n ");
     while(iterador.hasNext()){
         barco=(Barco)iterador.next();
         vector=barco.getPosicion();
         System.out.println(barco.getNombre());
         System.out.println("LONGITUD "+ barco.getLongitud());
         System.out.println("VECTOR EN LA PRIMERA CASILLA "+vector[0]);
         System.out.println("VIDA DELBARCO "+ barco.getVida());
     }
    }
}
