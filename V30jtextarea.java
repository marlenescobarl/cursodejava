import javax.swing.*;

public class V30jtextarea extends JFrame{
    private JTextField textfield1;
    private JTextArea textarea1;

    //constructor para el diseno

    public V30jtextarea(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);

        textarea1 = new JTextArea();
        textarea1.setBounds(10, 50, 400, 300);
        add(textarea1);
    }
    public static void main(String args[]){
        V30jtextarea formulario = new V30jtextarea();
        formulario.setBounds(0,0,540, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}