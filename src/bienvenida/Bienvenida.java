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
public class Bienvenida extends JFrame implements ActionListener{
    private JLabel lab1,lab2,lab3,lab4;
    private JTextField campo;
    private JButton boton;
    
    public Bienvenida (){
        setLayout(null);
        setTitle ("Bienvenida");
        getContentPane().setBackground(new Color(255,0,0)); //Da color al fondo de pantalla
        
        // Cargar imagen para el ícono de la ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/images/icon.png"));
        setIconImage(iconoVentana.getImage());
        
        // Cargar imagen del logo
        ImageIcon imagenLogo = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        lab1 = new JLabel(imagenLogo);
        lab1.setBounds(15, 25, 300, 150);
        add(lab1);
        
         lab2 = new JLabel("Sistema de control vacacional");
        lab2.setBounds(35,135,300,30);
        lab2.setFont(new Font("Andale Mono", 3, 19)); //0= Texto en blanco, 1=Texto negritas, 2= Cursiva, 3= negritas y cursiva
        lab2.setForeground(new Color(255,255,255));
        add(lab2);
        
        lab3 = new JLabel("Ingrese su nombre");
        lab3.setBounds(45,215,200,30);
        lab3.setFont(new Font("Andale Mono", 2, 14)); //0= Texto en blanco, 1=Texto negritas, 2= Cursiva, 3= negritas y cursiva
        lab3.setForeground(new Color(255,255,255));
        add(lab3);
        
        campo = new JTextField();
        campo.setBounds(45,240,255,25);
        campo.setBackground(new Color(224,224,224));
        campo.setFont(new Font ("Andale mono",1,14));
        campo.setForeground(new Color(255,0,0));
        add(campo);
        
        boton = new JButton ("Continuar");
        boton.setBounds(125,280,150,30);
        boton.setBackground(new Color(254,254,254));
        boton.setFont(new Font ("Andale mono",1,14)); //Diseño de la letra
        boton.setForeground(new Color(255,0,0)); //Color de la letra
        boton.addActionListener(this);
        add(boton);
        
    }
    
    public void actionPerformed(ActionEvent dmx){
        if(dmx.getSource()==boton){
            
        }
    }
    
    public static void main(String[] args) {
        Bienvenida dmx=new Bienvenida();
        dmx.setBounds(0,0,400,450);
        dmx.setVisible(true);
        dmx.setResizable(false);
        dmx.setLocationRelativeTo(null);
    }
            
}
    

