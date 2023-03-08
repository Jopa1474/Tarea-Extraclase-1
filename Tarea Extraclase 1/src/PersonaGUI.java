import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase para la interfaz
 */

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

    /**
     * Metodo constructor para la interfaz
     */
    public PersonaGUI() {

        /**
         * Atributos de la interfaz
         */
        setContentPane(panel1);
        setTitle("Personas");
        setSize(650, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        /**
         * Para anadir las provincias al combobox
         * @author https://www.youtube.com/watch?v=xoVoRT4MyU4
         */
        boxProvincia.addItem("San Jose");
        boxProvincia.addItem("Alajuela");
        boxProvincia.addItem("Cartago");
        boxProvincia.addItem("Heredia");
        boxProvincia.addItem("Guanacaste");
        boxProvincia.addItem("Puntarenas");
        boxProvincia.addItem("Limon");

        //Transformado en array a peticion del ide, y funciono
        final int[] Size = {0};


        /**
         * Boton para agregar personas
         */
        btnPersona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Provincia = (String) boxProvincia.getSelectedItem();
                int Edad = 0;
                Edad = Integer.parseInt(txtEdad.getText());

                if (Size[0] != 4){
                    if (Edad > 0){
                        Persona nombre = new Persona(txtNombre.getText(), Provincia, Edad);

                        boxPersona1.addItem(nombre);

                        boxPersona2.addItem(nombre);

                        System.out.println(nombre.getNombre());
                        System.out.println(nombre.getEdad());
                        System.out.println(nombre.getProvincia());

                        txtNombre.setText("");
                        txtEdad.setText("");

                        lblResultado.setText("Resultado:");

                        Size[0] += 1;
                        System.out.println("Size: "+ Size[0]);
                    }
                    else {
                        lblResultado.setText("La edad debe ser mayor a 0");
                    }
                }
                else {
                    System.out.println("Numero maximo de personas alcanzado");
                }

            }
        });

        /**
         * Boton para sumar las edades de las personas seleccionadas
         */
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

        /**
         * Boton para restar las edades de las personas seleccionadas
         */
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int resta = 0;

                Persona a = (Persona)boxPersona1.getSelectedItem();
                Persona b = (Persona)boxPersona2.getSelectedItem();

                resta = a.getEdad() - b.getEdad();

                System.out.println(resta);

                lblResultado.setText("Resultado :" + resta);

            }
        });

        /**
         * Boton para multiplicar las edades de las persons seleccionadas
         */
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int multi = 0;

                Persona a = (Persona)boxPersona1.getSelectedItem();
                Persona b = (Persona)boxPersona2.getSelectedItem();

                multi = a.getEdad() * b.getEdad();

                System.out.println(multi);

                lblResultado.setText("Resultado :" + multi);

            }
        });

        /**
         * Boton para dividir las edades de las personas seleccionadas
         */
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int division = 0;

                Persona a = (Persona)boxPersona1.getSelectedItem();
                Persona b = (Persona)boxPersona2.getSelectedItem();

                division = a.getEdad() / b.getEdad();

                System.out.println(division);

                lblResultado.setText("Resultado :" + division);

            }
        });


    }
}
