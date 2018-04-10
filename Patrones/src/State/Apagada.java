/*
 * Prueba de Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class Apagada implements IWashState {
    
    WashMachine manejadorEstado;
    
    public Apagada(WashMachine actual){
        manejadorEstado = actual;
    }

    @Override
    public void apagar() {
        System.out.println("No se puede, ya esta apagada, gil!");
        
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el lavarropas");
        manejadorEstado.cambiarEstado(manejadorEstado.setEncendida());
    }

    @Override
    public void suspender() {
        System.out.println("Primero prendela, viste!!!");
        
    }
    
}