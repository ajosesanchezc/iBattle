/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Interfaz.RegistroPartida;
import Motor.Barco;
import Motor.Persona;
import Motor.Jugada;
import Motor.Jugador;
import Motor.ListaBarcos;
import Motor.RegistroPersona;
import Motor.Tablero;
import java.io.FileWriter;
import java.util.*;
import java.util.ArrayList;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

/**
 *
 * @author tony
 */
public class Xml implements Archivo{

   TreeSet<Persona> listaPersona = new TreeSet();
   boolean partidaGuardada = false;

    public boolean isPartidaGuardada() {
        return partidaGuardada;
    }

    public Xml() {
       // String archivoPersona = "src/archivo/listaPersona.xml";
    }

    public TreeSet<Persona> cargarListaPersona() {

          try 
          {
             listaPersona = new TreeSet();
             SAXBuilder builder = new SAXBuilder(false);
             Document doc = builder.build("src/archivo/listaPersona.xml");
             Element raiz = doc.getRootElement();
             if(raiz!=null)
             {
                 List personas = raiz.getChildren("persona");
                 Iterator per = personas.iterator();
                 while (per.hasNext())
                 {
                    Element e = (Element) per.next();
                    String nombre = e.getChildText("nombre");
                    String apellido = e.getChildText("apellido");
                    String fechaNaci = e.getChildText("fechaNacimiento");
                    Date fecha = new Date();
                    String[] valor = fechaNaci.split("/");
                    fecha.setDate(Integer.parseInt(valor[0]));
                    fecha.setMonth(Integer.parseInt(valor[1]));
                    fecha.setYear(Integer.parseInt(valor[2]));
                    String nick = e.getChildText("nick");
                    String password = e.getChildText("password");
                    String path = e.getChildText("pathAvatar");
                    Persona persona = new Persona (nombre, apellido, password, nick, fecha, path);
                    listaPersona.add(persona);
                 }
             }
          } catch (Exception e) {
             e.printStackTrace();
          }
          return listaPersona;

       }

       public class AgregarPersona extends Element
   {

      public AgregarPersona(Persona persona)
      {
         super("persona");
         addContent(new Element("nombre").setText(persona.getNombre()));
         addContent(new Element("apellido").setText(persona.getApellido()));
         String fecha = String.valueOf(persona.getFecha().getDate()) + "/" + String.valueOf(persona.getFecha().getMonth()) + "/";
         fecha = fecha + String.valueOf(persona.getFecha().getYear());
         addContent(new Element("fechaNacimiento").setText(fecha));
         addContent(new Element("nick").setText(persona.getNick()));
         addContent(new Element("password").setText(persona.getPassword()));
         addContent(new Element("pathAvatar").setText(persona.getFoto()));
      }
   }

       public boolean guardarListaPersonas(TreeSet<Persona> lista)
   {
      Element root = new Element("personas");

      Iterator iterador = lista.iterator();

      while (iterador.hasNext()) {
         Persona persona = (Persona) iterador.next();
         AgregarPersona nuevo = new AgregarPersona(persona);
         root.addContent(nuevo);
      }
      Document doc = new Document(root);
      try {
         XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
         FileWriter writer = new FileWriter("src/archivo/listaPersona.xml");
         out.output(doc, writer);
      } catch (java.io.IOException e) {
         e.printStackTrace();
         System.out.println("Problema con I/O al escribir el xml");
      } catch (Exception e) {
         System.out.println("Problema al escribir el xml");
      }
      return(true);
   }

      /**
     * firma para realizar la transformacion de una cadena de String a un vector de enteros.
     * @param String con la cadena a transformar
     * @return Vector de enteros con la tranformacion de la cadena
     * NOTA: Se realizo este metodo por su frecuente uso para transformar una fecha leida tipo String a enteros
     * para luego ser asignada a la fecha de cada usuario
     */
      private int[] convertirVector (String cadena)
      {
            String[] vector= cadena.split(" ");
            int tamaño= vector.length;
            int [] aux = new int[tamaño];
            for (int i=0; i<tamaño; i++)
            {
                aux[i] = Integer.parseInt(vector[i]);
            }
            return(aux);
      }


