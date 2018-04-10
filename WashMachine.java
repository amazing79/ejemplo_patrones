/*
 * Prueba Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class WashMachine {
    IWashState estoyApagada;
    IWashState estoyPrendida;
    IWashState estoySuspendida;
    
    IWashState washState;
    
    public WashMachine(){
        estoyApagada = new Apagada(this);
        estoyPrendida = new Encendida(this);
        estoySuspendida = new Suspendida(this);
        
        washState = estoyApagada;
    
    }
    
    public void cambiarEstado(IWashState nuevoEstado){
        washState = nuevoEstado;
        
    }
    
    public void apagar(){
       washState.apagar();
    }
    
    public void encender(){
        washState.encender();
    }
    
    public void suspender(){
        washState.suspender();
    }
    
    public IWashState setApagada(){ return this.estoyApagada;}
    public IWashState setEncendida() { return this.estoyPrendida;}
    public IWashState setSuspendida() { return this.estoySuspendida;}
    
}
