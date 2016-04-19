/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//tal cual como esta en la liberacion de la interfaz V 1.0
package Interfaz;

import java.util.Date;

/**
 *
 * @author lab_a112
 */
public class RegistroPartida
{

   private Date fechaPartida;
   private int totalPartidas;

    public RegistroPartida() {
    }

   public Date getFecha()
   {
      return fechaPartida;
   }

//    public RegistroPartida(Date fechaPartida, int totalPartidas)
//    {
//        this.fechaPartida = fechaPartida;
//        this.totalPartidas = totalPartidas;
//    }
//
//    public RegistroPartida(Date fechaPartida) {
//        this.fechaPartida = fechaPartida;
//        this.totalPartidas = 1;
//
//    }

    
   public void setFechaPartida(Date fechaPartida)
   {
      this.fechaPartida = fechaPartida;
   }

   public int getTotalPartida()
   {
      return totalPartidas;
   }

   public void setTotalPartidas(int totalPartidas)
   {
      this.totalPartidas = totalPartidas;
   }
}
