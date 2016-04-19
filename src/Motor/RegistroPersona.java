package Motor;

import Interfaz.RegistroPartida;
import archivo.Txt;
import archivo.Xml;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lab_a112
 */
public class RegistroPersona {

    private static TreeSet<Persona> listaPersona = new TreeSet();

    public TreeSet<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(TreeSet<Persona> listaPersona) {
        RegistroPersona.listaPersona = listaPersona;
    }
    /**
    * firma para cargar una lista  de persona y lista  record.
    * @return a la lista local (listaPersona) los nodos de tipo persona
    * con la informacion de record y sus datos.
    * NOTA: Este metodo realiza el enlace de los dos archivos, tanto lista record
    * como el registro de las personas.
    */
    
    public void cargarListaCompleta()
    {
        TreeSet<Persona> listaRecord = new TreeSet();
        //Txt archivo = new Txt();
        Xml archivo = new Xml();
        listaPersona = archivo.cargarListaPersona();
        listaRecord = archivo.cargarRecord();

        for (Persona persona : listaPersona)
        {
            for (Persona personaRecord : listaRecord)
            {
                if (persona.getNick().equals(personaRecord.getNick())) 
                    persona.setPartidas(personaRecord.getPartidas());
            }
        }

    }

    /**
    * firma para agregar una nueva persona.
    * @param  el objeto de tipo persona que se desea agrear
    * @return un boolean indicado si se pudo o no agregar a la lista.
    */
    public Boolean nuevaPersona(Persona laPersona)
    {
        return (listaPersona.add(laPersona));
    }
    /**
    * firma para buscar una persona.
    * @param  el nick de la persona que se desea buscar en la lista
    * @return un boolean indicado si se pudo o no encontrar en la listaPersona.
    */
    public static boolean buscarPersona(String nick)
    {
        Persona persona;
        Iterator iterador = listaPersona.iterator();
        while (iterador.hasNext())
        {
            persona = (Persona) iterador.next();
                if (persona.getNick().equals(nick))
                    return (true);
        }
        return (false);
    }

    /**
    * firma para obtener una persona.
    * @param  el nick y password de la persona que se desea
    * @return el objeto de la persona que se encontro.
    *  NOTA: este metodo siempre devolvera la persona, ya que quien lo llama
    *  anteriormente llama al metodo buscarPesona quien le dice si esta o no en
    * la listaPersona
    */
    public Persona obtenerPersona(String nick, String password)
    {
        Persona persona;
        Iterator iterador = listaPersona.iterator();
        while (iterador.hasNext())
        {
            persona = (Persona) iterador.next();
            if (persona.getNick().equals(nick))
            {
                if (persona.getPassword().equals(password))
                {
                    return (persona);
                }
            }
        }
        return (null);
    }

    /**
    * firma para borrar una persona.
    * @param  el nick y password de la persona que se desea borrar
    * @return un boolean indicado si se pudo o no remover de la listaPersona
    */
    public boolean borrarPersona(String nick, String password)
    {
        Persona persona;
        Iterator iterador = listaPersona.iterator();

        while (iterador.hasNext())
        {
            persona = (Persona) iterador.next();
            if (persona.getNick().equals(nick))
            {
                if (persona.getPassword().equals(password))
                {
                    listaPersona.remove(persona);
                    return (true);
                }
            }
        }
        return (false);
    }

    public void imprimirListaPersona() {

        Iterator iterador = listaPersona.iterator();

        while (iterador.hasNext())
        {
            System.out.println(iterador.next());
        }
    }

    /**
    * firma para verificar si un usuario le corresponde el Password
    * @param  el nick y password de la persona
    * @return un boolean indicado si le corresponde el password.
    */
    public static boolean correspondePassword(String nick, String pass)
    {
        Persona persona;
        Iterator iterador = listaPersona.iterator();
        while (iterador.hasNext())
        {
            persona = (Persona) iterador.next();
            if (persona.getNick().equals(nick))
            {
                if (persona.getPassword().equals(pass))
                    return (true);
            }
        }
        return false;
    }

    /**
     * firma para obtener una lista de todos los nick registrados.
     * @param
     * @return Collection de String .
     */
    public static Collection<String> obtenerListaNick()
    {
        Persona persona;
        Collection<String> listaNickJugadores = new TreeSet();
        Iterator iterador = listaPersona.iterator();
        while (iterador.hasNext())
        {
            persona = (Persona) iterador.next();
            listaNickJugadores.add(persona.getNick());
        }
        return (listaNickJugadores);
    }

    /**
    * firma para obtener una persona.
    * @param  el nick de la persona que se desea
    * @return el objeto de la persona que se encontro.
    *  NOTA: este metodo siempre devolvera la persona, ya que quien lo llama
    *  anteriormente llama al metodo buscarPesona quien le dice si esta o no en
    * la listaPersona
    */
    private Persona obtenerPersona(String nick) 
    {
        Persona persona;
        Iterator iterador = listaPersona.iterator();
           while (iterador.hasNext())
            {
                persona = (Persona) iterador.next();
                    if (persona.getNick().equals(nick))
                        return (persona);
           }
            return (null);
    }

    /**
    * firma para obtener una lista de partidas ordenadas por fecha
    * @param  lista de partidas que se desea ordenar
    * @return una lista collection de tipo (Registro Partida) ordenada
    */
    private Collection <RegistroPartida> obtenerListaOrdenada(ArrayList <RegistroPartida> lista )
    {
       RegistroPartida aux = new RegistroPartida();
       int longitud = lista.size();
       for(int i=0; i<longitud; i++)
       {
           int minimo = i;
           for(int j=i+1; j<longitud; j++)
           {
               if(lista.get(minimo).getFecha().before(lista.get(j).getFecha()))
                   minimo=j;
           }
           aux.setFechaPartida(lista.get(i).getFecha());
           aux.setTotalPartidas(lista.get(i).getTotalPartida());
           lista.get(i).setFechaPartida(lista.get(minimo).getFecha());
           lista.get(i).setTotalPartidas(lista.get(minimo).getTotalPartida());

           lista.get(minimo).setFechaPartida(aux.getFecha());
           lista.get(minimo).setTotalPartidas(aux.getTotalPartida());
       }
       return(lista);
    }

    /**
    * firma para obtener una lista de partidas
    * @param  el nick de la persona boolean si es victoria o derrota
    * @return una lista collection de tipo (Registro Partida)
    */
    public Collection<RegistroPartida> obtenerListaDePartidas(String nickUsuario, boolean victoria)
    {
        Persona persona = new Persona();
        persona = obtenerPersona(nickUsuario);
        if (victoria)
            return (obtenerListaOrdenada(persona.getPartidas().getGanadas()));
        else
            return (obtenerListaOrdenada(persona.getPartidas().getPerdidas()));
    }
}
