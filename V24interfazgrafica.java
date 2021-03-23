import javax.swing.*;
public class V24interfazgrafica extends JFrame
{
    private JLabel label1;

    public V24interfazgrafica()
    {
        setLayout(null);
        label1 = new JLabel("H E L L O  W O R L D");
        label1.setBounds(10, 20, 200, 200);
        add (label1);
    }
    public static void main (String args [])
    {
        V24interfazgrafica ventana = new V24interfazgrafica();
        ventana. setBounds(0, 0, 400, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
}