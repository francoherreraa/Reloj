
package reloj;

public class Reloj {
    public static void main(String[] args) {
        UnReloj relojComun = new UnReloj("CASIO",1001234);
        RelojFit smartWatch = new RelojFit("Xiaomi",2006789);
        Persona carlos = new Persona("Carlos", 25);
        Persona maria = new Persona("María", 18);
        
        //Métodos llamados desde Carlos con un reloj común.
        carlos.asignarReloj(relojComun);
        carlos.decirHora();
        carlos.aumentarHoraReloj();
        carlos.decirHora();
//        carlos.pedirPasos(3, 4);
        
//        //Métodos llamados desde María con un reloj Fit.
//        maria.asignarReloj(smartWatch);
//        maria.decirHora();
//        maria.aumentarHoraReloj();
//        maria.decirHora();
//        maria.pedirPasos(3, 4);
    }
    
}
