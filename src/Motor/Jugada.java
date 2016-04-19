package Motor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tony
 */
public class Jugada {

    private ArrayList<Jugador> jugadores;
    private Date fechaJuego;
    private String turno;

    public Jugada()
    {
    }

    public Jugada(ArrayList<Jugador> jugadores, String turno)
    {
        this.jugadores = jugadores;
        this.turno = turno;
    }

    public Jugada(Persona p1, Persona p2)
    {
        this.jugadores = new ArrayList<Jugador>();
        insertarEnLista(p1);
        insertarEnLista(p2);
        this.turno = "player1";
        this.fechaJuego = asignarFechaHoy();
    }

    public Jugada(ArrayList<Jugador> jugadores, Date fechaJuego, String turno)
    {
        this.jugadores = jugadores;
        this.fechaJuego = fechaJuego;
        this.turno = turno;
    }

    public Date getFechaJuego()
    {
        return fechaJuego;
    }

    public void setFechaJuego(Date fechaJuego)
    {
        this.fechaJuego = fechaJuego;
    }

    public String getTurno()
    {
        return turno;
    }

    public void setTurno(String turno)
    {
        this.turno = turno;
    }

    public List<Jugador> getJugadores()
    {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores)
    {
        this.jugadores = jugadores;
    }


    /**
     * firma para asignar la fecha actual al momento de crear una partida.
     * @return fecha del momento en que se cree la jugada.
     * NOTA: Este metodo es invocado por el constructor cuando se instancia una
     * nueva jugada
     */
    private Date asignarFechaHoy()
    {

        Calendar fechaJuegoCalendar = new GregorianCalendar();
        Date fechaJuegoDate = new Date();
        int dia, mes, año;
        dia = (fechaJuegoCalendar.get(Calendar.DATE));
        mes = (fechaJuegoCalendar.get(Calendar.MONTH));
        año = (fechaJuegoCalendar.get(Calendar.YEAR));
        mes = mes + 1;
        fechaJuegoDate.setDate(dia);
        fechaJuegoDate.setMonth(mes);
        fechaJuegoDate.setYear(año);
        return (fechaJuegoDate);
    }

    /**
     * firma para insertar en la lista de jugadores una persona con todos sus datos.
     * @param Objecto de tipo Persona, con los datos a insertar en lista
     * NOTA: Este metodo es invocado dos veces por el constructor cuando se
     * instancia una nueva jugada para insertar en lista de jugadores cada persona
     */
    private void insertarEnLista(Persona p)
    {
        Jugador j = new Jugador(p);
        this.jugadores.add(j);//inserto el jugador
    }


