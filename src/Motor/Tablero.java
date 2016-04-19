package Motor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JessicaP
 */
public class Tablero {

   private int[][] matriz;
   private ListaBarcos misBarcosActivos;  // ultima actualizacion a nivel de atributos.
   private ListaBarcos misBarcosHundidos;  // ultima actualizacion a nivel de atributos.
   public int[][] aux;

   public Tablero() {
      aux = new int[10][10];
      for (int i = 0; i < aux.length; i++) {
         for (int j = 0; j < aux[i].length; j++) {
            aux[i][j] = 0;
         }
      }
      this.matriz = aux;
      this.misBarcosActivos = new ListaBarcos();
      this.misBarcosHundidos = new ListaBarcos();
   }

   public Tablero(int[][] aux) {
      this.matriz = aux;
   }

   public Tablero(int[][] matriz, ListaBarcos misBarcosActivos, ListaBarcos misBarcosHundidos) {
      this.matriz = matriz;
      this.misBarcosActivos = misBarcosActivos;
      this.misBarcosHundidos = misBarcosHundidos;
   }

   public int[][] getMatriz() {
      return matriz;
   }

   public void setMatriz(int[][] matriz) {
      this.matriz = matriz;
   }

   public ListaBarcos getMisBarcosActivos() {
      return misBarcosActivos;
   }

   public void setMisBarcosActivos(ListaBarcos misBarcosActivos) {
      this.misBarcosActivos = misBarcosActivos;
   }

   public ListaBarcos getMisBarcosHundidos() {
      return misBarcosHundidos;
   }

   public void setMisBarcosHundidos(ListaBarcos misBarcosHundidos) {
      this.misBarcosHundidos = misBarcosHundidos;
   }

   /**
    * firma para crear un tablero aleatorio, realiza la implentacion del metodo
    * generarTableroRandom (ImplementacionIMotor).
    * @param objeto de la clase Tablero, se utilizara para crear el tablero del
    * player correspondiente.
    * @return objeto de la clase Tablero, con una matriz de enteros generada
    * aleatoriamente y los barcos activos que se generan al crear la matriz.
    * NOTA: Este metodo realiza su tarea llamando a otros metodos que generan
    * aleatoriamente los barcos, lleva el control del numero de barcos maximos
    * que se tiene que crear.
    */
   public Tablero tableroRandom(Tablero elTablero) {

      Random numerosAleatorios = new Random();
      if (elTablero != null) {
         System.out.println("estoy en tableroRamdon");
         int cont = 0;
         cont = elTablero.generarPortaavionRandom(cont, elTablero, numerosAleatorios);
         cont = elTablero.generarAcorazadoRandom(cont, elTablero, numerosAleatorios);
         cont = elTablero.generarSubmarinoRandom(cont, elTablero, numerosAleatorios);
         cont = elTablero.generarMinadorRandom(cont, elTablero, numerosAleatorios);
         if (cont == 10) {
            return (elTablero);
         } else {
            return (null);
         }

      } else {
         return (null);
      }
   }

