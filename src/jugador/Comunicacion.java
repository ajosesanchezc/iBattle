/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jugador;

import Interfaz.CreateGameException;
import Interfaz.CreateUserException;
import Interfaz.IMotorEnlace;
import Interfaz.LoadGameException;
import Interfaz.Motor;
import Interfaz.RegistroPartida;
import Motor.RegistroPersona;
import archivo.Txt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author lab_l11
 */
public class Comunicacion {
    private static IMotorEnlace motor = Motor.getMotorImplementation();
//    private static ManejoArrayList listaNick = new ManejoArrayList();

    public static boolean crearNuevaPersona(String nombre, String apellido,  String nick,
                                        char [] password, String avatar, String dia, String mes, String año)
    {
        Date fechaCompleta = new Date();
        fechaCompleta.setDate(Integer.parseInt(dia));
        fechaCompleta.setMonth(Integer.parseInt(mes));
        fechaCompleta.setYear(Integer.parseInt(año));
        String passwordNuevo = new String();
        passwordNuevo = MetodosUtiles.obtenerFormatoContraseña(password);
       try {
            motor.crearJugador(nombre, apellido, nick, avatar, fechaCompleta, passwordNuevo);
            return(true);
       } catch (CreateUserException ex)
       {
           new CreateUserException ();
           return(false);
        }
    }

    
    public static int [][] obtenerTablero(String player)
    {
        int matriz [][] = motor.obtenerTablero(player);
        return (matriz);
    }

    public static boolean disparar(int x, int y, String player)
    {
        System.out.println("X "+x + "Y "+ y + "player "+player);
        return(motor.disparar(x, y, player));
    }

        public static boolean esTurnoDe(String player)
        {
            return(motor.esTurnoDe( player ) );
        }


        public static boolean finDeJuego()
        {
            return(motor.finDeJuego());
        }


        public static String obtenerGanador()
        {
            return(motor.obtenerGanador());
        }

       public static int obtenerNumeroBarcosRestantes(boolean hundidas, boolean enemigos, String tipoBarco, String player)
       {
            return(motor.obtenerNumeroBarcosRestantes( hundidas, enemigos, tipoBarco, player ) );
       }

       public static String obtenerNickJugador(String player)
       {
            return(motor.obtenerNickJugador(player));
       }


       public static ManejoArrayList obtenerListaNick()
        {
            ManejoArrayList listaNick = new ManejoArrayList();
            Collection <String> listaNickObtenida = (Collection) motor.obtenerListaNickJugadores();
            for(String nick : listaNickObtenida)
            {
//               listaNick.agregarElemento(nick);
                listaNick.agregarElemento(nick);
            }
            return(listaNick);
        }


        public static boolean eliminarPersona(JComboBox jCBListaNick , char[] password)
        {
            int indice = jCBListaNick.getSelectedIndex();
            String passwordNuevo = new String();
            ArrayList <String> listaNickObtenida = obtenerListaNick().getListaNick();
            String nick = new String();
            nick = listaNickObtenida.get(indice);
            passwordNuevo = MetodosUtiles.obtenerFormatoContraseña(password);
            RegistroPersona lista= new RegistroPersona();
            System.out.println(lista);
            return(motor.eliminarJugador(nick, passwordNuevo));
        }


        public static String cargarPartida(JComboBox jCBListaNickJugador1, char[] password1,
                                           JComboBox jCBListaNickJugador2, char[] password2)
        {
            String mensaje = "";
            try
            {
                String nick1 = new String();
                String nick2 = new String();
                String passwordNuevo1 = new String();
                String passwordNuevo2 = new String();
                nick1 = MetodosUtiles.obtenerNick(jCBListaNickJugador1);
                nick2 = MetodosUtiles.obtenerNick(jCBListaNickJugador2);
                passwordNuevo1 = MetodosUtiles.obtenerFormatoContraseña(password1);
                passwordNuevo2 = MetodosUtiles.obtenerFormatoContraseña(password2);
                motor.cargarPartida(nick1, passwordNuevo1, nick2, passwordNuevo2);
                return(mensaje);
            }
            catch (LoadGameException ex) {
                 return(ex.getMessage());

            }
        }

           public static String crearPartida(JComboBox jCBListaNickJugador1, char[] password1,
                                           JComboBox jCBListaNickJugador2, char[] password2)
           {
                String mensaje = "";
                try
                {
                    String nick1 = new String();
                    String nick2 = new String();
                    String passwordNuevo1 = new String();
                    String passwordNuevo2 = new String();
                    nick1 = MetodosUtiles.obtenerNick(jCBListaNickJugador1);
                    nick2 = MetodosUtiles.obtenerNick(jCBListaNickJugador2);
                    passwordNuevo1 = MetodosUtiles.obtenerFormatoContraseña(password1);
                    passwordNuevo2 = MetodosUtiles.obtenerFormatoContraseña(password2);
                    motor.crearPartida(nick1, passwordNuevo1, nick2, passwordNuevo2);
                    return(mensaje);
                }
                catch (CreateGameException ex)
                {
                   return(ex.getMessage());
                }
           }

           public static String obtenerPathAvatar(String player)
           {
                return motor.obtenerPathAvatarJugador(player);
           }

           public static Collection <RegistroPartida> obtenerListaRecord(String nick, boolean ganadas)
           {
               return(motor.obtenerListaDePartidas(nick, ganadas));
           }

           public static boolean salvarPartida()
           {
               return (motor.salvarPartida());
           }

           public static boolean existePartidaGuardada()
           {
                return(motor.existePartidaGuardada());
           }


           public static IMotorEnlace obtenerMotor()
           {
                return(motor);
           }
}
