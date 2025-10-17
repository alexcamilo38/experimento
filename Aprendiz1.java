
package ejemplo;


public class Aprendiz1 extends Persona1 {
  


//declaro los atributos de la clase aprendiz
private int codigoaprendez;
private float nota;
  //se crea el constructor para la clase hija
    public Aprendiz1(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        
    }

    public Aprendiz1( String nombre, String apellido, int edad,int codigoaprendez, float nota) {
        super(nombre, apellido, edad);
        this.codigoaprendez = codigoaprendez;
        this.nota = nota;
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "  +getNombre() + 
                "\nApellido: " +getApellido()+
                "\nEdad: " +getEdad() +
                "\nCodigoaprendiz. " +codigoaprendez+
                "\nNota: "+nota);
    }
}