    /**
     * firma para buscar y obtener el nick de un jugador, hace la implementacion
     * del metodo obtenerNickJugador (ImplementacionIMotor)
     * @param String indicando el jugador del que se quiere obtener el nick
     * @return String con el nick del jugador
      * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String buscarNickname(String player)
    {
        String nick = "0";
        if (!jugadores.isEmpty()) {
            if (player.equals("player1")) {
                nick = jugadores.get(0).getLaPersona().getNick();
            } else if (player.equals("player2")) {
                nick = jugadores.get(1).getLaPersona().getNick();
            }
        }
        return nick;
    }

   
    /**
     * firma para buscar y obtener el nombre de un jugador, hace la implementacion
     * del metodo obtenerNombreJugador (ImplementacionIMotor)
     * @param String indicando el jugador del que se quiere obtener el nombre
     * @return String con el nombre del jugador
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String obtenerNombre(String player)
    {
        String nombre = "";
        if (!jugadores.isEmpty())
        {
            if (player.equals("player1"))
                nombre = jugadores.get(0).getLaPersona().getNombre();
            else
                if (player.equals("player2"))
                  nombre = jugadores.get(1).getLaPersona().getNombre();
        }
        return nombre;
    }


    /**
     * firma para buscar y obtener la fecha de nacimiento de un jugador,
     * hace la implementacion del metodo obtenerFechaNacimientoJugador
     * (ImplementacionIMotor)
     * @param String indicando el jugador del que se quiere obtener la fecha de
     * nacimiento
     * @return Date con la fecha de nacimiento del jugador
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public Date obtenerFecha(String player)
    {
        Date fecha = new Date();
        fecha = null;
        if (!jugadores.isEmpty())
        {
            if (player.equals("player1"))
                fecha = jugadores.get(0).getLaPersona().getFecha();
            else
                if (player.equals("player2"))
                     fecha = jugadores.get(1).getLaPersona().getFecha();
        }
        return (fecha);
    }

    /**
     * firma para buscar y obtener el apellido de un jugador,hace la
     * implementacion del metodo obtenerApellidoJugador (ImplementacionIMotor)
     * @param String indicando el jugador del que se quiere obtener el apellido
     * @return String con el apellido del jugador
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String obtenerApellido(String player)
    {
        String apellido = "";
        if (!jugadores.isEmpty())
        {
            if (player.equals("player1")) 
                apellido = jugadores.get(0).getLaPersona().getApellido();

            else
                if (player.equals("player2"))
                    apellido = jugadores.get(1).getLaPersona().getApellido();
        }
        return apellido;
    }

     
    /**
     * firma para buscar y obtener el pathAvatar de un jugador,hace la
     * implementacion del metodo obtenerPathAvatarJugador (ImplementacionIMotor)
     * @param String indicando el jugador del que se quiere obtener el pathAvatar
     * @return String con el pathAvatar del jugador
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public String obtenerPath(String player)
    {
        String foto = "";
        if (!jugadores.isEmpty())
        {
            if (player.equals("player1")) 
                foto = jugadores.get(0).getLaPersona().getFoto();
            else
                if (player.equals("player2"))
                    foto = jugadores.get(1).getLaPersona().getFoto();
        }
        return foto;
    }

   
    public Tablero obtenerTablero(String player) {
        Tablero tablero = new Tablero();
        if (!jugadores.isEmpty()) {
            if (player.equals("player1")) {
                tablero = jugadores.get(0).getElTablero();
            } else if (player.equals("player2")) {
                tablero = jugadores.get(1).getElTablero();
            }
        }
        return tablero;
    }

    /**
     * firma para indicar si se impacto, si se dio en el blanco de un barco
     * enemigo implementacion del metodo disparar (ImplementacionIMotor)
     * @param String indicando el jugador que realiza el disparo, enteros x,y
     * indicando en que posicion del tablero(matriz) se realiza el disparo
     * @return boolean indicando si se logro o no impactar en un barco
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public boolean blanco(int x, int y, String player) {
        int a;
        if (player.equals("player1"))
            a = 1;
        else
            a = 0;
        int[][] matriz = jugadores.get(a).getElTablero().getMatriz();
        if (matriz[x][y] == 1) 
        {
            actualizarBarcos(x, y, a);
            matriz[x][y] = 3;
            jugadores.get(a).getElTablero().setMatriz(matriz);
            return (true);
        } else 
        {
            matriz[x][y] = 2;
            jugadores.get(a).getElTablero().setMatriz(matriz);
            if (a == 1) {
                turno = "player2";
            } else {
                turno = "player1";
            }
            return (false);
        }
    }


    /**
     * firma para luego de concluida una jugada asignar al record de partidas de
     * cada jugador la partida ganada o perdida del juego realizado
     * @param String indicando el jugador ganador de la partida
     * @return boolean indicando si se logro actualizar el registro de partidas
     * de cada jugador
     */
    private boolean asignarRecord(String ganador)
    {
        Calendar fechaJuegoCalendar = new GregorianCalendar();
        Date fechaJuegoDate = new Date();
        int dia, mes, año;
        dia = (fechaJuegoCalendar.get(Calendar.DATE));
        mes = (fechaJuegoCalendar.get(Calendar.MONTH));
        año = (fechaJuegoCalendar.get(Calendar.YEAR));
        mes = mes + 1;
        fechaJuegoDate.setDate(dia);
        fechaJuegoDate.setMonth(mes);
        fechaJuegoDate.setYear(año);
        if (ganador.equals(jugadores.get(0).getLaPersona().getNick()))
        {
            jugadores.get(0).getLaPersona().getPartidas().agregarRecordGanadas(fechaJuegoDate);
            jugadores.get(1).getLaPersona().getPartidas().agregarRecordPerdidas(fechaJuegoDate);
            return (true);
        } else
        {
            jugadores.get(1).getLaPersona().getPartidas().agregarRecordGanadas(fechaJuegoDate);
            jugadores.get(0).getLaPersona().getPartidas().agregarRecordPerdidas(fechaJuegoDate);
            return (true);
        }
    }

     /**
     * firma para indicar si ya la partida actual a llegado a su fin, es decir
     * ya existe un ganador, hace la implementacion del metodo finDeJuego
     * (ImplementacionIMotor)
     * @return boolean indicando si es o no fin de la partida actual
     */
    public boolean finDeJuego()
    {
        if (jugadores.get(0).getElTablero().listaBarcoVacia()) 
            return (true);
        if (jugadores.get(1).getElTablero().listaBarcoVacia())
            return (true);

        return (false);
    }

