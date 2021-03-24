import javax.swing.*; //lVibreria para la interfaz
public class V25ventana extends JFrame // extends para la usar herencias JFrame para crear la pantalla
{
    public V25ventana() // creacion del constructor
    {
        setLayout(null); //para el uso de las coordenadas, 
    }
    public static void main (String args [])
    {
        V25ventana ventana = new V25ventana (); //creacion de un nuevo objeto 
        ventana.setBounds(200,200, 300, 500); // hubicacion y tamanno de la ventana
        ventana.setVisible(true); // para que se visualice la ventana
    }
}