/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.util.Collection;
import java.util.Date;


/**
 *
 * @author lab_a112
 */
public interface IMotorEnlace
{
    /**
    * firma para crear un jugador nuevo
    * @param datos de la persona a crear
    * @return boolean indicando si se pudo crear o no el jugador
    */
    public boolean crearJugador(String nombreJugador, String apellidoJugador, String nickJugador, String pathAvatarJugador, Date fechaNacimientoJugador, String passwordJugador) throws CreateUserException;
  
    /**
  * firma para eliminar un jugador existente
  * @param nick y password del jugador a eliminar
  * @return boolean indicando si se pudo eliminar o no al jugador en el motor
  */
    public boolean eliminarJugador(String nickJugador,String passwordJugador );

    /**
    * firma para obtener el nombre de un jugador
    * @param String indicando el jugador del cual se quiere obtener el nombre
    * @return String con el nombre del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerNombreJugador(String player);

     /**
    * firma para obtener el apellido de un jugador
    * @param String indicando el jugador del cual se quiere obtener el apellido
    * @return String con el apellido del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerApellidoJugador(String player);

     /**
     * firma para obtener el nick de un jugador.
     * @param String indicando el jugador del cual se quiere obtener el nick
     * @return String con el nick del jugador.
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String obtenerNickJugador(String player);

    /**
    * firma para obtener la fecha de nacimiento de un jugador
    * @param String indicando el jugador del cual se quiere obtener la fecha
    * @return Date con la fecha de nacimiento del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public Date obtenerFechaNacimientoJugador(String player);

    /**
    * firma para obtener el path del avatar de un jugador
    * @param String indicando el jugador del cual se quiere obtener el nick
    * @return String con el path del avatar del jugador
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public String obtenerPathAvatarJugador(String player);

     /**
     * firma para crear una nueva partida a nivel del motor
     * @param cuatro String indicando los nickname y password de cada jugador
     * @return boolean indicando si se pudo crear o no la partida
     */
    public boolean crearPartida(String nickJugador1, String passwordJugador1, String nickJugador2, String passwordJugador2) throws CreateGameException;

    /**
     * firma para validar si ya existe una partida guardada en el motor
     * @param
     * @return boolean indicando si existe o no una partida guardada en el motor
     */
    public boolean existePartidaGuardada();

    /**
    * firma para cargar una partida guardada en el motor
    * @param cuatro String con el nickname y password de cada jugador
    * @return boolean indicando si se pudo cargar o no la partida
    */
    public boolean cargarPartida(String nickJugador1, String passwordJugador1, String nickJugador2, String passwordJuagador2) throws LoadGameException ;

    /**
    * firma para salvar la partida a nivel del servidor
    * @param
    * @return boolean indicando si se pudo o no salvar la partida en el motor
    */
    public boolean salvarPartida();

    /**
     * firma para generar un tablero aleatorio
     * @param
     * @return matriz de enteros con el tablero generado aleatoriamente
     */
    public int [][] generarTableroRandom();

    /**
     * firma para colocar un barco en el tablero
     * @param las posiciones X, Y de origen / destino, el tipo de barco y el jugador que lo coloco
     * @return boolean indicando si se pudo o no colocar el barco en las posiciones establecidas
     * NOTA: para el parametro player se asumen como validas SOLO las siguientes cadenas:
     * "player1" : Jugador 1
     * "player2" : Jugador 2
     */
    public boolean colocarBarco(int posXOrigen, int posYOrigen, int posXFin, int posYFin, String tipoBarco, String player);

    /**
     * firma para obtener un tablero de juego
     * @param el jugador que hace la solicitud
     * @return matriz de enteros con el tablero correspondiente
     * NOTA #1: Para el parametro player se asumen como validas SOLO las siguientes cadenas:
     * "player1" : Jugador 1
     * "player2" : Jugador 2
     * NOTA #2: Si el jugador "player1" hace la solicitud, se obtiene el tablero del "player2"
     */
    public int [][] obtenerTablero (String player);

    /**
    * firma para disparar dentro de una posición del tablero
    * @param posición X,Y a donde se dispara y jugador que está disparando
    * @return boolean indicando si se impactó o no a un barco enemigo
    * NOTA: Para el parámetro player se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public boolean disparar(int posX, int posY, String player);

    /**
    * firma para determinar si el jugador posee el turno para jugar o no
    * @param player que hace la solicitud
    * @return boolean indicando si el player tiene el turno de juego o no
    * NOTA: Para el parámetro se asumen como válidas SÓLO las siguientes cadenas:
    * "player1" : Jugador 1
    * "player2" : Jugador 2
    */
    public boolean esTurnoDe(String player);

    /**
    * firma para determinar si se alcanzó el fin de juego
    * @param
    * @return boolean indicando si el juego terminó o no
    */
    public boolean finDeJuego();

    /**
    * firma para obtener el ganador del juego
    * @param
    * @return String con el nick del jugador ganador
    * NOTA: En caso de no existir ganador, se retorna cadena en blanco ("")
    */
    public String obtenerGanador();

    /**
     * firma para obtener la lista de todos los nick registrados en el motor
     * @param
     * @return Collection de String con los nick
     */
    public Collection <String> obtenerListaNickJugadores();

    /**
    * firma para obtener la lista de partidas
    * @param el nick del usuario del cual se quieren obtener las partidas y un
    * booleano indicando si es de victorias (true) o de derrotas (false)
    * @return Collection con la lista de partidas por fecha
    */
    public Collection <RegistroPartida> obtenerListaDePartidas(String nickUsuario, boolean victoria);

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
    public int obtenerNumeroBarcosRestantes(boolean hundidos, boolean enemigos, String TipoBarco, String player);
}
