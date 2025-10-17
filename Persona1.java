
package ejemplo;

/**
 *
 * @author SENA
 */
public class Persona1 {
   //declaro los atributos para la clase persona 
  private String nombre;
  private String apellido;
private int edad;
//Creamos el constructor para la clase persona
    public Persona1(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
   
}
