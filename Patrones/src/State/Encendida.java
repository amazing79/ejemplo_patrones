/*
 * Prueba de Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class Encendida implements IWashState{
    
    WashMachine manejadorEstado;
    
    public Encendida(WashMachine actual){
        manejadorEstado = actual;
    }
    
    @Override
    public void apagar() {
        System.out.println("Apagando!!!");
        manejadorEstado.cambiarEstado(manejadorEstado.setApagada());
    }

    @Override
    public void encender() {
        System.out.println("No escuchas el ruido?? Estoy prendida papa!!");
        
    }

    @Override
    public void suspender() {
        System.out.println("Pasando a estado suspendido!");
        manejadorEstado.cambiarEstado(manejadorEstado.setSuspendida());
    }
    
}
