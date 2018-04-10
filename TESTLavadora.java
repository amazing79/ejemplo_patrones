/*
 * Prueba de Patrones
 */
package State;

/**
 *
 * @author ignacio
 */
public class TESTLavadora {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        
        WashMachine lavadora = new WashMachine();
        SimpleWashMAchine otraLavadora = new SimpleWashMAchine();
        
        otraLavadora.operar("apagar");
        otraLavadora.operar("suspender");
        otraLavadora.operar("encender");
        otraLavadora.operar("encender");
        otraLavadora.operar("suspender");
        otraLavadora.operar("apagar");
        otraLavadora.operar("encender");
        otraLavadora.operar("apagar");
        
        System.out.println("************************");
        System.out.println("Ejemplo otra lavadora");
        System.out.println("************************");
        
        lavadora.apagar();
        lavadora.suspender();
        lavadora.encender();
        lavadora.encender();
        lavadora.suspender();
        lavadora.apagar();
        lavadora.encender();
        lavadora.apagar();
        
      
                
        
    }
}