        private int[][] cargarMatriz(Element raiz)
          {
           int [][] matriz = new int [10][10];
           List <Element> filas = raiz.getChildren("matriz");
           ArrayList <String> lista = new ArrayList();
           String nombre = new String();
             for(Element e: filas)
             {
                  nombre = e.getChildText("fila"+ String.valueOf(0) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(1) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(2) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(3) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(4) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(5) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(6) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(7) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(8) );
                  lista.add(nombre);
                  nombre = e.getChildText("fila"+ String.valueOf(9) );
                  lista.add(nombre);
             }
         for (int i=0; i<lista.size(); i++)
           {
               int[] vector = convertirVector(lista.get(i));
               for(int j=0; j<10; j++)
                   matriz[i][j] = vector[j];
           }
           return(matriz);
      }


   private ListaBarcos cargarListaBarcos(Element raiz, String tipoBarcos)
   {
       ArrayList <Barco> listaBarcos = new ArrayList();
       List <Element> barcos = raiz.getChildren(tipoBarcos);
         for(Element cadaBarco: barcos)
         {
             List <Element> listaA = cadaBarco.getChildren("barco");
             for(Element e: listaA)
             {
                String nombre = e.getChildText("nombre");
                String longitud = e.getChildText("longitud");
                String vida = e.getChildText("vida");
                String posicion = e.getChildText("posicion");
                int [] aux = convertirVector(posicion);
                Barco barco = new Barco(nombre, Integer.parseInt(longitud),aux, Integer.parseInt(vida));
                listaBarcos.add(barco);
             }
         }
         ListaBarcos lista = new ListaBarcos(listaBarcos);
      return(lista);
   }

