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
        
        //programacion del diseño de la caja de texto
        textfield1 = new JTextField();


    }
}