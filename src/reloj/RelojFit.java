
package reloj;

/**
 *
 * @author Franco
 */
public class RelojFit extends UnReloj{
    
    
    public RelojFit(String modelo, int numSerie) {
        super(modelo, numSerie);
    }
    
    public int cuentaPasos(int x1, int y1, int x2, int y2){
        int pasos = (int) Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2));
        return pasos;
    }
    
    public int frecuenciaAleatoria(){
        return (int)(Math.random() * 120);  
    }
    
    
    
}
