/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TableroPlayer1.java
 *
 * Created on 23/01/2010, 01:14:35 PM
 */
package jugador.InterfazGrafica;

import Interfaz.RegistroPartida;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jugador.Comunicacion;

/**
 *
 * @author Me, me, me...
 */
public class TableroPlayer1 extends javax.swing.JFrame {

   /** Creates new form TableroPlayer1 */
   int Xo, Yo, Xf, Yf, contadorBarcos = 0;
   int totalBarcos = 10;
   boolean primero = true,
           bColocado = false;
   String player = "player1";
   String tipoBarco = " ";
   int tamano = 0;

   public TableroPlayer1() {
      initComponents();
      inicializarRecord();
      inicializar();
      arregloBotones[0][0] = jB00;
      arregloBotones[0][1] = jB01;
      arregloBotones[0][2] = jB02;
      arregloBotones[0][3] = jB03;
      arregloBotones[0][4] = jB04;
      arregloBotones[0][5] = jB05;
      arregloBotones[0][6] = jB06;
      arregloBotones[0][7] = jB07;
      arregloBotones[0][8] = jB08;
      arregloBotones[0][9] = jB09;
      arregloBotones[1][0] = jB10;
      arregloBotones[1][1] = jB11;
      arregloBotones[1][2] = jB12;
      arregloBotones[1][3] = jB13;
      arregloBotones[1][4] = jB14;
      arregloBotones[1][5] = jB15;
      arregloBotones[1][6] = jB16;
      arregloBotones[1][7] = jB17;
      arregloBotones[1][8] = jB18;
      arregloBotones[1][9] = jB19;
      arregloBotones[2][0] = jB20;
      arregloBotones[2][1] = jB21;
      arregloBotones[2][2] = jB22;
      arregloBotones[2][3] = jB23;
      arregloBotones[2][4] = jB24;
      arregloBotones[2][5] = jB25;
      arregloBotones[2][6] = jB26;
      arregloBotones[2][7] = jB27;
      arregloBotones[2][8] = jB28;
      arregloBotones[2][9] = jB29;
      arregloBotones[3][0] = jB30;
      arregloBotones[3][1] = jB31;
      arregloBotones[3][2] = jB32;
      arregloBotones[3][3] = jB33;
      arregloBotones[3][4] = jB34;
      arregloBotones[3][5] = jB35;
      arregloBotones[3][6] = jB36;
      arregloBotones[3][7] = jB37;
      arregloBotones[3][8] = jB38;
      arregloBotones[3][9] = jB39;
      arregloBotones[4][0] = jB40;
      arregloBotones[4][1] = jB41;
      arregloBotones[4][2] = jB42;
      arregloBotones[4][3] = jB43;
      arregloBotones[4][4] = jB44;
      arregloBotones[4][5] = jB45;
      arregloBotones[4][6] = jB46;
      arregloBotones[4][7] = jB47;
      arregloBotones[4][8] = jB48;
      arregloBotones[4][9] = jB49;
      arregloBotones[5][0] = jB50;
      arregloBotones[5][1] = jB51;
      arregloBotones[5][2] = jB52;
      arregloBotones[5][3] = jB53;
      arregloBotones[5][4] = jB54;
      arregloBotones[5][5] = jB55;
      arregloBotones[5][6] = jB56;
      arregloBotones[5][7] = jB57;
      arregloBotones[5][8] = jB58;
      arregloBotones[5][9] = jB59;
      arregloBotones[6][0] = jB60;
      arregloBotones[6][1] = jB61;
      arregloBotones[6][2] = jB62;
      arregloBotones[6][3] = jB63;
      arregloBotones[6][4] = jB64;
      arregloBotones[6][5] = jB65;
      arregloBotones[6][6] = jB66;
      arregloBotones[6][7] = jB67;
      arregloBotones[6][8] = jB68;
      arregloBotones[6][9] = jB69;
      arregloBotones[7][0] = jB70;
      arregloBotones[7][1] = jB71;
      arregloBotones[7][2] = jB72;
      arregloBotones[7][3] = jB73;
      arregloBotones[7][4] = jB74;
      arregloBotones[7][5] = jB75;
      arregloBotones[7][6] = jB76;
      arregloBotones[7][7] = jB77;
      arregloBotones[7][8] = jB78;
      arregloBotones[7][9] = jB79;
      arregloBotones[8][0] = jB80;
      arregloBotones[8][1] = jB81;
      arregloBotones[8][2] = jB82;
      arregloBotones[8][3] = jB83;
      arregloBotones[8][4] = jB84;
      arregloBotones[8][5] = jB85;
      arregloBotones[8][6] = jB86;
      arregloBotones[8][7] = jB87;
      arregloBotones[8][8] = jB88;
      arregloBotones[8][9] = jB89;
      arregloBotones[9][0] = jB90;
      arregloBotones[9][1] = jB91;
      arregloBotones[9][2] = jB92;
      arregloBotones[9][3] = jB93;
      arregloBotones[9][4] = jB94;
      arregloBotones[9][5] = jB95;
      arregloBotones[9][6] = jB96;
      arregloBotones[9][7] = jB97;
      arregloBotones[9][8] = jB98;
      arregloBotones[9][9] = jB99;
      deshabilitarBotones();
   }

private void inicializar()
{
    jBAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Comunicacion.obtenerPathAvatar("player1"))));
    jTFNick.setText(Comunicacion.obtenerNickJugador("player1"));
}

   private void inicializarRecord()
   {

        String recordJugador ="";
        ArrayList <RegistroPartida> listaNickObtenida = new ArrayList <RegistroPartida>();
        listaNickObtenida =(ArrayList) Comunicacion.obtenerListaRecord(Comunicacion.obtenerNickJugador("player1"), true);
        for(RegistroPartida record: listaNickObtenida)
        {
           recordJugador ="Fecha: " + String.valueOf(record.getFecha().getDate()) + "/" +
                            String.valueOf(record.getFecha().getMonth()) + "/" +
                            String.valueOf(record.getFecha().getYear());
            jCBListaRecord.addItem(recordJugador);
            String numero = "Numero de Partidas "+String.valueOf(record.getTotalPartida());
             jCBListaRecord.addItem(numero);
        }


          recordJugador ="";
        listaNickObtenida = new ArrayList <RegistroPartida>();
        listaNickObtenida =(ArrayList) Comunicacion.obtenerListaRecord(Comunicacion.obtenerNickJugador("player1"), false);
        for(RegistroPartida record: listaNickObtenida)
        {
           recordJugador ="Fecha: " + String.valueOf(record.getFecha().getDate()) + "/" +
                            String.valueOf(record.getFecha().getMonth()) + "/" +
                            String.valueOf(record.getFecha().getYear());
            jCBListaPerdidas.addItem(recordJugador);
            String numero = "Numero de Partidas "+String.valueOf(record.getTotalPartida());
             jCBListaPerdidas.addItem(numero);
        }
   }

   public void deshabilitarBotones(){
      for (int i = 0; i < arregloBotones.length; i++) {
         for (int j = 0; j < arregloBotones.length; j++) {
            arregloBotones[i][j].setEnabled(false);
         }
      }
   }

   public void inicializarTablero() {
      for (int i = 0; i < arregloBotones.length; i++) {
         for (int j = 0; j < arregloBotones.length; j++) {
            arregloBotones[i][j].setIcon(new ImageIcon(getClass().getResource("/jugador/InterfazGrafica/img/cuadroBlanco.png")));
            arregloBotones[i][j].setEnabled(true);
         }
      }
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jB00 = new javax.swing.JButton();
        jB01 = new javax.swing.JButton();
        jB02 = new javax.swing.JButton();
        jB03 = new javax.swing.JButton();
        jB04 = new javax.swing.JButton();
        jB05 = new javax.swing.JButton();
        jB06 = new javax.swing.JButton();
        jB07 = new javax.swing.JButton();
        jB08 = new javax.swing.JButton();
        jB09 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB11 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB13 = new javax.swing.JButton();
        jB14 = new javax.swing.JButton();
        jB15 = new javax.swing.JButton();
        jB16 = new javax.swing.JButton();
        jB17 = new javax.swing.JButton();
        jB18 = new javax.swing.JButton();
        jB19 = new javax.swing.JButton();
        jB20 = new javax.swing.JButton();
        jB21 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jB23 = new javax.swing.JButton();
        jB24 = new javax.swing.JButton();
        jB25 = new javax.swing.JButton();
        jB26 = new javax.swing.JButton();
        jB27 = new javax.swing.JButton();
        jB28 = new javax.swing.JButton();
        jB29 = new javax.swing.JButton();
        jB30 = new javax.swing.JButton();
        jB31 = new javax.swing.JButton();
        jB32 = new javax.swing.JButton();
        jB33 = new javax.swing.JButton();
        jB34 = new javax.swing.JButton();
        jB35 = new javax.swing.JButton();
        jB36 = new javax.swing.JButton();
        jB37 = new javax.swing.JButton();
        jB38 = new javax.swing.JButton();
        jB39 = new javax.swing.JButton();
        jB40 = new javax.swing.JButton();
        jB41 = new javax.swing.JButton();
        jB42 = new javax.swing.JButton();
        jB43 = new javax.swing.JButton();
        jB44 = new javax.swing.JButton();
        jB45 = new javax.swing.JButton();
        jB46 = new javax.swing.JButton();
        jB47 = new javax.swing.JButton();
        jB48 = new javax.swing.JButton();
        jB49 = new javax.swing.JButton();
        jB50 = new javax.swing.JButton();
        jB51 = new javax.swing.JButton();
        jB52 = new javax.swing.JButton();
        jB53 = new javax.swing.JButton();
        jB54 = new javax.swing.JButton();
        jB55 = new javax.swing.JButton();
        jB56 = new javax.swing.JButton();
        jB57 = new javax.swing.JButton();
        jB58 = new javax.swing.JButton();
        jB59 = new javax.swing.JButton();
        jB60 = new javax.swing.JButton();
        jB61 = new javax.swing.JButton();
        jB62 = new javax.swing.JButton();
        jB63 = new javax.swing.JButton();
        jB64 = new javax.swing.JButton();
        jB65 = new javax.swing.JButton();
        jB66 = new javax.swing.JButton();
        jB67 = new javax.swing.JButton();
        jB68 = new javax.swing.JButton();
        jB69 = new javax.swing.JButton();
        jB70 = new javax.swing.JButton();
        jB71 = new javax.swing.JButton();
        jB72 = new javax.swing.JButton();
        jB73 = new javax.swing.JButton();
        jB74 = new javax.swing.JButton();
        jB75 = new javax.swing.JButton();
        jB76 = new javax.swing.JButton();
        jB77 = new javax.swing.JButton();
        jB78 = new javax.swing.JButton();
        jB79 = new javax.swing.JButton();
        jB80 = new javax.swing.JButton();
        jB81 = new javax.swing.JButton();
        jB82 = new javax.swing.JButton();
        jB83 = new javax.swing.JButton();
        jB84 = new javax.swing.JButton();
        jB85 = new javax.swing.JButton();
        jB86 = new javax.swing.JButton();
        jB87 = new javax.swing.JButton();
        jB88 = new javax.swing.JButton();
        jB89 = new javax.swing.JButton();
        jB90 = new javax.swing.JButton();
        jB91 = new javax.swing.JButton();
        jB92 = new javax.swing.JButton();
        jB93 = new javax.swing.JButton();
        jB94 = new javax.swing.JButton();
        jB95 = new javax.swing.JButton();
        jB96 = new javax.swing.JButton();
        jB97 = new javax.swing.JButton();
        jB98 = new javax.swing.JButton();
        jB99 = new javax.swing.JButton();
        jBTableroRandom = new javax.swing.JButton();
        jBTableroManual = new javax.swing.JButton();
        jBContinuar = new javax.swing.JButton();
        jLNick = new javax.swing.JLabel();
        jTFNick = new javax.swing.JTextField();
        jBAvatar = new javax.swing.JButton();
        jLAvatar = new javax.swing.JLabel();
        jCBListaRecord = new javax.swing.JComboBox();
        jCBListaPerdidas = new javax.swing.JComboBox();
        jLRecordGanadas = new javax.swing.JLabel();
        jLRecordPerdidas = new javax.swing.JLabel();
        jTFSubmarino1 = new javax.swing.JTextField();
        jTFAcorazado1 = new javax.swing.JTextField();
        jBMinador = new javax.swing.JButton();
        jBPortaavion = new javax.swing.JButton();
        jTFSubmarino = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTFPortaavion = new javax.swing.JTextField();
        jTFPortaavion1 = new javax.swing.JTextField();
        jTFMinador11 = new javax.swing.JTextField();
        jTFMinador1 = new javax.swing.JTextField();
        jBAcorazado = new javax.swing.JButton();
        jBSubmarino = new javax.swing.JButton();
        jTFAcorazado11 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLJugador1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(923, 669));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(923, 669));
        jLayeredPane1.setName("jLayeredPane1"); // NOI18N

        jB00.setMaximumSize(new java.awt.Dimension(30, 30));
        jB00.setMinimumSize(new java.awt.Dimension(30, 30));
        jB00.setName("jB00"); // NOI18N
        jB00.setPreferredSize(new java.awt.Dimension(30, 30));
        jB00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB00ActionPerformed(evt);
            }
        });
        jB00.setBounds(50, 90, 30, 30);
        jLayeredPane1.add(jB00, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB01.setMaximumSize(new java.awt.Dimension(30, 30));
        jB01.setMinimumSize(new java.awt.Dimension(30, 30));
        jB01.setName("jB01"); // NOI18N
        jB01.setPreferredSize(new java.awt.Dimension(30, 30));
        jB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB01ActionPerformed(evt);
            }
        });
        jB01.setBounds(80, 90, 30, 30);
        jLayeredPane1.add(jB01, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB02.setMaximumSize(new java.awt.Dimension(30, 30));
        jB02.setMinimumSize(new java.awt.Dimension(30, 30));
        jB02.setName("jB02"); // NOI18N
        jB02.setPreferredSize(new java.awt.Dimension(30, 30));
        jB02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB02ActionPerformed(evt);
            }
        });
        jB02.setBounds(110, 90, 30, 30);
        jLayeredPane1.add(jB02, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB03.setMaximumSize(new java.awt.Dimension(30, 30));
        jB03.setMinimumSize(new java.awt.Dimension(30, 30));
        jB03.setName("jB03"); // NOI18N
        jB03.setPreferredSize(new java.awt.Dimension(30, 30));
        jB03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB03ActionPerformed(evt);
            }
        });
        jB03.setBounds(140, 90, 30, 30);
        jLayeredPane1.add(jB03, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB04.setMaximumSize(new java.awt.Dimension(30, 30));
        jB04.setMinimumSize(new java.awt.Dimension(30, 30));
        jB04.setName("jB04"); // NOI18N
        jB04.setPreferredSize(new java.awt.Dimension(30, 30));
        jB04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB04ActionPerformed(evt);
            }
        });
        jB04.setBounds(170, 90, 30, 30);
        jLayeredPane1.add(jB04, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB05.setMaximumSize(new java.awt.Dimension(30, 30));
        jB05.setMinimumSize(new java.awt.Dimension(30, 30));
        jB05.setName("jB05"); // NOI18N
        jB05.setPreferredSize(new java.awt.Dimension(30, 30));
        jB05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB05ActionPerformed(evt);
            }
        });
        jB05.setBounds(200, 90, 30, 30);
        jLayeredPane1.add(jB05, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB06.setMaximumSize(new java.awt.Dimension(30, 30));
        jB06.setMinimumSize(new java.awt.Dimension(30, 30));
        jB06.setName("jB06"); // NOI18N
        jB06.setPreferredSize(new java.awt.Dimension(30, 30));
        jB06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB06ActionPerformed(evt);
            }
        });
        jB06.setBounds(230, 90, 30, 30);
        jLayeredPane1.add(jB06, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB07.setMaximumSize(new java.awt.Dimension(30, 30));
        jB07.setMinimumSize(new java.awt.Dimension(30, 30));
        jB07.setName("jB07"); // NOI18N
        jB07.setPreferredSize(new java.awt.Dimension(30, 30));
        jB07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB07ActionPerformed(evt);
            }
        });
        jB07.setBounds(260, 90, 30, 30);
        jLayeredPane1.add(jB07, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB08.setMaximumSize(new java.awt.Dimension(30, 30));
        jB08.setMinimumSize(new java.awt.Dimension(30, 30));
        jB08.setName("jB08"); // NOI18N
        jB08.setPreferredSize(new java.awt.Dimension(30, 30));
        jB08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB08ActionPerformed(evt);
            }
        });
        jB08.setBounds(290, 90, 30, 30);
        jLayeredPane1.add(jB08, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB09.setMaximumSize(new java.awt.Dimension(30, 30));
        jB09.setMinimumSize(new java.awt.Dimension(30, 30));
        jB09.setName("jB09"); // NOI18N
        jB09.setPreferredSize(new java.awt.Dimension(30, 30));
        jB09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB09ActionPerformed(evt);
            }
        });
        jB09.setBounds(320, 90, 30, 30);
        jLayeredPane1.add(jB09, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB10.setMaximumSize(new java.awt.Dimension(30, 30));
        jB10.setMinimumSize(new java.awt.Dimension(30, 30));
        jB10.setName("jB10"); // NOI18N
        jB10.setPreferredSize(new java.awt.Dimension(30, 30));
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });
        jB10.setBounds(50, 120, 30, 30);
        jLayeredPane1.add(jB10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB11.setMaximumSize(new java.awt.Dimension(30, 30));
        jB11.setMinimumSize(new java.awt.Dimension(30, 30));
        jB11.setName("jB11"); // NOI18N
        jB11.setPreferredSize(new java.awt.Dimension(30, 30));
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });
        jB11.setBounds(80, 120, 30, 30);
        jLayeredPane1.add(jB11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB12.setMaximumSize(new java.awt.Dimension(30, 30));
        jB12.setMinimumSize(new java.awt.Dimension(30, 30));
        jB12.setName("jB12"); // NOI18N
        jB12.setPreferredSize(new java.awt.Dimension(30, 30));
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });
        jB12.setBounds(110, 120, 30, 30);
        jLayeredPane1.add(jB12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB13.setMaximumSize(new java.awt.Dimension(30, 30));
        jB13.setMinimumSize(new java.awt.Dimension(30, 30));
        jB13.setName("jB13"); // NOI18N
        jB13.setPreferredSize(new java.awt.Dimension(30, 30));
        jB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB13ActionPerformed(evt);
            }
        });
        jB13.setBounds(140, 120, 30, 30);
        jLayeredPane1.add(jB13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB14.setMaximumSize(new java.awt.Dimension(30, 30));
        jB14.setMinimumSize(new java.awt.Dimension(30, 30));
        jB14.setName("jB14"); // NOI18N
        jB14.setPreferredSize(new java.awt.Dimension(30, 30));
        jB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB14ActionPerformed(evt);
            }
        });
        jB14.setBounds(170, 120, 30, 30);
        jLayeredPane1.add(jB14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB15.setMaximumSize(new java.awt.Dimension(30, 30));
        jB15.setMinimumSize(new java.awt.Dimension(30, 30));
        jB15.setName("jB15"); // NOI18N
        jB15.setPreferredSize(new java.awt.Dimension(30, 30));
        jB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB15ActionPerformed(evt);
            }
        });
        jB15.setBounds(200, 120, 30, 30);
        jLayeredPane1.add(jB15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB16.setMaximumSize(new java.awt.Dimension(30, 30));
        jB16.setMinimumSize(new java.awt.Dimension(30, 30));
        jB16.setName("jB16"); // NOI18N
        jB16.setPreferredSize(new java.awt.Dimension(30, 30));
        jB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB16ActionPerformed(evt);
            }
        });
        jB16.setBounds(230, 120, 30, 30);
        jLayeredPane1.add(jB16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB17.setMaximumSize(new java.awt.Dimension(30, 30));
        jB17.setMinimumSize(new java.awt.Dimension(30, 30));
        jB17.setName("jB17"); // NOI18N
        jB17.setPreferredSize(new java.awt.Dimension(30, 30));
        jB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB17ActionPerformed(evt);
            }
        });
        jB17.setBounds(260, 120, 30, 30);
        jLayeredPane1.add(jB17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB18.setMaximumSize(new java.awt.Dimension(30, 30));
        jB18.setMinimumSize(new java.awt.Dimension(30, 30));
        jB18.setName("jB18"); // NOI18N
        jB18.setPreferredSize(new java.awt.Dimension(30, 30));
        jB18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB18ActionPerformed(evt);
            }
        });
        jB18.setBounds(290, 120, 30, 30);
        jLayeredPane1.add(jB18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB19.setMaximumSize(new java.awt.Dimension(30, 30));
        jB19.setMinimumSize(new java.awt.Dimension(30, 30));
        jB19.setName("jB19"); // NOI18N
        jB19.setPreferredSize(new java.awt.Dimension(30, 30));
        jB19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB19ActionPerformed(evt);
            }
        });
        jB19.setBounds(320, 120, 30, 30);
        jLayeredPane1.add(jB19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB20.setMaximumSize(new java.awt.Dimension(30, 30));
        jB20.setMinimumSize(new java.awt.Dimension(30, 30));
        jB20.setName("jB20"); // NOI18N
        jB20.setPreferredSize(new java.awt.Dimension(30, 30));
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });
        jB20.setBounds(50, 150, 30, 30);
        jLayeredPane1.add(jB20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB21.setMaximumSize(new java.awt.Dimension(30, 30));
        jB21.setMinimumSize(new java.awt.Dimension(30, 30));
        jB21.setName("jB21"); // NOI18N
        jB21.setPreferredSize(new java.awt.Dimension(30, 30));
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });
        jB21.setBounds(80, 150, 30, 30);
        jLayeredPane1.add(jB21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB22.setMaximumSize(new java.awt.Dimension(30, 30));
        jB22.setMinimumSize(new java.awt.Dimension(30, 30));
        jB22.setName("jB22"); // NOI18N
        jB22.setPreferredSize(new java.awt.Dimension(30, 30));
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });
        jB22.setBounds(110, 150, 30, 30);
        jLayeredPane1.add(jB22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB23.setMaximumSize(new java.awt.Dimension(30, 30));
        jB23.setMinimumSize(new java.awt.Dimension(30, 30));
        jB23.setName("jB23"); // NOI18N
        jB23.setPreferredSize(new java.awt.Dimension(30, 30));
        jB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB23ActionPerformed(evt);
            }
        });
        jB23.setBounds(140, 150, 30, 30);
        jLayeredPane1.add(jB23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB24.setMaximumSize(new java.awt.Dimension(30, 30));
        jB24.setMinimumSize(new java.awt.Dimension(30, 30));
        jB24.setName("jB24"); // NOI18N
        jB24.setPreferredSize(new java.awt.Dimension(30, 30));
        jB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB24ActionPerformed(evt);
            }
        });
        jB24.setBounds(170, 150, 30, 30);
        jLayeredPane1.add(jB24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB25.setMaximumSize(new java.awt.Dimension(30, 30));
        jB25.setMinimumSize(new java.awt.Dimension(30, 30));
        jB25.setName("jB25"); // NOI18N
        jB25.setPreferredSize(new java.awt.Dimension(30, 30));
        jB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB25ActionPerformed(evt);
            }
        });
        jB25.setBounds(200, 150, 30, 30);
        jLayeredPane1.add(jB25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB26.setMaximumSize(new java.awt.Dimension(30, 30));
        jB26.setMinimumSize(new java.awt.Dimension(30, 30));
        jB26.setName("jB26"); // NOI18N
        jB26.setPreferredSize(new java.awt.Dimension(30, 30));
        jB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB26ActionPerformed(evt);
            }
        });
        jB26.setBounds(230, 150, 30, 30);
        jLayeredPane1.add(jB26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB27.setMaximumSize(new java.awt.Dimension(30, 30));
        jB27.setMinimumSize(new java.awt.Dimension(30, 30));
        jB27.setName("jB27"); // NOI18N
        jB27.setPreferredSize(new java.awt.Dimension(30, 30));
        jB27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB27ActionPerformed(evt);
            }
        });
        jB27.setBounds(260, 150, 30, 30);
        jLayeredPane1.add(jB27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB28.setMaximumSize(new java.awt.Dimension(30, 30));
        jB28.setMinimumSize(new java.awt.Dimension(30, 30));
        jB28.setName("jB28"); // NOI18N
        jB28.setPreferredSize(new java.awt.Dimension(30, 30));
        jB28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB28ActionPerformed(evt);
            }
        });
        jB28.setBounds(290, 150, 30, 30);
        jLayeredPane1.add(jB28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB29.setMaximumSize(new java.awt.Dimension(30, 30));
        jB29.setMinimumSize(new java.awt.Dimension(30, 30));
        jB29.setName("jB29"); // NOI18N
        jB29.setPreferredSize(new java.awt.Dimension(30, 30));
        jB29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB29ActionPerformed(evt);
            }
        });
        jB29.setBounds(320, 150, 30, 30);
        jLayeredPane1.add(jB29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB30.setMaximumSize(new java.awt.Dimension(30, 30));
        jB30.setMinimumSize(new java.awt.Dimension(30, 30));
        jB30.setName("jB30"); // NOI18N
        jB30.setPreferredSize(new java.awt.Dimension(30, 30));
        jB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB30ActionPerformed(evt);
            }
        });
        jB30.setBounds(50, 180, 30, 30);
        jLayeredPane1.add(jB30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB31.setMaximumSize(new java.awt.Dimension(30, 30));
        jB31.setMinimumSize(new java.awt.Dimension(30, 30));
        jB31.setName("jB31"); // NOI18N
        jB31.setPreferredSize(new java.awt.Dimension(30, 30));
        jB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB31ActionPerformed(evt);
            }
        });
        jB31.setBounds(80, 180, 30, 30);
        jLayeredPane1.add(jB31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB32.setMaximumSize(new java.awt.Dimension(30, 30));
        jB32.setMinimumSize(new java.awt.Dimension(30, 30));
        jB32.setName("jB32"); // NOI18N
        jB32.setPreferredSize(new java.awt.Dimension(30, 30));
        jB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB32ActionPerformed(evt);
            }
        });
        jB32.setBounds(110, 180, 30, 30);
        jLayeredPane1.add(jB32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB33.setMaximumSize(new java.awt.Dimension(30, 30));
        jB33.setMinimumSize(new java.awt.Dimension(30, 30));
        jB33.setName("jB33"); // NOI18N
        jB33.setPreferredSize(new java.awt.Dimension(30, 30));
        jB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB33ActionPerformed(evt);
            }
        });
        jB33.setBounds(140, 180, 30, 30);
        jLayeredPane1.add(jB33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB34.setMaximumSize(new java.awt.Dimension(30, 30));
        jB34.setMinimumSize(new java.awt.Dimension(30, 30));
        jB34.setName("jB34"); // NOI18N
        jB34.setPreferredSize(new java.awt.Dimension(30, 30));
        jB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB34ActionPerformed(evt);
            }
        });
        jB34.setBounds(170, 180, 30, 30);
        jLayeredPane1.add(jB34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB35.setMaximumSize(new java.awt.Dimension(30, 30));
        jB35.setMinimumSize(new java.awt.Dimension(30, 30));
        jB35.setName("jB35"); // NOI18N
        jB35.setPreferredSize(new java.awt.Dimension(30, 30));
        jB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB35ActionPerformed(evt);
            }
        });
        jB35.setBounds(200, 180, 30, 30);
        jLayeredPane1.add(jB35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB36.setMaximumSize(new java.awt.Dimension(30, 30));
        jB36.setMinimumSize(new java.awt.Dimension(30, 30));
        jB36.setName("jB36"); // NOI18N
        jB36.setPreferredSize(new java.awt.Dimension(30, 30));
        jB36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB36ActionPerformed(evt);
            }
        });
        jB36.setBounds(230, 180, 30, 30);
        jLayeredPane1.add(jB36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB37.setMaximumSize(new java.awt.Dimension(30, 30));
        jB37.setMinimumSize(new java.awt.Dimension(30, 30));
        jB37.setName("jB37"); // NOI18N
        jB37.setPreferredSize(new java.awt.Dimension(30, 30));
        jB37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB37ActionPerformed(evt);
            }
        });
        jB37.setBounds(260, 180, 30, 30);
        jLayeredPane1.add(jB37, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB38.setMaximumSize(new java.awt.Dimension(30, 30));
        jB38.setMinimumSize(new java.awt.Dimension(30, 30));
        jB38.setName("jB38"); // NOI18N
        jB38.setPreferredSize(new java.awt.Dimension(30, 30));
        jB38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB38ActionPerformed(evt);
            }
        });
        jB38.setBounds(290, 180, 30, 30);
        jLayeredPane1.add(jB38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB39.setMaximumSize(new java.awt.Dimension(30, 30));
        jB39.setMinimumSize(new java.awt.Dimension(30, 30));
        jB39.setName("jB39"); // NOI18N
        jB39.setPreferredSize(new java.awt.Dimension(30, 30));
        jB39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB39ActionPerformed(evt);
            }
        });
        jB39.setBounds(320, 180, 30, 30);
        jLayeredPane1.add(jB39, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB40.setMaximumSize(new java.awt.Dimension(30, 30));
        jB40.setMinimumSize(new java.awt.Dimension(30, 30));
        jB40.setName("jB40"); // NOI18N
        jB40.setPreferredSize(new java.awt.Dimension(30, 30));
        jB40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB40ActionPerformed(evt);
            }
        });
        jB40.setBounds(50, 210, 30, 30);
        jLayeredPane1.add(jB40, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB41.setMaximumSize(new java.awt.Dimension(30, 30));
        jB41.setMinimumSize(new java.awt.Dimension(30, 30));
        jB41.setName("jB41"); // NOI18N
        jB41.setPreferredSize(new java.awt.Dimension(30, 30));
        jB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB41ActionPerformed(evt);
            }
        });
        jB41.setBounds(80, 210, 30, 30);
        jLayeredPane1.add(jB41, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB42.setMaximumSize(new java.awt.Dimension(30, 30));
        jB42.setMinimumSize(new java.awt.Dimension(30, 30));
        jB42.setName("jB42"); // NOI18N
        jB42.setPreferredSize(new java.awt.Dimension(30, 30));
        jB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB42ActionPerformed(evt);
            }
        });
        jB42.setBounds(110, 210, 30, 30);
        jLayeredPane1.add(jB42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB43.setMaximumSize(new java.awt.Dimension(30, 30));
        jB43.setMinimumSize(new java.awt.Dimension(30, 30));
        jB43.setName("jB43"); // NOI18N
        jB43.setPreferredSize(new java.awt.Dimension(30, 30));
        jB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB43ActionPerformed(evt);
            }
        });
        jB43.setBounds(140, 210, 30, 30);
        jLayeredPane1.add(jB43, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB44.setMaximumSize(new java.awt.Dimension(30, 30));
        jB44.setMinimumSize(new java.awt.Dimension(30, 30));
        jB44.setName("jB44"); // NOI18N
        jB44.setPreferredSize(new java.awt.Dimension(30, 30));
        jB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB44ActionPerformed(evt);
            }
        });
        jB44.setBounds(170, 210, 30, 30);
        jLayeredPane1.add(jB44, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB45.setMaximumSize(new java.awt.Dimension(30, 30));
        jB45.setMinimumSize(new java.awt.Dimension(30, 30));
        jB45.setName("jB45"); // NOI18N
        jB45.setPreferredSize(new java.awt.Dimension(30, 30));
        jB45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB45ActionPerformed(evt);
            }
        });
        jB45.setBounds(200, 210, 30, 30);
        jLayeredPane1.add(jB45, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB46.setMaximumSize(new java.awt.Dimension(30, 30));
        jB46.setMinimumSize(new java.awt.Dimension(30, 30));
        jB46.setName("jB46"); // NOI18N
        jB46.setPreferredSize(new java.awt.Dimension(30, 30));
        jB46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB46ActionPerformed(evt);
            }
        });
        jB46.setBounds(230, 210, 30, 30);
        jLayeredPane1.add(jB46, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB47.setMaximumSize(new java.awt.Dimension(30, 30));
        jB47.setMinimumSize(new java.awt.Dimension(30, 30));
        jB47.setName("jB47"); // NOI18N
        jB47.setPreferredSize(new java.awt.Dimension(30, 30));
        jB47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB47ActionPerformed(evt);
            }
        });
        jB47.setBounds(260, 210, 30, 30);
        jLayeredPane1.add(jB47, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB48.setMaximumSize(new java.awt.Dimension(30, 30));
        jB48.setMinimumSize(new java.awt.Dimension(30, 30));
        jB48.setName("jB48"); // NOI18N
        jB48.setPreferredSize(new java.awt.Dimension(30, 30));
        jB48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB48ActionPerformed(evt);
            }
        });
        jB48.setBounds(290, 210, 30, 30);
        jLayeredPane1.add(jB48, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB49.setMaximumSize(new java.awt.Dimension(30, 30));
        jB49.setMinimumSize(new java.awt.Dimension(30, 30));
        jB49.setName("jB49"); // NOI18N
        jB49.setPreferredSize(new java.awt.Dimension(30, 30));
        jB49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB49ActionPerformed(evt);
            }
        });
        jB49.setBounds(320, 210, 30, 30);
        jLayeredPane1.add(jB49, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB50.setMaximumSize(new java.awt.Dimension(30, 30));
        jB50.setMinimumSize(new java.awt.Dimension(30, 30));
        jB50.setName("jB50"); // NOI18N
        jB50.setPreferredSize(new java.awt.Dimension(30, 30));
        jB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50ActionPerformed(evt);
            }
        });
        jB50.setBounds(50, 240, 30, 30);
        jLayeredPane1.add(jB50, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB51.setMaximumSize(new java.awt.Dimension(30, 30));
        jB51.setMinimumSize(new java.awt.Dimension(30, 30));
        jB51.setName("jB51"); // NOI18N
        jB51.setPreferredSize(new java.awt.Dimension(30, 30));
        jB51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB51ActionPerformed(evt);
            }
        });
        jB51.setBounds(80, 240, 30, 30);
        jLayeredPane1.add(jB51, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB52.setMaximumSize(new java.awt.Dimension(30, 30));
        jB52.setMinimumSize(new java.awt.Dimension(30, 30));
        jB52.setName("jB52"); // NOI18N
        jB52.setPreferredSize(new java.awt.Dimension(30, 30));
        jB52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB52ActionPerformed(evt);
            }
        });
        jB52.setBounds(110, 240, 30, 30);
        jLayeredPane1.add(jB52, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB53.setMaximumSize(new java.awt.Dimension(30, 30));
        jB53.setMinimumSize(new java.awt.Dimension(30, 30));
        jB53.setName("jB53"); // NOI18N
        jB53.setPreferredSize(new java.awt.Dimension(30, 30));
        jB53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB53ActionPerformed(evt);
            }
        });
        jB53.setBounds(140, 240, 30, 30);
        jLayeredPane1.add(jB53, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB54.setMaximumSize(new java.awt.Dimension(30, 30));
        jB54.setMinimumSize(new java.awt.Dimension(30, 30));
        jB54.setName("jB54"); // NOI18N
        jB54.setPreferredSize(new java.awt.Dimension(30, 30));
        jB54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB54ActionPerformed(evt);
            }
        });
        jB54.setBounds(170, 240, 30, 30);
        jLayeredPane1.add(jB54, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB55.setMaximumSize(new java.awt.Dimension(30, 30));
        jB55.setMinimumSize(new java.awt.Dimension(30, 30));
        jB55.setName("jB55"); // NOI18N
        jB55.setPreferredSize(new java.awt.Dimension(30, 30));
        jB55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB55ActionPerformed(evt);
            }
        });
        jB55.setBounds(200, 240, 30, 30);
        jLayeredPane1.add(jB55, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB56.setMaximumSize(new java.awt.Dimension(30, 30));
        jB56.setMinimumSize(new java.awt.Dimension(30, 30));
        jB56.setName("jB56"); // NOI18N
        jB56.setPreferredSize(new java.awt.Dimension(30, 30));
        jB56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB56ActionPerformed(evt);
            }
        });
        jB56.setBounds(230, 240, 30, 30);
        jLayeredPane1.add(jB56, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB57.setMaximumSize(new java.awt.Dimension(30, 30));
        jB57.setMinimumSize(new java.awt.Dimension(30, 30));
        jB57.setName("jB57"); // NOI18N
        jB57.setPreferredSize(new java.awt.Dimension(30, 30));
        jB57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB57ActionPerformed(evt);
            }
        });
        jB57.setBounds(260, 240, 30, 30);
        jLayeredPane1.add(jB57, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB58.setMaximumSize(new java.awt.Dimension(30, 30));
        jB58.setMinimumSize(new java.awt.Dimension(30, 30));
        jB58.setName("jB58"); // NOI18N
        jB58.setPreferredSize(new java.awt.Dimension(30, 30));
        jB58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB58ActionPerformed(evt);
            }
        });
        jB58.setBounds(290, 240, 30, 30);
        jLayeredPane1.add(jB58, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB59.setMaximumSize(new java.awt.Dimension(30, 30));
        jB59.setMinimumSize(new java.awt.Dimension(30, 30));
        jB59.setName("jB59"); // NOI18N
        jB59.setPreferredSize(new java.awt.Dimension(30, 30));
        jB59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB59ActionPerformed(evt);
            }
        });
        jB59.setBounds(320, 240, 30, 30);
        jLayeredPane1.add(jB59, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB60.setMaximumSize(new java.awt.Dimension(30, 30));
        jB60.setMinimumSize(new java.awt.Dimension(30, 30));
        jB60.setName("jB60"); // NOI18N
        jB60.setPreferredSize(new java.awt.Dimension(30, 30));
        jB60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB60ActionPerformed(evt);
            }
        });
        jB60.setBounds(50, 270, 30, 30);
        jLayeredPane1.add(jB60, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB61.setMaximumSize(new java.awt.Dimension(30, 30));
        jB61.setMinimumSize(new java.awt.Dimension(30, 30));
        jB61.setName("jB61"); // NOI18N
        jB61.setPreferredSize(new java.awt.Dimension(30, 30));
        jB61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB61ActionPerformed(evt);
            }
        });
        jB61.setBounds(80, 270, 30, 30);
        jLayeredPane1.add(jB61, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB62.setMaximumSize(new java.awt.Dimension(30, 30));
        jB62.setMinimumSize(new java.awt.Dimension(30, 30));
        jB62.setName("jB62"); // NOI18N
        jB62.setPreferredSize(new java.awt.Dimension(30, 30));
        jB62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB62ActionPerformed(evt);
            }
        });
        jB62.setBounds(110, 270, 30, 30);
        jLayeredPane1.add(jB62, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB63.setMaximumSize(new java.awt.Dimension(30, 30));
        jB63.setMinimumSize(new java.awt.Dimension(30, 30));
        jB63.setName("jB63"); // NOI18N
        jB63.setPreferredSize(new java.awt.Dimension(30, 30));
        jB63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB63ActionPerformed(evt);
            }
        });
        jB63.setBounds(140, 270, 30, 30);
        jLayeredPane1.add(jB63, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB64.setMaximumSize(new java.awt.Dimension(30, 30));
        jB64.setMinimumSize(new java.awt.Dimension(30, 30));
        jB64.setName("jB64"); // NOI18N
        jB64.setPreferredSize(new java.awt.Dimension(30, 30));
        jB64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB64ActionPerformed(evt);
            }
        });
        jB64.setBounds(170, 270, 30, 30);
        jLayeredPane1.add(jB64, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB65.setMaximumSize(new java.awt.Dimension(30, 30));
        jB65.setMinimumSize(new java.awt.Dimension(30, 30));
        jB65.setName("jB65"); // NOI18N
        jB65.setPreferredSize(new java.awt.Dimension(30, 30));
        jB65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB65ActionPerformed(evt);
            }
        });
        jB65.setBounds(200, 270, 30, 30);
        jLayeredPane1.add(jB65, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB66.setMaximumSize(new java.awt.Dimension(30, 30));
        jB66.setMinimumSize(new java.awt.Dimension(30, 30));
        jB66.setName("jB66"); // NOI18N
        jB66.setPreferredSize(new java.awt.Dimension(30, 30));
        jB66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB66ActionPerformed(evt);
            }
        });
        jB66.setBounds(230, 270, 30, 30);
        jLayeredPane1.add(jB66, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB67.setMaximumSize(new java.awt.Dimension(30, 30));
        jB67.setMinimumSize(new java.awt.Dimension(30, 30));
        jB67.setName("jB67"); // NOI18N
        jB67.setPreferredSize(new java.awt.Dimension(30, 30));
        jB67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB67ActionPerformed(evt);
            }
        });
        jB67.setBounds(260, 270, 30, 30);
        jLayeredPane1.add(jB67, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB68.setMaximumSize(new java.awt.Dimension(30, 30));
        jB68.setMinimumSize(new java.awt.Dimension(30, 30));
        jB68.setName("jB68"); // NOI18N
        jB68.setPreferredSize(new java.awt.Dimension(30, 30));
        jB68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB68ActionPerformed(evt);
            }
        });
        jB68.setBounds(290, 270, 30, 30);
        jLayeredPane1.add(jB68, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB69.setMaximumSize(new java.awt.Dimension(30, 30));
        jB69.setMinimumSize(new java.awt.Dimension(30, 30));
        jB69.setName("jB69"); // NOI18N
        jB69.setPreferredSize(new java.awt.Dimension(30, 30));
        jB69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB69ActionPerformed(evt);
            }
        });
        jB69.setBounds(320, 270, 30, 30);
        jLayeredPane1.add(jB69, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB70.setMaximumSize(new java.awt.Dimension(30, 30));
        jB70.setMinimumSize(new java.awt.Dimension(30, 30));
        jB70.setName("jB70"); // NOI18N
        jB70.setPreferredSize(new java.awt.Dimension(30, 30));
        jB70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB70ActionPerformed(evt);
            }
        });
        jB70.setBounds(50, 300, 30, 30);
        jLayeredPane1.add(jB70, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB71.setMaximumSize(new java.awt.Dimension(30, 30));
        jB71.setMinimumSize(new java.awt.Dimension(30, 30));
        jB71.setName("jB71"); // NOI18N
        jB71.setPreferredSize(new java.awt.Dimension(30, 30));
        jB71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB71ActionPerformed(evt);
            }
        });
        jB71.setBounds(80, 300, 30, 30);
        jLayeredPane1.add(jB71, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB72.setMaximumSize(new java.awt.Dimension(30, 30));
        jB72.setMinimumSize(new java.awt.Dimension(30, 30));
        jB72.setName("jB72"); // NOI18N
        jB72.setPreferredSize(new java.awt.Dimension(30, 30));
        jB72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB72ActionPerformed(evt);
            }
        });
        jB72.setBounds(110, 300, 30, 30);
        jLayeredPane1.add(jB72, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB73.setMaximumSize(new java.awt.Dimension(30, 30));
        jB73.setMinimumSize(new java.awt.Dimension(30, 30));
        jB73.setName("jB73"); // NOI18N
        jB73.setPreferredSize(new java.awt.Dimension(30, 30));
        jB73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB73ActionPerformed(evt);
            }
        });
        jB73.setBounds(140, 300, 30, 30);
        jLayeredPane1.add(jB73, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB74.setMaximumSize(new java.awt.Dimension(30, 30));
        jB74.setMinimumSize(new java.awt.Dimension(30, 30));
        jB74.setName("jB74"); // NOI18N
        jB74.setPreferredSize(new java.awt.Dimension(30, 30));
        jB74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB74ActionPerformed(evt);
            }
        });
        jB74.setBounds(170, 300, 30, 30);
        jLayeredPane1.add(jB74, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB75.setMaximumSize(new java.awt.Dimension(30, 30));
        jB75.setMinimumSize(new java.awt.Dimension(30, 30));
        jB75.setName("jB75"); // NOI18N
        jB75.setPreferredSize(new java.awt.Dimension(30, 30));
        jB75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB75ActionPerformed(evt);
            }
        });
        jB75.setBounds(200, 300, 30, 30);
        jLayeredPane1.add(jB75, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB76.setMaximumSize(new java.awt.Dimension(30, 30));
        jB76.setMinimumSize(new java.awt.Dimension(30, 30));
        jB76.setName("jB76"); // NOI18N
        jB76.setPreferredSize(new java.awt.Dimension(30, 30));
        jB76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB76ActionPerformed(evt);
            }
        });
        jB76.setBounds(230, 300, 30, 30);
        jLayeredPane1.add(jB76, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB77.setMaximumSize(new java.awt.Dimension(30, 30));
        jB77.setMinimumSize(new java.awt.Dimension(30, 30));
        jB77.setName("jB77"); // NOI18N
        jB77.setPreferredSize(new java.awt.Dimension(30, 30));
        jB77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB77ActionPerformed(evt);
            }
        });
        jB77.setBounds(260, 300, 30, 30);
        jLayeredPane1.add(jB77, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB78.setMaximumSize(new java.awt.Dimension(30, 30));
        jB78.setMinimumSize(new java.awt.Dimension(30, 30));
        jB78.setName("jB78"); // NOI18N
        jB78.setPreferredSize(new java.awt.Dimension(30, 30));
        jB78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB78ActionPerformed(evt);
            }
        });
        jB78.setBounds(290, 300, 30, 30);
        jLayeredPane1.add(jB78, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB79.setMaximumSize(new java.awt.Dimension(30, 30));
        jB79.setMinimumSize(new java.awt.Dimension(30, 30));
        jB79.setName("jB79"); // NOI18N
        jB79.setPreferredSize(new java.awt.Dimension(30, 30));
        jB79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB79ActionPerformed(evt);
            }
        });
        jB79.setBounds(320, 300, 30, 30);
        jLayeredPane1.add(jB79, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB80.setMaximumSize(new java.awt.Dimension(30, 30));
        jB80.setMinimumSize(new java.awt.Dimension(30, 30));
        jB80.setName("jB80"); // NOI18N
        jB80.setPreferredSize(new java.awt.Dimension(30, 30));
        jB80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB80ActionPerformed(evt);
            }
        });
        jB80.setBounds(50, 330, 30, 30);
        jLayeredPane1.add(jB80, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB81.setMaximumSize(new java.awt.Dimension(30, 30));
        jB81.setMinimumSize(new java.awt.Dimension(30, 30));
        jB81.setName("jB81"); // NOI18N
        jB81.setPreferredSize(new java.awt.Dimension(30, 30));
        jB81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB81ActionPerformed(evt);
            }
        });
        jB81.setBounds(80, 330, 30, 30);
        jLayeredPane1.add(jB81, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB82.setMaximumSize(new java.awt.Dimension(30, 30));
        jB82.setMinimumSize(new java.awt.Dimension(30, 30));
        jB82.setName("jB82"); // NOI18N
        jB82.setPreferredSize(new java.awt.Dimension(30, 30));
        jB82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB82ActionPerformed(evt);
            }
        });
        jB82.setBounds(110, 330, 30, 30);
        jLayeredPane1.add(jB82, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB83.setMaximumSize(new java.awt.Dimension(30, 30));
        jB83.setMinimumSize(new java.awt.Dimension(30, 30));
        jB83.setName("jB83"); // NOI18N
        jB83.setPreferredSize(new java.awt.Dimension(30, 30));
        jB83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB83ActionPerformed(evt);
            }
        });
        jB83.setBounds(140, 330, 30, 30);
        jLayeredPane1.add(jB83, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB84.setMaximumSize(new java.awt.Dimension(30, 30));
        jB84.setMinimumSize(new java.awt.Dimension(30, 30));
        jB84.setName("jB84"); // NOI18N
        jB84.setPreferredSize(new java.awt.Dimension(30, 30));
        jB84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB84ActionPerformed(evt);
            }
        });
        jB84.setBounds(170, 330, 30, 30);
        jLayeredPane1.add(jB84, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB85.setMaximumSize(new java.awt.Dimension(30, 30));
        jB85.setMinimumSize(new java.awt.Dimension(30, 30));
        jB85.setName("jB85"); // NOI18N
        jB85.setPreferredSize(new java.awt.Dimension(30, 30));
        jB85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB85ActionPerformed(evt);
            }
        });
        jB85.setBounds(200, 330, 30, 30);
        jLayeredPane1.add(jB85, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB86.setMaximumSize(new java.awt.Dimension(30, 30));
        jB86.setMinimumSize(new java.awt.Dimension(30, 30));
        jB86.setName("jB86"); // NOI18N
        jB86.setPreferredSize(new java.awt.Dimension(30, 30));
        jB86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB86ActionPerformed(evt);
            }
        });
        jB86.setBounds(230, 330, 30, 30);
        jLayeredPane1.add(jB86, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB87.setMaximumSize(new java.awt.Dimension(30, 30));
        jB87.setMinimumSize(new java.awt.Dimension(30, 30));
        jB87.setName("jB87"); // NOI18N
        jB87.setPreferredSize(new java.awt.Dimension(30, 30));
        jB87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB87ActionPerformed(evt);
            }
        });
        jB87.setBounds(260, 330, 30, 30);
        jLayeredPane1.add(jB87, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB88.setMaximumSize(new java.awt.Dimension(30, 30));
        jB88.setMinimumSize(new java.awt.Dimension(30, 30));
        jB88.setName("jB88"); // NOI18N
        jB88.setPreferredSize(new java.awt.Dimension(30, 30));
        jB88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB88ActionPerformed(evt);
            }
        });
        jB88.setBounds(290, 330, 30, 30);
        jLayeredPane1.add(jB88, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB89.setMaximumSize(new java.awt.Dimension(30, 30));
        jB89.setMinimumSize(new java.awt.Dimension(30, 30));
        jB89.setName("jB89"); // NOI18N
        jB89.setPreferredSize(new java.awt.Dimension(30, 30));
        jB89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB89ActionPerformed(evt);
            }
        });
        jB89.setBounds(320, 330, 30, 30);
        jLayeredPane1.add(jB89, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB90.setMaximumSize(new java.awt.Dimension(30, 30));
        jB90.setMinimumSize(new java.awt.Dimension(30, 30));
        jB90.setName("jB90"); // NOI18N
        jB90.setPreferredSize(new java.awt.Dimension(30, 30));
        jB90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB90ActionPerformed(evt);
            }
        });
        jB90.setBounds(50, 360, 30, 30);
        jLayeredPane1.add(jB90, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB91.setMaximumSize(new java.awt.Dimension(30, 30));
        jB91.setMinimumSize(new java.awt.Dimension(30, 30));
        jB91.setName("jB91"); // NOI18N
        jB91.setPreferredSize(new java.awt.Dimension(30, 30));
        jB91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB91ActionPerformed(evt);
            }
        });
        jB91.setBounds(80, 360, 30, 30);
        jLayeredPane1.add(jB91, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB92.setMaximumSize(new java.awt.Dimension(30, 30));
        jB92.setMinimumSize(new java.awt.Dimension(30, 30));
        jB92.setName("jB92"); // NOI18N
        jB92.setPreferredSize(new java.awt.Dimension(30, 30));
        jB92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB92ActionPerformed(evt);
            }
        });
        jB92.setBounds(110, 360, 30, 30);
        jLayeredPane1.add(jB92, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB93.setMaximumSize(new java.awt.Dimension(30, 30));
        jB93.setMinimumSize(new java.awt.Dimension(30, 30));
        jB93.setName("jB93"); // NOI18N
        jB93.setPreferredSize(new java.awt.Dimension(30, 30));
        jB93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB93ActionPerformed(evt);
            }
        });
        jB93.setBounds(140, 360, 30, 30);
        jLayeredPane1.add(jB93, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB94.setMaximumSize(new java.awt.Dimension(30, 30));
        jB94.setMinimumSize(new java.awt.Dimension(30, 30));
        jB94.setName("jB94"); // NOI18N
        jB94.setPreferredSize(new java.awt.Dimension(30, 30));
        jB94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB94ActionPerformed(evt);
            }
        });
        jB94.setBounds(170, 360, 30, 30);
        jLayeredPane1.add(jB94, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB95.setMaximumSize(new java.awt.Dimension(30, 30));
        jB95.setMinimumSize(new java.awt.Dimension(30, 30));
        jB95.setName("jB95"); // NOI18N
        jB95.setPreferredSize(new java.awt.Dimension(30, 30));
        jB95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB95ActionPerformed(evt);
            }
        });
        jB95.setBounds(200, 360, 30, 30);
        jLayeredPane1.add(jB95, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB96.setMaximumSize(new java.awt.Dimension(30, 30));
        jB96.setMinimumSize(new java.awt.Dimension(30, 30));
        jB96.setName("jB96"); // NOI18N
        jB96.setPreferredSize(new java.awt.Dimension(30, 30));
        jB96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB96ActionPerformed(evt);
            }
        });
        jB96.setBounds(230, 360, 30, 30);
        jLayeredPane1.add(jB96, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB97.setMaximumSize(new java.awt.Dimension(30, 30));
        jB97.setMinimumSize(new java.awt.Dimension(30, 30));
        jB97.setName("jB97"); // NOI18N
        jB97.setPreferredSize(new java.awt.Dimension(30, 30));
        jB97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB97ActionPerformed(evt);
            }
        });
        jB97.setBounds(260, 360, 30, 30);
        jLayeredPane1.add(jB97, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB98.setMaximumSize(new java.awt.Dimension(30, 30));
        jB98.setMinimumSize(new java.awt.Dimension(30, 30));
        jB98.setName("jB98"); // NOI18N
        jB98.setPreferredSize(new java.awt.Dimension(30, 30));
        jB98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB98ActionPerformed(evt);
            }
        });
        jB98.setBounds(290, 360, 30, 30);
        jLayeredPane1.add(jB98, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jB99.setMaximumSize(new java.awt.Dimension(30, 30));
        jB99.setMinimumSize(new java.awt.Dimension(30, 30));
        jB99.setName("jB99"); // NOI18N
        jB99.setPreferredSize(new java.awt.Dimension(30, 30));
        jB99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB99ActionPerformed(evt);
            }
        });
        jB99.setBounds(320, 360, 30, 30);
        jLayeredPane1.add(jB99, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(jugador.InterfazGrafica.ProyectoiBattleApp.class).getContext().getResourceMap(TableroPlayer1.class);
        jBTableroRandom.setText(resourceMap.getString("jBTableroRandom.text")); // NOI18N
        jBTableroRandom.setMaximumSize(new java.awt.Dimension(140, 40));
        jBTableroRandom.setMinimumSize(new java.awt.Dimension(140, 40));
        jBTableroRandom.setName("jBTableroRandom"); // NOI18N
        jBTableroRandom.setPreferredSize(new java.awt.Dimension(140, 40));
        jBTableroRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTableroRandomActionPerformed(evt);
            }
        });
        jBTableroRandom.setBounds(270, 550, 140, 40);
        jLayeredPane1.add(jBTableroRandom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBTableroManual.setText(resourceMap.getString("jBTableroManual.text")); // NOI18N
        jBTableroManual.setMaximumSize(new java.awt.Dimension(140, 40));
        jBTableroManual.setMinimumSize(new java.awt.Dimension(140, 40));
        jBTableroManual.setName("jBTableroManual"); // NOI18N
        jBTableroManual.setPreferredSize(new java.awt.Dimension(140, 40));
        jBTableroManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTableroManualActionPerformed(evt);
            }
        });
        jBTableroManual.setBounds(470, 550, 140, 40);
        jLayeredPane1.add(jBTableroManual, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBContinuar.setText(resourceMap.getString("jBContinuar.text")); // NOI18N
        jBContinuar.setName("jBContinuar"); // NOI18N
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });
        jBContinuar.setBounds(700, 550, 120, 40);
        jLayeredPane1.add(jBContinuar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNick.setFont(resourceMap.getFont("jLNick.font")); // NOI18N
        jLNick.setText(resourceMap.getString("jLNick.text")); // NOI18N
        jLNick.setName("jLNick"); // NOI18N
        jLNick.setBounds(510, 70, 70, 20);
        jLayeredPane1.add(jLNick, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFNick.setText(resourceMap.getString("jTFNick.text")); // NOI18N
        jTFNick.setName("jTFNick"); // NOI18N
        jTFNick.setBounds(590, 70, 70, 20);
        jLayeredPane1.add(jTFNick, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBAvatar.setText(resourceMap.getString("jBAvatar.text")); // NOI18N
        jBAvatar.setName("jBAvatar"); // NOI18N
        jBAvatar.setBounds(510, 130, 70, 60);
        jLayeredPane1.add(jBAvatar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLAvatar.setFont(resourceMap.getFont("jLAvatar.font")); // NOI18N
        jLAvatar.setText(resourceMap.getString("jLAvatar.text")); // NOI18N
        jLAvatar.setName("jLAvatar"); // NOI18N
        jLAvatar.setBounds(510, 100, 60, 20);
        jLayeredPane1.add(jLAvatar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCBListaRecord.setName("jCBListaRecord"); // NOI18N
        jCBListaRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBListaRecordActionPerformed(evt);
            }
        });
        jCBListaRecord.setBounds(720, 240, 120, 20);
        jLayeredPane1.add(jCBListaRecord, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCBListaPerdidas.setName("jCBListaPerdidas"); // NOI18N
        jCBListaPerdidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBListaPerdidasActionPerformed(evt);
            }
        });
        jCBListaPerdidas.setBounds(720, 390, 120, 20);
        jLayeredPane1.add(jCBListaPerdidas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLRecordGanadas.setFont(resourceMap.getFont("jLRecordGanadas.font")); // NOI18N
        jLRecordGanadas.setText(resourceMap.getString("jLRecordGanadas.text")); // NOI18N
        jLRecordGanadas.setName("jLRecordGanadas"); // NOI18N
        jLRecordGanadas.setBounds(720, 210, 120, 20);
        jLayeredPane1.add(jLRecordGanadas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLRecordPerdidas.setFont(resourceMap.getFont("jLRecordPerdidas.font")); // NOI18N
        jLRecordPerdidas.setText(resourceMap.getString("jLRecordPerdidas.text")); // NOI18N
        jLRecordPerdidas.setName("jLRecordPerdidas"); // NOI18N
        jLRecordPerdidas.setBounds(720, 360, 120, 20);
        jLayeredPane1.add(jLRecordPerdidas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFSubmarino1.setText(resourceMap.getString("jTFSubmarino1.text")); // NOI18N
        jTFSubmarino1.setName("jTFSubmarino1"); // NOI18N
        jTFSubmarino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSubmarino1ActionPerformed(evt);
            }
        });
        jTFSubmarino1.setBounds(510, 450, 20, 20);
        jLayeredPane1.add(jTFSubmarino1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFAcorazado1.setText(resourceMap.getString("jTFAcorazado1.text")); // NOI18N
        jTFAcorazado1.setName("jTFAcorazado1"); // NOI18N
        jTFAcorazado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAcorazado1ActionPerformed(evt);
            }
        });
        jTFAcorazado1.setBounds(510, 270, 20, 20);
        jLayeredPane1.add(jTFAcorazado1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBMinador.setIcon(resourceMap.getIcon("jBMinador.icon")); // NOI18N
        jBMinador.setName("jBMinador"); // NOI18N
        jBMinador.setBounds(570, 310, 50, 40);
        jLayeredPane1.add(jBMinador, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBPortaavion.setIcon(resourceMap.getIcon("jBPortaavion.icon")); // NOI18N
        jBPortaavion.setName("jBPortaavion"); // NOI18N
        jBPortaavion.setBounds(570, 380, 50, 40);
        jLayeredPane1.add(jBPortaavion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFSubmarino.setText(resourceMap.getString("jTFSubmarino.text")); // NOI18N
        jTFSubmarino.setName("jTFSubmarino"); // NOI18N
        jTFSubmarino.setBounds(430, 450, 70, 20);
        jLayeredPane1.add(jTFSubmarino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator4.setName("jSeparator4"); // NOI18N
        jSeparator4.setBounds(430, 430, 200, 10);
        jLayeredPane1.add(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFPortaavion.setText(resourceMap.getString("jTFPortaavion.text")); // NOI18N
        jTFPortaavion.setName("jTFPortaavion"); // NOI18N
        jTFPortaavion.setBounds(430, 390, 70, 20);
        jLayeredPane1.add(jTFPortaavion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFPortaavion1.setText(resourceMap.getString("jTFPortaavion1.text")); // NOI18N
        jTFPortaavion1.setName("jTFPortaavion1"); // NOI18N
        jTFPortaavion1.setBounds(510, 390, 20, 20);
        jLayeredPane1.add(jTFPortaavion1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFMinador11.setText(resourceMap.getString("jTFMinador11.text")); // NOI18N
        jTFMinador11.setName("jTFMinador11"); // NOI18N
        jTFMinador11.setBounds(430, 320, 70, 20);
        jLayeredPane1.add(jTFMinador11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFMinador1.setText(resourceMap.getString("jTFMinador1.text")); // NOI18N
        jTFMinador1.setName("jTFMinador1"); // NOI18N
        jTFMinador1.setBounds(510, 320, 20, 20);
        jLayeredPane1.add(jTFMinador1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBAcorazado.setIcon(resourceMap.getIcon("jBAcorazado.icon")); // NOI18N
        jBAcorazado.setName("jBAcorazado"); // NOI18N
        jBAcorazado.setBounds(570, 250, 50, 40);
        jLayeredPane1.add(jBAcorazado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBSubmarino.setIcon(resourceMap.getIcon("jBSubmarino.icon")); // NOI18N
        jBSubmarino.setName("jBSubmarino"); // NOI18N
        jBSubmarino.setBounds(570, 440, 50, 40);
        jLayeredPane1.add(jBSubmarino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTFAcorazado11.setText(resourceMap.getString("jTFAcorazado11.text")); // NOI18N
        jTFAcorazado11.setName("jTFAcorazado11"); // NOI18N
        jTFAcorazado11.setBounds(430, 270, 70, 20);
        jLayeredPane1.add(jTFAcorazado11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator2.setName("jSeparator2"); // NOI18N
        jSeparator2.setBounds(440, 360, 190, 10);
        jLayeredPane1.add(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jSeparator1.setBounds(440, 300, 190, 2);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.setBounds(560, 240, 70, 250);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setBounds(430, 210, 80, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLJugador1.setFont(resourceMap.getFont("jLJugador1.font")); // NOI18N
        jLJugador1.setText(resourceMap.getString("jLJugador1.text")); // NOI18N
        jLJugador1.setName("jLJugador1"); // NOI18N
        jLJugador1.setBounds(10, 0, 90, 30);
        jLayeredPane1.add(jLJugador1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(null);
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel4.setBounds(840, 580, 100, 100);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLfondo.setIcon(resourceMap.getIcon("jLfondo.icon")); // NOI18N
        jLfondo.setText(resourceMap.getString("jLfondo.text")); // NOI18N
        jLfondo.setName("jLfondo"); // NOI18N
        jLfondo.setBounds(0, 0, 940, 700);
        jLayeredPane1.add(jLfondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTableroRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTableroRandomActionPerformed

      inicializarTablero();
      int maximo = 10;
       int aux[][] = (Comunicacion.obtenerMotor().generarTableroRandom());
       for (int i = 0; i < maximo; i++) {
          for (int j = 0; j < maximo; j++) {
             System.out.println("i: " + i + " j: " + j);
             if (aux[i][j] == 1) {
                arregloBotones[i][j].setIcon(new ImageIcon(getClass().getResource("/jugador/InterfazGrafica/img/cuadroAzul.png")));
             }
          }
       }
       JOptionPane.showMessageDialog(null, "Tablero generado satisfactoriamente, se completaron los 10 barcos correspondientes al tablero  ", "Creacion Tablero Aleatorio", JOptionPane.INFORMATION_MESSAGE);
       for (int i = 0; i < maximo; i++) {
          for (int j = 0; j < maximo; j++) {
             System.out.print(aux[i][j] + " ");
          }
          System.out.println();
       }
       jBTableroRandom.setEnabled(false);
       jBTableroManual.setEnabled(false);
       contadorBarcos = 10;
    }//GEN-LAST:event_jBTableroRandomActionPerformed

    private void jBTableroManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTableroManualActionPerformed
       inicializarTablero();
       for (int i = 0; i < arregloBotones.length; i++) {
          for (int j = 0; j < arregloBotones.length; j++) {
             arregloBotones[i][j].setEnabled(true);
          }
       }
       jBTableroRandom.setEnabled(false);
       jBTableroManual.setEnabled(false);
    }//GEN-LAST:event_jBTableroManualActionPerformed

    private void jB00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB00ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 0;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB00ActionPerformed

    private void jB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB01ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 1;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB01ActionPerformed

    private void jB02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB02ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 2;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB02ActionPerformed

    private void jB03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB03ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 3;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB03ActionPerformed

    private void jB04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB04ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 4;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
              }
           }
       }
    }//GEN-LAST:event_jB04ActionPerformed

    private void jB05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB05ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 5;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB05ActionPerformed

    private void jB06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB06ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 6;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB06ActionPerformed

    private void jB07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB07ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 7;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB07ActionPerformed

    private void jB08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB08ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 8;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB08ActionPerformed

    private void jB09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB09ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 0, Y = 9;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB09ActionPerformed

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB11ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 1;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB11ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 0;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB10ActionPerformed

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB12ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 2;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB12ActionPerformed

    private void jB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB13ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 3;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB13ActionPerformed

    private void jB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB14ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 4;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB14ActionPerformed

    private void jB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB15ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 5;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB15ActionPerformed

    private void jB16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB16ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 6;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB16ActionPerformed

    private void jB17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB17ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 7;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB17ActionPerformed

    private void jB18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB18ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 8;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB18ActionPerformed

    private void jB19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB19ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 1, Y = 9;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB19ActionPerformed

    private void jB21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB21ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 1;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB21ActionPerformed

    private void jB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB20ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 0;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB20ActionPerformed

    private void jB22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB22ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 2;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB22ActionPerformed

    private void jB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB23ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 3;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                     jBTableroManual.setEnabled(false);
                }
              }
           }
       }
    }//GEN-LAST:event_jB23ActionPerformed

    private void jB24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB24ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 4;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB24ActionPerformed

    private void jB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB25ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 5;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB25ActionPerformed

    private void jB26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB26ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 6;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB26ActionPerformed

    private void jB27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB27ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 7;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB27ActionPerformed

    private void jB28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB28ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 8;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB28ActionPerformed

    private void jB29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB29ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 2, Y = 9;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB29ActionPerformed

    private void jB30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB30ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 0;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB30ActionPerformed

    private void jB31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB31ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 1;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB31ActionPerformed

    private void jB32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB32ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 2;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB32ActionPerformed

    private void jB33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB33ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 3;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB33ActionPerformed

    private void jB34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB34ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 4;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB34ActionPerformed

    private void jB35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB35ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 5;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB35ActionPerformed

    private void jB36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB36ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 6;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB36ActionPerformed

    private void jB37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB37ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 7;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB37ActionPerformed

    private void jB38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB38ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 8;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
        }
    }//GEN-LAST:event_jB38ActionPerformed

    private void jB39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB39ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 3, Y = 9;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
        }
    }//GEN-LAST:event_jB39ActionPerformed

    private void jB40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB40ActionPerformed
       if (contadorBarcos < totalBarcos) {
           int X = 4, Y = 0;
           if (primero) {
              Xo = X;
              Yo = Y;
              primero = false;
              System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
           } else {
              Xf = X;
              Yf = Y;
              primero = true;
              System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
              if (Yo == Yf) {
                 tamano = 1 + Math.abs(Xf - Xo);
              }
              if (Xo == Xf) {
                 tamano = 1 + Math.abs(Yf - Yo);
              }
              switch (tamano) {
                 case 1:
                    tipoBarco = "minador";
                    break;
                 case 2:
                    tipoBarco = "submarino";
                    break;
                 case 3:
                    tipoBarco = "acorazado";
                    break;
                 case 4:
                    tipoBarco = "portaavion";
                    break;
              } // fin switch tamaño
              System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
              if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                 llenarBoton(Xo, Xf, Yo, Yf);
                 System.out.println(tipoBarco + " colocado");
                 if (++contadorBarcos == 10) {
                    JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                 }
              }
           }
       }
    }//GEN-LAST:event_jB40ActionPerformed

    private void jB41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB41ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB41ActionPerformed

    private void jB42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB42ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB42ActionPerformed

    private void jB43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB43ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB43ActionPerformed

    private void jB44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB44ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB44ActionPerformed

    private void jB45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB45ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB45ActionPerformed

    private void jB46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB46ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB46ActionPerformed

    private void jB47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB47ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB47ActionPerformed

    private void jB48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB48ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB48ActionPerformed

    private void jB49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB49ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 4, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                    jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB49ActionPerformed

    private void jB50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB50ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 0;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB50ActionPerformed

    private void jB51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB51ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB51ActionPerformed

    private void jB52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB52ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB52ActionPerformed

    private void jB53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB53ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB53ActionPerformed

    private void jB54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB54ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB54ActionPerformed

    private void jB55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB55ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB55ActionPerformed

    private void jB56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB56ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB56ActionPerformed

    private void jB57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB57ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB57ActionPerformed

    private void jB58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB58ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB58ActionPerformed

    private void jB59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB59ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 5, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB59ActionPerformed

    private void jB60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB60ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 0;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB60ActionPerformed

    private void jB61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB61ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB61ActionPerformed

    private void jB62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB62ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB62ActionPerformed

    private void jB63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB63ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB63ActionPerformed

    private void jB64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB64ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB64ActionPerformed

    private void jB65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB65ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB65ActionPerformed

    private void jB66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB66ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB66ActionPerformed

    private void jB67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB67ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB67ActionPerformed

    private void jB68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB68ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB68ActionPerformed

    private void jB69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB69ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 6, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB69ActionPerformed

    private void jB70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB70ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 0;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB70ActionPerformed

    private void jB71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB71ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB71ActionPerformed

    private void jB72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB72ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB72ActionPerformed

    private void jB73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB73ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB73ActionPerformed

    private void jB74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB74ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB74ActionPerformed

    private void jB75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB75ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB75ActionPerformed

    private void jB76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB76ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB76ActionPerformed

    private void jB77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB77ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }

    }//GEN-LAST:event_jB77ActionPerformed

    private void jB78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB78ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB78ActionPerformed

    private void jB79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB79ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 7, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB79ActionPerformed

    private void jB80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB80ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 0;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB80ActionPerformed

    private void jB81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB81ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB81ActionPerformed

    private void jB82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB82ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB82ActionPerformed

    private void jB83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB83ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB83ActionPerformed

    private void jB84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB84ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB84ActionPerformed

    private void jB85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB85ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB85ActionPerformed

    private void jB86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB86ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB86ActionPerformed

    private void jB87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB87ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB87ActionPerformed

    private void jB88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB88ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB88ActionPerformed

    private void jB89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB89ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 8, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB89ActionPerformed

    private void jB90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB90ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 0;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB90ActionPerformed

    private void jB91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB91ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 1;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB91ActionPerformed

    private void jB92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB92ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 2;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB92ActionPerformed

    private void jB93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB93ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 3;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB93ActionPerformed

    private void jB94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB94ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 4;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB94ActionPerformed

    private void jB95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB95ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 5;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB95ActionPerformed

    private void jB96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB96ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 6;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB96ActionPerformed

    private void jB97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB97ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 7;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB97ActionPerformed

    private void jB98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB98ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 8;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB98ActionPerformed

    private void jB99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB99ActionPerformed
       if (contadorBarcos < totalBarcos) {
          int X = 9, Y = 9;
          if (primero) {
             Xo = X;
             Yo = Y;
             primero = false;
             System.out.println("X Origen: " + Xo + ", Y Origen: " + Yo);
          } else {
             Xf = X;
             Yf = Y;
             primero = true;
             System.out.println("X Final: " + Xf + ", Y Final: " + Yf);
             if (Yo == Yf) {
                tamano = 1 + Math.abs(Xf - Xo);
             }
             if (Xo == Xf) {
                tamano = 1 + Math.abs(Yf - Yo);
             }
             switch (tamano) {
                case 1:
                   tipoBarco = "minador";
                   break;
                case 2:
                   tipoBarco = "submarino";
                   break;
                case 3:
                   tipoBarco = "acorazado";
                   break;
                case 4:
                   tipoBarco = "portaavion";
                   break;
             } // fin switch tamaño
             System.out.println("Tamaño del barco: " + tamano + ", Tipo de barco: " + tipoBarco);
             if (Comunicacion.obtenerMotor().colocarBarco(Xo, Yo, Xf, Yf, tipoBarco, player)) {
                llenarBoton(Xo, Xf, Yo, Yf);
                System.out.println(tipoBarco + " colocado");
                if (++contadorBarcos == 10) {
                   JOptionPane.showMessageDialog(null, "Se completaron los 10 barcos correspondientes al tablero", "Total de barcos", JOptionPane.INFORMATION_MESSAGE);
                   jBTableroManual.setEnabled(false);
                }
             }
          }
       }
    }//GEN-LAST:event_jB99ActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed

       TableroPlayer2 pantalla = new TableroPlayer2 (); 
       this.setVisible(false);
       pantalla.setVisible(true);
       pantalla.setLocationRelativeTo(null);

    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jCBListaRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListaRecordActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCBListaRecordActionPerformed

    private void jCBListaPerdidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListaPerdidasActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCBListaPerdidasActionPerformed

    private void jTFSubmarino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSubmarino1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTFSubmarino1ActionPerformed

    private void jTFAcorazado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAcorazado1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTFAcorazado1ActionPerformed


   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {

         public void run() {
                new TableroPlayer1().setVisible(true);
         }
      });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB00;
    private javax.swing.JButton jB01;
    private javax.swing.JButton jB02;
    private javax.swing.JButton jB03;
    private javax.swing.JButton jB04;
    private javax.swing.JButton jB05;
    private javax.swing.JButton jB06;
    private javax.swing.JButton jB07;
    private javax.swing.JButton jB08;
    private javax.swing.JButton jB09;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB15;
    private javax.swing.JButton jB16;
    private javax.swing.JButton jB17;
    private javax.swing.JButton jB18;
    private javax.swing.JButton jB19;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jB23;
    private javax.swing.JButton jB24;
    private javax.swing.JButton jB25;
    private javax.swing.JButton jB26;
    private javax.swing.JButton jB27;
    private javax.swing.JButton jB28;
    private javax.swing.JButton jB29;
    private javax.swing.JButton jB30;
    private javax.swing.JButton jB31;
    private javax.swing.JButton jB32;
    private javax.swing.JButton jB33;
    private javax.swing.JButton jB34;
    private javax.swing.JButton jB35;
    private javax.swing.JButton jB36;
    private javax.swing.JButton jB37;
    private javax.swing.JButton jB38;
    private javax.swing.JButton jB39;
    private javax.swing.JButton jB40;
    private javax.swing.JButton jB41;
    private javax.swing.JButton jB42;
    private javax.swing.JButton jB43;
    private javax.swing.JButton jB44;
    private javax.swing.JButton jB45;
    private javax.swing.JButton jB46;
    private javax.swing.JButton jB47;
    private javax.swing.JButton jB48;
    private javax.swing.JButton jB49;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB51;
    private javax.swing.JButton jB52;
    private javax.swing.JButton jB53;
    private javax.swing.JButton jB54;
    private javax.swing.JButton jB55;
    private javax.swing.JButton jB56;
    private javax.swing.JButton jB57;
    private javax.swing.JButton jB58;
    private javax.swing.JButton jB59;
    private javax.swing.JButton jB60;
    private javax.swing.JButton jB61;
    private javax.swing.JButton jB62;
    private javax.swing.JButton jB63;
    private javax.swing.JButton jB64;
    private javax.swing.JButton jB65;
    private javax.swing.JButton jB66;
    private javax.swing.JButton jB67;
    private javax.swing.JButton jB68;
    private javax.swing.JButton jB69;
    private javax.swing.JButton jB70;
    private javax.swing.JButton jB71;
    private javax.swing.JButton jB72;
    private javax.swing.JButton jB73;
    private javax.swing.JButton jB74;
    private javax.swing.JButton jB75;
    private javax.swing.JButton jB76;
    private javax.swing.JButton jB77;
    private javax.swing.JButton jB78;
    private javax.swing.JButton jB79;
    private javax.swing.JButton jB80;
    private javax.swing.JButton jB81;
    private javax.swing.JButton jB82;
    private javax.swing.JButton jB83;
    private javax.swing.JButton jB84;
    private javax.swing.JButton jB85;
    private javax.swing.JButton jB86;
    private javax.swing.JButton jB87;
    private javax.swing.JButton jB88;
    private javax.swing.JButton jB89;
    private javax.swing.JButton jB90;
    private javax.swing.JButton jB91;
    private javax.swing.JButton jB92;
    private javax.swing.JButton jB93;
    private javax.swing.JButton jB94;
    private javax.swing.JButton jB95;
    private javax.swing.JButton jB96;
    private javax.swing.JButton jB97;
    private javax.swing.JButton jB98;
    private javax.swing.JButton jB99;
    private javax.swing.JButton jBAcorazado;
    private javax.swing.JButton jBAvatar;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBMinador;
    private javax.swing.JButton jBPortaavion;
    private javax.swing.JButton jBSubmarino;
    private javax.swing.JButton jBTableroManual;
    private javax.swing.JButton jBTableroRandom;
    private javax.swing.JComboBox jCBListaPerdidas;
    private javax.swing.JComboBox jCBListaRecord;
    private javax.swing.JLabel jLAvatar;
    private javax.swing.JLabel jLJugador1;
    private javax.swing.JLabel jLNick;
    private javax.swing.JLabel jLRecordGanadas;
    private javax.swing.JLabel jLRecordPerdidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFAcorazado1;
    private javax.swing.JTextField jTFAcorazado11;
    private javax.swing.JTextField jTFMinador1;
    private javax.swing.JTextField jTFMinador11;
    private javax.swing.JTextField jTFNick;
    private javax.swing.JTextField jTFPortaavion;
    private javax.swing.JTextField jTFPortaavion1;
    private javax.swing.JTextField jTFSubmarino;
    private javax.swing.JTextField jTFSubmarino1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
   final javax.swing.JButton arregloBotones[][] = new javax.swing.JButton[10][10];

   public void llenarBoton(int Xo, int Xf, int Yo, int Yf) {

      if (Xf < Xo) {
         int x = Xf;
         Xf = Xo;
         Xo = x;
      }
      if (Yf < Yo) {
         int y = Yf;
         Yf = Yo;
         Yo = y;
      }
      for (int i = Xo; i <= Xf; i++) {
         for (int j = Yo; j <= Yf; j++) {
            arregloBotones[i][j].setIcon(new ImageIcon(getClass().getResource("/jugador/InterfazGrafica/img/cuadroAzul.png")));
         }
      }
   }
}

