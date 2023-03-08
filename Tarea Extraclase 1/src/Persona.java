/**
 * Clase persona, con su nombre, provincia y edad
 */
public class Persona {

    /**
     * Atributos de la clase persona (nombre, provincia y edad)
     */
    private String nombre;
    private String Provincia;
    private int edad;

    /**
     * Metodo constructor para la clase persona
     * @param nombre
     * @param provincia
     * @param edad
     */
    public Persona(String nombre, String provincia, int edad){
        this.nombre = nombre;
        this.Provincia = provincia;
        this.edad = edad;
    }

    /**
     * Metodo para asignar una determinada edad al objeto Persona
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para asignar un determinado nombre al objeto Persona
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para asignar una determinada provincia al objeto Persona
     * @param provincia
     */
    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    /**
     * Metodo para obtener el nombre del objeto Persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la provincia del objeto Persona
     * @return Provincia
     */
    public String getProvincia() {
        return Provincia;
    }

    /**
     * Metodo para obtener la edad del objeto Persona
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para asignarle un nombre mediante el cual poder identificar al objeto
     * @return El objeto Persona con el nombre
     * @author https://www.youtube.com/watch?v=xoVoRT4MyU4
     */
    public String toString(){
        return this.nombre;
    }

}
