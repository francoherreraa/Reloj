
package reloj;

import java.time.LocalTime;

/**
 *
 * @author Franco
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private unReloj reloj;
    private int X;
    private int y;
    

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.X = 0;
        this.y = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void asignarReloj(unReloj reloj){
        this.reloj = reloj;
    }
            
    public void hablar(){
        
    }
    
    public void comer(){
        
    }
    
    public void decirHora(){
        System.out.println("La hora es: "+reloj.getHora());
    }
    
    public void perdirPasos(int x2, int y2){
        if (this.reloj instanceof RelojFit )
    }
    
}
