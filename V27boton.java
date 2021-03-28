import javax.swing.*;
import java.awt.event.*; // sirve para controlar los eventos
public class V27boton extends JFrame implements ActionListener //atento al llamado de los eventos
{
    //llamdo  del boton
    JButton boton1;
    JLabel label1;
    JLabel label2;
    
    public V27boton() 
    {
        setLayout(null);
        label1 = new JLabel ("TE QUIERO MUCHO ");
        label1.setBounds(10, 10, 300, 30);
        add(label1);

        label2 = new JLabel ("T I G R E");
        label2.setBounds(10, 100, 100, 30);
        add(label2);

        boton1 = new JButton("cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    //creacion del evento (funcion)
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton1)
        {
            System.exit(0); //para cerrar la ventana
        }
    }
    //creacion de la ventana
    public static void main (String args[])
    {
        V27boton formulario = new V27boton();
        formulario.setBounds(0,0,450,350);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

}

