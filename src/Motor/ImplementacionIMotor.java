package Motor;

import Interfaz.*;
import archivo.Txt;
import archivo.Xml;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.apache.log4j.Logger;


/**
 *
 * @author lab_l11
 */
public class ImplementacionIMotor implements IMotorEnlace
{
   private Logger bitacora = Logger.getLogger(getClass());
   private Jugada jugada;
   private RegistroPersona registro = new RegistroPersona();
   private Tablero tablero;
   public int cont1;

   private int cantPortaAvion = 0,
               cantAcorazado = 0,
               cantSubmarino = 0,
               cantMinador = 0;
 // private Txt archivo = new Txt();
    private Xml archivo = new Xml();

    public ImplementacionIMotor( Jugada jugada )
    {
        this.jugada = jugada;
    }
  
    public ImplementacionIMotor() {
        this.tablero = new Tablero();
        this.cont1 = 0;
    }

    private void asignarJugada(Jugada jugada)
    {
        this.jugada= jugada;
    }


    public boolean crearJugador(String nombreJugador, String apellidoJugador, String nickJugador, String pathAvatarJugador, Date fechaNacimientoJugador, String passwordJugador) throws CreateUserException
    {
        registro.cargarListaCompleta();
        if( RegistroPersona.buscarPersona(nickJugador) )
         {
           System.out.print("Error Nick Existente \n");
            throw new CreateUserException ("El nick ya existe");
         }
         else
         {
             Persona persona = new Persona(nombreJugador,apellidoJugador,passwordJugador,nickJugador, fechaNacimientoJugador,pathAvatarJugador);
             registro.nuevaPersona(persona);
             archivo.guardarListaPersonas(registro.getListaPersona());
             archivo.guardarRecord(registro.getListaPersona());
             bitacora.info("Creando Jugador");
             return(true);
         }
    }

  /**
  * firma para eliminar un jugador existente
  * @param nick y password del jugador a eliminar
  * @return boolean indicando si se pudo eliminar o no al jugador en el motor
  */
    public boolean eliminarJugador(String nickJugador, String passwordJugador)
    {
        registro.cargarListaCompleta();
       if(registro.borrarPersona(nickJugador, passwordJugador))
       {
           archivo.guardarListaPersonas(registro.getListaPersona());
           archivo.guardarRecord(registro.getListaPersona());
           bitacora.info("Jugador eliminado corectamente");
           return(true);
       }
       else
           return(false);
    }

    /**
    * firma para obtener la fecha de nacimiento de un jugador
    * @param String indicando el jugador del cual se quiere obtener la fecha
    * @return Date con la fecha de nacimiento del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public Date obtenerFechaNacimientoJugador(String player)
    {
        return(jugada.obtenerFecha(player));
    }

    /**
    * firma para obtener el path del avatar de un jugador
    * @param String indicando el jugador del cual se quiere obtener el nick
    * @return String con el path del avatar del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerPathAvatarJugador(String player)
    {
        return(jugada.obtenerPath(player));
    }

/**
 * firma para crear una nueva partida a nivel del motor
 * @param cuatro String indicando los nickname y password de cada jugador
 * @return boolean indicando si se pudo crear o no la partida
 */
    public boolean crearPartida(String nickJugador1, String passwordJugador1, String nickJugador2, String passwordJugador2) throws CreateGameException
    {
        registro.cargarListaCompleta();
         if (!RegistroPersona.buscarPersona(nickJugador1)){
            System.err.print("Error en buscar jugador 1\n");
            throw new CreateGameException ("El nick no se consigue, el jugador 1 no existe");
        }
        else {
         if(!RegistroPersona.correspondePassword(nickJugador1, passwordJugador1)){
            System.err.print("Error en buscar jugador 1\n");
            throw new CreateGameException ("El Password no pertenece al jugador 1");
         } 
        } 
        if (!RegistroPersona.buscarPersona(nickJugador2)){
            System.err.print("Error en buscar jugador 2\n");
            throw new CreateGameException ("El nick no se consigue, el jugador 2 no existe");
        }
        else {
         if(!RegistroPersona.correspondePassword(nickJugador2, passwordJugador2)){
            System.err.print("Error en buscar jugador 2\n");
            throw new CreateGameException ("El Password no pertenece al jugador 2");
         } 
        } 
        Jugada jugada1 = new Jugada(registro.obtenerPersona(nickJugador1, passwordJugador1),registro.obtenerPersona(nickJugador2, passwordJugador2));
        asignarJugada(jugada1);
        bitacora.info("La partida se creo de manera exitosa");
        return (true);
    }

