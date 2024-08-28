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
    private UnReloj reloj;
    private int x;
    private int y;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.x = 0;
        this.y = 0;
    }
// Santiago estuvo aquí

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

    public void asignarReloj(UnReloj reloj) {
        this.reloj = reloj;
        System.out.println("Se le asignó un reloj a " + this.nombre);
    }

    public void hablar() {
        System.out.println("¡Hola!");
    }

    public void comer() {
        System.out.println("¡Qué rico está esto");
    }

    public void decirHora() {
        System.out.println("La hora es: " + reloj.getHora());
    }

    public void pedirPasos(int x2, int y2) {// revisado por jon
        if (this.reloj instanceof RelojFit) {
            RelojFit relojFit = (RelojFit) reloj; //Se castea el reloj para poder utilizar el método .cuentaPasos()            
            System.out.println("Acabo de caminar " + relojFit.cuentaPasos(x, y, x2, y2) + " pasos");
            System.out.println("Mi posición actual es: (" + x2 + "," + y2);
            this.x = x2;
            this.y = y2;
        } else {
            System.out.println("Este reloj no puede contar los pasos");
        }
    }

    public void aumentarHoraReloj() {
        reloj.incrementarHora();
        System.out.println(this.nombre + " le incrementó una hora al reloj");
    }

}
