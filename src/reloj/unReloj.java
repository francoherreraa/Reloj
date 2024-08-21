
package reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Franco
 */
public class unReloj{   
    private String modelo;   
    private int numSerie;
    private int hora = 0;
    private int dia = 0;

    public unReloj(String modelo, int numSerie) {
        this.modelo = modelo;
        this.numSerie = numSerie;         
    }

    public LocalTime getHora(){
        return LocalTime.now().withNano(0).plusHours(hora);
    } 
    
    public LocalDate getDia(){
        return LocalDate.now().plusDays(dia);
    }
    
    public void incrementarDia(){
        dia++;
    }
    
    public void incrementarHora(){
        if (hora == 23){
            hora = 0;
        }else{
            hora++;
        }
    }

    public void limpiarPantalla(){
        
    }
    
   
}