   /**
    * firma para crear el barco Portaavion aleatoriamente
    * @param Entero (para controlar en numero de barcos que se van generando) y
    * objetos: clase Tablero y clase Random.
    * @return Entero, indicando el numero de barcos creados.
    */
   public int generarPortaavionRandom(int cont, Tablero elTablero, Random numerosAleatorios) {

      int b = 0;
      String tipoBarco = " portaavion ";
      do { // Para el barco portaavion: 4 casillas (1).
         int longitud = 4;
         int direccion = numerosAleatorios.nextInt(2);
         int posX = numerosAleatorios.nextInt(9); // Fila
         int posY = numerosAleatorios.nextInt(9); // Columna
         if (direccion == 0) {
            if (elTablero.verificarCasillaHorizontal(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoHorizontal(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posX, (posY + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         } else {
            if (elTablero.verificarCasillaVertical(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoVertical(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posY, (posX + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         }
      } while (b < 1);
      return cont;

   }

   /**
    * firma para crear el barco Acorazado aleatoriamente
    * @param Entero (para controlar en numero de barcos que se van generando) y
    * objetos: clase Tablero y clase Random.
    * @return Entero, indicando el numero de barcos creados.
    */
   public int generarAcorazadoRandom(int cont, Tablero elTablero, Random numerosAleatorios) {

      int b = 0;
      String tipoBarco = " acorazado ";
      do {  // Para el barco acorazado: 3 casillas (2).
         int longitud = 3;
         int direccion = numerosAleatorios.nextInt(2);
         int posX = numerosAleatorios.nextInt(9); // Fila
         int posY = numerosAleatorios.nextInt(9); // Columna
         if (direccion == 0) {
            if (elTablero.verificarCasillaHorizontal(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoHorizontal(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posX, (posY + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         } else {
            if (elTablero.verificarCasillaVertical(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoVertical(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posY, (posX + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         }
      } while (b < 2);
      return cont;

   }

   /**
    * firma para crear el barco Submarino aleatoriamente.
    * @param Entero (para controlar en numero de barcos que se van generando) y
    * objetos: clase Tablero y clase Random.
    * @return Entero, indicando el numero de barcos creados.
    */
   public int generarSubmarinoRandom(int cont, Tablero elTablero, Random numerosAleatorios) {
      int b = 0;
      String tipoBarco = " submarino ";
      do {  // Para el submarino: 2 casillas (3).
         int longitud = 2;
         int direccion = numerosAleatorios.nextInt(2);
         int posX = numerosAleatorios.nextInt(9); // Fila
         int posY = numerosAleatorios.nextInt(9); // Columna
         if (direccion == 0) {
            if (elTablero.verificarCasillaHorizontal(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoHorizontal(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posX, (posY + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         } else {
            if (elTablero.verificarCasillaVertical(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoVertical(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posY, (posX + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         }
      } while (b < 3);
      return cont;

   }

   /**
    * firma para crear el barco Minador aleatoriamente.
    * @param Entero (para controlar en numero de barcos que se van generando) y
    * objetos: clase Tablero y clase Random.
    * @return Entero, indicando el numero de barcos creados.
    */
   public int generarMinadorRandom(int cont, Tablero elTablero, Random numerosAleatorios) {

      int b = 0;
      String tipoBarco = " minador ";
      do {  // Para el minador: 1 casilla (4).
         int longitud = 1;
         int direccion = numerosAleatorios.nextInt(2);
         int posX = numerosAleatorios.nextInt(9); // Fila
         int posY = numerosAleatorios.nextInt(9); // Columna
         if (direccion == 0) {
            if (elTablero.verificarCasillaHorizontal(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoHorizontal(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posX, (posY + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         } else {
            if (elTablero.verificarCasillaVertical(posX, posY, elTablero, longitud)) {
               elTablero.crearBarcoVertical(posX, posY, elTablero, longitud);
               b++;
               misBarcosActivos.agregarBarco(new Barco(tipoBarco, longitud, (elTablero.ubicacion(posY, (posX + (longitud - 1)), longitud, direccion)), longitud));
               cont++;
            }
         }
      } while (b < 4);
      return cont;

   }

   /**
    * firma para verificar las casillas horizontalmente.
    * @param las posiciones x, y (origen), objeto de la clase Tablero y longitud del barco
    * @return Boolean indicando el si se puede o no ubicar el barco horizontalmente.
    */
   public boolean verificarCasillaHorizontal(int x, int y, Tablero elTablero, int longitud) {

      aux = elTablero.getMatriz();
      int d = x;
      int c = 0;
      boolean casilla = true;
      int a = (y + (longitud));
      if ((y + (longitud - 1)) <= ((aux.length) - 1)) {
         if (y > 0) {
            y = (y - 1);
         }
         if (a > 9) {
            a = 9;
         }
         if (x != 9) {
            d = d + 1;
         }
         if (x > 0) {
            x = x - 1;
         }
         for (int j = y; j <= a; j++) {
            if ((casilla) && (c < ((longitud + 2) * 3))) {
               for (int i = x; i <= d; i++) {
                  if (((aux[i][j]) != 0)) {
                     casilla = false;
                  } else {
                     c++;
                  }
               }
            }
         }
      } else {
         casilla = false;
      }
      return casilla;

   }

   /**
    * firma para verificar las casillas verticalmente.
    * @param las posiciones x, y (origen), objeto de la clase Tablero y longitud del barco
    * @return Boolean indicando el si se puede o no ubicar el barco verticalmente.
    */
   public boolean verificarCasillaVertical(int x, int y, Tablero elTablero, int longitud) {

      aux = elTablero.getMatriz();
      int b = y;
      int c = 0;
      boolean casilla = true;
      int a = (x + (longitud));
      if ((x + (longitud - 1)) <= ((aux.length) - 1)) {
         if (y != 9) {
            b = b + 1;
         }
         if (y > 0) {
            y = (y - 1);
         }
         if (a > 9) {
            a = 9;
         }
         if (x > 0) {
            x = x - 1;
         }
         for (int j = y; j <= b; j++) {
            if ((casilla) && (c < ((longitud + 2) * 3))) {
               for (int i = x; i <= a; i++) {
                  if (((aux[i][j]) != 0)) {
                     casilla = false;
                  } else {
                     c++;
                  }
               }
            }
         }
      } else {
         casilla = false;
      }
      return casilla;

   }

    /**
    * firma para verificar las casillas verticalmente (SobreCarga).
    * @param las posiciones x, y (origen) y x (destina), objeto de la clase Tablero y longitud del barco
    * @return Boolean indicando el si se puede o no ubicar el barco verticalmente.
    */
   public boolean verificarCasillaVertical(int Xo, int Xf, int y, Tablero elTablero, int longitud) {
      boolean casilla = true;
      aux = elTablero.getMatriz();
      if (Xf < Xo) {
         int x = Xf;
         Xf = Xo;
         Xo = x;
      }
      if ((Xo < 0) || (Xf > aux.length)) {
         casilla = false;
      }
      for (int i = Xo - 1; i <= Xf + 1; i++) {
         for (int j = y - 1; j <= y + 1; j++) {
            if ((i >= 0) && (i < aux.length) && (j >= 0) && (j < aux.length)) {
               if (aux[i][j] != 0) {
                  casilla = false;
               }
            }
         }
      }
      return casilla;
   }

    /**
    * firma para verificar las casillas Horizontalmente (SobreCarga).
    * @param las posiciones x, y (origen) y x (destina), objeto de la clase Tablero y longitud del barco
    * @return Boolean indicando el si se puede o no ubicar el barco verticalmente.
    */
   public boolean verificarCasillaHorizontal(int Yo, int Yf, int x, Tablero elTablero, int longitud) {
      boolean casilla = true;
      aux = elTablero.getMatriz();
      if (Yf < Yo) {
         int y = Yf;
         Yf = Yo;
         Yo = y;
      }
      if ((Yo < 0) || (Yf > aux.length)) {
         casilla = false;
      }
      for (int i = x - 1; i <= x + 1; i++) {
         for (int j = Yo - 1; j <= Yf + 1; j++) {
            if ((i >= 0) && (i < aux.length) && (j >= 0) && (j < aux.length)) {
               if (aux[i][j] != 0) {
                  casilla = false;
               }
            }
         }
      }
      return casilla;
   }

   /**
    * firma para crear un barco horizontalmente.
    * @param las posiciones x, y (origen), objeto de la clase Tablero y longitud del barco
    * @return
    */
   public void crearBarcoHorizontal(int x, int y, Tablero elTablero, int longitud) {

      aux = elTablero.getMatriz();
      int a = (y + (longitud - 1));
      for (int j = (y); j <= a; j++) {
         aux[x][j] = 1;
      }
      elTablero.setMatriz(aux);

   }

   /**
    * firma para crear un barco verticalmente.
    * @param las posiciones x, y (origen), objeto de la clase Tablero y longitud del barco
    * @return
    */
   public void crearBarcoVertical(int x, int y, Tablero elTablero, int longitud) {

      aux = elTablero.getMatriz();
      int a = (x + (longitud - 1));
      for (int j = (x); j <= a; j++) {
         aux[j][y] = 1;
      }
      elTablero.setMatriz(aux);

   }

   /**
    * firma para crear un vector, que guarda en cada casilla una posicion x ó y ocupada por un barco.
    * @param origen y fin, longitud del barco y direccion (horizontal o vertical).
    * @return vector que guarda las posiciones ocupadas por un barco determinado.
    * NOTA #1: Si la direccion es horizontal, origen y fin seran posicion X de origen
    * y posicion Y de destino respectivamente.
    * NOTA #2: Si la direccion es vertical, origen y fin seran posicion Y de origen
    * y posicion X de destino respectivamente.
    * NOTA #3: En la creacion del vector tenemos que la informacion de cada coordenada
    * o posicion (X, Y) que ocupa el barco en el tablero de juego se va guardando
    * primero la fila y despues la columna.
    */
   public int[] ubicacion(int origen, int fin, int longitud, int direccion) {

      int[] ubicacion = new int[(longitud * 2)];
      if (direccion == 0) { // Horizontal
         for (int i = 0; i < (longitud * 2); i++) {
            if (((i + 1) % 2) != 0) {
               ubicacion[i] = (origen);
            } else {
               ubicacion[i] = ((fin - longitud) + 1);
               fin++;
            }
         }
      } else { // vertical
         for (int i = 0; i < (longitud * 2); i++) {
            if (((i + 1) % 2) != 0) {
               ubicacion[i] = ((fin - longitud) + 1);
               fin++;
            } else {
               ubicacion[i] = (origen);
            }
         }
      }
      return ubicacion;

   }

   /**
    * firma para almacenar las longitudes de los tipos de barcos.
    * @param String indicando el tipo de barco.
    * @return Entero que indica la longitud del barco recibido.
    */
   public int longitudDelBarco(String tipoBarco) {
      int a = 0;
      int longitudPortaavion = 4;
      int longitudAcorazado = 3;
      int longitudSubmarino = 2;
      int longitudMinador = 1;
      if (tipoBarco.equals("portaavion")) {
         a = (longitudPortaavion);
      }
      if (tipoBarco.equals("acorazado")) {
         a = (longitudAcorazado);
      }
      if (tipoBarco.equals("submarino")) {
         a = (longitudSubmarino);
      }
      if (tipoBarco.equals("minador")) {
         a = (longitudMinador);
      }
      return a;

   }

   /**
    * firma para verificar si se puede ubicar un barco, tomando en cuenta las
    * longitudes del mismo y las dimenciones dadas por el usuario.
    * @param origen, fin y longitud del barco.
    * @return  Boolean indicando si se puede o no ubicar el barco.
    * NOTA #1: Si la direccion del barco es horizontal, origen y fin son posicion
    * "Y" de origen y de destino respectivamente.
    * NOTA #2: Si la direccion del barco es vertical, origen y fin son posicion
    * "X" de origen y de destino respectivamente.
    */
   public boolean sePuedeUbicarBarco(int origen, int fin, int longitud) {
      boolean puedo = true;
      if (Math.abs(fin - origen) != (longitud - 1)) {
         puedo = false;
      }
      return puedo;
   }

   /**
    * firma para verificar si las posiciones dadas por el usuario son validas y
    * se puede crear el barco, hace parte de la implementacon del metodo
    * colocarBarco (ImplementacionIMotor).
    * @param las posiciones X y Y de origen / destino, String tipo de barco,
    * objeto de la clase Tablero.
    * @return  Boolean indicando si se puede o no ubicar el barco en las posiciones dadas.
    */
   public boolean direccionBarco(int posXOrigen, int posYOrigen, int posXFin, int posYFin, String tipoBarco, Tablero elTablero) {
      boolean dir = false;
      int a = (elTablero.longitudDelBarco(tipoBarco));
      if (posXOrigen == posXFin) {  // -------------------------------- Barco en horizontal.
         if (elTablero.sePuedeUbicarBarco(posYOrigen, posYFin, a)) {
            if (elTablero.verificarCasillaHorizontal(posYOrigen, posYFin, posXOrigen, elTablero, a)) {
               dir = true;
            }
         }
      } else { // -------------------------------- Barco en vertical.
         if (elTablero.sePuedeUbicarBarco(posXOrigen, posXFin, a)) {
            if (elTablero.verificarCasillaVertical(posXOrigen, posXFin, posYOrigen, elTablero, a)) {
               dir = true;
            }
         }
      }
      return dir;

   }

   /**
    * firma para crear un tablero manual, se hace una parte de la implementacion del metodo
    * colocarBarco (ImplementacionIMotor) despues de llamar al metodo direccionBarco.
    * @param Enteros: las posiciones X y Y de origen / destino, String tipo de barco,
    * objeto de la clase Tablero.
    * @return  Objeto de la clase Tablero, que se va actualizando a medida que se crea un barco.
    */
   public Tablero crearTableroManual(int posXOrigen, int posYOrigen, int posXFin, int posYFin, String tipoBarco, Tablero elTablero) {

      int a = (elTablero.longitudDelBarco(tipoBarco));
      if (posXOrigen == posXFin) {  // -------------------------------- Barco en horizontal.
         if (posYOrigen > posYFin) {
            int y = posYOrigen;
            posYOrigen = posYFin;
            posYFin = y;
         }
         elTablero.crearBarcoHorizontal(posXOrigen, posYOrigen, elTablero, a);
         misBarcosActivos.agregarBarco(new Barco(tipoBarco, a, (elTablero.ubicacion(posXOrigen, posYFin, a, 0)), a));
      } else {
         if (posXOrigen > posXFin) {
            int y = posXOrigen;
            posXOrigen = posXFin;
            posXFin = y;
         }
         elTablero.crearBarcoVertical(posXOrigen, posYOrigen, elTablero, a);
         misBarcosActivos.agregarBarco(new Barco(tipoBarco, a, (elTablero.ubicacion(posYOrigen, posXFin, a, 1)), a));
      }
      elTablero.setMatriz(aux);
      return elTablero;
   }

   public boolean listaBarcoVacia() {
      //  misBarcosActivos.clear();
      if (misBarcosActivos.getLista().size() == 0) {
         return (true);
      }
      return (false);
   }

   public void imprimirBarcosActivos(ArrayList<Barco> misBarcosActivos) {
      int[] vector = new int[10];
      Barco barco = new Barco();
      Iterator iterador = misBarcosActivos.iterator();
      System.out.println("LISTA DE TODOS LOS BARCOS ORDENADOS POR NOMBRE REPETIDOS Activos! \n ");
      while (iterador.hasNext()) {
         barco = (Barco) iterador.next();
         vector = barco.getPosicion();
         System.out.println(barco.getNombre());
         System.out.println("LONGITUD " + barco.getLongitud());
         System.out.println("VECTOR EN LA PRIMERA CASILLA " + vector[0]);
         System.out.println("VIDA DELBARCO " + barco.getVida());
      }
   }

   public void imprimirBarcosHundidos(ArrayList<Barco> misBarcosHundidos) {
      int[] vector = new int[10];
      Barco barco = new Barco();
      Iterator iterador = misBarcosHundidos.iterator();
      System.out.println(" \n LISTA DE TODOS LOS BARCOS ORDENADOS POR NOMBRE REPETIDOS HUNDIDOS \n ");
      while (iterador.hasNext()) {
         barco = (Barco) iterador.next();
         vector = barco.getPosicion();
         System.out.println(barco.getNombre());
         System.out.println("LONGITUD " + barco.getLongitud());
         System.out.println("VECTOR EN LA PRIMERA CASILLA " + vector[0]);
         System.out.println("VIDA DELBARCO " + barco.getVida());
      }
   }
} 





