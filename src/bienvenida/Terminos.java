package bienvenida;

/**
 *
 * @author abner
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Terminos extends JFrame implements ActionListener, ChangeListener{
    private JLabel lab1,lab2;
    private JScrollPane scroll;
    private JTextArea area;
    private JCheckBox box;
    private JButton bot1, bot2;
    
    public Terminos (){
        setLayout (null);
        setTitle ("Licencia de uso");
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/images/icon.png"));
        setIconImage(iconoVentana.getImage());
        
        lab1 = new JLabel ("TÉRMINOS Y CONDICIONES");
        lab1.setBounds(215,10,200,30);
        lab1.setFont(new Font("Andale Mono", 1, 14));;
        lab1.setForeground(new Color(0,0,0));
        add(lab1);;
        
        area = new JTextArea();
        area.setEditable(false); //Este metodo dice si se puede editar o no el texto
        area.setFont(new Font("Andale mono",0,12));
        area.setText("\n\n          TÉRMINOS Y CONDICIONES"+
                "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN LA AUTORIZACIÓN DEL INGENIERO ABNER"+
                "\n          B. PROHIBIDA LA ALTERACIÓN DEL CODIGO FUENTE"+
                "\n          C. QUEDA RESTRICATAMENTE INFORMADO QUE SOY NOVIO DE MAFER "+
                "\n\n          SI NO ESTA DE ACUERDO DE CLIC EN EL BOTON (NO ACEPTO)"+
                "\n\n          PARA MAYOR INFORMACIÓN POR FAVOR ESCRIBANOS A NUESTRO TELEFONO:"+
                "\n          +52 722 140 8774");
        scroll = new JScrollPane (area);
        scroll.setBounds(10,40,575,200);
        add(scroll);
        
        box=new JCheckBox ("Yo acepto");
        box.setBounds(10,250,300,30);
        box.addChangeListener(this);
        add(box);
        
        bot1 = new JButton("Continuar");
        bot1.setEnabled(false);
        bot1.setBounds(10,290,100,30);
        bot1.addActionListener(this);
        add(bot1);
        
        bot2 = new JButton("No acepto");
        bot2.setEnabled(true);
        bot2.setBounds(120,290,100,30);
        bot2.addActionListener(this);
        add(bot2);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/images/coca-cola.png"));
        lab2 = new JLabel(imagen);
        lab2.setBounds(315, 135, 300, 300);
        add(lab2);
        
    }
    
    public void stateChanged(ChangeEvent dmx){
        
    }
    
    public void actionPerformed(ActionEvent dmx){
        
    }
    public static void main(String[] args) {
        Terminos dmx=new Terminos();
        dmx.setBounds(0,0,610,450);
        dmx.setVisible(true);
        dmx.setResizable(false);
        dmx.setLocationRelativeTo(null);
    }
}
