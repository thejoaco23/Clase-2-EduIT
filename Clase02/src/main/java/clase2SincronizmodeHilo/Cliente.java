
package clase2SincronizmodeHilo;

public class Cliente implements Runnable{
    private Cuenta cuenta;
    
    public  Cliente(Cuenta cuenta) {this.cuenta= cuenta;}
   
    // no existe la multitarea nativa, solo son millones d eprocesos a que simulan multi tarea
    @Override 
            public void run(){
                cuenta.debitar(2000);
                System.out.println("Saldo :" + cuenta.getSaldo());
                        
            }
    
}