    public Jugada cargarJugada()
    {

        try {
         RegistroPersona registro= new RegistroPersona();
         SAXBuilder builder = new SAXBuilder(false);
         Document doc = builder.build("src/archivo/Jugada.xml");
         Element raiz = doc.getRootElement();
         ArrayList <Jugador> listaJugadores = new ArrayList();
         List jugadores = raiz.getChildren("jugador");
         Iterator lista = jugadores.iterator();
         String turno = new String();
         int a = 1;
         while (lista.hasNext()) {
            Element e = (Element) lista.next();
            String nick = e.getChildText("nick");
            String password = e.getChildText("password");
            ListaBarcos listaBarcosActivos = new ListaBarcos();
            listaBarcosActivos = cargarListaBarcos(e, "barcosActivos");
            ListaBarcos listaBarcosHundidos = new ListaBarcos();
            listaBarcosHundidos = cargarListaBarcos(e, "barcosHundidos");
            int[][] matriz = cargarMatriz(e);
            Tablero tablero = new Tablero(matriz, listaBarcosActivos, listaBarcosHundidos);
            Persona persona = new Persona ();
            persona = registro.obtenerPersona(nick,password);
            Jugador jugador = new Jugador(persona, tablero);
            listaJugadores.add(jugador);
         }
          turno = raiz.getChildText("esTurnoDe");
           String fecha = raiz.getChildText("FechaDeJuego"); //continuar aqui
           Date nuevaFecha = new Date();
                String[] valor = fecha.split("/");
                nuevaFecha.setDate(Integer.parseInt(valor[0]));
                nuevaFecha.setMonth(Integer.parseInt(valor[1]));
                nuevaFecha.setYear(Integer.parseInt(valor[2]));
         Jugada jugada = new Jugada(listaJugadores, nuevaFecha, turno);
         return(jugada);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return (null);
    }


    public class AgregarMatriz extends Element
    {

      public AgregarMatriz(Jugador jugador)
      {
         super("matriz");
         int [][] matriz = new int[10][10];
         String vector= new String();
         matriz = jugador.getElTablero().getMatriz();
         for (int i=0; i<10; i++)
         {
             for(int j=0; j<10; j++)
             {
                 vector = vector + matriz[i][j] + " ";
             }
             String fila="fila"+ String.valueOf(i);
            addContent(new Element(fila).setText(vector));
            vector="";
         }
      }
   }

      public class AgregarBarco extends Element
      {

          public AgregarBarco(Barco barco)
          {
              super("barco");
              addContent(new Element("nombre").setText(barco.getNombre()));
             addContent(new Element("longitud").setText(String.valueOf(barco.getLongitud())));
             addContent(new Element("vida").setText(String.valueOf(barco.getVida())));
             int tamañoVector=2 * barco.getLongitud();
             String posicion = new String();
             int [] vectorPosicion = barco.getPosicion();
             for(int j=0; j<tamañoVector; j++)
                 posicion = posicion + " " + vectorPosicion[j];
             addContent(new Element("posicion").setText(posicion));
          }


      }

    public class AgregarListaBarcos extends Element
    {

      public AgregarListaBarcos(Jugador jugador, boolean activos, String msj)
      {
          super(msj);

         ArrayList <Barco> lista = new ArrayList();
         if(activos)
            lista=jugador.getElTablero().getMisBarcosActivos().getLista();
         else
             lista=jugador.getElTablero().getMisBarcosHundidos().getLista();

         int tamaño = lista.size();
         if (tamaño != 0)
         {
             for(int i= 0; i<tamaño; i++)
             {
                 AgregarBarco barco = new AgregarBarco(lista.get(i));
                 addContent(barco);
             }
         }
      }
   }

     public class AgregarJugador extends Element
     {

      public AgregarJugador(Jugador jugador)
      {
         super("jugador");
         addContent(new Element("nick").setText(jugador.getLaPersona().getNick()));
         addContent(new Element("password").setText(jugador.getLaPersona().getPassword()));AgregarListaBarcos activos= new AgregarListaBarcos(jugador, true, "barcosActivos");
         addContent(activos);AgregarListaBarcos hundidos= new AgregarListaBarcos(jugador, false, "barcosHundidos");
         addContent(hundidos);
         AgregarMatriz matriz  = new AgregarMatriz(jugador);
         addContent(matriz);
      }
   }

    public boolean guardarJugada(Jugada jugada) {
      Element root = new Element("jugadores");
     for(int i=0; i<2; i++)
     {
         Jugador jugador = new Jugador();
         jugador =jugada.getJugadores().get(i);
         AgregarJugador nuevo = new AgregarJugador(jugador);
         root.addContent(nuevo);
     }
       root.addContent(new Element("esTurnoDe").setText(jugada.getTurno()));
       String fecha = String.valueOf(jugada.getFechaJuego().getDate()) + "/";
       fecha = fecha + String.valueOf(jugada.getFechaJuego().getMonth()) + "/";
       fecha = fecha + String.valueOf(jugada.getFechaJuego().getYear());
       root.addContent(new Element("FechaDeJuego").setText(fecha));  ///AQUI FECHA
      Document doc = new Document(root);
      try {
         XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
         FileWriter writer = new FileWriter("src/archivo/Jugada.xml");
         out.output(doc, writer);
      } catch (java.io.IOException e) {
         e.printStackTrace();
         System.out.println("Problema con I/O al leer el xml");
      } catch (Exception e) {
         System.out.println("Problema al leer el xml");
      }
      partidaGuardada = true;
      return(true);
   }

    
    private ArrayList<RegistroPartida> cargarLista(Element e,String tipoPartida)
    {
       ArrayList <RegistroPartida> listaRecord = new ArrayList();
       List <Element> record = e.getChildren(tipoPartida);
         for(Element cadaPartida: record)
         {
             List <Element> listaA = cadaPartida.getChildren("partida");
             for(Element partida: listaA)
             {
                String nuevafecha = partida.getChildText("fecha");
                String total = partida.getChildText("total");
                String[] valor = nuevafecha.split("/");
                Date fecha = new Date();
                     fecha.setDate(Integer.parseInt(valor[0]));
                     fecha.setMonth(Integer.parseInt(valor[1]));
                     fecha.setYear(Integer.parseInt(valor[2]));
                RegistroPartida nuevaPartida = new RegistroPartida();
                nuevaPartida.setFechaPartida(fecha);
                nuevaPartida.setTotalPartidas(Integer.parseInt(total));
                listaRecord.add(nuevaPartida);
             }
         }
      return(listaRecord);

    }

    public TreeSet <Persona> cargarRecord()
    {
         try {
         ArrayList <RegistroPartida> listaGanadas = new ArrayList();
         ArrayList <RegistroPartida> listaPerdidas = new ArrayList();
         TreeSet <Persona> listaPersonas= new TreeSet();
         SAXBuilder builder = new SAXBuilder(false);
         Document doc = builder.build("src/archivo/record.xml");
         Element raiz = doc.getRootElement();
         List personas = raiz.getChildren("persona");
         Iterator lista = personas.iterator();
         while (lista.hasNext()) {
            Element e = (Element) lista.next();
            String nick = e.getChildText("nick");
            String existeG = e.getChildText("existeGanada");
            if(existeG.equals("si"))
            {
                listaGanadas = cargarLista(e, "partidasGanadas");
            }
            String existeP = e.getChildText("existePerdida");
            if(existeP.equals("si"))
            {
                 listaPerdidas = cargarLista(e, "partidasPerdidas");
            }
            Persona persona = new Persona();

            persona.setNick(nick);
            persona.getPartidas().setGanadas(listaGanadas);
            persona.getPartidas().setPerdidas(listaPerdidas);
            listaPersonas.add(persona);
         }
         return(listaPersonas);
      } catch (Exception e) {
             System.out.println("Erroral cargar record en Xml");
      }
      return (null);
    }


     public class AgregarPartida extends Element
      {

          public AgregarPartida(RegistroPartida registro)
          {
             super("partida");
             String fecha = new String();
             fecha = String.valueOf(registro.getFecha().getDate()) + "/";
             fecha = fecha + String.valueOf(registro.getFecha().getMonth() + "/");
             fecha = fecha + String.valueOf(registro.getFecha().getYear());
             addContent(new Element("fecha").setText(fecha));
             addContent(new Element("total").setText(String.valueOf(registro.getTotalPartida())));
          }


      }

    public class AgregarRegistroPartida extends Element
    {

      public AgregarRegistroPartida(ArrayList <RegistroPartida> lista, String msj)
      {
         super(msj);
         int tamaño = lista.size();
             for(int i= 0; i<tamaño; i++)
             {
                 AgregarPartida partida = new AgregarPartida(lista.get(i));
                 addContent(partida);
             }

      }
   }

    public class AgregarPersonaRecord extends Element
     {

      public AgregarPersonaRecord(Persona persona)
      {
        super("persona");
        int contGanada = 0;
        int contPerdida = 0;
         String mensaje = new String();
             addContent(new Element("nick").setText(persona.getNick()));
             if (!(persona.getPartidas().getGanadas().isEmpty()))
              {
                  mensaje = "partidasGanadas";
                  addContent(new Element("existeGanada").setText("si"));
                  contGanada++;
                  AgregarRegistroPartida registroG = new AgregarRegistroPartida (persona.getPartidas().getGanadas(), mensaje);
                  addContent(registroG);
             }
              if(!(persona.getPartidas().getPerdidas().isEmpty()))
              {
                  mensaje = "partidasPerdidas";
                  contPerdida++;
                  addContent(new Element("existePerdida").setText("si"));
                  AgregarRegistroPartida registroP = new AgregarRegistroPartida (persona.getPartidas().getPerdidas(), mensaje);
                  addContent(registroP);
              }
             if (contGanada == 0)
                addContent(new Element("existeGanada").setText("no"));
             if(contPerdida == 0)
                 addContent(new Element("existePerdida").setText("no"));
        }
    }


    public boolean guardarRecord(TreeSet <Persona> lista) {
      Element root = new Element("personas");
      for(Persona persona: lista)
      {
         if( (!(persona.getPartidas().getGanadas().isEmpty())) || (!(persona.getPartidas().getPerdidas().isEmpty())) )
        {
             AgregarPersonaRecord nuevo = new AgregarPersonaRecord(persona);
             root.addContent(nuevo);
         }
      }

      Document doc = new Document(root);
      try {
         XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
         FileWriter writer = new FileWriter("src/archivo/record.xml");
         out.output(doc, writer);
      } catch (java.io.IOException e) {
         e.printStackTrace();
         System.out.println("Problema con I/O al leer el xml");
      } catch (Exception e) {
         System.out.println("Problema al leer el xml");
      }
      return(true);
   }
        public boolean partidaGuardada ()
        {
            boolean partidaGuardada = true;
            return(partidaGuardada);
        }
}