    /**
    * firma para obtener el nombre de un jugador
    * @param String indicando el jugador del cual se quiere obtener el nombre
    * @return String con el nombre del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerNombreJugador(String player)
    {
       return(jugada.obtenerNombre(player));
    }

    /**
    * firma para obtener el apellido de un jugador
    * @param String indicando el jugador del cual se quiere obtener el apellido
    * @return String con el apellido del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerApellidoJugador(String player)
    {
           return(jugada.obtenerApellido(player));
    }

     /**
     * firma para obtener el nick de un jugador.
     * @param String indicando el jugador del cual se quiere obtener el nick
     * @return String con el nick del jugador.
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String obtenerNickJugador(String player)
    {
       return (jugada.buscarNickname(player));
    }

    /**
     * firma para validar si ya existe una partida guardada en el motor
     * @param
     * @return boolean indicando si existe o no una partida guardada en el motor
     */
     public boolean existePartidaGuardada() {
      return (archivo.partidaGuardada());
   }

    /**
    * firma para cargar una partida guardada en el motor
    * @param cuatro String con el nickname y password de cada jugador
    * @return boolean indicando si se pudo cargar o no la partida
    */
    public boolean cargarPartida(String nickJugador1, String passwordJugador1, String nickJugador2, String passwordJugador2) throws LoadGameException
    {
        registro.cargarListaCompleta();
       Jugada jugada1=archivo.cargarJugada();
       String mensaje = validacionCargaJugada(nickJugador1, passwordJugador1, nickJugador2, passwordJugador2,jugada1);
       if(mensaje.equals(""))
       {
         jugada = new Jugada();
         jugada = jugada1;
         bitacora.info("La partida se cargo");
         return(true);
       }
       throw new LoadGameException (mensaje);
    }

    /**
    * firma para salvar la partida a nivel del servidor
    * @param
    * @return boolean indicando si se pudo o no salvar la partida en el motor
    */
    public boolean salvarPartida()
    {
        archivo.guardarJugada(jugada);
        return(true);
    }

    /**
     * firma para generar un tablero aleatorio
     * @param
     * @return matriz de enteros con el tablero generado aleatoriamente
     */

     public int[][] generarTableroRandom() { // colocar e el proyecto final

        Tablero elTablero;
        tablero = (tablero.tableroRandom(tablero));
        elTablero = tablero;
        tablero = new Tablero();
        if ((jugada.getJugadores().get(0).getElTablero()) == null) {
              jugada.getJugadores().get(0).setElTablero(elTablero);
              bitacora.info("colocando Tablero Aleatorio para Player1" );
              
        }
        else {
            
            if (jugada.getJugadores().get(1).getElTablero()== null) {
               jugada.getJugadores().get(1).setElTablero(elTablero);
                bitacora.info("colocando Tablero Aleatorio para Player2" );
                
            }
            else
                System.out.println(" ya jugador2 tiene tablero");
        }

        return (elTablero.getMatriz());
    }

   /**
    * firma para colocar un barco en el tablero
    * @param las posiciones X, Y de origen / destino, el tipo de barco y el jugador que lo coloco
    * @return boolean indicando si se pudo o no colocar el barco en las posiciones establecidas
    * NOTA: para el parametro player se asumen como validas SOLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
   public boolean colocarBarco(int posXOrigen, int posYOrigen, int posXFin, int posYFin, String tipoBarco, String player) {
      /**
       * MODIFICADO PARA SUBIR AL PROYECTO
       */
      boolean colocar = true;
      int maximo = 10;
      int posicion = 0;
      /* pasar esto al proyecto */
      if ((posXOrigen != posXFin) && (posYOrigen != posYFin)) {
         colocar = false;
      } else {
         if (!tablero.direccionBarco(posXOrigen, posYOrigen, posXFin, posYFin, tipoBarco, tablero)) {
            colocar = false;
            System.out.println("dentro de direcciónBarco...");
         } else {
            if ((tipoBarco.equals("portaavion")) && (cantPortaAvion++ > 0)) {
                  colocar = false;
            }
            if ((tipoBarco.equals("acorazado")) && (cantAcorazado++ > 1)) {
               colocar = false;
            }
            if ((tipoBarco.equals("submarino")) && (cantSubmarino++ > 2)) {
               colocar = false;
            }
            if ((tipoBarco.equals("minador")) && (cantMinador++ > 3)) {
               colocar = false;
            }
         }
      }
      if (colocar) {
         tablero = (tablero.crearTableroManual(posXOrigen, posYOrigen, posXFin, posYFin, tipoBarco, tablero));
         cont1++;
         if (cont1 == maximo) {
            if (player.equals("player1")) {
               jugada.getJugadores().get(posicion).setElTablero(tablero);
               bitacora.info("Tablero manual creado  para player1");
            } else {
               jugada.getJugadores().get(posicion + 1).setElTablero(tablero);
               bitacora.info("Tablero manual creado  para player2");
            }
            tablero = new Tablero();
            cont1 = 0;
            cantPortaAvion = 0;
            cantAcorazado = 0;
            cantSubmarino = 0;
            cantMinador = 0;
         }
      }

