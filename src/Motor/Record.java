package Motor;

import Interfaz.RegistroPartida;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tony
 */
public class Record {
    private ArrayList <RegistroPartida> ganadas;
    private ArrayList <RegistroPartida> perdidas;

    public Record()
    {
        ganadas = new ArrayList<RegistroPartida>();
        perdidas = new ArrayList<RegistroPartida>();
    }

    public ArrayList<RegistroPartida> getGanadas() {
        return ganadas;
    }

    public void setGanadas(ArrayList<RegistroPartida> ganadas) {
        this.ganadas = ganadas;
    }

    public ArrayList<RegistroPartida> getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(ArrayList<RegistroPartida> perdidas) {
        this.perdidas = perdidas;
    }

    /**
    * firma para verificar si hay coincidencia de Fecha.
    * @param  la fecha, lista de partidas
    * @return un boolean indicado para esa fecha ya posee un nodo.
    *  NOTA: en caso de poseer un nodo, no se crea un nodo nuevo, sino que se suma
    *  al Total de partida una unidad.
    */
    private boolean coincidenFecha(Date fechaPartida, ArrayList <RegistroPartida> listaPartidas )
    {
       for (RegistroPartida partida : listaPartidas )
       {
           if( partida.getFecha().getDate() == fechaPartida.getDate()) 
                if(partida.getFecha().getMonth() == fechaPartida.getMonth())
                    if (partida.getFecha().getYear() == fechaPartida.getYear()){
                        partida.setTotalPartidas((partida.getTotalPartida())+1);
                        //System.out.println("SI COINCIDE LA FECHAAAAAAAAA");
                        return(true);
                    }
       }
       return(false);
    }

   /**
    * firma agregar un record a la lista de ganadas
    * @param  la fecha
    * @return un boolean indicado si se pudo o no agregar
    */
    public boolean agregarRecordGanadas (Date fechaPartida )
    {
        if (!(coincidenFecha (fechaPartida, ganadas)))
        {
            RegistroPartida  registro = new RegistroPartida();
            registro.setFechaPartida(fechaPartida);
            registro.setTotalPartidas(1);
                if (ganadas.add(registro))
                    return(true);
                return(false);
        }
        else
            return(true);
    }

   /**
    * firma agregar un record a la lista de perdidas
    * @param  la fecha
    * @return un boolean indicado si se pudo o no agregar
    */
    public boolean agregarRecordPerdidas (Date fechaPartida)
    {
        if (!(coincidenFecha ( fechaPartida , perdidas) ) )
        {
            RegistroPartida registro = new RegistroPartida();
            registro.setFechaPartida(fechaPartida);
            registro.setTotalPartidas(1);
                if (perdidas.add(registro))
                    return(true);
                return(false);
        }
        else
            return(true);
    }

}
