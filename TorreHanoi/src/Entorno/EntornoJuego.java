package Entorno;

import LogicaJuego.TorresdeHanoi;
import graficos.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class EntornoJuego extends JPanel implements ActionListener, MouseListener {

    //Essta variable aplica la clase de torres de hanoi
    TorresdeHanoi hanoi;
    //Número de discos con los que se va jugar en las torres de hanoi
    int iDiscos;
    //Número de pasos hechos por el usuario
    int iNumeroDePasos;
    //Número de discos en juego
    int iDiscosJuego;
    //Las 3 torres en el juego
    Torres torre1;
    Torres torre2;
    Torres torre3;
    //Botón de Inicio
    JButton iniciar;
    //Número de Discos
    JComboBox numeroDiscos;
    //Etiquetas en Pantalla
    JLabel pasosEchos;
    JLabel labelPasos;
    JLabel numeroDeDiscos;
    JLabel nombreTorre1;
    JLabel nombreTorre2;
    JLabel nombreTorre3;
    //Botón que muestra la solución
    JButton resolver;
    //para mover el aro
    boolean bSeleccionado;
    Discos discoMover;

    /**
     * Constructor de la clase mundo
     */
    public EntornoJuego() throws IOException {
        iNumeroDePasos = 0;
        iDiscos = 3;
        discoMover = null;
        bSeleccionado = false;
        hanoi = new TorresdeHanoi();
        hanoi.hanoi(iDiscos, 1, 2, 3);
        iDiscosJuego = 3;

        this.setBackground(Color.WHITE);

        this.setLayout(null);

        //label que muestra el número de pasos óptimos para resolver el juego
        labelPasos = new JLabel("Minimo de Movimientos: " + hanoi.getContador());
        labelPasos.setBounds(700, 130, 180, 10);
        this.add(labelPasos);
        //Label que muestra el numero de pasos que ah echo el jugador
        pasosEchos = new JLabel("Tu numero de movimientos: ");
        pasosEchos.setBounds(700, 150, 180, 10);
        this.add(pasosEchos);
        //Torre 1
        torre1 = new Torres();
        torre1.setBounds(0, 10, 220, 300);
        torre1.addMouseListener(this);
        agregarAros(3);
        this.add(torre1);
        nombreTorre1 = new JLabel("TORRE UNO");
        nombreTorre1.setBounds(80, 0, 150, 10);
        this.add(nombreTorre1);
        //Torre 2
        torre2 = new Torres();
        torre2.setBounds(220, 10, 220, 300);
        torre2.addMouseListener(this);
        this.add(torre2);
        nombreTorre2 = new JLabel("TORRE DOS");
        nombreTorre2.setBounds(300, 0, 150, 10);
        this.add(nombreTorre2);
        //Torre 3
        torre3 = new Torres();
        torre3.setBounds(440, 10, 220, 300);
        torre3.addMouseListener(this);
        this.add(torre3);
        nombreTorre3 = new JLabel("TORRE TRES");
        nombreTorre3.setBounds(520, 0, 150, 10);
        this.add(nombreTorre3);
        //label numero de discos
        numeroDeDiscos = new JLabel("Número de aros:");
        numeroDeDiscos.setBounds(700, 60, 150, 20);
        this.add(numeroDeDiscos);
        //Botón de Resolver
        resolver = new JButton("Resolver");
        resolver.setBounds(700, 200, 90, 30);
        resolver.addActionListener(this);
        this.add(resolver);
        //boton Inicio
        iniciar = new JButton("Iniciar");
        iniciar.setBounds(800, 80, 90, 30);
        iniciar.addActionListener(this);
        this.add(iniciar);
        //JcomboBox
        numeroDiscos = new JComboBox();
        //llenar el jcomboBox
        for (int i = 3; i <= 8; i++) {
            numeroDiscos.addItem(i);
        }
        numeroDiscos.setBounds(700, 80, 90, 30);
        this.add(numeroDiscos);
    }

    //Agrega el número de discos
    public void agregarAros(int n) {
        Discos disco = new Discos();
        disco.setBounds(90, 250, 45, 20);
        disco.addMouseListener((MouseListener) this);
        torre1.add(disco);
        torre1.updateUI();
        for (int i = 1; i <= n - 1; i++) {
            torre1.add(new Discos());
            torre1.getComponent(i).addMouseListener(this);
        }
        organizar(n);

        torre1.updateUI();

    }

    //Este método sirve para que los discos queden ordenados del mayor al menor
    public void organizar(int n) {
        if (n >= 0) {
            for (int j = 1; j <= n - 1; j++) {

                //panel Anterior
                JPanel anterior = (JPanel) torre1.getComponent(j - 1);
                //posiciones y tamaño del aro anterior
                int iEjeX = anterior.getX();
                int iEjeY = anterior.getY();
                int iAncho = anterior.getWidth();
                int iAlto = anterior.getHeight();

                //Panel que se va a modificar
                JPanel aroA = (JPanel) torre1.getComponent(j);
                aroA.setBounds(iEjeX, iEjeY - iAlto, iAncho, iAlto);
                anterior.setBounds(iEjeX - 10, iEjeY, iAncho + 20, iAlto);
                torre1.setComponentZOrder(aroA, j);
                torre1.setComponentZOrder(anterior, j - 1);

            }
            organizar(n - 1);
        }

    }

    //Eventos en el Botón Iniciar
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            try {
                iNumeroDePasos = 0;
                int n = (int) numeroDiscos.getSelectedItem();
                iDiscosJuego = n;
                hanoi.setContador(0);
                iDiscos = n;
                hanoi.setContador(0);
                //Cálculo de la solución optima y eficiente 
                hanoi.hanoi(n, 1, 2, 3);
                //Número de pasos mínimos para resolver el juego
                int iPasosMinimos = hanoi.getContador();

                //actualiza el Label minimo de pasos
                labelPasos.setText("Minimo de Movimientos: " + iPasosMinimos);

                //Remueve los discos en las torres
                torre1.removeAll();
                torre2.removeAll();
                torre3.removeAll();
                //Redibuja las Torres
                torre1.updateUI();
                torre2.updateUI();
                torre3.updateUI();

                hanoi.setContador(0);
                pasosEchos.setText("Tu numero de movimientos: ");
                agregarAros(n);

            } catch (IOException ex) {
                Logger.getLogger(EntornoJuego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == resolver) {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if (guarda != null) {
                try {

                    hanoi.hanoi(iDiscosJuego, 1, 2, 3);
                    hanoi.guardarSolucion(guarda);
                } catch (IOException ex) {
                    Logger.getLogger(EntornoJuego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //Evento click para mover el disco
    @Override
    public void mouseClicked(MouseEvent e) {

        //mover de la torre 1 a otra torre
        if (torre1.getComponentCount() > 0) {
            if (e.getSource() == torre1.getComponent(torre1.getComponentCount() - 1) && bSeleccionado == false) {
                //Disco que voy a mover
                discoMover = (Discos) torre1.getComponent(torre1.getComponentCount() - 1);
                bSeleccionado = true;
                //Eliminar el disco de la torre
                torre1.remove(torre1.getComponentCount() - 1);
                torre1.updateUI();
            }
        }
        //mover de la torre 2 a otra torre
        if (torre2.getComponentCount() > 0) {
            if (e.getSource() == torre2.getComponent(torre2.getComponentCount() - 1) && bSeleccionado == false) {

                //Disco que voy a mover
                discoMover = (Discos) torre2.getComponent(torre2.getComponentCount() - 1);
                bSeleccionado = true;
                //elimino el disco de la torre
                torre2.remove(torre2.getComponentCount() - 1);
                torre2.updateUI();
            }
        }

        //mover de la torre 3 a otra torre
        if (torre3.getComponentCount() > 0) {
            if (e.getSource() == torre3.getComponent(torre3.getComponentCount() - 1) && bSeleccionado == false) {
                //aro que voy a mover
                discoMover = (Discos) torre3.getComponent(torre3.getComponentCount() - 1);
                bSeleccionado = true;
                //elimino el disco de la torre
                torre3.remove(torre3.getComponentCount() - 1);
                torre3.updateUI();
            }
        }

        //para soltar un disco en la torre 1 una vez echo click en un disco de otra torre
        if (e.getSource() == torre1 && bSeleccionado == true) {
            if (discoMover != null) {
                //guardar el ancho y alto para acomodar
                int x = discoMover.getX();//posicion en x
                int h = discoMover.getHeight();//altura
                int w = discoMover.getWidth();//anchura
                if (torre1.getComponentCount() == 0) {

                    //acomodar el disco que entra
                    discoMover.setBounds(x, 250, w, h);

                    torre1.add(discoMover);
                    torre1.updateUI();
                    iNumeroDePasos++;
                    discoMover = null;
                    bSeleccionado = false;

                } else {

                    //último disco que hay en la torre
                    Discos aroPresente = (Discos) torre1.getComponent(torre1.getComponentCount() - 1);
                    //si retorna true
                    if (verificar(aroPresente, discoMover)) {

                        discoMover.setBounds(x, 250 - (20 * torre1.getComponentCount() - 1), w, 20);
                        torre1.add(discoMover);
                        torre1.updateUI();
                        iNumeroDePasos++;
                        discoMover = null;
                        bSeleccionado = false;

                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento inavlido");
                    }
                }
            }
        }

        //para soltar un disco en la torre 2 una vez echo click en un disco de otra torre
        if (e.getSource() == torre2 && bSeleccionado == true) {
            if (discoMover != null) {
                //guardar el ancho y alto para acomodar
                int x = discoMover.getX();//posicion en x
                int w = discoMover.getWidth();//anchura
                if (torre2.getComponentCount() == 0) {

                    //acomodar el disco que entra
                    discoMover.setBounds(x, 250, w, 20);

                    torre2.add(discoMover);
                    torre2.updateUI();

                    //contador que aumento para contar el numero de pasos del usuario
                    iNumeroDePasos++;

                    //Para actualizar el Label de numero de pasos que hace el jugador
                    pasosEchos.setText("Tu numero de movimientos: " + iNumeroDePasos);

                    discoMover = null;
                    bSeleccionado = false;

                } else {
                    //ultimo disco que hay en la torre
                    Discos aroPresente = (Discos) torre2.getComponent(torre2.getComponentCount() - 1);

                    //si retorna true
                    if (verificar(aroPresente, discoMover)) {

                        discoMover.setBounds(x, 250 - (20 * torre2.getComponentCount() - 1), w, 20);
                        torre2.add(discoMover);
                        torre2.updateUI();

                        //contador que aumento para contar el numero de pasos del usuario
                        iNumeroDePasos++;

                        //Para actualizar el Label de numero de pasos que hace el jugador
                        pasosEchos.setText("Tu numero de movimientos: " + iNumeroDePasos);

                        discoMover = null;
                        bSeleccionado = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento invalido");
                    }
                }
            }
        }

        //Depositar un disco en la torre 3 una vez echo click en un disco de la otra torre
        if (e.getSource() == torre3 && bSeleccionado == true) {
            if (discoMover != null) {

                //guardar el ancho y alto para acomodar
                int x = discoMover.getX();//posicion en x
                int h = discoMover.getHeight();//altura
                int w = discoMover.getWidth();//anchura
                if (torre3.getComponentCount() == 0) {

                    //acomodar el disco que entra
                    discoMover.setBounds(x, 250, w, h);

                    torre3.add(discoMover);
                    torre3.updateUI();
                    discoMover = null;

                    //contador que aumento para contar el numero de pasos del usuario
                    iNumeroDePasos++;

                    //Para actualizar el Label de numero de pasos que hace el jugador
                    pasosEchos.setText("Tu numero de movimientos: " + iNumeroDePasos);

                    bSeleccionado = false;

                } else {

                    //último disco que hay en la torre
                    Discos aroPresente = (Discos) torre3.getComponent(torre3.getComponentCount() - 1);
                    //si retorna true
                    if (verificar(aroPresente, discoMover)) {

                        discoMover.setBounds(x, 250 - (20 * torre3.getComponentCount() - 1), w, 20);
                        torre3.add(discoMover);
                        torre3.updateUI();

                        //contador que aumento para contar el numero de pasos del usuario
                        iNumeroDePasos++;

                        //Para actualizar el Label de numero de pasos que hace el jugador
                        pasosEchos.setText("Tu numero de movimientos: " + iNumeroDePasos);

                        discoMover = null;
                        bSeleccionado = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento inavlido");
                    }
                }
            }
        }

        if (e.getSource() == torre3) {
            if (hanoi.verificarFinalJuego(iDiscos, torre3.getComponentCount()) == true) {
                JOptionPane.showMessageDialog(null, "Felicitaciones termino el juego");

                System.out.println(iNumeroDePasos);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    //Verifica que el aro sea menor al que existe en la torre
    public boolean verificar(Discos aroPresente, Discos aroAMover) {
        //ancho del aro que hay en la torre
        int iAncho1 = aroPresente.getWidth();
        //ancho del disco que se quiere poner; verifica si es menor o mayor
        int iAncho2 = aroAMover.getWidth();

        if (iAncho1 > iAncho2) {
            return true;
        } else {
            return false;
        }
    }
}
