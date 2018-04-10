/*
 * Prueba de Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class SimpleWashMAchine implements IWashState{
    
    String estadoActual;

    public SimpleWashMAchine() {
        this.estadoActual = "apagada";
    }

    @Override
    public void apagar() {
        this.estadoActual = "apagada";
        System.out.println("apagando!!");
    }

    @Override
    public void encender() {
        this.estadoActual = "encendida";
        System.out.println("Encendiendo");
    }

    @Override
    public void suspender() {
        this.estadoActual = "suspendida";
        System.out.println("suspendiendo");
    }
    
    public void operar(String accion){
        switch (accion ){
            case "apagar": 
                if ("encendida".equals(this.estadoActual)){
                    this.apagar();
                }
                else{
                    if("suspendida".equals(this.estadoActual) ){
                        System.out.println("Primero hay que reanudar");
                    }
                    else{
                         System.out.println("No se puede, ya esta apagada, gil!");
                    }
                }
                break;
            case "encender":
                if ("apagada".equals(this.estadoActual)){
                    this.encender();
                }
                else{
                    if("suspendida".equals(this.estadoActual) ){
                        this.encender();
                    }
                    else{
                        System.out.println("No escuchas el ruido?? Estoy prendida papa!!");
                    }
                }
                break;
            case "suspender":
             if ("encendida".equals(this.estadoActual)){
                    this.suspender();
                }
                else{
                    if("suspendida".equals(this.estadoActual) )
                    {
                       System.out.println("Ya estoy en PAUSA!");
                    }
                    else{
                        System.out.println("No se puede suspender si esta apagada");
                    }
                }
             break;
        }
    }  
}
