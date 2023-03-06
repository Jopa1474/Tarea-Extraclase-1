public class Persona {

    private String nombre;
    private String Provincia;
    private int edad;

    public Persona(String nombre, String provincia, int edad){
        this.nombre = nombre;
        this.Provincia = provincia;
        this.edad = edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return Provincia;
    }

    public int getEdad() {
        return edad;
    }

}
