/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Motor.*;

/**
 *
 * @author lab_l11
 */
public class Motor {

   public static ImplementacionIMotor getMotorImplementation()
   {
      ImplementacionIMotor elMotor = new ImplementacionIMotor();
      return elMotor;
   }
}
