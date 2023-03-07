import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonaGUI extends JFrame{
    private JPanel panel1;
    private JLabel lblResultado;
    private JTextField txtNombre;
    private JComboBox boxPersona1;
    private JComboBox boxPersona2;
    private JComboBox boxProvincia;
    private JTextField txtEdad;
    private JButton btnPersona;
    private JButton btnMulti;
    private JButton btnSuma;
    private JButton btnDivision;
    private JButton btnResta;

    public PersonaGUI() {
        setContentPane(panel1);
        setTitle("Personas");
        setSize(650, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //txtUsuario.getText()

        btnPersona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int Edad = 0;
                Edad = Integer.parseInt(txtEdad.getText());

                Persona nombre = new Persona(txtNombre.getText(),"si",Edad);


                boxPersona1.addItem(nombre);

                boxPersona2.addItem(nombre);

                System.out.println(nombre.getNombre());
                System.out.println(nombre.getEdad());
                System.out.println(nombre.getProvincia());

                txtNombre.setText("");
                txtEdad.setText("");

                boxPersona1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Persona a = (Persona)boxPersona1.getSelectedItem();
                        System.out.println(a.getNombre());

                    }
                });

                //JComboBox<Object> comboBox = new JComboBox<Object>();
                //Object obj = new Object(); // Aquí puedes crear el objeto que quieras agregar al combo box

            }
        });

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = 0;

                Persona a = (Persona)boxPersona1.getSelectedItem();
                Persona b = (Persona)boxPersona2.getSelectedItem();

                suma = a.getEdad() + b.getEdad();

                System.out.println(suma);

                lblResultado.setText("Resultado :" + suma);
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}