     /**
     * firma para buscar y obtener el nick del jugador ganador de la partida
     * actual,hace la implementacion del metodo obtenerGanador
     * (ImplementacionIMotor)
     * @return String con el nick del jugador ganador
     * NOTA1: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     * NOTA2: En caso de no existir un ganador en la partida actual,
     * se retorna cadena en blanco
     */
    public String obtenerGanador()
    {
        if (jugadores.get(0).getElTablero().listaBarcoVacia())
        {
            asignarRecord(jugadores.get(1).getLaPersona().getNick());
            return (jugadores.get(1).getLaPersona().getNick());
        } 
        else
        {
            if (jugadores.get(1).getElTablero().listaBarcoVacia()) {
                asignarRecord(jugadores.get(0).getLaPersona().getNick());
                return (jugadores.get(0).getLaPersona().getNick());
            }
            else
                return ("");
        }
    }

     /**
     * firma para actualizar los barcos de un jugador luego de que el enemigo
     * impacta en uno de sus barcos
     * @param enteros x,y indicando la posicion del tablero(matriz) donde se
     * realizo el dispara y hay un barco; entero "a" que indica a cual jugador se
     * actualizaran sus barcos
     * @return boolean indicando si se logro o no actualizar los barcos del jugador
     * NOTA: Para el parametro "a" se le asigna cero(0) para referirse al
     * jugador1 y uno(1) para referirse al jugador2
     *
     */
    public boolean actualizarBarcos(int x, int y, int a) {
        ListaBarcos lista;
        Barco barco;
        int[] vector;
        int vida = 0;
        Iterator iterador = jugadores.get(a).getElTablero().getMisBarcosActivos().getLista().iterator();
        while (iterador.hasNext()) {
            barco = (Barco) iterador.next();
            vector = barco.getPosicion(); 
            for (int k = 0; k < vector.length; k++) {
                if (x == vector[k]) {
                    if (y == vector[k + 1]) {
                        System.out.println("\n IMPRIMIENDO DATOS DEL BARCO IMPACTADO");
                        System.out.println("nombre " + barco.getNombre());
                        vida = barco.getVida();
                        System.out.println("la vida que tenia " + barco.getVida());
                        vida = vida - 1;
                        barco.setVida(vida);
                        System.out.println("vida actualizada " + barco.getVida());
                        for (int i = 0; i < vector.length; i++) {
                            System.out.print(vector[i] + " ");
                        }
                        System.out.println("");
                        if (vida == 0) {
                            lista = new ListaBarcos(jugadores.get(a).getElTablero().getMisBarcosHundidos().getLista());
                            lista.agregarBarco(barco);
                            jugadores.get(a).getElTablero().getMisBarcosHundidos().setLista(lista.getLista());
                            jugadores.get(a).getElTablero().getMisBarcosHundidos().imprimirBarcos();
                            lista = new ListaBarcos(jugadores.get(a).getElTablero().getMisBarcosActivos().getLista());
                            lista.eliminarBarcoConVidaCero();
                            jugadores.get(a).getElTablero().getMisBarcosActivos().setLista(lista.getLista());
                            jugadores.get(a).getElTablero().getMisBarcosActivos().imprimirBarcos();
                        }
                        return (true);
                    }
                }
                k++;
            }
        }
        System.out.println("algo pasa pero NO LO ENCONTRO");
        return (false);
    }

     /**
     * firma para buscar y obtener el numero de barcos restantes de un jugador
     * de una partida actual, hace la implementacion del metodo
     * obtenerNumeroBarcosRestantes (ImplementacionIMotor)
     * @param boolean indicando si se refiere o no a barcos hundidos, boolean
     * indicando si se refiere a los barcos del enemigo(verdadero) o a los barcos
     * propios(falso), String indicando tipo de barco del cual se requiere su
     * numero y String con el jugador de la partida actual que realiza la solicitud
     * @return entero con el numero de barcos
     * NOTA: Para el parametro se asumen como válidas SOLO las siguientes cadenas:
     * "player1" : Jugador 1.
     * "player2" : Jugador 2.
     */
    public int obtenerNumeroBarcosRestantes(boolean hundidos, boolean enemigos, String TipoBarco, String player)
    {
        int a;
        int cont = 0;
        ArrayList<Barco> lista = new ArrayList();

        if (player.equals("player1")) {
            if (enemigos) {
                a = 1;
            } else {
                a = 0;
            }
        } else if (enemigos) {
            a = 0;
        } else {
            a = 1;
        }

        if (hundidos) {
            lista = jugadores.get(a).getElTablero().getMisBarcosHundidos().getLista();
        } else {
            lista = jugadores.get(a).getElTablero().getMisBarcosActivos().getLista();
        }

        for (Barco barco : lista) {
            if (barco.getNombre().equals(TipoBarco)) {
                cont++;
            }
        }
        return (cont);
    }
}

