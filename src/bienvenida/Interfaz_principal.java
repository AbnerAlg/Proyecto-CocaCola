/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bienvenida;

/**
 *
 * @author abner
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
public class Interfaz_principal extends JFrame implements ActionListener {
    private JMenuBar barra;
    private JMenuItem nuevo,salir,vacaciones,creador,colorfondo,RED, Green, Blue;
    private JMenu menuopc, menu_cal, menu_acerca;
    private JLabel lablogo, lab_welcome, lab_data, lab_name,
            lab_paterno;
    private JTextField nombre,paterno, materno;
    private JComboBox combo1,combo2;
    private JScrollPane scroll;
    
    public Interfaz_principal(){
        setLayout (null);
        setTitle ("Pantalla Principal");
        getContentPane().setBackground(new Color (255,0,0));
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/images/icon.png"));
        setIconImage(iconoVentana.getImage());
        
        barra=new JMenuBar ();
        barra.setBackground(new Color (255,0,0));
        setJMenuBar(barra);
        
        menuopc = new JMenu ("Opciones");
        menuopc.setBackground(new Color(255,0,0));
        menuopc.setFont(new Font("Andale Mono",1,12));    
        menuopc.setForeground(new Color(255, 255, 255));
        barra.add(menuopc);
        
        menu_cal = new JMenu("Calcular");
        menu_cal.setBackground(new Color(255,0,0));
        menu_cal.setFont(new Font("Andale Mono",1,12));    
        menu_cal.setForeground(new Color(255, 255, 255));
        barra.add(menu_cal);
        
        menu_acerca = new JMenu("Acerca de");
        menu_acerca.setBackground(new Color(255,0,0));
        menu_acerca.setFont(new Font("Andale Mono",1,12));    
        menu_acerca.setForeground(new Color(255, 255, 255));
        barra.add(menu_acerca);
        
       
        colorfondo = new JMenu ("Color de fondo");
        colorfondo.setBackground(new Color(225,225,225));
        colorfondo.setFont(new Font("Andale Mono",1,12));    
        colorfondo.setForeground(new Color(255, 0, 0));
        menuopc.add(colorfondo);
        
        vacaciones = new JMenuItem("Vacaciones");
        vacaciones.setBackground(new Color(225,225,225));
        vacaciones.setFont(new Font("Andale Mono",1,12));    
        vacaciones.setForeground(new Color(255, 0, 0));
        menu_cal.add(vacaciones);
        
        creador= new JMenuItem("Creador");
        creador.setBackground(new Color(225,225,225));
        creador.setFont(new Font("Andale Mono",1,12));    
        creador.setForeground(new Color(255, 0, 0));
        menu_acerca.add(creador);
        
        nuevo = new JMenuItem ("Nuevo");
        nuevo.setBackground(new Color(225,225,225));
        nuevo.setFont(new Font("Andale Mono",1,12));    
        nuevo.setForeground(new Color(255, 0, 0));
        menuopc.add(nuevo);
        
        salir = new JMenuItem ("Salir");
        salir.setBackground(new Color(225,225,225));
        salir.setFont(new Font("Andale Mono",1,12));    
        salir.setForeground(new Color(255, 0, 0));
        menuopc.add(salir);
        
        RED = new JMenuItem("Rojo");
        RED.setBackground(new Color(225,225,225));
        RED.setFont(new Font("Andale Mono",1,12));    
        RED.setForeground(new Color(255, 0, 0));
        colorfondo.add(RED);
        RED.addActionListener(this);
        
        Green = new JMenuItem("Verde");
        Green.setBackground(new Color(225,225,225));
        Green.setFont(new Font("Andale Mono",1,12));    
        Green.setForeground(new Color(255, 0, 0));
        colorfondo.add(Green);
        Green.addActionListener(this);
        
        Blue = new JMenuItem("Azul");
        Blue.setBackground(new Color(225,225,225));
        Blue.setFont(new Font("Andale Mono",1,12));    
        Blue.setForeground(new Color(255, 0, 0));
        colorfondo.add(Blue);
        Blue.addActionListener(this);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        lablogo =new JLabel(imagen);
        lablogo.setBounds(5,5,250,100);
        add(lablogo);
        
        
        
    }
    public void actionPerformed (ActionEvent dmx){
    
    }
    public static void main(String[] args) {
        Interfaz_principal dmx=new Interfaz_principal();
        dmx.setVisible(true);
        dmx.setResizable(false);
        dmx.setLocationRelativeTo(null);
        dmx.setBounds(0,0,500,500);
    }
}
