/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package archivo;

import Interfaz.RegistroPartida;
import Motor.Jugada;
import Motor.Persona;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public interface  Archivo {

    /**
     * firma para cargar una jugada previamente guardada, leida desde archivo.
     * @return Un objeto de tipo Jugada con todos los datos de la jugada cargada.
     */
    public Jugada cargarJugada();

    /**
     * firma para guardar una jugada en archivo
     * @param un objeto de tipo Jugada con la informacion de la jugada que se desea guardar.
     * @return boolean indicado si se pudo o no guardar la jugada.
     */
    public boolean guardarJugada(Jugada jugada);

    /**
     * firma encargada de cargar desde archivo la lista de usuarios registrados.
     * @return TreeSet con toda la informacion de los usuarios registrados.
     */
    public TreeSet <Persona> cargarListaPersona();

    /**
     * firma para  guardar una lista de personas en archivo
     * @param Objeto de tipo TreeSet de Persona con todos los datos que se desean guardar.
     * @return boolean indicando si se pudo guardar la lista.
     */
    public boolean guardarListaPersonas(TreeSet <Persona> lista);
    
    /**
     * firma para cargar el Record de Partidas de cada persona
     * @return  una lista de tipo TreeSet de la clase Persona con su Record de Partidas.
     * NOTA: como registro de personas y el record se cargan en archivos distintos
     * existe un metodo que luego de cargar ambos archivos los une para crear 
     * una lista de Personas con todos sus datos completos.
     */
    public TreeSet <Persona> cargarRecord();

    /**
     * firma para  guardar en archivo el Record de Partidas de cada persona registrada
     * @param la lista de tipo TreeSet(de persona) con todos los datos para realizar
     * guardado.
     * @return boolean indicando si se pudo o no guardar.
     */
    public boolean guardarRecord(TreeSet <Persona> listaPersona);


    public boolean partidaGuardada ();
}
