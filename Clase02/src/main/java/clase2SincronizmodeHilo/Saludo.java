package clase2SincronizmodeHilo;

public class Saludo {
    public synchronized void Saludar(String nombre,boolean esJefe){
    if(esJefe){
        System.err.println("Hola mis escalvos, llegue!");
        notifyAll();
        try {
            Thread.sleep(100);
        } catch (Exception e) {        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {        }
        
        //notifica a todos los hilos que estan en wait y los saca de wait
    }else{
        System.out.println(nombre + "-> llego!");
        try {
        wait(); } catch (Exception e) {}
  //wait "pausa" esta congelado temporalmente
        System.out.println(nombre +": Hola Jefe");
    }
    }
}
