/*
 * Prueba de Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class Suspendida implements IWashState{
    
    WashMachine manejadorEstado;
    
    public Suspendida(WashMachine actual){
        manejadorEstado = actual;
    }
    
    @Override
    public void apagar() {
        System.out.println("Primero, reanuda la marcha, antes de apagar");
        
    }

    @Override
    public void encender() {
        System.out.println("Reanudando!!!");
        manejadorEstado.cambiarEstado(manejadorEstado.estoyPrendida);
        
    }

    @Override
    public void suspender() {
        System.out.println("Ya estoy en PAUSA!");
        
    }
}
