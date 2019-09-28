
package clase2SincronizmodeHilo;


public class Cuenta {
   float saldo=2000;
    //float monto=2000;
   //agrego syncrhonized pausa el movimiento en la cuenta /bloquea el objeto
   //cuaando termina el primer proceso en la cuenta, permite al 2do usar la cuenta
   public synchronized void depositar(float monto){
   
   saldo+=monto;}
   
   public synchronized void debitar(float monto){
            System.out.println("--Iniciando debito, mucha suerte!");
           synchronized (this){//sincronizado parcial apartir de Java 7
               
            if (saldo>=monto) {
                try {
                    Thread.sleep(2000); } catch (Exception e) {}
                saldo-=monto;
            }else{
                System.out.println("No hay saldo suficiente");  
            }}
                System.out.println( "--Safaste, pudiste pagarlo");}
             
           
   public synchronized float getSaldo() {return saldo;}
    
}
