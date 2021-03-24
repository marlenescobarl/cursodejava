import javax.swing.*;
public class V26ventana extends JFrame 
{
    //indicar que vamos a usar texto, para uso privado de esta clase
    private JLabel label1;
    private JLabel label2;

    //darle un disenno, dentro de un constructor

    public V26ventana()
    {
        //metodo. indicar que se haran uso de coordenadas, null que no haga nada a menos que se de la instruccion
        setLayout(null);

        //disenar las etiquetas, labels
        //crear el objeto para la label1, para mostrar texto
        label1 = new JLabel("INTERFAZ GRAFICA");

        //indicar als coordenadas que debe tener
        label1.setBounds(10,10,300, 30);

        //metodo, agregar los datos anteriores
        add(label1);

        //crear la segunda etiqueta
        label2 = new JLabel("VERSION 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    //clase main
    public static void main(String args [])
    {
        //crear un objeto para la interfaz para extraer todo lo de la clase JFrame
        V26ventana ventana = new V26ventana();
        //disenno de la interfaz
        ventana.setBounds(0,0,300,200);
        //quitar al usuario la opcion que pueda modificar el tamanno de la interfaz
        ventana.setResizable(false);
        //que sea la ineterfaz visible
        ventana.setVisible(true);
        //para mandar la hubicacion al centro
        ventana.setLocationRelativeTo(null);
    }

}