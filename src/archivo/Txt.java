package archivo;

import Interfaz.RegistroPartida;
import Motor.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Txt implements Archivo {

    private String inicioPersona;
    private String inicioJugada;
    private String inicioRecord; 
    public boolean partidaGuardada;

    public Txt() {

        inicioPersona = "src/archivo/listaPersona.txt";
        inicioJugada = "src/archivo/Jugada.txt";
        inicioRecord = "src/archivo/record.txt";
        partidaGuardada = false;

    }

    public boolean isPartidaGuardada() {
        return partidaGuardada;
    }


    public String getInicioPersona() {
        return inicioPersona;
    }

    public void setInicioPersona(String inicioPersona) {
        this.inicioPersona = inicioPersona;
    }

    public TreeSet<Persona> cargarListaPersona() {
        BufferedReader archivo = null;
        TreeSet<Persona> lista = new TreeSet<Persona>();
        int a = 0;
        try {
            archivo = new BufferedReader(new FileReader(inicioPersona));
            String linea;
            while (archivo.ready()) {
                linea = archivo.readLine();
                a = Integer.parseInt(linea);
                for (int i = 0; i < a; i++) {
                    Date fecha = new Date();
                    Persona persona = new Persona();
                    persona.setNombre(archivo.readLine());
                    System.out.println(" nombre " + persona.getNombre());
                    persona.setApellido(archivo.readLine());
                    System.out.println(" apellido " + persona.getApellido());
                    persona.setPassword(archivo.readLine());
                    System.out.println(" password " + persona.getPassword());
                    persona.setNick(archivo.readLine());
                    System.out.println(" nick " + persona.getNick());
                    String[] valor = archivo.readLine().split("/");
                    fecha.setDate(Integer.parseInt(valor[0]));
                    System.out.println("DIA " + fecha.getDate());
                    fecha.setMonth(Integer.parseInt(valor[1]));
                    System.out.println("MES " + fecha.getMonth());
                    fecha.setYear(Integer.parseInt(valor[2]));
                    System.out.println("ano " + fecha.getYear());
                    persona.setFecha(fecha);
                    persona.setFoto(archivo.readLine());
                    System.out.println("path avatar " + persona.getFoto());
                    lista.add(persona);
                }
                return (TreeSet<Persona>) lista;
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println("ERROR AL CARGAR EL ARCHIVO Lista Persona");
        }
        return (null);
    }
    /**
     * firma para  cargar un jugador
     * @param un vector de String que posee los datos del Jugador
     * @return  objeto de tipo Persona con todos los datos.
     * NOTA: como cada jugada posee 2 jugadores
     * se creo el metodo aparte para reutilizar codigo.
     */
    private Persona cargarJugador(String[] valor) {
        RegistroPersona registro = new RegistroPersona();
        Persona persona = new Persona();
        persona = registro.obtenerPersona(valor[0], valor[1]);
        return (persona);
    }
    /**
     * firma para  cargar una lista de barcos
     * @param puntero del archivo.
     * @return  una lista de barcos ya cargada.
     */
    private ListaBarcos cargarListaBarcos(BufferedReader reader) {
        try {
            ListaBarcos lista = new ListaBarcos();
            int a = Integer.parseInt(reader.readLine());
            for (int m = 0; m < a; m++) //for de barcos
            {
                String[] valor = reader.readLine().split(" ");
                Barco barco = new Barco(valor[0], Integer.parseInt(valor[1]), Integer.parseInt(valor[2]));
                int b = Integer.parseInt(valor[1]);
                b = b * 2;
                int[] vector = new int[b];
                valor = reader.readLine().split(" ");
                for (int i = 0; i < b; i++)//for de vector posicion
                {
                    vector[i] = Integer.parseInt(valor[i]);
                }
                barco.setPosicion(vector);
                lista.agregarBarco(barco);
            }
            return (lista);
        } catch (IOException ex) {
            System.out.println("Problema con el I/O del archivo");
            return (null);
        }
    }

    /**
     * firma para  cargar un tablero
     * @param puntero del archivo.
     * @return  una matriz de enteros que representa el tablero del jugador
     * NOTA: como cada jugador posee 2 tableros
     * se creo el metodo aparte para reutilizar codigo.
     */
    private int[][] cargarTablero(BufferedReader reader) {
        try {
            int[][] matriz = new int[10][10];
            for (int i = 0; i < 10; i++) {
                String[] valor = reader.readLine().split(" ");
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = Integer.parseInt(valor[j]);
                }
            }
            return (matriz);
        } catch (IOException ex) {
            System.out.println("Problema con el I/O del archivo");
            return (null);
        }
    }

    public TreeSet<Persona> cargarRecord() {
        try {
            TreeSet<Persona> listaPersonaRecord = new TreeSet<Persona>();
            BufferedReader archivo = new BufferedReader(new FileReader(inicioRecord));
            int ganadas, perdidas;
            while (archivo.ready()) {
                Persona persona = new Persona();
                ArrayList<RegistroPartida> listaGanadas = new ArrayList<RegistroPartida>();
                ArrayList<RegistroPartida> listaPerdidas = new ArrayList<RegistroPartida>();
                persona.setNick(archivo.readLine());
                System.out.println("NICK DE LA PERSONA  " + persona.getNick());
                ganadas = (Integer.parseInt(archivo.readLine()));
                System.out.println("NUMERO DE GANADAS   " + ganadas);
                perdidas = (Integer.parseInt(archivo.readLine()));
                System.out.println("NUMERO DE PERDIDAS  " + perdidas);
                for (int i = 0; i < ganadas; i++) {
                    RegistroPartida partida = new RegistroPartida();
                    Date fecha = new Date();
                    String[] valor = archivo.readLine().split("/");
                    fecha.setDate(Integer.parseInt(valor[0]));
                    System.out.println("DIA " + fecha.getDate());
                    fecha.setMonth(Integer.parseInt(valor[1]));
                    System.out.println("MES " + fecha.getMonth());
                    fecha.setYear(Integer.parseInt(valor[2]));
                    System.out.println("ano " + fecha.getYear());
                    partida.setTotalPartidas(Integer.parseInt(archivo.readLine()));
                    System.out.println("EL NUMERO ES  " + partida.getTotalPartida());
                    partida.setFechaPartida(fecha);
                    listaGanadas.add(partida);
                }
                persona.getPartidas().setGanadas(listaGanadas);
                for (int i = 0; i < perdidas; i++) {
                    RegistroPartida partida = new RegistroPartida();
                    Date fecha = new Date();
                    String[] valor = archivo.readLine().split("/");
                    fecha.setDate(Integer.parseInt(valor[0]));
                    System.out.println("DIA " + fecha.getDate());
                    fecha.setMonth(Integer.parseInt(valor[1]));
                    System.out.println("MES " + fecha.getMonth());
                    fecha.setYear(Integer.parseInt(valor[2]));
                    System.out.println("ano " + fecha.getYear());
                    partida.setTotalPartidas(Integer.parseInt(archivo.readLine()));
                    System.out.println("EL NUMERO ES  " + partida.getTotalPartida());
                    partida.setFechaPartida(fecha);
                    listaPerdidas.add(partida);
                }
                persona.getPartidas().setPerdidas(listaPerdidas);
                listaPersonaRecord.add(persona);
            }
            archivo.close();
            return (listaPersonaRecord);
        } catch (Exception e) {
            System.out.println("ERROR AL CARGAR EL ARCHIVO Cargar Record");
        }
        return (null);
    }

    
    public Jugada cargarJugada() {
        try {
            Jugada jugada = new Jugada();
            BufferedReader reader = new BufferedReader(new FileReader(inicioJugada));
             while (reader.ready())
             {
                String[] valor;
                ArrayList<Jugador> jugadores = new ArrayList();
                for (int l = 0; l < 2; l++) {//aca (for de persona)
                    valor = reader.readLine().split(" ");
                    Persona persona = cargarJugador(valor);
                    ListaBarcos activos = new ListaBarcos();
                    activos = cargarListaBarcos(reader);
                    ListaBarcos hundidos = new ListaBarcos();
                    hundidos = cargarListaBarcos(reader);
                    Tablero tablero = new Tablero(cargarTablero(reader), activos, hundidos);
                    Jugador jugador = new Jugador(persona, tablero);
                    jugadores.add(jugador);
                }
                String player = reader.readLine();
                Date fecha = new Date();
                String[] valor1 = reader.readLine().split("/");
                fecha.setDate(Integer.parseInt(valor1[0]));
                System.out.println("DIA " + fecha.getDate());
                fecha.setMonth(Integer.parseInt(valor1[1]));
                System.out.println("MES " + fecha.getMonth());
                fecha.setYear(Integer.parseInt(valor1[2]));
                System.out.println("ano " + fecha.getYear());
                jugada = new Jugada(jugadores, fecha, player);
                System.out.println("ES turno de  " + jugada.getTurno());
                System.out.println("Fecha " + jugada.getFechaJuego());
                for (Jugador jugador1 : jugada.getJugadores()) {
                    System.out.println("Jugador");
                    System.out.println(jugador1);
                    System.out.println("Barcos activos");
                    jugador1.getElTablero().getMisBarcosActivos().imprimirBarcos();
                    System.out.println("Barcos Hundidos");
                    jugador1.getElTablero().getMisBarcosHundidos().imprimirBarcos();
                    //             jugador1.getElTablero().imprimirTablero();
                }
             }
            reader.close();
            return (jugada);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo a leer");
            return (null);
        } catch (IOException ex) {
            System.out.println("Problema con el I/O del archivo");
            return (null);
        } catch (Exception e) {
            System.out.println("Problema leyendo la Jugada ");
            return (null);
        }


    }

    /**
     * firma para  guardar la lista de barcos activs o hundidos en archivo
     * @param puntero del archivo, entero que indica a cual jugador corresponden los datos,
     * la jugada a guardar, boolean activos para diferenciar si es los barcos activos o
     * hundidos
     * NOTA: como cada jugador posee 2 listas de barcos (activos, hundidos)
     * se creo el metodo aparte para reutilizar codigo  ser llamado de acuerdo al tipo de
     * lista de barco.
     */
    private void guardarListaBarcos(BufferedWriter writer, int i, Jugada jugada, boolean activos) {
        try {
            ArrayList<Barco> lista = new ArrayList();

            if (activos) {
                lista = jugada.getJugadores().get(i).getElTablero().getMisBarcosActivos().getLista();
            } else {
                lista = jugada.getJugadores().get(i).getElTablero().getMisBarcosHundidos().getLista();
            }

            int tamanoLista = lista.size();
            writer.write(String.valueOf(tamanoLista));
            writer.newLine();
            for (int j = 0; j < tamanoLista; j++) {
                writer.write(lista.get(j).getNombre() + " " + String.valueOf(lista.get(j).getLongitud()));
                writer.write(" " + String.valueOf(lista.get(j).getVida()));
                writer.newLine();
                int tamanoPosicion = 2 * lista.get(j).getLongitud();
                for (int k = 0; k < tamanoPosicion; k++) {
                    writer.write(lista.get(j).getPosicion()[k] + " ");
                }
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error de I/O al escribir el archivo");
        }

    }

    public boolean guardarJugada(Jugada jugada) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(inicioJugada));
            for (int i = 0; i < 2; i++) {
                writer.write(jugada.getJugadores().get(i).getLaPersona().getNick());
                writer.write(" " + jugada.getJugadores().get(i).getLaPersona().getPassword());
                writer.newLine();
                guardarListaBarcos(writer, i, jugada, true);
                guardarListaBarcos(writer, i, jugada, false);
                int[][] matriz = jugada.getJugadores().get(i).getElTablero().getMatriz();
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        writer.write(matriz[j][k] + " ");
                    }
                    writer.newLine();
                }
            }
            writer.write(jugada.getTurno());
            writer.newLine();
            Date fecha = new Date();
            fecha = jugada.getFechaJuego();
            writer.write(String.valueOf(fecha.getDate()) + "/");
            writer.write(String.valueOf(fecha.getMonth()) + "/");
            writer.write(String.valueOf(fecha.getYear()));
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error de I/O al escribir el archivo");
        }
        //catch (Exception e)
        // {
        //    System.out.println("Error al guardar la jugada");
        //}
        partidaGuardada = true;
        return (true);
    }

    public boolean guardarListaPersonas(TreeSet<Persona> lista) {
        if (lista != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(inicioPersona));
                System.out.println(String.valueOf(lista.size()));
                writer.write(String.valueOf(lista.size()));
                writer.newLine();
                for (Persona persona : lista) {
                    writer.write(persona.getNombre());
                    writer.newLine();
                    writer.write(persona.getApellido());
                    writer.newLine();
                    writer.write(persona.getPassword());
                    writer.newLine();
                    writer.write(persona.getNick());
                    writer.newLine();
                    Date fecha = new Date();
                    fecha = persona.getFecha();
                    writer.write(String.valueOf(fecha.getDate()) + "/");
                    writer.write(String.valueOf(fecha.getMonth()) + "/");
                    writer.write(String.valueOf(fecha.getYear()));
                    writer.newLine();
                    writer.write(persona.getFoto());
                    writer.newLine();
                }
                writer.close();
            } catch (IOException ex) {
                System.out.println("Error de I/O al escribir el archivo");
            }
            return (true);
        }
        return (false);
    }

    /**
     * firma para  guardar el Record de Partidas de cada persona.
     * @param la lista de tipo (RegistroPartida) que se desea guardar, puntero del archivo
     * @return boolean indicando si se pudo gudardar o no.
     * NOTA: como cada Persona en su record tiene 2 listas (ganadas, perdidas)
     * se creo el metodo aparte para reutilizar codigo, ser llamado
     * de acuerdo al tipo de lista a guardar.
     */
    private boolean guardarListaRecord(BufferedWriter writer, ArrayList<RegistroPartida> list) {
        try {
            for (RegistroPartida partida : list) {
                Date fecha = new Date();
                fecha = partida.getFecha();
                writer.write(String.valueOf(fecha.getDate()) + "/");
                writer.write(String.valueOf(fecha.getMonth()) + "/");
                writer.write(String.valueOf(fecha.getYear()));
                writer.newLine();
                writer.write(String.valueOf(partida.getTotalPartida()));
                writer.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Error de I/O al escribir el archivo");
        }
        return (true);
    }
    
    public boolean guardarRecord(TreeSet<Persona> listaPersona) {
        if (listaPersona != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(inicioRecord));
                System.out.println("numero de personas contenidas " + String.valueOf(listaPersona.size()));
                for (Persona persona : listaPersona) {
                    if ((!(persona.getPartidas().getGanadas().isEmpty())) || (!(persona.getPartidas().getPerdidas().isEmpty()))) {
                        ArrayList<RegistroPartida> list = new ArrayList<RegistroPartida>();
                        writer.write(persona.getNick());
                        writer.newLine();
                        list = persona.getPartidas().getGanadas();
                        writer.write(String.valueOf(list.size()));
                        writer.newLine();
                        list = persona.getPartidas().getPerdidas();
                        writer.write(String.valueOf(list.size()));
                        writer.newLine();
                    }
                    if (!(persona.getPartidas().getGanadas().isEmpty())) {

                        guardarListaRecord(writer, persona.getPartidas().getGanadas());
                    }
                    if (!(persona.getPartidas().getPerdidas().isEmpty())) {
                        guardarListaRecord(writer, persona.getPartidas().getPerdidas());
                    }
                }
                writer.close();
            } catch (IOException ex) {
                System.out.println("Error de I/O al escribir el archivo");
            }
            return (true);
        }
        return (false);
    }


    public boolean partidaGuardada() {

        boolean partidaGuardada = false;
        try {

            BufferedReader reader = new BufferedReader(new FileReader(inicioJugada));
            partidaGuardada = reader.ready();

        } catch (IOException ex) {
            System.out.println("Problema con el I/O del archivo");
        }
        System.out.println("desde txt partida guardada: " + partidaGuardada);
        return (partidaGuardada);
    }
}
