import javax.swing.*;
import java.awt.event.*;

public class V29practica extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    
    //constructor
    public V29practica(){
        setLayout(null);
        label1 = new JLabel ("USUARIO: ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        //programacion del diseno de la caja de texto
        textfield1 = new JTextField();
        textfield1.setBounds(120, 17, 150, 20);
        add(textfield1);

        //diseno del boton
        boton1 = new JButton("ACEPTAR");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        //indicamos que el boton mas adelante tendra un evento
        boton1.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            //obtener el texto que el usuario haya escrito y guardarlo dentro de la variable texto
            String texto = textfield1.getText();

            //colocar el texto dentro del titulo de la interfaz
            setTitle(texto);
        }
    }
    //programacion de la interfaz
    public static void main (String args[]){
        V29practica formulario = new V29practica();
        formulario.setBounds(0,0, 300, 150);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