      return colocar;
   }

    /**
     * firma para obtener un tablero de juego
     * @param el jugador que hace la solicitud
     * @return matriz de enteros con el tablero correspondiente
     * NOTA #1: Para el parametro player se asumen como validas SOLO las siguientes cadenas:
     * "player1" : Jugador 1
     * "player2" : Jugador 2
     * NOTA #2: Si el jugador "player1" hace la solicitud, se obtiene el tablero del "player2"
     */
    public int[][] obtenerTablero(String player) {
        int posicion = 0;
        if (player.equals("player1")) {
            return (jugada.getJugadores().get(posicion + 1).getElTablero().getMatriz());
        } else {
            return (jugada.getJugadores().get(posicion).getElTablero().getMatriz());
        }
    }

    /**
    * firma para disparar dentro de una posición del tablero
    * @param posición X,Y a donde se dispara y jugador que está disparando
    * @return boolean indicando si se impactó o no a un barco enemigo
    * NOTA: Para el parámetro player se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public boolean disparar(int posX, int posY, String player)
    {  
        if (jugada.blanco( posX , posY , player) ) {

             System.out.println("SALIIIII");
             bitacora.info("Dio en un barco");
             return(true); //pintar en rojo
       }
        else
            return(false); //pintar agua
    }

    /**
    * firma para determinar si el jugador posee el turno para jugar o no
    * @param player que hace la solicitud
    * @return boolean indicando si el player tiene el turno de juego o no
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public boolean esTurnoDe( String player )
    {
        if ( jugada.getTurno().equals(player) )
            return(true);
        return(false);
    }

    /**
    * firma para determinar si se alcanzó el fin de juego
    * @param
    * @return boolean indicando si el juego terminó o no
    */
    public boolean finDeJuego()
    {
        if( jugada.finDeJuego())
            return(true);
        return(false);
    }

    /**
    * firma para obtener el ganador del juego
    * @param
    * @return String con el nick del jugador ganador
    * NOTA: En caso de no existir ganador, se retorna cadena en blanco ("")
    */
    public String obtenerGanador()
    {
        return ( jugada.obtenerGanador() );
    }

    /**
     * firma para obtener la lista de todos los nick registrados en el motor
     * @param
     * @return Collection de String con los nick
     */
    public Collection<String> obtenerListaNickJugadores()
    {
        registro.cargarListaCompleta();
        Collection <String> lista = (Collection) RegistroPersona.obtenerListaNick();
        return (lista);
    }

    /**
    * firma para obtener la lista de partidas
    * @param el nick del usuario del cual se quieren obtener las partidas y un
    * booleano indicando si es de victorias (true) o de derrotas (false)
    * @return Collection con la lista de partidas por fecha
    */
    public Collection<RegistroPartida> obtenerListaDePartidas(String nickUsuario, boolean victoria)
    {
      Collection<RegistroPartida> aux = new ArrayList<RegistroPartida>();
      aux= registro.obtenerListaDePartidas(nickUsuario, victoria);
        System.out.println(aux.size());
        return(registro.obtenerListaDePartidas(nickUsuario, victoria));
    }

    /**
    * firma para obtener el número de barcos de un jugador
    * @param un booleano que indica si la lista es de barcos hundidos (true)
    * o activos (false), un booleano indicando si es de barcos enemigos (true)
    * o propios (false) y el String del jugador que hace la solicitud
    * @return un entero con la cantidad de barcos
    * NOTA: Para el parámetro player se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public int obtenerNumeroBarcosRestantes(boolean hundidos, boolean enemigos, String TipoBarco, String player)
    {
        return (jugada.obtenerNumeroBarcosRestantes(hundidos, enemigos,  TipoBarco,  player));
    }

  private String validacionCargaJugada(String nickJugador1, String passwordJugador1, String nickJugador2, String passwordJugador2, Jugada jugada)
  {
      if(jugada!=null){
      if (!(nickJugador1.equals(jugada.getJugadores().get(0).getLaPersona().getNick())))
            return("El nick del jugador 1 no coincide con el de la jugada guardada");
      else
            if(!(passwordJugador1.equals(jugada.getJugadores().get(0).getLaPersona().getPassword())))
                 return("El Password no pertenece al jugador 1");

        if (!(nickJugador2.equals(jugada.getJugadores().get(1).getLaPersona().getNick())))
            return("El nick del jugador 2 no coincide con el de la jugada guardada");
        else
        {
         if(!(passwordJugador2.equals(jugada.getJugadores().get(1).getLaPersona().getPassword())))
             return("El Password no pertenece al jugador 2");
        }
      }
        return("");
         }
}
